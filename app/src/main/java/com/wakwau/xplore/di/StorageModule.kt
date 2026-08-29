// [Jalur Class]: com.wakwau.xplore.di.StorageModule
// [Penjelasan]: Menginisialisasi komponen I/O, Room Database, AppPreferences (MMKV), dan repository data terstruktur termasuk integrasi preferensi berkas tersembunyi ke DirectoryRepositoryImpl.
package com.wakwau.xplore.di

import android.content.Context
import androidx.room.Room
import com.wakwau.xplore.core.storage.checksum.FileChecksumReader
import com.wakwau.xplore.core.storage.checksum.LocalFileChecksumCalculator
import com.wakwau.xplore.core.storage.db.AppDatabase
import com.wakwau.xplore.core.storage.db.repository.FileIndexRepository
import com.wakwau.xplore.core.storage.db.repository.FileIndexRepositoryImpl
import com.wakwau.xplore.core.storage.db.repository.FileOperationQueueRepository
import com.wakwau.xplore.core.storage.db.repository.FileOperationQueueRepositoryImpl
import com.wakwau.xplore.core.storage.db.repository.RecentFilesRepository
import com.wakwau.xplore.core.storage.db.repository.RecentFilesRepositoryImpl
import com.wakwau.xplore.core.storage.constant.StorageConstants
import com.wakwau.xplore.core.storage.error.StorageErrorMapper
import com.wakwau.xplore.core.storage.io.LocalDirectoryCreator
import com.wakwau.xplore.core.storage.io.LocalDirectoryLister
import com.wakwau.xplore.core.storage.io.LocalFileCopier
import com.wakwau.xplore.core.storage.io.LocalFileDeleter
import com.wakwau.xplore.core.storage.io.LocalFileMover
import com.wakwau.xplore.core.storage.io.LocalFileRenamer
import com.wakwau.xplore.core.storage.io.RootDirectoryLister
import com.wakwau.xplore.core.storage.io.SafDirectoryCreator
import com.wakwau.xplore.core.storage.io.SafDirectoryLister
import com.wakwau.xplore.core.storage.mapper.FileItemMapper
import com.wakwau.xplore.core.storage.metadata.DetailedMetadataReader
import com.wakwau.xplore.core.storage.metadata.FileMetadataReader
import com.wakwau.xplore.core.storage.metadata.LocalDetailedMetadataReader
import com.wakwau.xplore.core.storage.permission.AndroidStoragePermissionChecker
import com.wakwau.xplore.core.storage.permission.FilePermissionFormatter
import com.wakwau.xplore.core.storage.permission.StoragePermissionChecker
import com.wakwau.xplore.core.storage.preferences.AppPreferences
import com.wakwau.xplore.core.storage.preferences.AppPreferencesRepository
import com.wakwau.xplore.core.storage.provider.InternalStoragePathResolver
import com.wakwau.xplore.core.storage.provider.SafVolumeNameResolver
import com.wakwau.xplore.core.storage.provider.StorageSpaceReader
import com.wakwau.xplore.core.storage.repository.DirectoryRepository
import com.wakwau.xplore.core.storage.repository.DirectoryRepositoryImpl
import com.wakwau.xplore.core.storage.repository.FileRepository
import com.wakwau.xplore.core.storage.repository.FileRepositoryImpl
import com.wakwau.xplore.core.storage.repository.StorageVolumeRepository
import com.wakwau.xplore.core.storage.repository.StorageVolumeRepositoryImpl
import com.wakwau.xplore.core.storage.search.FileSearchService
import com.wakwau.xplore.core.storage.search.FileSearchServiceImpl

class StorageModule(private val applicationContext: Context) {
    private val localDirectoryLister = LocalDirectoryLister()
    private val localDirectoryCreator = LocalDirectoryCreator()
    private val localFileDeleter = LocalFileDeleter(applicationContext)
    private val localFileRenamer = LocalFileRenamer()
    private val localFileCopier = LocalFileCopier(applicationContext)
    private val localFileMover = LocalFileMover(applicationContext, localFileCopier, localFileDeleter)
    
    private val internalStoragePathResolver = InternalStoragePathResolver()
    private val storageSpaceReader = StorageSpaceReader()
    private val safVolumeNameResolver = SafVolumeNameResolver(applicationContext)
    
    private val fileMetadataReader = FileMetadataReader()
    private val fileItemMapper = FileItemMapper()
    private val storageErrorMapper = StorageErrorMapper()
    private val filePermissionFormatter = FilePermissionFormatter()

    val database: AppDatabase by lazy {
        Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            DATABASE_NAME
        ).fallbackToDestructiveMigration().build()
    }

    val appPreferencesRepository: AppPreferencesRepository by lazy {
        AppPreferences()
    }

    val recentFilesRepository: RecentFilesRepository by lazy {
        RecentFilesRepositoryImpl(database.recentFileDao())
    }

    val fileIndexRepository: FileIndexRepository by lazy {
        FileIndexRepositoryImpl(database.fileIndexDao())
    }

    val fileOperationQueueRepository: FileOperationQueueRepository by lazy {
        FileOperationQueueRepositoryImpl(database.fileOperationQueueDao())
    }

    val fileChecksumReader: FileChecksumReader by lazy {
        LocalFileChecksumCalculator(applicationContext)
    }

    val detailedMetadataReader: DetailedMetadataReader by lazy {
        LocalDetailedMetadataReader(
            permissionFormatter = filePermissionFormatter,
            context = applicationContext
        )
    }

    val storagePermissionChecker: StoragePermissionChecker by lazy {
        AndroidStoragePermissionChecker(applicationContext)
    }

    val storageVolumeRepository: StorageVolumeRepository by lazy {
        StorageVolumeRepositoryImpl(
            context = applicationContext,
            internalStoragePathResolver = internalStoragePathResolver,
            storageSpaceReader = storageSpaceReader,
            safVolumeNameResolver = safVolumeNameResolver
        )
    }

    private val safDirectoryLister = SafDirectoryLister(applicationContext)
    private val safDirectoryCreator = SafDirectoryCreator(applicationContext)
    private val rootDirectoryLister = RootDirectoryLister(applicationContext)

    val directoryRepository: DirectoryRepository by lazy {
        DirectoryRepositoryImpl(
            localDirectoryLister = localDirectoryLister,
            safDirectoryLister = safDirectoryLister,
            safDirectoryCreator = safDirectoryCreator,
            rootDirectoryLister = rootDirectoryLister,
            localDirectoryCreator = localDirectoryCreator,
            fileMetadataReader = fileMetadataReader,
            fileItemMapper = fileItemMapper,
            storageErrorMapper = storageErrorMapper,
            appPreferencesRepository = appPreferencesRepository
        )
    }

    val fileRepository: FileRepository by lazy {
        FileRepositoryImpl(
            localFileDeleter = localFileDeleter,
            localFileRenamer = localFileRenamer,
            localFileCopier = localFileCopier,
            localFileMover = localFileMover,
            fileMetadataReader = fileMetadataReader,
            fileItemMapper = fileItemMapper,
            storageErrorMapper = storageErrorMapper
        )
    }

    val fileSearchService: FileSearchService by lazy {
        FileSearchServiceImpl(
            directoryRepository = directoryRepository,
            fileIndexRepository = fileIndexRepository
        )
    }

    companion object {
        private const val DATABASE_NAME = StorageConstants.DATABASE_NAME
    }
}

