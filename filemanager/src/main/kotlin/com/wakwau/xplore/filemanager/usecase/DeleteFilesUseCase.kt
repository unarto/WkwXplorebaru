package com.wakwau.xplore.filemanager.usecase

import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.core.storage.operation.FileOperationResult
import com.wakwau.xplore.core.storage.repository.FileRepository
import com.wakwau.xplore.core.storage.search.FileSearchService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DeleteFilesUseCase(
    private val fileRepository: FileRepository,
    private val fileSearchService: FileSearchService? = null
) {
    suspend operator fun invoke(locations: List<StorageLocation>): FileOperationResult<Unit> {
        for (location in locations) {
            val result = fileRepository.delete(location)
            if (result is FileOperationResult.Failure || result is FileOperationResult.Cancelled) {
                return result
            }
            if (result is FileOperationResult.Success) {
                fileSearchService?.let { service ->
                    CoroutineScope(Dispatchers.IO).launch {
                        service.removeIndexByPrefix(location.path)
                    }
                }
            }
        }
        return FileOperationResult.Success(Unit)
    }
}
