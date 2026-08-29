package com.wakwau.xplore.filemanager.ui.dialog

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

sealed class FileDialogState {
    object Hidden : FileDialogState()
    data class RenameDialog(val itemId: String, val currentName: String) : FileDialogState()
    data class CreateDirectoryDialog(val parentPath: String) : FileDialogState()
    data class DeleteConfirmation(val itemIds: List<String>) : FileDialogState()
    data class OverwriteConfirmation(val targetName: String) : FileDialogState()
    data class ErrorDialog(val message: String) : FileDialogState()
}

class FileDialogCoordinator {
    private val _dialogState = MutableStateFlow<FileDialogState>(FileDialogState.Hidden)
    val dialogState: StateFlow<FileDialogState> = _dialogState.asStateFlow()

    fun showRenameDialog(itemId: String, currentName: String) {
        _dialogState.value = FileDialogState.RenameDialog(itemId, currentName)
    }

    fun showCreateDirectoryDialog(parentPath: String) {
        _dialogState.value = FileDialogState.CreateDirectoryDialog(parentPath)
    }

    fun showDeleteConfirmation(itemIds: List<String>) {
        _dialogState.value = FileDialogState.DeleteConfirmation(itemIds)
    }

    fun showOverwriteConfirmation(targetName: String) {
        _dialogState.value = FileDialogState.OverwriteConfirmation(targetName)
    }

    fun showError(message: String) {
        _dialogState.value = FileDialogState.ErrorDialog(message)
    }

    fun dismiss() {
        _dialogState.value = FileDialogState.Hidden
    }
}
