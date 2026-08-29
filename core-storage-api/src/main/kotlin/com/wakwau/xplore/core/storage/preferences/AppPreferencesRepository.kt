// [Jalur Class]: com.wakwau.xplore.core.storage.preferences.AppPreferencesRepository
// [Penjelasan]: Antarmuka kontrak repository untuk membaca dan menyimpan preferensi aplikasi via MMKV.
package com.wakwau.xplore.core.storage.preferences

import kotlinx.coroutines.flow.StateFlow

interface AppPreferencesRepository {
    val preferencesState: StateFlow<FilePreferencesState>
    fun getPreferencesState(): FilePreferencesState
    suspend fun setSortOrder(sortOrder: FileSortOrder)
    suspend fun setSortDirection(sortDirection: FileSortDirection)
    suspend fun setLayoutMode(layoutMode: FileLayoutMode)
    suspend fun setShowHiddenFiles(showHiddenFiles: Boolean)
    suspend fun setLastVisitedPath(lastVisitedPath: String)
}
