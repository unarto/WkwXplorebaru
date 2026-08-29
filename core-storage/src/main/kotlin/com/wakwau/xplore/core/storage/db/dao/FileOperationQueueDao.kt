// [Jalur Class]: com.wakwau.xplore.core.storage.db.dao.FileOperationQueueDao
// [Penjelasan]: Data Access Object (DAO) untuk pengelolaan antrean tugas operasi berkas pada database Room.
package com.wakwau.xplore.core.storage.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.wakwau.xplore.core.storage.db.entity.FileOperationQueueEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface FileOperationQueueDao {
    @Query("SELECT * FROM file_operation_queue ORDER BY id ASC")
    fun getAllQueue(): Flow<List<FileOperationQueueEntity>>

    @Query("SELECT * FROM file_operation_queue WHERE status = :status ORDER BY id ASC")
    fun getQueueByStatus(status: String): Flow<List<FileOperationQueueEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entity: FileOperationQueueEntity): Long

    @Query("UPDATE file_operation_queue SET status = :status, progress = :progress WHERE id = :id")
    suspend fun updateProgress(id: Long, status: String, progress: Float)

    @Query("DELETE FROM file_operation_queue WHERE id = :id")
    suspend fun deleteById(id: Long)

    @Query("DELETE FROM file_operation_queue WHERE status = 'COMPLETED'")
    suspend fun clearCompleted()
}
