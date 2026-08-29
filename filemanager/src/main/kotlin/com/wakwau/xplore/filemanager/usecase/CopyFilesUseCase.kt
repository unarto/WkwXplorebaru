package com.wakwau.xplore.filemanager.usecase

import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.core.storage.operation.FileOperationProgress
import com.wakwau.xplore.core.storage.operation.FileOperationResult
import com.wakwau.xplore.core.storage.repository.FileRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.File

// [Jalur Class]: com.wakwau.xplore.filemanager.usecase.CopyFilesUseCase
// [Penjelasan]: Menghubungkan langsung fitur salin dari domain filemanager ke core-storage-api. Progress riil disalurkan langsung dari repositori.
class CopyFilesUseCase(private val fileRepository: FileRepository) {
    fun invoke(sources: List<StorageLocation>, destinationDir: StorageLocation): Flow<FileOperationResult<FileOperationProgress>> = flow {
        for (source in sources) {
            val destLocation = StorageLocation(
                path = destinationDir.path + File.separator + File(source.path).name,
                rootId = destinationDir.rootId
            )
            fileRepository.copy(source, destLocation).collect { result ->
                emit(result)
            }
        }
    }
}
