// [Jalur Class]: com.wakwau.xplore.di.FileManagerUseCaseModule
// [Penjelasan]: Menginisialisasi use case domain termasuk ToggleShowHiddenFilesUseCase.
package com.wakwau.xplore.di

import com.wakwau.xplore.core.storage.checksum.FileChecksumReader
import com.wakwau.xplore.core.storage.metadata.DetailedMetadataReader
import com.wakwau.xplore.core.storage.permission.StoragePermissionChecker
import com.wakwau.xplore.core.storage.preferences.AppPreferencesRepository
import com.wakwau.xplore.core.storage.repository.DirectoryRepository
import com.wakwau.xplore.core.storage.repository.FileRepository
import com.wakwau.xplore.core.storage.repository.StorageVolumeRepository
import com.wakwau.xplore.core.storage.search.FileSearchService
import com.wakwau.xplore.filemanager.usecase.CheckStoragePermissionUseCase
import com.wakwau.xplore.filemanager.usecase.ComputeFileChecksumUseCase
import com.wakwau.xplore.filemanager.usecase.CopyFilesUseCase
import com.wakwau.xplore.filemanager.usecase.CreateDirectoryUseCase
import com.wakwau.xplore.filemanager.usecase.DeleteFilesUseCase
import com.wakwau.xplore.filemanager.usecase.GetFileDetailedMetadataUseCase
import com.wakwau.xplore.filemanager.usecase.GetStorageVolumesUseCase
import com.wakwau.xplore.filemanager.usecase.ListDirectoryUseCase
import com.wakwau.xplore.filemanager.usecase.ListFilesUseCase
import com.wakwau.xplore.filemanager.usecase.MoveFilesUseCase
import com.wakwau.xplore.filemanager.usecase.RenameFileUseCase
import com.wakwau.xplore.filemanager.usecase.SearchFilesUseCase
import com.wakwau.xplore.filemanager.usecase.ToggleShowHiddenFilesUseCase

class FileManagerUseCaseModule(
    private val directoryRepository: DirectoryRepository,
    private val fileRepository: FileRepository,
    private val storageVolumeRepository: StorageVolumeRepository,
    private val storagePermissionChecker: StoragePermissionChecker,
    private val detailedMetadataReader: DetailedMetadataReader,
    private val fileChecksumReader: FileChecksumReader,
    private val appPreferencesRepository: AppPreferencesRepository,
    private val fileSearchService: FileSearchService,
    private val fileIndexRepository: com.wakwau.xplore.core.storage.db.repository.FileIndexRepository
) {
    val getStorageVolumesUseCase: GetStorageVolumesUseCase by lazy { GetStorageVolumesUseCase(storageVolumeRepository) }
    val checkStoragePermissionUseCase: CheckStoragePermissionUseCase by lazy { CheckStoragePermissionUseCase(storagePermissionChecker) }
    
    // Existing listFilesUseCase, plus the requested alias/wrapper
    val listFilesUseCase: ListFilesUseCase by lazy { ListFilesUseCase(directoryRepository) }
    val listDirectoryUseCase: ListDirectoryUseCase by lazy { ListDirectoryUseCase(directoryRepository, fileSearchService) }
    
    val copyFilesUseCase: CopyFilesUseCase by lazy { CopyFilesUseCase(fileRepository) }
    val moveFilesUseCase: MoveFilesUseCase by lazy { MoveFilesUseCase(fileRepository, fileSearchService) }
    val deleteFilesUseCase: DeleteFilesUseCase by lazy { DeleteFilesUseCase(fileRepository, fileSearchService) }
    val renameFileUseCase: RenameFileUseCase by lazy { RenameFileUseCase(fileRepository, fileSearchService) }
    val createDirectoryUseCase: CreateDirectoryUseCase by lazy { CreateDirectoryUseCase(directoryRepository) }

    val getFileDetailedMetadataUseCase: GetFileDetailedMetadataUseCase by lazy {
        GetFileDetailedMetadataUseCase(detailedMetadataReader)
    }

    val computeFileChecksumUseCase: ComputeFileChecksumUseCase by lazy {
        ComputeFileChecksumUseCase(fileChecksumReader)
    }

    val toggleShowHiddenFilesUseCase: ToggleShowHiddenFilesUseCase by lazy {
        ToggleShowHiddenFilesUseCase(appPreferencesRepository)
    }

    val searchFilesUseCase: SearchFilesUseCase by lazy {
        SearchFilesUseCase(fileSearchService)
    }
}
