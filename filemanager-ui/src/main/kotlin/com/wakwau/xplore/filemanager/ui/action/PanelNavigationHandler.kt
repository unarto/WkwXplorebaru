// [Jalur Class]: com.wakwau.xplore.filemanager.ui.action.PanelNavigationHandler
// [Penjelasan]: Menangani logika navigasi naik satu level direktori (Up Dir) menggunakan java.io.File API yang aman.
package com.wakwau.xplore.filemanager.ui.action

import com.wakwau.xplore.core.storage.constant.StorageConstants
import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.filemanager.ui.event.DualPaneEvent
import com.wakwau.xplore.filemanager.ui.state.DualPaneState
import com.wakwau.xplore.filemanager.ui.state.PanelId
import java.io.File

class PanelNavigationHandler(
    private val dispatch: (DualPaneEvent) -> Unit
) {
    fun handleNavigateUp(state: DualPaneState, panelId: PanelId) {
        val panel = if (panelId == PanelId.LEFT) state.leftPanel else state.rightPanel
        val currentLocation = panel.currentLocation
        
        if (currentLocation != null && currentLocation.path.isNotEmpty() && currentLocation.path != StorageConstants.ROOT_PATH) {
            val parentPath = File(currentLocation.path).parent ?: StorageConstants.ROOT_PATH
            val newLocation = StorageLocation(parentPath, currentLocation.rootId)
            dispatch(DualPaneEvent.OpenLocation(panelId, newLocation))
        }
    }
}
