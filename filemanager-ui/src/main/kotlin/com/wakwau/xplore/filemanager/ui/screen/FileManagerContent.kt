// [Jalur Class]: com.wakwau.xplore.filemanager.ui.screen.FileManagerContent
// [Penjelasan]: Menghubungkan dialog detail berkas FileDetailDialog saat ikon berkas ditekan dan mengelola aksi operasional panel berkas.
package com.wakwau.xplore.filemanager.ui.screen

import androidx.compose.ui.res.stringResource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.wakwau.xplore.core.storage.constant.StorageConstants
import com.wakwau.xplore.core.storage.model.FileType
import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.filemanager.ui.component.ActivePanelContent
import com.wakwau.xplore.filemanager.ui.search.FileSearchDialog
import com.wakwau.xplore.filemanager.ui.detail.FileDetailDialog
import com.wakwau.xplore.filemanager.ui.component.ProgressDialog
import com.wakwau.xplore.filemanager.ui.component.SideAction
import com.wakwau.xplore.filemanager.ui.component.SideActionBar
import com.wakwau.xplore.filemanager.ui.event.DualPaneEvent
import com.wakwau.xplore.filemanager.ui.gesture.onPanelSwipe
import com.wakwau.xplore.filemanager.ui.state.DualPaneState
import com.wakwau.xplore.filemanager.ui.state.DualPanelStateController
import com.wakwau.xplore.filemanager.ui.state.FileOperationPanelPosition
import com.wakwau.xplore.filemanager.ui.state.OperationUiState
import com.wakwau.xplore.filemanager.ui.state.PanelId
import com.wakwau.xplore.filemanager.ui.tree.TreeNavigationAdapter
import java.io.File

@Composable
fun FileManagerContent(
    state: DualPaneState,
    treeAdapter: TreeNavigationAdapter,
    operationPanelPosition: FileOperationPanelPosition,
    panelStateController: DualPanelStateController,
    onEvent: (DualPaneEvent) -> Unit,
    showHiddenFiles: Boolean = false,
    onSortClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    // [Jalur Class]: com.wakwau.xplore.filemanager.ui.screen.FileManagerContent
    // [Penjelasan]: Merender tata letak dua panel dengan meneruskan treeAdapter ke ActivePanelContent.
    val isLeftActive = state.activePanelId == PanelId.LEFT
    val activePanel = if (isLeftActive) state.leftPanel else state.rightPanel
    val inactivePanel = if (isLeftActive) state.rightPanel else state.leftPanel
    val handleSideAction: (SideAction) -> Unit = { action ->
        val selectedItems = treeAdapter.getSelectedItems(activePanel.id, activePanel.selectedItemIds)
        when (action) {
            SideAction.SWITCH_PANE -> {
                panelStateController.togglePanel()
            }
            SideAction.UP_DIR -> {
                val current = activePanel.currentLocation
                if (current != null && current.path.isNotEmpty() && current.path != StorageConstants.ROOT_PATH) {
                    val parentPath = File(current.path).parent ?: StorageConstants.ROOT_PATH
                    onEvent(DualPaneEvent.OpenLocation(activePanel.id, StorageLocation(path = parentPath, rootId = current.rootId)))
                }
            }
            SideAction.MARK -> {
                val allNodeIds = treeAdapter.getEngine(activePanel.id).treeState.roots.map { it.data.id }.toSet()
                onEvent(DualPaneEvent.SetSelectedItems(activePanel.id, allNodeIds))
            }
            SideAction.UNMARK -> {
                onEvent(DualPaneEvent.ClearSelection(activePanel.id))
            }
            SideAction.COPY -> {
                val targetPath = inactivePanel.currentLocation?.path 
                    ?: treeAdapter.getSelectedPath(inactivePanel.id).value 
                    ?: treeAdapter.getEngine(inactivePanel.id).treeState.roots.firstOrNull()?.data?.location?.path
                    
                if (selectedItems.isNotEmpty() && targetPath != null) {
                    onEvent(DualPaneEvent.ShowOperationConfirmation(isMove = false, items = selectedItems, targetPath = targetPath))
                }
            }
            SideAction.MOVE -> {
                val targetPath = inactivePanel.currentLocation?.path 
                    ?: treeAdapter.getSelectedPath(inactivePanel.id).value 
                    ?: treeAdapter.getEngine(inactivePanel.id).treeState.roots.firstOrNull()?.data?.location?.path

                if (selectedItems.isNotEmpty() && targetPath != null) {
                    onEvent(DualPaneEvent.ShowOperationConfirmation(isMove = true, items = selectedItems, targetPath = targetPath))
                }
            }
            SideAction.DELETE -> {
                if (selectedItems.isNotEmpty()) {
                    onEvent(DualPaneEvent.DeleteSelected(selectedItems))
                }
            }
            SideAction.SORT -> {
                onSortClick()
            }
            SideAction.TOGGLE_HIDDEN -> {
                onEvent(DualPaneEvent.ToggleShowHiddenFiles)
            }
            SideAction.SEARCH -> {
                onEvent(DualPaneEvent.SearchIconClicked)
            }
        }
    }

    if (state.operationState is OperationUiState.Confirming) {
        val isMove = state.operationState.isMove
        val opName = if (isMove) androidx.compose.ui.res.stringResource(com.wakwau.xplore.filemanager.ui.R.string.label_move) 
                     else androidx.compose.ui.res.stringResource(com.wakwau.xplore.filemanager.ui.R.string.cd_copy)
        
        com.wakwau.xplore.core.ui.components.AppDialog(
            title = androidx.compose.ui.res.stringResource(com.wakwau.xplore.filemanager.ui.R.string.title_operation_items, opName),
            confirmButtonText = opName,
            onConfirm = {
                if (isMove) onEvent(DualPaneEvent.ExecuteConfirmedMove(state.operationState.items, state.operationState.targetPath))
                else onEvent(DualPaneEvent.ExecuteConfirmedCopy(state.operationState.items, state.operationState.targetPath))
            },
            onDismissRequest = { onEvent(DualPaneEvent.ClearOperationState) }
        ) {
            androidx.compose.material3.Text(
                text = androidx.compose.ui.res.stringResource(
                    com.wakwau.xplore.filemanager.ui.R.string.msg_operation_confirmation, 
                    opName, state.operationState.items.size, state.operationState.targetPath
                ),
                style = androidx.compose.material3.MaterialTheme.typography.bodyMedium,
                color = androidx.compose.material3.MaterialTheme.colorScheme.onSurface
            )
        }
    }

    if (state.operationState is OperationUiState.Running) {
        ProgressDialog(
            operationName = stringResource(state.operationState.operationNameRes),
            progress = state.operationState.progress,
            onCancel = { onEvent(DualPaneEvent.ClearOperationState) }
        )
    }

    if (state.fileDetailState.isVisible) {
        FileDetailDialog(
            state = state.fileDetailState,
            onDismiss = { onEvent(DualPaneEvent.DismissFileDetails) },
            onCalculateChecksum = { item -> onEvent(DualPaneEvent.CalculateChecksum(item)) }
        )
    }

    if (state.searchUiState.isSearchDialogOpen) {
        FileSearchDialog(
            state = state.searchUiState,
            currentLocation = state.activePanel.currentLocation,
            onDismiss = { onEvent(DualPaneEvent.DismissSearchDialog) },
            onSearch = { query -> onEvent(DualPaneEvent.ExecuteSearch(query)) },
            onCancelSearch = { onEvent(DualPaneEvent.SearchCancelled) },
            onFileClick = { item -> 
                if (item.type == FileType.DIRECTORY) {
                    onEvent(DualPaneEvent.OpenLocation(state.activePanelId, item.location))
                }
                onEvent(DualPaneEvent.DismissSearchDialog)
            }
        )
    }

    Row(
        modifier = modifier
            .fillMaxSize()
            .onPanelSwipe(
                onSwipeLeft = { panelStateController.switchToRight() },
                onSwipeRight = { panelStateController.switchToLeft() }
            )
    ) {
        // If RIGHT panel is active: SideActionBar is on the LEFT
        if (!isLeftActive) {
            SideActionBar(
                position = FileOperationPanelPosition.LEFT,
                selectedCount = activePanel.selectedItemIds.size,
                showHiddenFiles = showHiddenFiles,
                onActionClick = handleSideAction
            )
        }

        // Active Panel Content (takes remaining width)
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        ) {
            ActivePanelContent(
                panel = activePanel,
                treeAdapter = treeAdapter,
                onNavigate = { onEvent(DualPaneEvent.OpenLocation(activePanel.id, it)) },
                onItemClick = { item ->
                    if (item.type == FileType.DIRECTORY) {
                        onEvent(DualPaneEvent.OpenLocation(activePanel.id, item.location))
                    }
                },
                onItemLongClick = { item ->
                    onEvent(DualPaneEvent.SelectItem(activePanel.id, item.id))
                    onEvent(DualPaneEvent.ShowFileDetails(item))
                },
                onIconClick = { item ->
                    onEvent(DualPaneEvent.SelectItem(activePanel.id, item.id))
                    onEvent(DualPaneEvent.ShowFileDetails(item))
                },
                onSelectionChange = { selectedIds ->
                    onEvent(DualPaneEvent.SetSelectedItems(activePanel.id, selectedIds))
                },
                onRetry = { onEvent(DualPaneEvent.Refresh(activePanel.id)) }
            )
        }

        // If LEFT panel is active: SideActionBar is on the RIGHT
        if (isLeftActive) {
            SideActionBar(
                position = FileOperationPanelPosition.RIGHT,
                selectedCount = activePanel.selectedItemIds.size,
                showHiddenFiles = showHiddenFiles,
                onActionClick = handleSideAction
            )
        }
    }
}
