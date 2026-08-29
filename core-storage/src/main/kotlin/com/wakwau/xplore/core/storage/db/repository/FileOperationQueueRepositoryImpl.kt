// [Jalur Class]: com.wakwau.xplore.core.storage.db.repository.FileOperationQueueRepositoryImpl
// [Penjelasan]: Implementasi FileOperationQueueRepository yang mengelola siklus hidup antrean tugas I/O berkas pada Room.
package com.wakwau.xplore.core.storage.db.repository

import com.wakwau.xplore.core.storage.db.dao.FileOperationQueueDao
import com.wakwau.xplore.core.storage.db.entity.FileOperationQueueEntity
import com.wakwau.xplore.core.storage.db.model.FileOperationStatus
import kotlinx.coroutines.flow.Flow

class FileOperationQueueRepositoryImpl(
    private val queueDao: FileOperationQueueDao
) : FileOperationQueueRepository {

    override val operationQueue: Flow<List<FileOperationQueueEntity>> = queueDao.getAllQueue()

    override fun getPendingOperations(): Flow<List<FileOperationQueueEntity>> {
        return queueDao.getQueueByStatus(FileOperationStatus.PENDING.name)
    }

    override suspend fun enqueueOperation(sourcePath: String, targetPath: String, operationType: String): Long {
        val entity = FileOperationQueueEntity(
            sourcePath = sourcePath,
            targetPath = targetPath,
            operationType = operationType,
            status = FileOperationStatus.PENDING.name,
            progress = ZERO_PROGRESS
        )
        return queueDao.insert(entity)
    }

    override suspend fun updateProgress(id: Long, status: FileOperationStatus, progress: Float) {
        queueDao.updateProgress(id, status.name, progress)
    }

    override suspend fun removeOperation(id: Long) {
        queueDao.deleteById(id)
    }

    override suspend fun clearCompletedOperations() {
        queueDao.clearCompleted()
    }

    companion object {
        private const val ZERO_PROGRESS = 0f
    }
}
