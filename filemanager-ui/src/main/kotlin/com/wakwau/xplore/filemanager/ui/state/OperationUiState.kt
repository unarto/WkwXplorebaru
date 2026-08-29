package com.wakwau.xplore.filemanager.ui.state

import com.wakwau.xplore.core.storage.operation.FileOperationProgress

sealed class OperationUiState {
    object Idle : OperationUiState()
    data class Confirming(
        val isMove: Boolean,
        val items: List<com.wakwau.xplore.core.storage.model.FileItem>,
        val targetPath: String
    ) : OperationUiState()
    data class Running(val operationNameRes: Int, val progress: FileOperationProgress? = null) : OperationUiState()
    data class Success(val messageRes: Int) : OperationUiState()
    data class Failure(val errorMessage: String) : OperationUiState()
    object Cancelled : OperationUiState()
}
