package com.wakwau.xplore.filemanager.ui.selection

import com.wakwau.xplore.core.storage.model.FileItem
import com.wakwau.xplore.core.storage.model.FileMetadata
import com.wakwau.xplore.core.storage.model.FileType
import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.treeview.model.TreeNode
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class TreeSelectionHandlerTest {

    private val handler = TreeSelectionHandler()

    private fun createFileItem(path: String, isDir: Boolean): FileItem {
        val name = path.substringAfterLast('/')
        return FileItem(
            id = path,
            name = name,
            location = StorageLocation(path = path, rootId = "root"),
            type = if (isDir) FileType.DIRECTORY else FileType.FILE,
            metadata = FileMetadata(
                size = 100L,
                modifiedTime = 1000L,
                createdTime = null,
                isReadable = true,
                isWritable = true,
                isExecutable = false,
                isHidden = false
            )
        )
    }

    @Test
    fun `test file 2-state toggle`() {
        val fileItem = createFileItem("/storage/doc.txt", isDir = false)
        val fileNode = TreeNode(id = fileItem.id, data = fileItem)

        // Initial: empty selection
        val initialSelection = emptySet<String>()
        assertEquals(FolderCheckCycleState.UNCHECKED, handler.getSelectionState(fileNode, initialSelection))

        // Click 1: Selects file
        val sel1 = handler.nextSelection(fileNode, initialSelection)
        assertTrue(sel1.contains(fileItem.id))
        assertEquals(1, sel1.size)
        assertEquals(FolderCheckCycleState.SELF_ONLY, handler.getSelectionState(fileNode, sel1))

        // Click 2: Deselects file
        val sel2 = handler.nextSelection(fileNode, sel1)
        assertFalse(sel2.contains(fileItem.id))
        assertEquals(0, sel2.size)
        assertEquals(FolderCheckCycleState.UNCHECKED, handler.getSelectionState(fileNode, sel2))
    }

    @Test
    fun `test folder 3-state selection cycle`() {
        val parentItem = createFileItem("/storage/photos", isDir = true)
        val child1Item = createFileItem("/storage/photos/img1.jpg", isDir = false)
        val child2Item = createFileItem("/storage/photos/img2.jpg", isDir = false)
        val child3Item = createFileItem("/storage/photos/subfolder", isDir = true)
        val subChildItem = createFileItem("/storage/photos/subfolder/img3.jpg", isDir = false)

        val subChildNode = TreeNode(id = subChildItem.id, data = subChildItem)
        val child3Node = TreeNode(id = child3Item.id, data = child3Item).apply {
            addChild(subChildNode)
        }
        val child1Node = TreeNode(id = child1Item.id, data = child1Item)
        val child2Node = TreeNode(id = child2Item.id, data = child2Item)

        val parentNode = TreeNode(
            id = parentItem.id,
            data = parentItem
        ).apply {
            addChild(child1Node)
            addChild(child2Node)
            addChild(child3Node)
        }

        // Initial State 0: Unchecked
        var currentSelection = emptySet<String>()
        assertEquals(FolderCheckCycleState.UNCHECKED, handler.getSelectionState(parentNode, currentSelection))

        // Click 1: Mark ONLY parent folder (count = 1)
        currentSelection = handler.nextSelection(parentNode, currentSelection)
        assertEquals(setOf("/storage/photos"), currentSelection)
        assertEquals(1, currentSelection.size)
        assertEquals(FolderCheckCycleState.SELF_ONLY, handler.getSelectionState(parentNode, currentSelection))

        // Click 2: Mark parent folder + all descendant children (count = 5)
        currentSelection = handler.nextSelection(parentNode, currentSelection)
        val expectedAll = setOf(
            "/storage/photos",
            "/storage/photos/img1.jpg",
            "/storage/photos/img2.jpg",
            "/storage/photos/subfolder",
            "/storage/photos/subfolder/img3.jpg"
        )
        assertEquals(expectedAll, currentSelection)
        assertEquals(5, currentSelection.size)
        assertEquals(FolderCheckCycleState.ALL_CHILDREN, handler.getSelectionState(parentNode, currentSelection))

        // Click 3: Unmark parent and all descendants (count = 0)
        currentSelection = handler.nextSelection(parentNode, currentSelection)
        assertTrue(currentSelection.isEmpty())
        assertEquals(0, currentSelection.size)
        assertEquals(FolderCheckCycleState.UNCHECKED, handler.getSelectionState(parentNode, currentSelection))
    }

    @Test
    fun `test empty folder cycle toggles between self and uncheck`() {
        val emptyDirItem = createFileItem("/storage/empty_dir", isDir = true)
        val placeholderItem = createFileItem("/storage/empty_dir/(Folder kosong)", isDir = false)
        val placeholderNode = TreeNode(id = "empty_placeholder", data = placeholderItem, isPlaceholder = true)

        val emptyDirNode = TreeNode(
            id = emptyDirItem.id,
            data = emptyDirItem
        ).apply {
            addChild(placeholderNode)
        }

        // Initial: Unchecked
        var currentSelection = emptySet<String>()
        assertEquals(FolderCheckCycleState.UNCHECKED, handler.getSelectionState(emptyDirNode, currentSelection))

        // Click 1: Mark empty folder
        currentSelection = handler.nextSelection(emptyDirNode, currentSelection)
        assertEquals(setOf("/storage/empty_dir"), currentSelection)
        assertEquals(1, currentSelection.size)

        // Click 2: Deselect (since no real descendants exist)
        currentSelection = handler.nextSelection(emptyDirNode, currentSelection)
        assertTrue(currentSelection.isEmpty())
        assertEquals(0, currentSelection.size)
    }

    @Test
    fun `test partial selection promotes to all children on folder click`() {
        val parentItem = createFileItem("/storage/music", isDir = true)
        val track1 = createFileItem("/storage/music/track1.mp3", isDir = false)
        val track2 = createFileItem("/storage/music/track2.mp3", isDir = false)

        val track1Node = TreeNode(id = track1.id, data = track1)
        val track2Node = TreeNode(id = track2.id, data = track2)
        val parentNode = TreeNode(
            id = parentItem.id,
            data = parentItem
        ).apply {
            addChild(track1Node)
            addChild(track2Node)
        }

        // Suppose parent and only track1 were selected
        val partialSelection = setOf("/storage/music", "/storage/music/track1.mp3")
        assertEquals(FolderCheckCycleState.SELF_ONLY, handler.getSelectionState(parentNode, partialSelection))

        // Clicking parent should promote to select ALL children
        val promoted = handler.nextSelection(parentNode, partialSelection)
        assertEquals(setOf("/storage/music", "/storage/music/track1.mp3", "/storage/music/track2.mp3"), promoted)
        assertEquals(3, promoted.size)
        assertEquals(FolderCheckCycleState.ALL_CHILDREN, handler.getSelectionState(parentNode, promoted))
    }
}
