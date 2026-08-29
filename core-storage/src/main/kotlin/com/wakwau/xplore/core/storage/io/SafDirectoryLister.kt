// [Jalur Class]: com.wakwau.xplore.core.storage.io.SafDirectoryLister
// [Penjelasan]: Menangani operasi list directory untuk Storage Access Framework (SAF) URI dengan dukungan filter berkas tersembunyi.

package com.wakwau.xplore.core.storage.io

import android.content.Context
import android.net.Uri
import androidx.documentfile.provider.DocumentFile
import com.wakwau.xplore.core.storage.model.FileItem
import com.wakwau.xplore.core.storage.model.FileType
import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.core.storage.model.FileMetadata
import java.io.FileNotFoundException

class SafDirectoryLister(private val context: Context) {
    fun listFiles(location: StorageLocation, showHidden: Boolean = true): List<FileItem> {
        val uri = Uri.parse(location.path)
        val documentFile = DocumentFile.fromTreeUri(context, uri) ?: throw FileNotFoundException("Invalid SAF URI: ${location.path}")
        
        if (!documentFile.exists() || !documentFile.isDirectory) {
            throw FileNotFoundException("Directory not found or is not a directory: ${location.path}")
        }
        
        val files = documentFile.listFiles()
        return files.filter { file ->
            if (!showHidden) {
                file.name?.startsWith(".") != true
            } else {
                true
            }
        }.map { file ->
            val type = if (file.isDirectory) FileType.DIRECTORY else FileType.FILE
            val itemUri = file.uri.toString()
            val metadata = FileMetadata(
                size = if (file.isFile) file.length() else 0L,
                modifiedTime = file.lastModified(),
                createdTime = null,
                isReadable = file.canRead(),
                isWritable = file.canWrite(),
                isExecutable = false,
                isHidden = file.name?.startsWith(".") == true
            )
            FileItem(
                id = itemUri,
                name = file.name ?: "Unknown",
                location = StorageLocation(itemUri, location.rootId),
                type = type,
                metadata = metadata
            )
        }.sortedWith(compareBy({ it.type != FileType.DIRECTORY }, { it.name.lowercase() }))
    }
}
