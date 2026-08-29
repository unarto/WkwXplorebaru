package com.wakwau.xplore.filemanager.ui.selection

import com.wakwau.xplore.core.storage.model.FileItem
import com.wakwau.xplore.core.storage.model.FileType
import com.wakwau.xplore.treeview.model.TreeNode

class TreeSelectionHandler {

    /**
     * Recursively collects all descendant IDs of a tree node,
     * ignoring any dummy/empty placeholder nodes.
     */
    fun collectDescendantIds(node: TreeNode<FileItem>): Set<String> {
        val descendantIds = mutableSetOf<String>()
        fun traverse(parent: TreeNode<FileItem>) {
            for (child in parent.children) {
                if (!child.isPlaceholder) {
                    descendantIds.add(child.data.id)
                    traverse(child)
                }
            }
        }
        traverse(node)
        return descendantIds
    }

    /**
     * Evaluates the current 3-state selection status of a folder or file node.
     */
    fun getSelectionState(
        node: TreeNode<FileItem>,
        selectedIds: Set<String>
    ): FolderCheckCycleState {
        val isSelfSelected = selectedIds.contains(node.data.id)
        if (!isSelfSelected) {
            return FolderCheckCycleState.UNCHECKED
        }

        if (node.data.type != FileType.DIRECTORY) {
            return FolderCheckCycleState.SELF_ONLY
        }

        val descendants = collectDescendantIds(node)
        return if (descendants.isNotEmpty() && descendants.all { selectedIds.contains(it) }) {
            FolderCheckCycleState.ALL_CHILDREN
        } else {
            FolderCheckCycleState.SELF_ONLY
        }
    }

    /**
     * Computes the next selected set of item IDs when a checkmark is clicked,
     * following the 3-state cycle:
     * - Click 1 (UNCHECKED -> SELF_ONLY): marks only the folder itself.
     * - Click 2 (SELF_ONLY -> ALL_CHILDREN): marks the folder and all its loaded descendants.
     * - Click 3 (ALL_CHILDREN -> UNCHECKED): unmarks the folder and all its loaded descendants.
     * 
     * For non-directory (file) items:
     * - Standard 2-state toggle between selected and unselected.
     */
    fun nextSelection(
        node: TreeNode<FileItem>,
        currentSelection: Set<String>
    ): Set<String> {
        if (node.isPlaceholder) {
            return currentSelection
        }

        if (node.data.type != FileType.DIRECTORY) {
            return if (currentSelection.contains(node.data.id)) {
                currentSelection - node.data.id
            } else {
                currentSelection + node.data.id
            }
        }

        val isSelfSelected = currentSelection.contains(node.data.id)
        val descendants = collectDescendantIds(node)
        val isAllChildrenSelected = descendants.isNotEmpty() && descendants.all { currentSelection.contains(it) }

        return when {
            // State 0 -> State 1: Select only the folder
            !isSelfSelected -> {
                currentSelection + node.data.id
            }
            // State 1 -> State 2: Select folder and all children
            !isAllChildrenSelected && descendants.isNotEmpty() -> {
                currentSelection + node.data.id + descendants
            }
            // State 2 -> State 0: Unselect folder and all children
            else -> {
                currentSelection - node.data.id - descendants
            }
        }
    }
}
