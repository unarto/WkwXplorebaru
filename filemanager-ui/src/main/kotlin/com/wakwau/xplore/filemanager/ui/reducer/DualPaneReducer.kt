// [Jalur Class]: com.wakwau.xplore.filemanager.ui.reducer.DualPaneReducer
// [Penjelasan]: Reducer murni untuk mengolah transisi status immutable saat membuka bottom sheet detail metadata berkas dan status perhitungan checksum.
package com.wakwau.xplore.filemanager.ui.reducer

import com.wakwau.xplore.filemanager.ui.event.DualPaneEvent
import com.wakwau.xplore.filemanager.ui.state.ChecksumState
import com.wakwau.xplore.filemanager.ui.state.DualPaneState
import com.wakwau.xplore.filemanager.ui.state.FileDetailState
import com.wakwau.xplore.filemanager.ui.state.OperationUiState
import com.wakwau.xplore.filemanager.ui.state.PanelId
import com.wakwau.xplore.filemanager.ui.state.PanelState

class DualPaneReducer {

    fun reduce(state: DualPaneState, event: DualPaneEvent): DualPaneState {
        return when (event) {
            is DualPaneEvent.SetActivePanel -> {
                state.copy(activePanelId = event.panelId)
            }
            is DualPaneEvent.OpenLocation -> {
                updatePanel(state, event.panelId) {
                    it.copy(currentLocation = event.location, isLoading = true, error = null)
                }
            }
            is DualPaneEvent.LoadingStarted -> {
                updatePanel(state, event.panelId) {
                    it.copy(isLoading = true, error = null)
                }
            }
            is DualPaneEvent.DirectoryLoaded -> {
                updatePanel(state, event.panelId) {
                    it.copy(
                        currentLocation = event.location,
                        items = event.items,
                        isLoading = false,
                        error = null,
                        selectedItemIds = emptySet() // clear selection on load
                    )
                }
            }
            is DualPaneEvent.DirectoryLoadFailed -> {
                updatePanel(state, event.panelId) {
                    it.copy(isLoading = false, error = event.error)
                }
            }
            is DualPaneEvent.SelectItem -> {
                updatePanel(state, event.panelId) {
                    it.copy(selectedItemIds = setOf(event.itemId))
                }
            }
            is DualPaneEvent.ToggleSelection -> {
                updatePanel(state, event.panelId) {
                    val newSelection = if (it.selectedItemIds.contains(event.itemId)) {
                        it.selectedItemIds - event.itemId
                    } else {
                        it.selectedItemIds + event.itemId
                    }
                    it.copy(selectedItemIds = newSelection)
                }
            }
            is DualPaneEvent.SetSelectedItems -> {
                updatePanel(state, event.panelId) {
                    it.copy(selectedItemIds = event.itemIds)
                }
            }
            is DualPaneEvent.ClearSelection -> {
                updatePanel(state, event.panelId) {
                    it.copy(selectedItemIds = emptySet())
                }
            }
            is DualPaneEvent.SetSortMode -> {
                updatePanel(state, event.panelId) {
                    it.copy(sortMode = event.sortMode)
                }
            }
            is DualPaneEvent.SetSortOrder -> {
                updatePanel(state, event.panelId) {
                    it.copy(sortOrder = event.sortOrder)
                }
            }
            // Operation Results
            is DualPaneEvent.ShowOperationConfirmation -> {
                state.copy(operationState = OperationUiState.Confirming(
                    isMove = event.isMove,
                    items = event.items,
                    targetPath = event.targetPath
                ))
            }
            is DualPaneEvent.OperationStarted -> {
                state.copy(operationState = OperationUiState.Running(event.operationNameRes))
            }
            is DualPaneEvent.OperationProgress -> {
                val currentOpState = state.operationState
                if (currentOpState is OperationUiState.Running) {
                    state.copy(operationState = currentOpState.copy(
                        progress = event.progress
                    ))
                } else {
                    state
                }
            }
            is DualPaneEvent.OperationSuccess -> {
                state.copy(operationState = OperationUiState.Success(event.messageRes))
            }
            is DualPaneEvent.OperationFailed -> {
                state.copy(operationState = OperationUiState.Failure(event.error))
            }
            is DualPaneEvent.OperationCancelled -> {
                state.copy(operationState = OperationUiState.Cancelled)
            }
            is DualPaneEvent.ClearOperationState -> {
                state.copy(operationState = OperationUiState.Idle)
            }

            // File Details & Checksum
            is DualPaneEvent.ShowFileDetails -> {
                state.copy(
                    fileDetailState = FileDetailState(
                        isVisible = true,
                        selectedItem = event.item,
                        isLoadingMetadata = true,
                        checksumState = ChecksumState.Idle
                    )
                )
            }
            is DualPaneEvent.DismissFileDetails -> {
                state.copy(fileDetailState = FileDetailState(isVisible = false))
            }
            is DualPaneEvent.FileDetailsLoadingStarted -> {
                state.copy(fileDetailState = state.fileDetailState.copy(isLoadingMetadata = true, errorMessage = null))
            }
            is DualPaneEvent.FileDetailsLoaded -> {
                state.copy(fileDetailState = state.fileDetailState.copy(isLoadingMetadata = false, metadata = event.metadata, errorMessage = null))
            }
            is DualPaneEvent.FileDetailsFailed -> {
                state.copy(fileDetailState = state.fileDetailState.copy(isLoadingMetadata = false, errorRes = event.errorRes, errorMessage = event.errorMessage))
            }
            is DualPaneEvent.ChecksumCalculationStarted -> {
                state.copy(fileDetailState = state.fileDetailState.copy(checksumState = ChecksumState.Calculating))
            }
            is DualPaneEvent.ChecksumCalculated -> {
                state.copy(fileDetailState = state.fileDetailState.copy(checksumState = ChecksumState.Success(event.checksum)))
            }
            is DualPaneEvent.ChecksumCalculationFailed -> {
                state.copy(fileDetailState = state.fileDetailState.copy(checksumState = ChecksumState.Error(event.errorRes, event.errorMessage)))
            }
            is DualPaneEvent.CalculateChecksum -> {
                state.copy(fileDetailState = state.fileDetailState.copy(checksumState = ChecksumState.Calculating))
            }

            // Search
            is DualPaneEvent.SearchIconClicked -> {
                state.copy(searchUiState = state.searchUiState.copy(isSearchDialogOpen = true))
            }
            is DualPaneEvent.DismissSearchDialog -> {
                state.copy(searchUiState = state.searchUiState.copy(isSearchDialogOpen = false, searchError = null, isSearching = false))
            }
            is DualPaneEvent.SearchStarted -> {
                state.copy(searchUiState = state.searchUiState.copy(isSearching = true, searchError = null))
            }
            is DualPaneEvent.SearchResultsUpdated -> {
                state.copy(searchUiState = state.searchUiState.copy(isSearching = false))
            }
            is DualPaneEvent.SearchFailed -> {
                state.copy(searchUiState = state.searchUiState.copy(searchError = event.error, isSearching = false))
            }
            is DualPaneEvent.SearchCancelled -> {
                state.copy(searchUiState = state.searchUiState.copy(isSearching = false))
            }

            // Intents that don't directly modify state synchronously without external result
            is DualPaneEvent.ExecuteSearch,
            is DualPaneEvent.NavigateUp,
            is DualPaneEvent.Refresh,
            is DualPaneEvent.ExecuteConfirmedCopy,
            is DualPaneEvent.ExecuteConfirmedMove,
            is DualPaneEvent.DeleteSelected,
            is DualPaneEvent.RenameItem,
            is DualPaneEvent.CreateDirectory,
            is DualPaneEvent.UpdateSortPreferences,
            is DualPaneEvent.ToggleShowHiddenFiles -> {
                state // Reducer does not perform side effects. It returns current state.
            }
        }
    }

    private fun updatePanel(
        state: DualPaneState,
        panelId: PanelId,
        updater: (PanelState) -> PanelState
    ): DualPaneState {
        return if (panelId == PanelId.LEFT) {
            state.copy(leftPanel = updater(state.leftPanel))
        } else {
            state.copy(rightPanel = updater(state.rightPanel))
        }
    }
}
