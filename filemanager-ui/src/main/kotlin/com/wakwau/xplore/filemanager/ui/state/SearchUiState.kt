package com.wakwau.xplore.filemanager.ui.state

import com.wakwau.xplore.core.storage.model.FileItem

data class SearchUiState(
    val isSearchDialogOpen: Boolean = false,
    val isSearching: Boolean = false,
    val searchError: String? = null
)
