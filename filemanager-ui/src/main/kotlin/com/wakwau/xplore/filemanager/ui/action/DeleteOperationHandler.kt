// [Jalur Class]: com.wakwau.xplore.filemanager.ui.action.DeleteOperationHandler
// [Penjelasan]: Handler operasi penghapusan berkas/direktori terpilih dengan integrasi FileOperationConstants dan pembersihan seleksi.
package com.wakwau.xplore.filemanager.ui.action

import com.wakwau.xplore.core.storage.model.FileItem
import com.wakwau.xplore.core.storage.operation.FileOperationResult
import com.wakwau.xplore.filemanager.ui.constant.FileOperationConstants
import com.wakwau.xplore.filemanager.ui.event.DualPaneEvent
import com.wakwau.xplore.filemanager.ui.state.DualPaneState
import com.wakwau.xplore.filemanager.usecase.DeleteFilesUseCase
import kotlinx.coroutines.CancellationException

class DeleteOperationHandler(
    private val deleteFilesUseCase: DeleteFilesUseCase,
    private val dispatch: (DualPaneEvent) -> Unit
) {
    suspend fun execute(state: DualPaneState, sourceItems: List<FileItem>) {
        val sourcePanel = state.activePanel
        if (sourceItems.isEmpty()) return
        
        dispatch(DualPaneEvent.OperationStarted(FileOperationConstants.OPERATION_DELETE))
        try {
            val locations = sourceItems.map { it.location }
            val result = deleteFilesUseCase(locations)
            
            if (result is FileOperationResult.Failure) {
                dispatch(DualPaneEvent.OperationFailed(result.error.name))
            } else if (result is FileOperationResult.Cancelled) {
                dispatch(DualPaneEvent.OperationCancelled)
            } else {
                dispatch(DualPaneEvent.OperationSuccess(FileOperationConstants.SUCCESS_DELETE))
                dispatch(DualPaneEvent.Refresh(sourcePanel.id))
                dispatch(DualPaneEvent.ClearSelection(sourcePanel.id))
            }
        } catch (e: CancellationException) {
            dispatch(DualPaneEvent.OperationCancelled)
            throw e
        }
    }
}
