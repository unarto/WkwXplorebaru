package com.wakwau.xplore.filemanager.ui.event

import com.wakwau.xplore.core.storage.model.FileItem
import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.filemanager.ui.state.PanelId
import com.wakwau.xplore.filemanager.ui.state.SortMode
import com.wakwau.xplore.filemanager.ui.state.SortOrder

// [Jalur Class]: com.wakwau.xplore.filemanager.ui.event.DualPaneEvent
// [Penjelasan]: Menambahkan event ToggleShowHiddenFiles untuk intent pengalihan visibilitas berkas tersembunyi.
sealed class DualPaneEvent {
    // Navigation
    data class OpenLocation(val panelId: PanelId, val location: StorageLocation) : DualPaneEvent()
    data class NavigateUp(val panelId: PanelId) : DualPaneEvent()
    
    // Panel Focus
    data class SetActivePanel(val panelId: PanelId) : DualPaneEvent()
    
    // Selection
    data class SelectItem(val panelId: PanelId, val itemId: String) : DualPaneEvent()
    data class ToggleSelection(val panelId: PanelId, val itemId: String) : DualPaneEvent()
    data class SetSelectedItems(val panelId: PanelId, val itemIds: Set<String>) : DualPaneEvent()
    data class ClearSelection(val panelId: PanelId) : DualPaneEvent()
    
    // Sorting & Preferences
    data class SetSortMode(val panelId: PanelId, val sortMode: SortMode) : DualPaneEvent()
    data class SetSortOrder(val panelId: PanelId, val sortOrder: SortOrder) : DualPaneEvent()
    
    data class UpdateSortPreferences(
        val fileSortOrder: com.wakwau.xplore.core.storage.preferences.FileSortOrder,
        val fileSortDirection: com.wakwau.xplore.core.storage.preferences.FileSortDirection
    ) : DualPaneEvent()
    
    object ToggleShowHiddenFiles : DualPaneEvent()
    
    // Refresh
    data class Refresh(val panelId: PanelId) : DualPaneEvent()

    // Data Loading Result (From UseCase back to UI state)
    data class DirectoryLoaded(val panelId: PanelId, val location: StorageLocation, val items: List<FileItem>) : DualPaneEvent()
    data class DirectoryLoadFailed(val panelId: PanelId, val error: String) : DualPaneEvent()
    data class LoadingStarted(val panelId: PanelId) : DualPaneEvent()
    
    // Operation intents
    data class ExecuteConfirmedCopy(val items: List<FileItem>, val targetPath: String) : DualPaneEvent()
    data class ExecuteConfirmedMove(val items: List<FileItem>, val targetPath: String) : DualPaneEvent()
    data class DeleteSelected(val items: List<FileItem>) : DualPaneEvent()
    data class RenameItem(val itemId: String, val newName: String) : DualPaneEvent()
    data class CreateDirectory(val name: String) : DualPaneEvent()
    
    // Operation Results
    data class OperationStarted(val operationNameRes: Int) : DualPaneEvent()
    data class ShowOperationConfirmation(
        val isMove: Boolean,
        val items: List<FileItem>,
        val targetPath: String
    ) : DualPaneEvent()
    data class OperationProgress(val progress: com.wakwau.xplore.core.storage.operation.FileOperationProgress) : DualPaneEvent()
    data class OperationSuccess(val messageRes: Int) : DualPaneEvent()
    data class OperationFailed(val error: String) : DualPaneEvent()
    object OperationCancelled : DualPaneEvent()
    object ClearOperationState : DualPaneEvent()

    // File Details & Checksum
    data class ShowFileDetails(val item: FileItem) : DualPaneEvent()
    object DismissFileDetails : DualPaneEvent()
    data class CalculateChecksum(val item: FileItem) : DualPaneEvent()
    object FileDetailsLoadingStarted : DualPaneEvent()
    data class FileDetailsLoaded(val metadata: com.wakwau.xplore.core.storage.model.FileDetailedMetadata) : DualPaneEvent()
    data class FileDetailsFailed(val errorRes: Int, val errorMessage: String? = null) : DualPaneEvent()
    object ChecksumCalculationStarted : DualPaneEvent()
    data class ChecksumCalculated(val checksum: com.wakwau.xplore.core.storage.model.FileChecksum) : DualPaneEvent()
    data class ChecksumCalculationFailed(val errorRes: Int, val errorMessage: String? = null) : DualPaneEvent()
    
    // Search
    object SearchIconClicked : DualPaneEvent()
    object DismissSearchDialog : DualPaneEvent()
    data class ExecuteSearch(val query: com.wakwau.xplore.core.storage.search.FileSearchQuery) : DualPaneEvent()
    data class SearchStarted(val keyword: String) : DualPaneEvent()
    data class SearchResultsUpdated(val keyword: String, val results: List<FileItem>) : DualPaneEvent()
    data class SearchFailed(val error: String) : DualPaneEvent()
    object SearchCancelled : DualPaneEvent()
}
