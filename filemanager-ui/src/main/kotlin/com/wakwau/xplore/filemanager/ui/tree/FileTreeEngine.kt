package com.wakwau.xplore.filemanager.ui.tree

import com.wakwau.xplore.core.storage.constant.StorageConstants
import com.wakwau.xplore.core.storage.model.FileItem
import com.wakwau.xplore.core.storage.model.FileType
import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.core.storage.operation.FileOperationResult
import com.wakwau.xplore.filemanager.usecase.ListDirectoryUseCase
import com.wakwau.xplore.treeview.model.TreeNode
import com.wakwau.xplore.treeview.state.TreeState
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.util.concurrent.ConcurrentHashMap

import com.wakwau.xplore.core.storage.preferences.AppPreferencesRepository
import com.wakwau.xplore.core.storage.preferences.FileSortOrder
import com.wakwau.xplore.core.storage.preferences.FileSortDirection

// [Jalur Class]: com.wakwau.xplore.filemanager.ui.tree.FileTreeEngine
// [Penjelasan]: Engine pohon direktori berkas yang memuat hierarki folder secara asinkron menggunakan ListDirectoryUseCase, TreeState, dan mendukung refresh hierarki node yang terbuka saat preferensi berubah.
class FileTreeEngine(
    private val listDirectoryUseCase: ListDirectoryUseCase,
    private val appPreferencesRepository: AppPreferencesRepository? = null,
    val treeState: TreeState<FileItem> = TreeState()
) {
    private val loadingNodes = ConcurrentHashMap.newKeySet<String>()

    private val _selectedPath = MutableStateFlow<String?>(null)
    val selectedPath: StateFlow<String?> = _selectedPath.asStateFlow()

    private val _errorState = MutableStateFlow<String?>(null)
    val errorState: StateFlow<String?> = _errorState.asStateFlow()

    suspend fun refreshExpandedNodes() {
        suspend fun refreshNode(node: TreeNode<FileItem>) {
            if (treeState.isExpanded(node) && node.data.type == FileType.DIRECTORY) {
                val previousExpandedIds = node.children.filter { it.isExpanded }.map { it.id }.toSet()
                loadChildren(node)
                for (child in node.children) {
                    if (previousExpandedIds.contains(child.id)) {
                        treeState.expand(child)
                        refreshNode(child)
                    }
                }
            }
        }
        for (root in treeState.roots) {
            refreshNode(root)
        }
        treeState.forceRefresh()
    }

    fun setSelectedPath(path: String?) {
        _selectedPath.value = path
    }

    suspend fun loadVolumesAsRoots(volumes: List<com.wakwau.xplore.core.storage.model.StorageVolumeItem>) {
        _errorState.value = null
        val roots = volumes.map { volume ->
            val rootItem = FileItem(
                id = volume.rootPath,
                name = volume.name,
                location = StorageLocation(volume.rootPath, volume.id),
                type = FileType.DIRECTORY,
                metadata = com.wakwau.xplore.core.storage.model.FileMetadata(
                    size = volume.spaceInfo?.totalBytes ?: 0L,
                    modifiedTime = 0L,
                    createdTime = 0L,
                    isHidden = false,
                    isReadable = true,
                    isWritable = true,
                    isExecutable = true
                )
            )
            TreeNode(data = rootItem, id = volume.rootPath)
        }
        treeState.setRoots(roots)
    }

    suspend fun loadRoot(rootItem: FileItem) {
        _errorState.value = null
        val rootNode = TreeNode(data = rootItem, id = rootItem.location.path)
        treeState.setRoots(listOf(rootNode))
        loadChildren(rootNode)
    }

    suspend fun toggleNode(node: TreeNode<FileItem>) {
        _errorState.value = null
        if (treeState.isExpanded(node)) {
            treeState.collapse(node)
        } else {
            if (!node.hasChildren && node.data.type == FileType.DIRECTORY) {
                loadChildren(node)
            } else {
                treeState.expand(node)
            }
        }
    }

    private suspend fun loadChildren(node: TreeNode<FileItem>) {
        if (!loadingNodes.add(node.id)) return
        try {
            when (val result = listDirectoryUseCase(node.data.location)) {
                is FileOperationResult.Success -> {
                    node.clearChildren()
                    if (result.data.isEmpty()) {
                        val emptyPlaceholderItem = FileItem(
                            id = "${node.data.location.path}${StorageConstants.EMPTY_NODE_ID_SUFFIX}",
                            name = "",
                            location = node.data.location,
                            type = FileType.FILE,
                            metadata = com.wakwau.xplore.core.storage.model.FileMetadata.EMPTY
                        )
                        val placeholderNode = TreeNode(
                            data = emptyPlaceholderItem,
                            id = emptyPlaceholderItem.id,
                            isPlaceholder = true
                        )
                        node.addChild(placeholderNode)
                    } else {
                        val comparator = getComparator()
                        val sortedItems = result.data.map { item ->
                            TreeNode(data = item, id = item.location.path)
                        }.sortedWith(comparator)
                        
                        sortedItems.forEach { node.addChild(it) }
                    }
                    treeState.expand(node)
                }
                is FileOperationResult.Failure -> {
                    _errorState.value = result.error.name
                }
                is FileOperationResult.Cancelled -> {
                    // Ignore
                }
            }
        } catch (e: Exception) {
            if (e is CancellationException) throw e
            _errorState.value = e.message
        } finally {
            loadingNodes.remove(node.id)
        }
    }

    fun reSortCurrentNodes() {
        val comparator = getComparator()
        treeState.roots.forEach { it.sortChildren(comparator) }
        treeState.forceRefresh()
    }

    private fun getComparator(): java.util.Comparator<TreeNode<FileItem>> {
        val prefs = appPreferencesRepository?.getPreferencesState()
        val order = prefs?.sortOrder ?: FileSortOrder.NAME
        val direction = prefs?.sortDirection ?: FileSortDirection.ASCENDING

        val baseComparator = when (order) {
            FileSortOrder.NAME -> compareBy<TreeNode<FileItem>> { it.data.name.lowercase() }
            FileSortOrder.DATE -> compareBy { it.data.metadata.modifiedTime }
            FileSortOrder.SIZE -> compareBy { it.data.metadata.size }
            FileSortOrder.TYPE -> compareBy { it.data.name.substringAfterLast('.', "") }
        }
        
        val directedComparator = if (direction == FileSortDirection.DESCENDING) {
            baseComparator.reversed()
        } else {
            baseComparator
        }
        
        return compareBy<TreeNode<FileItem>> { it.data.type != FileType.DIRECTORY }.then(directedComparator)
    }

    fun clearError() {
        _errorState.value = null
    }

    fun getFocusRange(): IntRange? {
        val visibleNodes = treeState.visibleNodes.value
        val path = _selectedPath.value
        return com.wakwau.xplore.treeview.model.TreeScopeCalculator.calculateFocusRange(visibleNodes, path) { it.location.path }
    }

    fun getBorderPositionForIndex(index: Int): com.wakwau.xplore.treeview.model.BorderPosition {
        val range = getFocusRange()
        return com.wakwau.xplore.treeview.model.TreeScopeCalculator.getBorderPosition(index, range)
    }

    fun getSelectedItems(selectedIds: Set<String>): List<FileItem> {
        val selectedItems = mutableListOf<FileItem>()
        fun traverse(nodes: List<TreeNode<FileItem>>) {
            for (node in nodes) {
                if (selectedIds.contains(node.data.id)) {
                    selectedItems.add(node.data)
                } else {
                    traverse(node.children)
                }
            }
        }
        traverse(treeState.roots)
        return selectedItems
    }

    fun updateSearchResults(keyword: String, items: List<FileItem>) {
        val searchRootId = "virtual_search_results"
        
        // Remove existing search results root if any
        val filteredRoots = treeState.roots.filter { it.id != searchRootId }.toMutableList()
        
        val rootItem = FileItem(
            id = searchRootId,
            name = "Search results: '$keyword'",
            location = StorageLocation(searchRootId, "virtual_search"),
            type = FileType.DIRECTORY,
            metadata = com.wakwau.xplore.core.storage.model.FileMetadata.EMPTY
        )
        val searchRootNode = TreeNode(data = rootItem, id = searchRootId)
        
        if (items.isEmpty()) {
            val emptyPlaceholderItem = FileItem(
                id = "${searchRootId}${StorageConstants.EMPTY_NODE_ID_SUFFIX}",
                name = "No results found",
                location = rootItem.location,
                type = FileType.FILE,
                metadata = com.wakwau.xplore.core.storage.model.FileMetadata.EMPTY
            )
            val placeholderNode = TreeNode(
                data = emptyPlaceholderItem,
                id = emptyPlaceholderItem.id,
                isPlaceholder = true
            )
            searchRootNode.addChild(placeholderNode)
        } else {
            val comparator = getComparator()
            val sortedItems = items.map { item ->
                // Ensure unique IDs if multiple files have same path (shouldn't happen but safe)
                TreeNode(data = item, id = "search_res_${item.location.path}")
            }.sortedWith(comparator)
            
            sortedItems.forEach { searchRootNode.addChild(it) }
        }
        
        filteredRoots.add(searchRootNode)
        treeState.setRoots(filteredRoots)
        treeState.expand(searchRootNode)
        treeState.forceRefresh()
    }
}
