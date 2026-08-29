// [Jalur Class]: com.wakwau.xplore.filemanager.ui.presentation.DualPaneViewModelFactory
// [Penjelasan]: Factory penyedia ViewModel yang menginjeksikan seluruh dependensi granular termasuk ToggleShowHiddenFilesUseCase ke DualPaneViewModel tanpa ketergantungan ke FileTreeEngine.
package com.wakwau.xplore.filemanager.ui.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.wakwau.xplore.filemanager.ui.action.CopyOperationHandler
import com.wakwau.xplore.filemanager.ui.action.CreateDirectoryOperationHandler
import com.wakwau.xplore.filemanager.ui.action.DeleteOperationHandler
import com.wakwau.xplore.filemanager.ui.action.FileDetailHandler
import com.wakwau.xplore.filemanager.ui.action.MoveOperationHandler
import com.wakwau.xplore.filemanager.ui.action.PanelNavigationHandler
import com.wakwau.xplore.filemanager.ui.action.PanelRefreshHandler
import com.wakwau.xplore.filemanager.ui.action.RenameOperationHandler
import com.wakwau.xplore.filemanager.ui.action.SearchOperationHandler
import com.wakwau.xplore.filemanager.ui.reducer.DualPaneReducer

import com.wakwau.xplore.core.storage.preferences.AppPreferencesRepository
import com.wakwau.xplore.filemanager.ui.tree.TreeNavigationAdapter
import com.wakwau.xplore.filemanager.usecase.ToggleShowHiddenFilesUseCase

class DualPaneViewModelFactory(
    private val reducer: DualPaneReducer,
    private val refreshHandler: PanelRefreshHandler,
    private val navigationHandler: PanelNavigationHandler,
    private val copyHandler: CopyOperationHandler,
    private val moveHandler: MoveOperationHandler,
    private val deleteHandler: DeleteOperationHandler,
    private val renameHandler: RenameOperationHandler,
    private val createDirectoryHandler: CreateDirectoryOperationHandler,
    private val fileDetailHandler: FileDetailHandler,
    private val searchOperationHandler: SearchOperationHandler,
    private val appPreferencesRepository: AppPreferencesRepository,
    private val treeNavigationAdapter: TreeNavigationAdapter,
    private val toggleShowHiddenFilesUseCase: ToggleShowHiddenFilesUseCase,
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DualPaneViewModel::class.java)) {
            return DualPaneViewModel(
                reducer = reducer,
                refreshHandler = refreshHandler,
                navigationHandler = navigationHandler,
                copyHandler = copyHandler,
                moveHandler = moveHandler,
                deleteHandler = deleteHandler,
                renameHandler = renameHandler,
                createDirectoryHandler = createDirectoryHandler,
                fileDetailHandler = fileDetailHandler,
                searchOperationHandler = searchOperationHandler,
                appPreferencesRepository = appPreferencesRepository,
                treeNavigationAdapter = treeNavigationAdapter,
                toggleShowHiddenFilesUseCase = toggleShowHiddenFilesUseCase,
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
    }
}
