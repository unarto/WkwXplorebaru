// [Jalur Class]: com.wakwau.xplore.filemanager.ui.action.CopyOperationHandler
// [Penjelasan]: Handler operasi penyalinan berkas/direktori dengan integrasi FileOperationConstants dan progress tracking.
package com.wakwau.xplore.filemanager.ui.action

import com.wakwau.xplore.core.storage.model.FileItem
import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.core.storage.operation.FileOperationProgress
import com.wakwau.xplore.core.storage.operation.FileOperationResult
import com.wakwau.xplore.filemanager.ui.constant.FileOperationConstants
import com.wakwau.xplore.filemanager.ui.event.DualPaneEvent
import com.wakwau.xplore.filemanager.ui.state.DualPaneState
import com.wakwau.xplore.filemanager.usecase.CopyFilesUseCase
import kotlinx.coroutines.CancellationException

class CopyOperationHandler(
    private val copyFilesUseCase: CopyFilesUseCase,
    private val dispatch: (DualPaneEvent) -> Unit
) {
    suspend fun execute(state: DualPaneState, itemsToCopy: List<FileItem>, targetPath: String) {
        val sourcePanel = state.activePanel
        val destPanel = state.inactivePanel
        
        val destLocation = StorageLocation(path = targetPath, rootId = destPanel.currentLocation?.rootId ?: "unknown")
        
        if (itemsToCopy.isEmpty()) return
        
        dispatch(DualPaneEvent.OperationStarted(FileOperationConstants.OPERATION_COPY))
        try {
            val sources = itemsToCopy.map { it.location }
            var isFailed = false
            var isCancelled = false
            
            copyFilesUseCase.invoke(sources, destLocation).collect { result ->
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
                dispatch(DualPaneEvent.OperationSuccess(FileOperationConstants.SUCCESS_COPY))
                dispatch(DualPaneEvent.Refresh(destPanel.id))
                dispatch(DualPaneEvent.ClearSelection(sourcePanel.id))
            }
        } catch (e: CancellationException) {
            dispatch(DualPaneEvent.OperationCancelled)
            throw e
        }
    }
}
