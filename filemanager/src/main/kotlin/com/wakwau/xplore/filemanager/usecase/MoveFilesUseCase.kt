package com.wakwau.xplore.filemanager.usecase

import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.core.storage.operation.FileOperationProgress
import com.wakwau.xplore.core.storage.operation.FileOperationResult
import com.wakwau.xplore.core.storage.repository.FileRepository
import com.wakwau.xplore.core.storage.search.FileSearchService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import java.io.File

// [Jalur Class]: com.wakwau.xplore.filemanager.usecase.MoveFilesUseCase
// [Penjelasan]: Menghubungkan langsung fitur pindah dari domain filemanager ke core-storage-api. Progress riil disalurkan langsung dari repositori.
class MoveFilesUseCase(
    private val fileRepository: FileRepository,
    private val fileSearchService: FileSearchService? = null
) {
    fun invoke(sources: List<StorageLocation>, destinationDir: StorageLocation): Flow<FileOperationResult<FileOperationProgress>> = flow {
        for (source in sources) {
            val destLocation = StorageLocation(
                path = destinationDir.path + File.separator + File(source.path).name,
                rootId = destinationDir.rootId
            )
            fileRepository.move(source, destLocation).collect { result ->
                if (result is FileOperationResult.Success) {
                    fileSearchService?.let { service ->
                        CoroutineScope(Dispatchers.IO).launch {
                            service.removeIndexByPrefix(source.path)
                        }
                    }
                }
                emit(result)
            }
        }
    }
}
