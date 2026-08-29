// [Jalur Class]: com.wakwau.xplore.filemanager.ui.action.MoveOperationHandler
// [Penjelasan]: Handler operasi pemindahan berkas/direktori dengan integrasi FileOperationConstants dan pembaruan kedua panel.
package com.wakwau.xplore.filemanager.ui.action

import com.wakwau.xplore.core.storage.model.FileItem
import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.core.storage.operation.FileOperationProgress
import com.wakwau.xplore.core.storage.operation.FileOperationResult
import com.wakwau.xplore.filemanager.ui.constant.FileOperationConstants
import com.wakwau.xplore.filemanager.ui.event.DualPaneEvent
import com.wakwau.xplore.filemanager.ui.state.DualPaneState
import com.wakwau.xplore.filemanager.usecase.MoveFilesUseCase
import kotlinx.coroutines.CancellationException

class MoveOperationHandler(
    private val moveFilesUseCase: MoveFilesUseCase,
    private val dispatch: (DualPaneEvent) -> Unit
) {
    suspend fun execute(state: DualPaneState, itemsToMove: List<FileItem>, targetPath: String) {
        val sourcePanel = state.activePanel
        val destPanel = state.inactivePanel
        
        val destLocation = StorageLocation(path = targetPath, rootId = destPanel.currentLocation?.rootId ?: "unknown")
        if (itemsToMove.isEmpty()) return
        
        dispatch(DualPaneEvent.OperationStarted(FileOperationConstants.OPERATION_MOVE))
        try {
            val sources = itemsToMove.map { it.location }
            var isFailed = false
            var isCancelled = false
            moveFilesUseCase.invoke(sources, destLocation).collect { result ->
                when (result) {
                    is FileOperationResult.Success -> {
                        dispatch(DualPaneEvent.OperationProgress(result.data))
                    }
                    is FileOperationResult.Failure -> {
                        dispatch(DualPaneEvent.OperationFailed(result.error.name))
                        isFailed = true
                    }
                    is FileOperationResult.Cancelled -> {
                        dispatch(DualPaneEvent.OperationCancelled)
                        isCancelled = true
                    }
                }
            }
            if (!isFailed && !isCancelled) {
                dispatch(DualPaneEvent.OperationSuccess(FileOperationConstants.SUCCESS_MOVE))
                dispatch(DualPaneEvent.Refresh(sourcePanel.id))
                dispatch(DualPaneEvent.Refresh(destPanel.id))
                dispatch(DualPaneEvent.ClearSelection(sourcePanel.id))
            }
        } catch (e: CancellationException) {
            dispatch(DualPaneEvent.OperationCancelled)
            throw e
        }
    }
}
