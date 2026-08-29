// [Jalur Class]: com.wakwau.xplore.filemanager.ui.screen.DualPaneFileManagerScreen
// [Penjelasan]: Menggunakan TreeNavigationAdapter untuk menginisialisasi storage volume roots dan meneruskan treeAdapter ke FileManagerScreen.
package com.wakwau.xplore.filemanager.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import com.wakwau.xplore.core.storage.model.StorageVolumeItem
import com.wakwau.xplore.filemanager.ui.presentation.DualPaneViewModel
import com.wakwau.xplore.filemanager.ui.state.PanelId
import com.wakwau.xplore.filemanager.ui.tree.TreeNavigationAdapter

@Composable
fun DualPaneFileManagerScreen(
    viewModel: DualPaneViewModel,
    treeAdapter: TreeNavigationAdapter,
    storageVolumes: List<StorageVolumeItem>,
    onSettingsClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    // [Jalur Class]: com.wakwau.xplore.filemanager.ui.screen.DualPaneFileManagerScreen
    // [Penjelasan]: Menginisialisasi volume root pada TreeNavigationAdapter tanpa menyentuh FileTreeEngine secara langsung.
    LaunchedEffect(storageVolumes) {
        if (storageVolumes.isNotEmpty()) {
            if (!treeAdapter.hasRoots(PanelId.LEFT)) {
                treeAdapter.loadVolumesAsRoots(PanelId.LEFT, storageVolumes)
            }
            if (!treeAdapter.hasRoots(PanelId.RIGHT)) {
                treeAdapter.loadVolumesAsRoots(PanelId.RIGHT, storageVolumes)
            }
        }
    }

    FileManagerScreen(
        viewModel = viewModel,
        treeAdapter = treeAdapter,
        onSettingsClick = onSettingsClick,
        modifier = modifier
    )
}
