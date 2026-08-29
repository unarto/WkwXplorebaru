// [Jalur Class]: com.wakwau.xplore.filemanager.ui.presentation.DualPaneViewModel
// [Penjelasan]: Menangani side effect ToggleShowHiddenFiles untuk mengubah preferensi berkas tersembunyi dan merefresh tree nodes.
package com.wakwau.xplore.filemanager.ui.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wakwau.xplore.filemanager.ui.action.CopyOperationHandler
import com.wakwau.xplore.filemanager.ui.action.CreateDirectoryOperationHandler
import com.wakwau.xplore.filemanager.ui.action.DeleteOperationHandler
import com.wakwau.xplore.filemanager.ui.action.FileDetailHandler
import com.wakwau.xplore.filemanager.ui.action.MoveOperationHandler
import com.wakwau.xplore.filemanager.ui.action.PanelNavigationHandler
import com.wakwau.xplore.filemanager.ui.action.PanelRefreshHandler
import com.wakwau.xplore.filemanager.ui.action.RenameOperationHandler
import com.wakwau.xplore.filemanager.ui.action.SearchOperationHandler
import com.wakwau.xplore.filemanager.ui.event.DualPaneEvent
import com.wakwau.xplore.filemanager.ui.reducer.DualPaneReducer
import com.wakwau.xplore.filemanager.ui.state.DualPaneState
import com.wakwau.xplore.filemanager.ui.state.DualPanelStateController
import com.wakwau.xplore.filemanager.ui.state.PanelId
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

import com.wakwau.xplore.core.storage.preferences.AppPreferencesRepository
import com.wakwau.xplore.filemanager.ui.tree.TreeNavigationAdapter
import com.wakwau.xplore.filemanager.usecase.ToggleShowHiddenFilesUseCase

class DualPaneViewModel(
    private val reducer: DualPaneReducer,
    private val refreshHandler: PanelRefreshHandler,
    private val navigationHandler: PanelNavigationHandler,
    private val copyHandler: CopyOperationHandler,
    private val moveHandler: MoveOperationHandler,
    private val deleteHandler: DeleteOperationHandler,
    private val renameHandler: RenameOperationHandler,
    private val createDirectoryHandler: CreateDirectoryOperationHandler,
    private val fileDetailHandler: FileDetailHandler,
    private val searchOperationHandler: SearchOperationHandler,
    private val appPreferencesRepository: AppPreferencesRepository,
    private val treeNavigationAdapter: TreeNavigationAdapter,
    private val toggleShowHiddenFilesUseCase: ToggleShowHiddenFilesUseCase,
) : ViewModel() {

    // [Jalur Class]: com.wakwau.xplore.filemanager.ui.presentation.DualPaneViewModel
    // [Penjelasan]: Mengontrol pergantian panel aktif melalui callback lambda dispatch MVI.
    val panelStateController = DualPanelStateController { panelId ->
        dispatch(DualPaneEvent.SetActivePanel(panelId))
    }

    private val _state = MutableStateFlow(DualPaneState())
    val state: StateFlow<DualPaneState> = _state.asStateFlow()
    
    val preferencesState = appPreferencesRepository.preferencesState

    fun dispatch(event: DualPaneEvent) {
        val newState = reducer.reduce(_state.value, event)
        _state.value = newState
        
        handleSideEffects(event)
    }

    private fun handleSideEffects(event: DualPaneEvent) {
        val stateSnapshot = _state.value
        
        when (event) {
            is DualPaneEvent.OpenLocation -> {
                viewModelScope.launch {
                    refreshHandler.loadDirectory(event.panelId, event.location)
                }
            }
            is DualPaneEvent.Refresh -> {
                val panel = if (event.panelId == PanelId.LEFT) stateSnapshot.leftPanel else stateSnapshot.rightPanel
                viewModelScope.launch {
                    panel.currentLocation?.let { location ->
                        refreshHandler.loadDirectory(event.panelId, location)
                    }
                    treeNavigationAdapter.refreshAllNodes()
                }
            }
            is DualPaneEvent.NavigateUp -> {
                navigationHandler.handleNavigateUp(stateSnapshot, event.panelId)
            }
            is DualPaneEvent.ExecuteConfirmedCopy -> {
                viewModelScope.launch {
                    copyHandler.execute(stateSnapshot, event.items, event.targetPath)
                }
            }
            is DualPaneEvent.ExecuteConfirmedMove -> {
                viewModelScope.launch {
                    moveHandler.execute(stateSnapshot, event.items, event.targetPath)
                }
            }
            is DualPaneEvent.DeleteSelected -> {
                viewModelScope.launch {
                    deleteHandler.execute(stateSnapshot, event.items)
                }
            }
            is DualPaneEvent.RenameItem -> {
                viewModelScope.launch {
                    renameHandler.execute(stateSnapshot, event.itemId, event.newName)
                }
            }
            is DualPaneEvent.CreateDirectory -> {
                viewModelScope.launch {
                    createDirectoryHandler.execute(stateSnapshot, event.name)
                }
            }
            is DualPaneEvent.ShowFileDetails -> {
                viewModelScope.launch {
                    fileDetailHandler.loadDetails(event.item)
                }
            }
            is DualPaneEvent.CalculateChecksum -> {
                viewModelScope.launch {
                    fileDetailHandler.computeChecksum(event.item)
                }
            }
            is DualPaneEvent.UpdateSortPreferences -> {
                viewModelScope.launch {
                    appPreferencesRepository.setSortOrder(event.fileSortOrder)
                    appPreferencesRepository.setSortDirection(event.fileSortDirection)
                    treeNavigationAdapter.reSortNodes()
                }
            }
            is DualPaneEvent.ToggleShowHiddenFiles -> {
                viewModelScope.launch {
                    toggleShowHiddenFilesUseCase()
                    treeNavigationAdapter.refreshAllNodes()
                }
            }
            is DualPaneEvent.ExecuteSearch -> {
                viewModelScope.launch {
                    searchOperationHandler.executeSearch(event.query)
                }
            }
            is DualPaneEvent.SearchCancelled -> {
                searchOperationHandler.cancelSearch()
            }
            is DualPaneEvent.SearchResultsUpdated -> {
                treeNavigationAdapter.updateSearchResults(stateSnapshot.activePanelId, event.keyword, event.results)
                dispatch(DualPaneEvent.DismissSearchDialog)
            }
            else -> {}
        }
    }
}
