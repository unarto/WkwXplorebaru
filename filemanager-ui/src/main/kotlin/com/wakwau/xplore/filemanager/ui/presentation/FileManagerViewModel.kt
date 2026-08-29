package com.wakwau.xplore.filemanager.ui.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wakwau.xplore.core.storage.model.StorageVolumeItem
import com.wakwau.xplore.core.storage.permission.StoragePermissionType
import com.wakwau.xplore.filemanager.usecase.CheckStoragePermissionUseCase
import com.wakwau.xplore.filemanager.usecase.GetStorageVolumesUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class FileManagerUiState(
    val hasPermission: Boolean = false,
    val requiredPermissionType: StoragePermissionType = StoragePermissionType.READ_WRITE_STORAGE,
    val storageVolumes: List<StorageVolumeItem> = emptyList(),
    val isLoading: Boolean = false
)

class FileManagerViewModel(
    private val getStorageVolumesUseCase: GetStorageVolumesUseCase,
    private val checkStoragePermissionUseCase: CheckStoragePermissionUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(FileManagerUiState())
    val uiState: StateFlow<FileManagerUiState> = _uiState.asStateFlow()

    init {
        checkPermission()
    }

    fun checkPermission() {
        val hasAccess = checkStoragePermissionUseCase.hasPermission()
        val requiredType = checkStoragePermissionUseCase.getRequiredPermission()
        _uiState.update { 
            it.copy(hasPermission = hasAccess, requiredPermissionType = requiredType) 
        }
        if (hasAccess) {
            loadVolumes()
        }
    }

    private fun loadVolumes() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true) }
            getStorageVolumesUseCase.refresh()
            getStorageVolumesUseCase().collect { volumes ->
                _uiState.update { it.copy(storageVolumes = volumes, isLoading = false) }
            }
        }
    }
}
