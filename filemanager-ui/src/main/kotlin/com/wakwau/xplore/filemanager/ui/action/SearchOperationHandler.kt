package com.wakwau.xplore.filemanager.ui.action

import com.wakwau.xplore.core.storage.search.FileSearchQuery
import com.wakwau.xplore.filemanager.ui.event.DualPaneEvent
import com.wakwau.xplore.filemanager.usecase.SearchFilesUseCase
import kotlinx.coroutines.Job
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class SearchOperationHandler(
    private val searchFilesUseCase: SearchFilesUseCase,
    private val dispatch: (DualPaneEvent) -> Unit
) {
    private var searchJob: Job? = null

    suspend fun executeSearch(query: FileSearchQuery) = coroutineScope {
        searchJob?.cancel()
        dispatch(DualPaneEvent.SearchStarted(query.keyword))
        
        searchJob = searchFilesUseCase(query)
            .onEach { results ->
                dispatch(DualPaneEvent.SearchResultsUpdated(query.keyword, results))
            }
            .catch { e ->
                dispatch(DualPaneEvent.SearchFailed(e.message ?: "Unknown error"))
            }
            .launchIn(this)
    }

    fun cancelSearch() {
        searchJob?.cancel()
        searchJob = null
        dispatch(DualPaneEvent.SearchCancelled)
    }
}
