package com.wakwau.xplore.core.storage.io

import android.content.Context
import android.net.Uri
import androidx.documentfile.provider.DocumentFile
import java.io.File
import java.io.FileNotFoundException
import java.io.IOException

// [Jalur Class]: com.wakwau.xplore.core.storage.io.LocalFileDeleter
// [Penjelasan]: Implementasi nyata fungsi menghapus byte untuk File lokal maupun SAF.
class LocalFileDeleter(private val context: Context? = null) {
    fun delete(path: String) {
        if (path.startsWith("content://")) {
            val ctx = context ?: throw IllegalStateException("Context is required for SAF content:// operations")
            val documentFile = DocumentFile.fromSingleUri(ctx, Uri.parse(path))
            if (documentFile != null && documentFile.exists()) {
                if (!documentFile.delete()) {
                    throw IOException("Failed to delete SAF file: $path")
                }
            } else {
                throw FileNotFoundException("File not found: $path")
            }
        } else {
            val file = File(path)
            if (!file.exists()) {
                throw FileNotFoundException("File not found: $path")
            }
            val deleted = if (file.isDirectory) {
                file.deleteRecursively()
            } else {
                file.delete()
            }
            if (!deleted) {
                throw IOException("Failed to delete file: $path")
            }
        }
    }
}
