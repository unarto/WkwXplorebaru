// [Jalur Class]: com.wakwau.xplore.di.AppCompositionRoot
// [Penjelasan]: Menghubungkan detailedMetadataReader, fileChecksumReader, dan appPreferencesRepository dari storageModule ke fileManagerUseCaseModule.
package com.wakwau.xplore.di

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import com.wakwau.xplore.core.settings.SettingsRepository
import com.wakwau.xplore.core.ui.settings.SettingsRepositoryImpl
import com.wakwau.xplore.settings.SettingsViewModel

class AppCompositionRoot(applicationContext: Context) {
    val storageModule = StorageModule(applicationContext)
    val fileManagerUseCaseModule = FileManagerUseCaseModule(
        directoryRepository = storageModule.directoryRepository,
        fileRepository = storageModule.fileRepository,
        storageVolumeRepository = storageModule.storageVolumeRepository,
        storagePermissionChecker = storageModule.storagePermissionChecker,
        detailedMetadataReader = storageModule.detailedMetadataReader,
        fileChecksumReader = storageModule.fileChecksumReader,
        appPreferencesRepository = storageModule.appPreferencesRepository,
        fileSearchService = storageModule.fileSearchService,
        fileIndexRepository = storageModule.fileIndexRepository
    )
    val fileManagerPresentationModule = FileManagerPresentationModule(
        useCaseModule = fileManagerUseCaseModule,
        appPreferencesRepository = storageModule.appPreferencesRepository
    )

    val settingsRepository: SettingsRepository by lazy {
        SettingsRepositoryImpl()
    }

    val dualPaneViewModelFactory: ViewModelProvider.Factory by lazy {
        fileManagerPresentationModule.createViewModelFactory()
    }

    val fileManagerViewModelFactory: ViewModelProvider.Factory by lazy {
        fileManagerPresentationModule.createFileManagerViewModelFactory()
    }

    val settingsViewModelFactory: ViewModelProvider.Factory by lazy {
        SettingsViewModel.provideFactory(settingsRepository)
    }
}
