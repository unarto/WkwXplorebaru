// [Jalur Class]: com.wakwau.xplore.filemanager.ui.component.DirectoryTreeView
// [Penjelasan]: Composable wrapper terisolasi untuk merender tampilan pohon berkas (file tree) tanpa mengekspos ComposeTreeView atau FileTreeEngine ke Screen UI utama.
package com.wakwau.xplore.filemanager.ui.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wakwau.xplore.core.storage.model.FileItem
import com.wakwau.xplore.core.storage.model.FileType
import com.wakwau.xplore.core.ui.theme.XPloreTheme
import com.wakwau.xplore.filemanager.ui.list.FileListError
import com.wakwau.xplore.filemanager.ui.list.FileListItem
import com.wakwau.xplore.filemanager.ui.selection.TreeSelectionHandler
import com.wakwau.xplore.filemanager.ui.state.PanelState
import com.wakwau.xplore.filemanager.ui.tree.TreeNavigationAdapter
import com.wakwau.xplore.treeview.component.ComposeTreeView
import com.wakwau.xplore.treeview.interaction.TreeInteraction
import com.wakwau.xplore.treeview.model.TreeNode
import kotlinx.coroutines.launch

@Composable
fun DirectoryTreeView(
    panelState: PanelState,
    treeAdapter: TreeNavigationAdapter,
    onItemClick: (FileItem) -> Unit,
    onItemLongClick: (FileItem) -> Unit,
    onSelectionChange: (Set<String>) -> Unit,
    onRetry: () -> Unit,
    onIconClick: (FileItem) -> Unit = {},
    modifier: Modifier = Modifier
) {
    // [Jalur Class]: com.wakwau.xplore.filemanager.ui.component.DirectoryTreeView
    // [Penjelasan]: Eksekusi perenderan ComposeTreeView menggunakan TreeNavigationAdapter dan State terisolasi.
    val coroutineScope = rememberCoroutineScope()
    val engine = treeAdapter.getEngine(panelState.id)
    val errorState by engine.errorState.collectAsState()
    val selectedPath by engine.selectedPath.collectAsState()
    val treeSelectionHandler = remember { TreeSelectionHandler() }
    val colors = XPloreTheme.colors

    if (errorState != null) {
        FileListError(
            error = errorState ?: "",
            onRetry = {
                treeAdapter.clearError(panelState.id)
                onRetry()
            },
            modifier = modifier
        )
    } else {
        ComposeTreeView(
            treeState = engine.treeState,
            modifier = modifier,
            focusedId = selectedPath,
            interaction = object : TreeInteraction<FileItem> {
                override fun onToggle(node: TreeNode<FileItem>) {
                    treeAdapter.setSelectedPath(panelState.id, node.data.location.path)
                    coroutineScope.launch {
                        treeAdapter.toggleNode(panelState.id, node)
                    }
                }
                override fun onNodeClick(node: TreeNode<FileItem>) {
                    treeAdapter.setSelectedPath(panelState.id, node.data.location.path)
                    onItemClick(node.data)
                }
                override fun onNodeLongClick(node: TreeNode<FileItem>) {
                    treeAdapter.setSelectedPath(panelState.id, node.data.location.path)
                    onItemLongClick(node.data)
                }
            },
            emptyPlaceholderContent = { node ->
                Text(
                    text = node.data.name,
                    color = colors.emptyText,
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Italic,
                    modifier = Modifier.padding(vertical = 4.dp, horizontal = 4.dp)
                )
            }
        ) { node, borderPosition ->
            val selectionState = treeSelectionHandler.getSelectionState(node, panelState.selectedItemIds)
            FileListItem(
                item = node.data,
                isSelected = panelState.selectedItemIds.contains(node.data.id),
                borderPosition = borderPosition,
                selectionState = selectionState,
                onClick = {
                    treeAdapter.setSelectedPath(panelState.id, node.data.location.path)
                    if (node.data.type == FileType.DIRECTORY) {
                        coroutineScope.launch {
                            treeAdapter.toggleNode(panelState.id, node)
                        }
                    } else {
                        onItemClick(node.data)
                    }
                },
                onLongClick = {
                    treeAdapter.setSelectedPath(panelState.id, node.data.location.path)
                    onItemLongClick(node.data)
                },
                onCheckToggle = {
                    val newSelection = treeSelectionHandler.nextSelection(node, panelState.selectedItemIds)
                    onSelectionChange(newSelection)
                },
                onIconClick = { onIconClick(node.data) },
                showExpandArrow = false
            )
        }
    }
}
