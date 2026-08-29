package com.wakwau.xplore.core.storage.io

import android.content.Context
import android.net.Uri
import androidx.documentfile.provider.DocumentFile
import com.wakwau.xplore.core.storage.operation.FileOperationProgress
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.isActive
import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.InputStream
import java.io.OutputStream
import kotlin.coroutines.coroutineContext

// [Jalur Class]: com.wakwau.xplore.core.storage.io.LocalFileCopier
// [Penjelasan]: Implementasi nyata fungsi penyalinan byte untuk File lokal maupun DocumentFile (SAF) secara real-time via Flow<FileOperationProgress>.
class LocalFileCopier(private val context: Context? = null) {
    fun copy(sourcePath: String, destPath: String): Flow<FileOperationProgress> = flow {
        if (sourcePath.startsWith("content://") || destPath.startsWith("content://")) {
            val ctx = context ?: throw IllegalStateException("Context is required for SAF content:// operations")
            val sourceDoc = DocumentFile.fromSingleUri(ctx, Uri.parse(sourcePath))
                ?: throw FileNotFoundException("Source SAF file not found: $sourcePath")
            val destDoc = DocumentFile.fromTreeUri(ctx, Uri.parse(destPath))
                ?: throw FileNotFoundException("Destination SAF folder not found: $destPath")
            
            if (sourcePath == destPath) {
                throw IllegalArgumentException("Source and destination are the same")
            }
            
            val newFile = destDoc.createFile(sourceDoc.type ?: "*/*", sourceDoc.name ?: "Unknown")
                ?: throw IllegalArgumentException("Failed to create destination SAF file")
            
            val totalBytes = sourceDoc.length()
            val input = ctx.contentResolver.openInputStream(sourceDoc.uri)
                ?: throw FileNotFoundException("Cannot open input stream")
            val output = ctx.contentResolver.openOutputStream(newFile.uri)
                ?: throw FileNotFoundException("Cannot open output stream")
            
            copyStream(input, output, sourceDoc.name ?: "Unknown", totalBytes) { progress ->
                emit(progress)
            }
        } else {
            val sourceFile = File(sourcePath)
            val destFile = File(destPath)
            
            if (!sourceFile.exists()) {
                throw FileNotFoundException("Source not found: $sourcePath")
            }
            
            if (sourceFile.absolutePath == destFile.absolutePath) {
                throw IllegalArgumentException("Source and destination are the same")
            }
            
            if (sourceFile.isDirectory && destFile.absolutePath.startsWith(sourceFile.absolutePath + File.separator)) {
                throw IllegalArgumentException("Cannot copy a directory into itself")
            }
            
            var totalCopied = 0L
            val totalBytes = if (sourceFile.isDirectory) calculateTotalSize(sourceFile) else sourceFile.length()
            
            if (sourceFile.isDirectory) {
                copyDirectoryRecursively(sourceFile, destFile, totalBytes) { incrementalBytes, fileName ->
                    totalCopied += incrementalBytes
                    emit(FileOperationProgress(totalCopied, totalBytes, fileName))
                }
            } else {
                copySingleFile(sourceFile, destFile, totalBytes) { incrementalBytes, fileName ->
                    totalCopied += incrementalBytes
                    emit(FileOperationProgress(totalCopied, totalBytes, fileName))
                }
            }
        }
    }.flowOn(Dispatchers.IO)
    
    private suspend fun copyStream(input: InputStream, output: OutputStream, fileName: String, totalBytes: Long, onProgress: suspend (FileOperationProgress) -> Unit) {
        val buffer = ByteArray(8192)
        var totalCopied = 0L
        input.use { inStream ->
            output.use { outStream ->
                var bytesRead: Int
                while (inStream.read(buffer).also { bytesRead = it } >= 0) {
                    if (!coroutineContext.isActive) {
                        throw kotlinx.coroutines.CancellationException("Copy cancelled")
                    }
                    outStream.write(buffer, 0, bytesRead)
                    totalCopied += bytesRead
                    onProgress(FileOperationProgress(totalCopied, totalBytes, fileName))
                }
            }
        }
    }
    
    private suspend fun copySingleFile(source: File, dest: File, totalBytes: Long, onProgress: suspend (Long, String) -> Unit) {
        val buffer = ByteArray(8192)
        
        FileInputStream(source).use { input ->
            FileOutputStream(dest).use { output ->
                var bytesRead: Int
                while (input.read(buffer).also { bytesRead = it } >= 0) {
                    if (!coroutineContext.isActive) {
                        dest.delete() 
                        throw kotlinx.coroutines.CancellationException("Copy cancelled")
                    }
                    output.write(buffer, 0, bytesRead)
                    onProgress(bytesRead.toLong(), source.name)
                }
            }
        }
    }
    
    private suspend fun copyDirectoryRecursively(sourceDir: File, destDir: File, totalBytes: Long, onProgress: suspend (Long, String) -> Unit) {
        if (!destDir.exists()) {
            destDir.mkdirs()
        }
        val destDirCanonical = destDir.canonicalPath
        val files = sourceDir.listFiles() ?: return
        for (file in files) {
            if (!coroutineContext.isActive) {
                throw kotlinx.coroutines.CancellationException("Copy cancelled")
            }
            val destFile = File(destDir, file.name)
            val destFileCanonical = destFile.canonicalPath
            if (!destFileCanonical.startsWith(destDirCanonical + File.separator) && destFileCanonical != destDirCanonical) {
                throw SecurityException("Path traversal attempt detected during copy: ${file.name}")
            }
            if (file.isDirectory) {
                copyDirectoryRecursively(file, destFile, totalBytes, onProgress)
            } else {
                copySingleFile(file, destFile, totalBytes, onProgress)
            }
        }
    }
    
    private fun calculateTotalSize(dir: File): Long {
        var size = 0L
        val files = dir.listFiles() ?: return 0
        for (file in files) {
            if (file.isDirectory) {
                size += calculateTotalSize(file)
            } else {
                size += file.length()
            }
        }
        return size
    }
}
