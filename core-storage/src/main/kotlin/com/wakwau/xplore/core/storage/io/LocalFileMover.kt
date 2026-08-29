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
import java.io.FileNotFoundException
import java.io.IOException
import kotlin.coroutines.coroutineContext

// [Jalur Class]: com.wakwau.xplore.core.storage.io.LocalFileMover
// [Penjelasan]: Implementasi nyata fungsi memindahkan byte untuk File lokal maupun SAF. Jika dalam satu partisi, gunakan renameTo(), jika beda gunakan Copier + Deleter.
class LocalFileMover(
    private val context: Context? = null,
    private val fileCopier: LocalFileCopier = LocalFileCopier(context),
    private val fileDeleter: LocalFileDeleter = LocalFileDeleter(context)
) {
    constructor(fileCopier: LocalFileCopier, fileDeleter: LocalFileDeleter) : this(null, fileCopier, fileDeleter)

    fun move(sourcePath: String, destPath: String): Flow<FileOperationProgress> = flow {
        if (sourcePath.startsWith("content://") || destPath.startsWith("content://")) {
            fileCopier.copy(sourcePath, destPath).collect { progress ->
                emit(progress)
            }
            if (coroutineContext.isActive) {
                fileDeleter.delete(sourcePath)
            }
        } else {
            val sourceFile = File(sourcePath)
            val destFile = File(destPath)
            
            if (!sourceFile.exists()) {
                throw FileNotFoundException("Source not found: $sourcePath")
            }
            
            val sourceCanonical = sourceFile.canonicalPath
            val destCanonical = destFile.canonicalPath

            if (sourceCanonical == destCanonical) {
                throw IOException("Source and destination are the same")
            }
            
            if (sourceFile.isDirectory && destCanonical.startsWith(sourceCanonical + File.separator)) {
                throw IOException("Cannot move a directory into itself")
            }
            
            // Try atomic rename first
            val renamed = sourceFile.renameTo(destFile)
            if (renamed) {
                emit(FileOperationProgress(sourceFile.length(), sourceFile.length(), sourceFile.name))
                return@flow
            }
            
            // Fallback to copy and delete if rename fails (e.g. cross mount point)
            fileCopier.copy(sourcePath, destPath).collect { progress ->
                emit(progress)
            }
            
            if (coroutineContext.isActive) {
                fileDeleter.delete(sourcePath)
            }
        }
    }.flowOn(Dispatchers.IO)
}
