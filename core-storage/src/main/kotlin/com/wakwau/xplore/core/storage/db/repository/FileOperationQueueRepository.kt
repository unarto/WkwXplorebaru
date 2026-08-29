// [Jalur Class]: com.wakwau.xplore.core.storage.db.repository.FileOperationQueueRepository
// [Penjelasan]: Antarmuka kontrak repository untuk mengelola antrean tugas operasi berkas (copy/move/extract).
package com.wakwau.xplore.core.storage.db.repository

import com.wakwau.xplore.core.storage.db.entity.FileOperationQueueEntity
import com.wakwau.xplore.core.storage.db.model.FileOperationStatus
import kotlinx.coroutines.flow.Flow

interface FileOperationQueueRepository {
    val operationQueue: Flow<List<FileOperationQueueEntity>>
    fun getPendingOperations(): Flow<List<FileOperationQueueEntity>>
    suspend fun enqueueOperation(sourcePath: String, targetPath: String, operationType: String): Long
    suspend fun updateProgress(id: Long, status: FileOperationStatus, progress: Float)
    suspend fun removeOperation(id: Long)
    suspend fun clearCompletedOperations()
}
