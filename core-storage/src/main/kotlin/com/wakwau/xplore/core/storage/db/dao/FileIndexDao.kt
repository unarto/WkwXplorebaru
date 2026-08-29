// [Jalur Class]: com.wakwau.xplore.core.storage.db.dao.FileIndexDao
// [Penjelasan]: Data Access Object (DAO) untuk query Room tabel file_index guna pencarian dan pencarian berbasis kategori.
package com.wakwau.xplore.core.storage.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.wakwau.xplore.core.storage.db.entity.FileIndexEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface FileIndexDao {
    @Query("""
        SELECT * FROM file_index 
        WHERE filePath LIKE :locationPrefix || '%'
        AND LOWER(fileName) LIKE '%' || LOWER(:keyword) || '%'
        AND (:minSize IS NULL OR size >= :minSize)
        AND (:maxSize IS NULL OR size <= :maxSize)
        AND (:extension IS NULL OR LOWER(extension) = LOWER(:extension))
        ORDER BY dateModified DESC
    """)
    fun searchFiles(
        locationPrefix: String,
        keyword: String,
        minSize: Long?,
        maxSize: Long?,
        extension: String?
    ): Flow<List<FileIndexEntity>>

    @Query("SELECT * FROM file_index WHERE category = :category ORDER BY dateModified DESC")
    fun getFilesByCategory(category: String): Flow<List<FileIndexEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdate(entity: FileIndexEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdateAll(entities: List<FileIndexEntity>)

    @Query("DELETE FROM file_index WHERE filePath = :filePath")
    suspend fun deleteByPath(filePath: String)

    @Query("DELETE FROM file_index WHERE filePath LIKE :locationPrefix || '%'")
    suspend fun deleteByPrefix(locationPrefix: String)

    @Query("DELETE FROM file_index")
    suspend fun clearAll()
}
