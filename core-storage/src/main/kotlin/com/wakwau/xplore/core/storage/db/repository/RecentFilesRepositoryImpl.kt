// [Jalur Class]: com.wakwau.xplore.core.storage.db.repository.RecentFilesRepositoryImpl
// [Penjelasan]: Implementasi RecentFilesRepository yang menjembatani panggilan operasi berkas riwayat ke RecentFileDao.
package com.wakwau.xplore.core.storage.db.repository

import com.wakwau.xplore.core.storage.db.dao.RecentFileDao
import com.wakwau.xplore.core.storage.db.entity.RecentFileEntity
import kotlinx.coroutines.flow.Flow

class RecentFilesRepositoryImpl(
    private val recentFileDao: RecentFileDao
) : RecentFilesRepository {

    override val recentFiles: Flow<List<RecentFileEntity>> = recentFileDao.getAllRecentFiles()

    override suspend fun recordFileAccess(filePath: String, fileType: String) {
        val entity = RecentFileEntity(
            filePath = filePath,
            lastAccessedTimestamp = System.currentTimeMillis(),
            fileType = fileType
        )
        recentFileDao.insertOrUpdate(entity)
    }

    override suspend fun removeRecentFile(filePath: String) {
        recentFileDao.deleteByPath(filePath)
    }

    override suspend fun clearAllRecentFiles() {
        recentFileDao.clearAll()
    }
}
