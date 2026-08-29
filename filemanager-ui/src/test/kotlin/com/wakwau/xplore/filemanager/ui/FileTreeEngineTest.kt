package com.wakwau.xplore.filemanager.ui

import com.wakwau.xplore.core.storage.model.FileItem
import com.wakwau.xplore.core.storage.model.FileMetadata
import com.wakwau.xplore.core.storage.model.FileType
import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.core.storage.operation.FileOperationError
import com.wakwau.xplore.core.storage.operation.FileOperationResult
import com.wakwau.xplore.core.storage.repository.DirectoryRepository
import com.wakwau.xplore.filemanager.ui.tree.FileTreeEngine
import com.wakwau.xplore.filemanager.usecase.ListDirectoryUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class FileTreeEngineTest {

    private val testDispatcher = StandardTestDispatcher()
    private lateinit var fakeDirectoryRepository: FakeDirectoryRepository
    private lateinit var listDirectoryUseCase: ListDirectoryUseCase
    private lateinit var engine: FileTreeEngine

    @Before
    fun setup() {
        Dispatchers.setMain(testDispatcher)
        fakeDirectoryRepository = FakeDirectoryRepository()
        listDirectoryUseCase = ListDirectoryUseCase(fakeDirectoryRepository)
        engine = FileTreeEngine(listDirectoryUseCase)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `loadRoot populates tree roots and loads children`() = runTest {
        val rootLocation = StorageLocation("/", "local")
        val rootItem = createFileItem("/", FileType.DIRECTORY)
        
        // Root has one directory and one file
        fakeDirectoryRepository.setFiles(rootLocation, listOf(
            createFileItem("/dir1", FileType.DIRECTORY),
            createFileItem("/file1.txt", FileType.FILE)
        ))

        engine.loadRoot(rootItem)

        val roots = engine.treeState.roots
        assertEquals(1, roots.size)
        assertEquals("/", roots[0].data.location.path)

        val children = roots[0].children
        assertEquals(2, children.size)
        assertEquals("/dir1", children[0].data.location.path)
        assertNull(engine.errorState.value)
    }

    @Test
    fun `loadRoot with empty directory inserts placeholder node`() = runTest {
        val rootLocation = StorageLocation("/emptyDir", "local")
        val rootItem = createFileItem("/emptyDir", FileType.DIRECTORY)
        
        fakeDirectoryRepository.setFiles(rootLocation, emptyList())

        engine.loadRoot(rootItem)

        val roots = engine.treeState.roots
        assertEquals(1, roots.size)
        assertEquals(1, roots[0].children.size)
        
        val placeholder = roots[0].children[0]
        assertTrue(placeholder.isPlaceholder)
        assertEquals("", placeholder.data.name)
        assertEquals(1, placeholder.depth)
        assertNull(engine.errorState.value)
    }

    @Test
    fun `setSelectedPath updates selectedPath StateFlow`() = runTest {
        assertNull(engine.selectedPath.value)
        engine.setSelectedPath("/storage/emulated/0/Download")
        assertEquals("/storage/emulated/0/Download", engine.selectedPath.value)
        engine.setSelectedPath(null)
        assertNull(engine.selectedPath.value)
    }

    @Test
    fun `loadRoot handles repository failure`() = runTest {
        val rootItem = createFileItem("/", FileType.DIRECTORY)
        fakeDirectoryRepository.shouldFail = true

        engine.loadRoot(rootItem)

        val roots = engine.treeState.roots
        assertEquals(1, roots.size)
        assertTrue(roots[0].children.isEmpty())
        
        assertEquals("UNKNOWN", engine.errorState.value)
    }

    @Test
    fun `toggleNode expands and loads children if not expanded`() = runTest {
        val rootLocation = StorageLocation("/", "local")
        val rootItem = createFileItem("/", FileType.DIRECTORY)
        
        fakeDirectoryRepository.setFiles(rootLocation, listOf(
            createFileItem("/dir1", FileType.DIRECTORY)
        ))

        engine.loadRoot(rootItem)
        
        val rootNode = engine.treeState.roots[0]
        assertTrue(engine.treeState.isExpanded(rootNode))
        
        val dirNode = rootNode.children[0]
        fakeDirectoryRepository.setFiles(dirNode.data.location, listOf(
            createFileItem("/dir1/subfile.txt", FileType.FILE)
        ))

        assertFalse(engine.treeState.isExpanded(dirNode))
        
        engine.toggleNode(dirNode)
        
        assertTrue(engine.treeState.isExpanded(dirNode))
        assertEquals(1, dirNode.children.size)
    }

    @Test
    fun `toggleNode collapses node if already expanded`() = runTest {
        val rootItem = createFileItem("/", FileType.DIRECTORY)
        engine.loadRoot(rootItem)
        
        val rootNode = engine.treeState.roots[0]
        assertTrue(engine.treeState.isExpanded(rootNode))
        
        engine.toggleNode(rootNode) // collapse
        assertFalse(engine.treeState.isExpanded(rootNode))
    }

    @Test
    fun `getFocusRange and getBorderPositionForIndex calculate dynamic scope`() = runTest {
        val rootLocation = StorageLocation("/", "local")
        val rootItem = createFileItem("/", FileType.DIRECTORY)
        fakeDirectoryRepository.setFiles(rootLocation, listOf(
            createFileItem("/dir1", FileType.DIRECTORY),
            createFileItem("/file1.txt", FileType.FILE)
        ))

        engine.loadRoot(rootItem)

        // With no selected path
        assertNull(engine.getFocusRange())
        assertEquals(com.wakwau.xplore.treeview.model.BorderPosition.NONE, engine.getBorderPositionForIndex(0))

        // Focus on root "/" which has 2 children and is expanded -> range 0..2
        engine.setSelectedPath("/")
        assertEquals(0..2, engine.getFocusRange())
        assertEquals(com.wakwau.xplore.treeview.model.BorderPosition.TOP, engine.getBorderPositionForIndex(0))
        assertEquals(com.wakwau.xplore.treeview.model.BorderPosition.MIDDLE, engine.getBorderPositionForIndex(1))
        assertEquals(com.wakwau.xplore.treeview.model.BorderPosition.BOTTOM, engine.getBorderPositionForIndex(2))

        // Focus on leaf child "/file1.txt" -> range 2..2 (SINGLE)
        engine.setSelectedPath("/file1.txt")
        assertEquals(2..2, engine.getFocusRange())
        assertEquals(com.wakwau.xplore.treeview.model.BorderPosition.NONE, engine.getBorderPositionForIndex(0))
        assertEquals(com.wakwau.xplore.treeview.model.BorderPosition.NONE, engine.getBorderPositionForIndex(1))
        assertEquals(com.wakwau.xplore.treeview.model.BorderPosition.SINGLE, engine.getBorderPositionForIndex(2))
    }

    private fun createFileItem(path: String, type: FileType): FileItem {
        return FileItem(
            id = path,
            location = StorageLocation(path, "local"),
            name = path.substringAfterLast("/").ifEmpty { "/" },
            type = type,
            metadata = FileMetadata(0, 0, 0, false, false, false, false)
        )
    }
}

class FakeDirectoryRepository : DirectoryRepository {
    var shouldFail = false
    private val files = mutableMapOf<StorageLocation, List<FileItem>>()

    fun setFiles(location: StorageLocation, newFiles: List<FileItem>) {
        files[location] = newFiles
    }

    override suspend fun list(location: StorageLocation): FileOperationResult<List<FileItem>> {
        if (shouldFail) return FileOperationResult.Failure(FileOperationError.UNKNOWN)
        return FileOperationResult.Success(files[location] ?: emptyList())
    }

    override suspend fun create(location: StorageLocation, name: String): FileOperationResult<FileItem> {
        throw UnsupportedOperationException()
    }
}
