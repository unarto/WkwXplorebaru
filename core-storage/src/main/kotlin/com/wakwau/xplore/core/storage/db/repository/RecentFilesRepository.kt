// [Jalur Class]: com.wakwau.xplore.core.storage.db.repository.RecentFilesRepository
// [Penjelasan]: Antarmuka kontrak repository pengelolaan riwayat berkas yang baru diakses.
package com.wakwau.xplore.core.storage.db.repository

import com.wakwau.xplore.core.storage.db.entity.RecentFileEntity
import kotlinx.coroutines.flow.Flow

interface RecentFilesRepository {
    val recentFiles: Flow<List<RecentFileEntity>>
    suspend fun recordFileAccess(filePath: String, fileType: String)
    suspend fun removeRecentFile(filePath: String)
    suspend fun clearAllRecentFiles()
}
