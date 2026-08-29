// [Jalur Class]: com.wakwau.xplore.XploreRoot
// [Penjelasan]: Menginjeksi TreeNavigationAdapter dari fileManagerPresentationModule ke DualPaneFileManagerScreen.
package com.wakwau.xplore

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import com.wakwau.xplore.filemanager.ui.settings.SettingsTreeScreen
import com.wakwau.xplore.filemanager.ui.presentation.DualPaneViewModel
import com.wakwau.xplore.filemanager.ui.presentation.FileManagerViewModel
import com.wakwau.xplore.filemanager.ui.screen.DualPaneFileManagerScreen
import com.wakwau.xplore.filemanager.ui.screen.PermissionScreen
import com.wakwau.xplore.settings.SettingsViewModel

@Composable
fun XploreRoot(
    settingsViewModel: SettingsViewModel = viewModel(
        factory = (LocalContext.current.applicationContext as XploreApplication).appCompositionRoot.settingsViewModelFactory
    )
) {
    // [Jalur Class]: com.wakwau.xplore.XploreRoot
    // [Penjelasan]: Menghubungkan ViewModel dan TreeNavigationAdapter ke tampilan layar utama.
    val context = LocalContext.current
    val app = context.applicationContext as XploreApplication
    val dualPaneViewModel: DualPaneViewModel = viewModel(
        factory = app.appCompositionRoot.dualPaneViewModelFactory
    )
    val fileManagerViewModel: FileManagerViewModel = viewModel(
        factory = app.appCompositionRoot.fileManagerViewModelFactory
    )

    val uiState by fileManagerViewModel.uiState.collectAsState()
    val settingsState by settingsViewModel.settingsState.collectAsState()
    var isSettingsOpen by remember { mutableStateOf(false) }

    if (isSettingsOpen) {
        SettingsTreeScreen(
            settingsState = settingsState,
            onThemeSelected = { mode -> settingsViewModel.setThemeMode(mode) },
            onLanguageSelected = { lang -> settingsViewModel.setLanguage(lang) },
            onBackClick = { isSettingsOpen = false }
        )
    } else {
        if (uiState.hasPermission) {
            DualPaneFileManagerScreen(
                viewModel = dualPaneViewModel,
                treeAdapter = app.appCompositionRoot.fileManagerPresentationModule.treeNavigationAdapter,
                storageVolumes = uiState.storageVolumes,
                onSettingsClick = { isSettingsOpen = true }
            )
        } else {
            PermissionScreen(
                onCheckPermission = { fileManagerViewModel.checkPermission() }
            )
        }
    }
}
