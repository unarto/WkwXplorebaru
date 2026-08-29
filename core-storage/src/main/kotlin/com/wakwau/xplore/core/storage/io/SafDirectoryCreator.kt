// [Jalur Class]: com.wakwau.xplore.core.storage.io.SafDirectoryCreator
// [Penjelasan]: Menangani pembuatan direktori nyata pada Storage Access Framework (SAF) menggunakan DocumentFile.
package com.wakwau.xplore.core.storage.io

import android.content.Context
import android.net.Uri
import androidx.documentfile.provider.DocumentFile
import com.wakwau.xplore.core.storage.model.FileItem
import com.wakwau.xplore.core.storage.model.FileMetadata
import com.wakwau.xplore.core.storage.model.FileType
import com.wakwau.xplore.core.storage.model.StorageLocation
import java.io.FileNotFoundException
import java.io.IOException

class SafDirectoryCreator(private val context: Context) {
    fun createDirectory(location: StorageLocation, name: String): FileItem {
        val uri = Uri.parse(location.path)
        val parentDoc = DocumentFile.fromTreeUri(context, uri)
            ?: throw FileNotFoundException("Invalid SAF parent URI: ${location.path}")

        if (!parentDoc.exists() || !parentDoc.isDirectory) {
            throw FileNotFoundException("Parent directory not found in SAF: ${location.path}")
        }

        val createdDir = parentDoc.createDirectory(name)
            ?: throw IOException("Failed to create directory via SAF: $name")

        val createdUri = createdDir.uri.toString()
        val metadata = FileMetadata(
            size = 0L,
            modifiedTime = createdDir.lastModified(),
            createdTime = null,
            isReadable = createdDir.canRead(),
            isWritable = createdDir.canWrite(),
            isExecutable = false,
            isHidden = name.startsWith(".")
        )

        return FileItem(
            id = createdUri,
            name = createdDir.name ?: name,
            location = StorageLocation(path = createdUri, rootId = location.rootId),
            type = FileType.DIRECTORY,
            metadata = metadata
        )
    }
}
