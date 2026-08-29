package com.wakwau.xplore.core.storage.repository

import com.wakwau.xplore.core.storage.error.StorageErrorMapper
import com.wakwau.xplore.core.storage.io.LocalFileCopier
import com.wakwau.xplore.core.storage.io.LocalFileDeleter
import com.wakwau.xplore.core.storage.io.LocalFileMover
import com.wakwau.xplore.core.storage.io.LocalFileRenamer
import com.wakwau.xplore.core.storage.mapper.FileItemMapper
import com.wakwau.xplore.core.storage.metadata.FileMetadataReader
import com.wakwau.xplore.core.storage.model.FileItem
import com.wakwau.xplore.core.storage.model.FileType
import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.core.storage.operation.FileOperationProgress
import com.wakwau.xplore.core.storage.operation.FileOperationResult
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.withContext

class FileRepositoryImpl(
    private val localFileDeleter: LocalFileDeleter,
    private val localFileRenamer: LocalFileRenamer,
    private val localFileCopier: LocalFileCopier,
    private val localFileMover: LocalFileMover,
    private val fileMetadataReader: FileMetadataReader,
    private val fileItemMapper: FileItemMapper,
    private val storageErrorMapper: StorageErrorMapper,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : FileRepository {

    override suspend fun delete(location: StorageLocation): FileOperationResult<Unit> = withContext(ioDispatcher) {
        try {
            localFileDeleter.delete(location.path)
            FileOperationResult.Success(Unit)
        } catch (e: kotlinx.coroutines.CancellationException) { return@withContext FileOperationResult.Cancelled } catch (e: Exception) {
            FileOperationResult.Failure(storageErrorMapper.map(e))
        }
    }

    override suspend fun rename(location: StorageLocation, newName: String): FileOperationResult<FileItem> = withContext(ioDispatcher) {
        try {
            val targetFile = localFileRenamer.rename(location.path, newName)
            val metadata = fileMetadataReader.readMetadata(targetFile)
            val type = if (targetFile.isDirectory) FileType.DIRECTORY else FileType.FILE
            val newLocation = StorageLocation(path = targetFile.absolutePath, rootId = location.rootId)
            val fileItem = fileItemMapper.map(
                id = targetFile.absolutePath,
                name = targetFile.name,
                location = newLocation,
                type = type,
                metadata = metadata
            )
            FileOperationResult.Success(fileItem)
        } catch (e: kotlinx.coroutines.CancellationException) { return@withContext FileOperationResult.Cancelled } catch (e: Exception) {
            FileOperationResult.Failure(storageErrorMapper.map(e))
        }
    }

    override fun copy(source: StorageLocation, destination: StorageLocation): kotlinx.coroutines.flow.Flow<FileOperationResult<FileOperationProgress>> = kotlinx.coroutines.flow.flow {
        try {
            localFileCopier.copy(source.path, destination.path).collect { progress ->
                emit(FileOperationResult.Success(progress))
            }
        } catch (e: kotlinx.coroutines.CancellationException) { 
            emit(FileOperationResult.Cancelled) 
        } catch (e: Exception) {
            emit(FileOperationResult.Failure(storageErrorMapper.map(e)))
        }
    }

    override fun move(source: StorageLocation, destination: StorageLocation): kotlinx.coroutines.flow.Flow<FileOperationResult<FileOperationProgress>> = kotlinx.coroutines.flow.flow {
        try {
            localFileMover.move(source.path, destination.path).collect { progress ->
                emit(FileOperationResult.Success(progress))
            }
        } catch (e: kotlinx.coroutines.CancellationException) { 
            emit(FileOperationResult.Cancelled) 
        } catch (e: Exception) {
            emit(FileOperationResult.Failure(storageErrorMapper.map(e)))
        }
    }
}
