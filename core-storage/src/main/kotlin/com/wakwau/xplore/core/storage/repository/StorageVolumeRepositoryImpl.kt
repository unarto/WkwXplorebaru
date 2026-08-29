// [Jalur Class]: com.wakwau.xplore.core.storage.repository.StorageVolumeRepositoryImpl
// [Penjelasan]: Implementasi StorageVolumeRepository untuk mendeteksi Internal Storage, SD Card, USB OTG, dan Root (melalui Shizuku) secara dinamis, dengan BroadcastReceiver untuk mount/unmount.

package com.wakwau.xplore.core.storage.repository

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Build
import android.os.Environment
import android.os.storage.StorageManager
import androidx.core.content.ContextCompat
import com.wakwau.xplore.core.storage.constant.StorageConstants
import com.wakwau.xplore.core.storage.model.StorageVolumeItem
import com.wakwau.xplore.core.storage.model.StorageVolumeType
import com.wakwau.xplore.core.storage.provider.InternalStoragePathResolver
import com.wakwau.xplore.core.storage.provider.StorageSpaceReader
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.io.File
import com.wakwau.xplore.core.storage.provider.SafVolumeNameResolver
import rikka.shizuku.Shizuku

class StorageVolumeRepositoryImpl(
    private val context: Context,
    private val internalStoragePathResolver: InternalStoragePathResolver,
    private val storageSpaceReader: StorageSpaceReader,
    private val safVolumeNameResolver: SafVolumeNameResolver
) : StorageVolumeRepository {

    private val _volumes = MutableStateFlow<List<StorageVolumeItem>>(emptyList())
    private val scope = CoroutineScope(Dispatchers.IO)

    init {
        val filter = IntentFilter().apply {
            addAction(Intent.ACTION_MEDIA_MOUNTED)
            addAction(Intent.ACTION_MEDIA_UNMOUNTED)
            addAction(Intent.ACTION_MEDIA_REMOVED)
            addAction(Intent.ACTION_MEDIA_BAD_REMOVAL)
            addAction(Intent.ACTION_MEDIA_EJECT)
            addDataScheme("file")
        }
        
        context.registerReceiver(object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                scope.launch {
                    refreshVolumes()
                }
            }
        }, filter)
    }

    override fun getVolumes(): Flow<List<StorageVolumeItem>> {
        return _volumes.asStateFlow()
    }

    override suspend fun refreshVolumes() {
        val newVolumes = mutableListOf<StorageVolumeItem>()

        // 1. Internal Storage
        val primaryRootPath = internalStoragePathResolver.getPrimaryInternalStoragePath()
        val primarySpaceInfo = storageSpaceReader.getSpaceInfo(primaryRootPath)
        
        newVolumes.add(
            StorageVolumeItem(
                id = StorageConstants.PRIMARY_INTERNAL_VOLUME_ID,
                name = StorageConstants.DEFAULT_PRIMARY_VOLUME_NAME,
                rootPath = primaryRootPath,
                type = StorageVolumeType.PRIMARY_INTERNAL,
                isReadOnly = false,
                spaceInfo = primarySpaceInfo
            )
        )

        // 2 & 3. Deteksi SD Card & USB OTG melalui ContextCompat.getExternalFilesDirs
        val externalDirs = ContextCompat.getExternalFilesDirs(context, null)
        for (dir in externalDirs) {
            if (dir == null) continue
            val absolutePath = dir.absolutePath
            if (absolutePath.contains("/Android/data/")) {
                val rootPath = absolutePath.substringBefore("/Android/data/")
                
                // Lewati jika ini adalah internal storage (biasanya /storage/emulated/0)
                if (rootPath == primaryRootPath || rootPath.contains("emulated")) {
                    continue
                }

                // Cek apakah SD Card atau USB OTG via StorageManager
                var type = StorageVolumeType.UNKNOWN
                var name = "External Storage"
                
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    val storageManager = context.getSystemService(Context.STORAGE_SERVICE) as StorageManager
                    val storageVolume = storageManager.getStorageVolume(File(rootPath))
                    if (storageVolume != null) {
                        name = storageVolume.getDescription(context) ?: name
                        type = if (storageVolume.isRemovable) {
                            // Sederhananya, jika string ID (UUID) mengandung '-', itu biasa SD Card
                            if (storageVolume.uuid?.contains("-") == true) StorageVolumeType.SECONDARY_SDCARD else StorageVolumeType.USB_OTG
                        } else {
                            StorageVolumeType.UNKNOWN
                        }
                    } else {
                        // Fallback heuristic
                        type = if (rootPath.contains("-")) StorageVolumeType.SECONDARY_SDCARD else StorageVolumeType.USB_OTG
                    }
                } else {
                    type = if (rootPath.contains("-")) StorageVolumeType.SECONDARY_SDCARD else StorageVolumeType.USB_OTG
                }
                
                val spaceInfo = storageSpaceReader.getSpaceInfo(rootPath)
                newVolumes.add(
                    StorageVolumeItem(
                        id = rootPath.hashCode().toString(),
                        name = name,
                        rootPath = rootPath,
                        type = type,
                        isReadOnly = false,
                        spaceInfo = spaceInfo
                    )
                )
            }
        }

        // 4. Root Storage
        val isShizukuAvailable = try {
            Shizuku.pingBinder()
        } catch (e: Throwable) {
            false
        }

        if (isShizukuAvailable) {
            val rootPath = "/"
            val rootSpaceInfo = storageSpaceReader.getSpaceInfo(rootPath)
            newVolumes.add(
                StorageVolumeItem(
                    id = "root_storage",
                    name = "Root",
                    rootPath = rootPath,
                    type = StorageVolumeType.ROOT,
                    isReadOnly = false, // Bisa diedit menggunakan Shizuku
                    spaceInfo = rootSpaceInfo
                )
            )
        }

        // 5. SAF Persisted URIs (SD Card / USB OTG via SAF)
        val persistedUris = context.contentResolver.persistedUriPermissions
        for (uriPermission in persistedUris) {
            val uri = uriPermission.uri
            val name = safVolumeNameResolver.resolveVolumeName(uri)
            newVolumes.add(
                StorageVolumeItem(
                    id = uri.toString().hashCode().toString(),
                    name = name,
                    rootPath = uri.toString(),
                    type = StorageVolumeType.SAF_PROVIDER,
                    isReadOnly = !uriPermission.isWritePermission,
                    spaceInfo = null,
                    createdAt = uriPermission.persistedTime
                )
            )
        }

        // Sort volumes based on the requested order and chronological time for SAF
        newVolumes.sortWith(Comparator { a, b ->
            val orderA = getOrderForType(a.type)
            val orderB = getOrderForType(b.type)
            if (orderA != orderB) {
                orderA.compareTo(orderB)
            } else {
                a.createdAt.compareTo(b.createdAt)
            }
        })

        _volumes.value = newVolumes
    }

    private fun getOrderForType(type: StorageVolumeType): Int {
        return when (type) {
            StorageVolumeType.PRIMARY_INTERNAL -> 1
            StorageVolumeType.SECONDARY_SDCARD -> 2
            StorageVolumeType.USB_OTG -> 3
            StorageVolumeType.ROOT -> 4
            StorageVolumeType.SAF_PROVIDER -> 5
            StorageVolumeType.UNKNOWN -> 6
        }
    }
}
