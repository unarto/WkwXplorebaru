// [Jalur Class]: com.wakwau.xplore.core.storage.repository.DirectoryRepositoryImpl
// [Penjelasan]: Implementasi DirectoryRepository dengan delegasi nyata per-skenario (Local, SAF, Root) untuk operasi list dan create directory serta filter berkas tersembunyi.

package com.wakwau.xplore.core.storage.repository

import com.wakwau.xplore.core.storage.error.StorageErrorMapper
import com.wakwau.xplore.core.storage.io.LocalDirectoryCreator
import com.wakwau.xplore.core.storage.io.LocalDirectoryLister
import com.wakwau.xplore.core.storage.io.RootDirectoryLister
import com.wakwau.xplore.core.storage.io.SafDirectoryCreator
import com.wakwau.xplore.core.storage.io.SafDirectoryLister
import com.wakwau.xplore.core.storage.mapper.FileItemMapper
import com.wakwau.xplore.core.storage.metadata.FileMetadataReader
import com.wakwau.xplore.core.storage.model.FileItem
import com.wakwau.xplore.core.storage.model.FileType
import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.core.storage.operation.FileOperationResult
import com.wakwau.xplore.core.storage.preferences.AppPreferencesRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DirectoryRepositoryImpl(
    private val localDirectoryLister: LocalDirectoryLister,
    private val safDirectoryLister: SafDirectoryLister? = null,
    private val safDirectoryCreator: SafDirectoryCreator? = null,
    private val rootDirectoryLister: RootDirectoryLister? = null,
    private val localDirectoryCreator: LocalDirectoryCreator,
    private val fileMetadataReader: FileMetadataReader,
    private val fileItemMapper: FileItemMapper,
    private val storageErrorMapper: StorageErrorMapper,
    private val appPreferencesRepository: AppPreferencesRepository? = null,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : DirectoryRepository {

    override suspend fun list(location: StorageLocation): FileOperationResult<List<FileItem>> = withContext(ioDispatcher) {
        try {
            val showHidden = appPreferencesRepository?.getPreferencesState()?.showHiddenFiles ?: false
            val fileItems = when {
                location.path.startsWith("content://") -> {
                    safDirectoryLister?.listFiles(location, showHidden = showHidden) ?: emptyList()
                }
                location.rootId == "root_storage" -> {
                    rootDirectoryLister?.listFiles(location, showHidden = showHidden) ?: emptyList()
                }
                else -> {
                    val files = localDirectoryLister.listFiles(location.path, showHidden = showHidden)
                    files.map { file ->
                        val metadata = fileMetadataReader.readMetadata(file)
                        val type = if (file.isDirectory) FileType.DIRECTORY else FileType.FILE
                        val itemLocation = StorageLocation(path = file.absolutePath, rootId = location.rootId)
                        fileItemMapper.map(
                            id = file.absolutePath,
                            name = file.name,
                            location = itemLocation,
                            type = type,
                            metadata = metadata
                        )
                    }
                }
            }
            FileOperationResult.Success(fileItems)
        } catch (e: kotlinx.coroutines.CancellationException) { 
            return@withContext FileOperationResult.Cancelled 
        } catch (e: Exception) {
            FileOperationResult.Failure(storageErrorMapper.map(e))
        }
    }

    override suspend fun create(location: StorageLocation, name: String): FileOperationResult<FileItem> = withContext(ioDispatcher) {
        try {
            val fileItem = if (location.path.startsWith("content://") && safDirectoryCreator != null) {
                safDirectoryCreator.createDirectory(location, name)
            } else {
                val dir = localDirectoryCreator.createDirectory(location.path, name)
                val metadata = fileMetadataReader.readMetadata(dir)
                val newLocation = StorageLocation(path = dir.absolutePath, rootId = location.rootId)
                fileItemMapper.map(
                    id = dir.absolutePath,
                    name = dir.name,
                    location = newLocation,
                    type = FileType.DIRECTORY,
                    metadata = metadata
                )
            }
            FileOperationResult.Success(fileItem)
        } catch (e: kotlinx.coroutines.CancellationException) { 
            return@withContext FileOperationResult.Cancelled 
        } catch (e: Exception) {
            FileOperationResult.Failure(storageErrorMapper.map(e))
        }
    }
}
