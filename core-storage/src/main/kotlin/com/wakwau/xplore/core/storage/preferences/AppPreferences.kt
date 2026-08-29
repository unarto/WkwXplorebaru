// [Jalur Class]: com.wakwau.xplore.core.storage.preferences.AppPreferences
// [Penjelasan]: Helper/Class pengelolaan MMKV untuk menyimpan dan membaca preferensi sort order, sort direction, layout mode, flag hidden files, dan last visited path.
package com.wakwau.xplore.core.storage.preferences

import com.tencent.mmkv.MMKV
import com.wakwau.xplore.core.storage.constant.StorageConstants
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AppPreferences(
    private val mmkv: MMKV = MMKV.defaultMMKV()
) : AppPreferencesRepository {

    private val _preferencesState = MutableStateFlow(loadInitialPreferences())
    override val preferencesState: StateFlow<FilePreferencesState> = _preferencesState.asStateFlow()

    override fun getPreferencesState(): FilePreferencesState {
        return _preferencesState.value
    }

    private fun loadInitialPreferences(): FilePreferencesState {
        val sortOrderName = mmkv.decodeString(StorageConstants.Preferences.KEY_SORT_ORDER, FileSortOrder.NAME.name) ?: FileSortOrder.NAME.name
        val sortOrder = runCatching { FileSortOrder.valueOf(sortOrderName) }.getOrDefault(FileSortOrder.NAME)

        val sortDirName = mmkv.decodeString(StorageConstants.Preferences.KEY_SORT_DIRECTION, FileSortDirection.ASCENDING.name) ?: FileSortDirection.ASCENDING.name
        val sortDirection = runCatching { FileSortDirection.valueOf(sortDirName) }.getOrDefault(FileSortDirection.ASCENDING)

        val layoutModeName = mmkv.decodeString(StorageConstants.Preferences.KEY_LAYOUT_MODE, FileLayoutMode.LIST.name) ?: FileLayoutMode.LIST.name
        val layoutMode = runCatching { FileLayoutMode.valueOf(layoutModeName) }.getOrDefault(FileLayoutMode.LIST)

        val showHiddenFiles = mmkv.decodeBool(StorageConstants.Preferences.KEY_SHOW_HIDDEN_FILES, false)
        val lastVisitedPath = mmkv.decodeString(StorageConstants.Preferences.KEY_LAST_VISITED_PATH, FilePreferencesState.DEFAULT_PATH) ?: FilePreferencesState.DEFAULT_PATH

        return FilePreferencesState(
            sortOrder = sortOrder,
            sortDirection = sortDirection,
            layoutMode = layoutMode,
            showHiddenFiles = showHiddenFiles,
            lastVisitedPath = lastVisitedPath
        )
    }

    override suspend fun setSortOrder(sortOrder: FileSortOrder) {
        mmkv.encode(StorageConstants.Preferences.KEY_SORT_ORDER, sortOrder.name)
        _preferencesState.value = _preferencesState.value.copy(sortOrder = sortOrder)
    }

    override suspend fun setSortDirection(sortDirection: FileSortDirection) {
        mmkv.encode(StorageConstants.Preferences.KEY_SORT_DIRECTION, sortDirection.name)
        _preferencesState.value = _preferencesState.value.copy(sortDirection = sortDirection)
    }

    override suspend fun setLayoutMode(layoutMode: FileLayoutMode) {
        mmkv.encode(StorageConstants.Preferences.KEY_LAYOUT_MODE, layoutMode.name)
        _preferencesState.value = _preferencesState.value.copy(layoutMode = layoutMode)
    }

    override suspend fun setShowHiddenFiles(showHiddenFiles: Boolean) {
        mmkv.encode(StorageConstants.Preferences.KEY_SHOW_HIDDEN_FILES, showHiddenFiles)
        _preferencesState.value = _preferencesState.value.copy(showHiddenFiles = showHiddenFiles)
    }

    override suspend fun setLastVisitedPath(lastVisitedPath: String) {
        mmkv.encode(StorageConstants.Preferences.KEY_LAST_VISITED_PATH, lastVisitedPath)
        _preferencesState.value = _preferencesState.value.copy(lastVisitedPath = lastVisitedPath)
    }
}
