package com.wakwau.xplore.filemanager.ui.component

import android.os.StatFs
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.wakwau.xplore.filemanager.ui.R
import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.core.ui.components.StorageDiskBar
import com.wakwau.xplore.core.util.ByteFormatter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

import android.os.Environment

@Composable
fun FileManagerStorageHeader(
    location: StorageLocation?,
    subFoldersCount: Int = 0,
    subFilesCount: Int = 0,
    modifier: Modifier = Modifier
) {
    val diskName = when {
        location?.rootId == "sdcard" -> stringResource(R.string.label_sd_card)
        location?.rootId == "root" -> stringResource(R.string.label_root)
        else -> stringResource(R.string.label_internal_shared_storage)
    }

    val pathDisplay = location?.path?.ifEmpty { Environment.getExternalStorageDirectory().absolutePath } ?: Environment.getExternalStorageDirectory().absolutePath

    var freeSpaceText by remember { mutableStateOf("...") }
    var totalSpaceText by remember { mutableStateOf("...") }
    var usedPercentage by remember { mutableStateOf(0f) }
    
    LaunchedEffect(pathDisplay) {
        withContext(Dispatchers.IO) {
            try {
                val statFs = StatFs(pathDisplay)
                val blockSize = statFs.blockSizeLong
                val totalBlocks = statFs.blockCountLong
                val availableBlocks = statFs.availableBlocksLong
                
                val totalBytes = totalBlocks * blockSize
                val freeBytes = availableBlocks * blockSize
                val usedBytes = totalBytes - freeBytes
                
                freeSpaceText = ByteFormatter.format(freeBytes)
                totalSpaceText = ByteFormatter.format(totalBytes)
                usedPercentage = if (totalBytes > 0) {
                    (usedBytes.toFloat() / totalBytes.toFloat())
                } else {
                    0f
                }
            } catch (e: IllegalArgumentException) {
                // Ignore or handle invalid path
            }
        }
    }

    StorageDiskBar(
        name = diskName,
        path = pathDisplay,
        subFoldersCount = subFoldersCount,
        subFilesCount = subFilesCount,
        freeSpaceText = freeSpaceText,
        totalSpaceText = totalSpaceText,
        usedPercentage = usedPercentage,
        isExternal = location?.rootId == "sdcard",
        isSelected = true,
        isExpanded = true,
        modifier = modifier
    )
}



