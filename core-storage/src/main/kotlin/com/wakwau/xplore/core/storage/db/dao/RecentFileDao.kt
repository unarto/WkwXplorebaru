// [Jalur Class]: com.wakwau.xplore.core.storage.db.dao.RecentFileDao
// [Penjelasan]: Data Access Object (DAO) untuk query Room tabel recent_files.
package com.wakwau.xplore.core.storage.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.wakwau.xplore.core.storage.db.entity.RecentFileEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface RecentFileDao {
    @Query("SELECT * FROM recent_files ORDER BY lastAccessedTimestamp DESC")
    fun getAllRecentFiles(): Flow<List<RecentFileEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdate(entity: RecentFileEntity)

    @Query("DELETE FROM recent_files WHERE filePath = :filePath")
    suspend fun deleteByPath(filePath: String)

    @Query("DELETE FROM recent_files")
    suspend fun clearAll()
}
