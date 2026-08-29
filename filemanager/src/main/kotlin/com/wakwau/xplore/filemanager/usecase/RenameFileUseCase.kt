package com.wakwau.xplore.filemanager.usecase

import com.wakwau.xplore.core.storage.model.FileItem
import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.core.storage.operation.FileOperationResult
import com.wakwau.xplore.core.storage.repository.FileRepository
import com.wakwau.xplore.core.storage.search.FileSearchService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RenameFileUseCase(
    private val fileRepository: FileRepository,
    private val fileSearchService: FileSearchService? = null
) {
    suspend operator fun invoke(location: StorageLocation, newName: String): FileOperationResult<FileItem> {
        val result = fileRepository.rename(location, newName)
        if (result is FileOperationResult.Success) {
            fileSearchService?.let { service ->
                CoroutineScope(Dispatchers.IO).launch {
                    service.removeIndexByPrefix(location.path)
                }
            }
        }
        return result
    }
}
