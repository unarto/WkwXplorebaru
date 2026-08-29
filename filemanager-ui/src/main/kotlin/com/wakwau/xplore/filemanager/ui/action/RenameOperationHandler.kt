// [Jalur Class]: com.wakwau.xplore.filemanager.ui.action.RenameOperationHandler
// [Penjelasan]: Handler operasi penggantian nama berkas/direktori dengan integrasi FileOperationConstants dan pembaruan panel aktif.
package com.wakwau.xplore.filemanager.ui.action

import com.wakwau.xplore.core.storage.operation.FileOperationResult
import com.wakwau.xplore.filemanager.ui.constant.FileOperationConstants
import com.wakwau.xplore.filemanager.ui.event.DualPaneEvent
import com.wakwau.xplore.filemanager.ui.state.DualPaneState
import com.wakwau.xplore.filemanager.usecase.RenameFileUseCase
import kotlinx.coroutines.CancellationException

class RenameOperationHandler(
    private val renameFileUseCase: RenameFileUseCase,
    private val dispatch: (DualPaneEvent) -> Unit
) {
    suspend fun execute(state: DualPaneState, itemId: String, newName: String) {
        val activePanel = state.activePanel
        val item = activePanel.items.find { it.id == itemId } ?: return
        
        dispatch(DualPaneEvent.OperationStarted(FileOperationConstants.OPERATION_RENAME))
        try {
            val result = renameFileUseCase(item.location, newName)
            when (result) {
                is FileOperationResult.Success -> {
                    dispatch(DualPaneEvent.OperationSuccess(FileOperationConstants.SUCCESS_RENAME))
                    dispatch(DualPaneEvent.Refresh(activePanel.id))
                }
                is FileOperationResult.Failure -> {
                    dispatch(DualPaneEvent.OperationFailed(result.error.name))
                }
                is FileOperationResult.Cancelled -> {
                    dispatch(DualPaneEvent.OperationCancelled)
                }
            }
        } catch (e: CancellationException) {
            throw e
        }
    }
}
