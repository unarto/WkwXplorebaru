package com.wakwau.xplore.core.storage.repository

import com.wakwau.xplore.core.storage.error.StorageErrorMapper
import com.wakwau.xplore.core.storage.io.LocalFileCopier
import com.wakwau.xplore.core.storage.io.LocalFileDeleter
import com.wakwau.xplore.core.storage.io.LocalFileMover
import com.wakwau.xplore.core.storage.io.LocalFileRenamer
import com.wakwau.xplore.core.storage.mapper.FileItemMapper
import com.wakwau.xplore.core.storage.metadata.FileMetadataReader
import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.core.storage.operation.FileOperationResult
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import java.io.File
import java.nio.file.Files

@OptIn(ExperimentalCoroutinesApi::class)
class FileRepositoryImplTest {

    private lateinit var repository: FileRepositoryImpl
    private lateinit var tempDir: File
    private val dispatcher = UnconfinedTestDispatcher()

    @Before
    fun setup() {
        val deleter = LocalFileDeleter()
        val renamer = LocalFileRenamer()
        val copier = LocalFileCopier()
        val mover = LocalFileMover(copier, deleter)
        val metadataReader = FileMetadataReader()
        val itemMapper = FileItemMapper()
        val errorMapper = StorageErrorMapper()
        
        repository = FileRepositoryImpl(
            localFileDeleter = deleter,
            localFileRenamer = renamer,
            localFileCopier = copier,
            localFileMover = mover,
            fileMetadataReader = metadataReader,
            fileItemMapper = itemMapper,
            storageErrorMapper = errorMapper,
            ioDispatcher = dispatcher
        )
        
        tempDir = Files.createTempDirectory("file_repo_test").toFile()
    }

    @After
    fun teardown() {
        tempDir.deleteRecursively()
    }

    @Test
    fun delete_existingFile_returnsSuccess() = runTest {
        val file = File(tempDir, "delete.txt")
        file.createNewFile()
        
        val result = repository.delete(StorageLocation(file.absolutePath))
        
        assertTrue(result is FileOperationResult.Success)
        assertTrue(!file.exists())
    }

    @Test
    fun delete_nonexistentFile_returnsFailure() = runTest {
        val result = repository.delete(StorageLocation("${tempDir.absolutePath}/none.txt"))
        
        assertTrue(result is FileOperationResult.Failure)
    }

    @Test
    fun rename_existingFile_validName_returnsSuccess() = runTest {
        val file = File(tempDir, "rename.txt")
        file.createNewFile()
        
        val result = repository.rename(StorageLocation(file.absolutePath), "newname.txt")
        
        assertTrue(result is FileOperationResult.Success)
        val newFile = File(tempDir, "newname.txt")
        assertTrue(newFile.exists())
    }

    @Test
    fun rename_existingFile_collision_returnsFailure() = runTest {
        val file = File(tempDir, "rename_col.txt")
        file.createNewFile()
        val existingTarget = File(tempDir, "target.txt")
        existingTarget.createNewFile()
        
        val result = repository.rename(StorageLocation(file.absolutePath), "target.txt")
        
        assertTrue(result is FileOperationResult.Failure)
    }

    @Test
    fun copy_existingFile_validDestination_returnsSuccess() = runTest {
        val file = File(tempDir, "copy.txt")
        file.writeText("content")
        val destFile = File(tempDir, "dest.txt")
        
        val results = repository.copy(StorageLocation(file.absolutePath), StorageLocation(destFile.absolutePath)).toList()
        
        assertTrue(results.isNotEmpty())
        assertTrue(results.last() is FileOperationResult.Success)
        assertTrue(destFile.exists())
    }

    @Test
    fun move_existingFile_validDestination_returnsSuccess() = runTest {
        val file = File(tempDir, "move.txt")
        file.writeText("content")
        val destFile = File(tempDir, "dest_move.txt")
        
        val results = repository.move(StorageLocation(file.absolutePath), StorageLocation(destFile.absolutePath)).toList()
        
        assertTrue(results.isNotEmpty())
        assertTrue(results.last() is FileOperationResult.Success)
        assertTrue(destFile.exists())
        assertTrue(!file.exists())
    }
}
