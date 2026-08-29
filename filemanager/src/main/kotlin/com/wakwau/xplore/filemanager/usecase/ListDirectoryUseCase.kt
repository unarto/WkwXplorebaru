package com.wakwau.xplore.filemanager.usecase

import com.wakwau.xplore.core.storage.model.FileItem
import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.core.storage.operation.FileOperationResult
import com.wakwau.xplore.core.storage.repository.DirectoryRepository
import com.wakwau.xplore.core.storage.search.FileSearchService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// Note: This acts as an alias or specific wrapper, as requested.
class ListDirectoryUseCase(
    private val directoryRepository: DirectoryRepository,
    private val fileSearchService: FileSearchService? = null
) {
    suspend operator fun invoke(location: StorageLocation): FileOperationResult<List<FileItem>> {
        val result = directoryRepository.list(location)
        if (result is FileOperationResult.Success && fileSearchService != null) {
            CoroutineScope(Dispatchers.IO).launch {
                // Hapus entry lama dari indeks untuk lokasi ini agar data yang terhapus juga hilang dari index
                fileSearchService.removeIndexByPrefix("${location.path}/")
                fileSearchService.addOrUpdateIndexBatch(result.data)
            }
        }
        return result
    }
}
