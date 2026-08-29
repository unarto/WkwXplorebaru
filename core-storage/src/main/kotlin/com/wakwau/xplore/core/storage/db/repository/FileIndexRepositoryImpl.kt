// [Jalur Class]: com.wakwau.xplore.core.storage.db.repository.FileIndexRepositoryImpl
// [Penjelasan]: Implementasi FileIndexRepository yang mengeksekusi query pencarian dan indeks berkas via FileIndexDao.
package com.wakwau.xplore.core.storage.db.repository

import com.wakwau.xplore.core.storage.db.dao.FileIndexDao
import com.wakwau.xplore.core.storage.db.entity.FileIndexEntity
import kotlinx.coroutines.flow.Flow

class FileIndexRepositoryImpl(
    private val fileIndexDao: FileIndexDao
) : FileIndexRepository {

    override fun searchFiles(
        locationPrefix: String,
        keyword: String,
        minSize: Long?,
        maxSize: Long?,
        extension: String?
    ): Flow<List<FileIndexEntity>> {
        return fileIndexDao.searchFiles(
            locationPrefix = locationPrefix,
            keyword = keyword,
            minSize = minSize,
            maxSize = maxSize,
            extension = extension
        )
    }

    override fun getFilesByCategory(category: String): Flow<List<FileIndexEntity>> {
        return fileIndexDao.getFilesByCategory(category)
    }

    override suspend fun addOrUpdateIndex(entity: FileIndexEntity) {
        fileIndexDao.insertOrUpdate(entity)
    }

    override suspend fun addOrUpdateIndexBatch(entities: List<FileIndexEntity>) {
        fileIndexDao.insertOrUpdateAll(entities)
    }

    override suspend fun removeIndex(filePath: String) {
        fileIndexDao.deleteByPath(filePath)
    }

    override suspend fun removeIndexByPrefix(locationPrefix: String) {
        fileIndexDao.deleteByPrefix(locationPrefix)
    }

    override suspend fun clearIndex() {
        fileIndexDao.clearAll()
    }
}
