// [Jalur Class]: com.wakwau.xplore.core.storage.io.RootDirectoryLister
// [Penjelasan]: Menangani operasi list directory untuk Root storage menggunakan PrivilegedFileService (Shizuku) dengan filter berkas tersembunyi.

package com.wakwau.xplore.core.storage.io

import android.content.Context
import com.wakwau.xplore.core.storage.model.FileItem
import com.wakwau.xplore.core.storage.model.FileType
import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.core.storage.model.FileMetadata
import com.wakwau.xplore.core.storage.shizuku.ShizukuHelper
import com.wakwau.xplore.core.storage.shizuku.ShizukuIpcConstants
import java.io.FileNotFoundException

class RootDirectoryLister(private val context: Context) {
    suspend fun listFiles(location: StorageLocation, showHidden: Boolean = true): List<FileItem> {
        val service = ShizukuHelper.getPrivilegedService(context.packageName)
            ?: throw FileNotFoundException("Root service not available")
            
        if (!service.exists(location.path) || !service.isDirectory(location.path)) {
            throw FileNotFoundException("Directory not found or is not a directory: ${location.path}")
        }
        
        val bundles = service.listDirectory(location.path)
        return bundles.filter { bundle ->
            if (!showHidden) {
                val name = bundle.getString(ShizukuIpcConstants.KEY_NAME) ?: ""
                val isHidden = bundle.getBoolean(ShizukuIpcConstants.KEY_IS_HIDDEN)
                !isHidden && !name.startsWith(".")
            } else {
                true
            }
        }.map { bundle ->
            val name = bundle.getString(ShizukuIpcConstants.KEY_NAME) ?: "Unknown"
            val path = bundle.getString(ShizukuIpcConstants.KEY_PATH) ?: ""
            val isDirectory = bundle.getBoolean(ShizukuIpcConstants.KEY_IS_DIRECTORY)
            val type = if (isDirectory) FileType.DIRECTORY else FileType.FILE
            
            val metadata = FileMetadata(
                size = bundle.getLong(ShizukuIpcConstants.KEY_SIZE),
                modifiedTime = bundle.getLong(ShizukuIpcConstants.KEY_LAST_MODIFIED),
                createdTime = null,
                isReadable = true,
                isWritable = true,
                isExecutable = true,
                isHidden = bundle.getBoolean(ShizukuIpcConstants.KEY_IS_HIDDEN) || name.startsWith(".")
            )
            
            FileItem(
                id = path,
                name = name,
                location = StorageLocation(path, location.rootId),
                type = type,
                metadata = metadata
            )
        }.sortedWith(compareBy({ it.type != FileType.DIRECTORY }, { it.name.lowercase() }))
    }
}
