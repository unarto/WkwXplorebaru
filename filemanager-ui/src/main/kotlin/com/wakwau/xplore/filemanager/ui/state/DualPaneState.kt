package com.wakwau.xplore.filemanager.ui.state

// [Jalur Class]: com.wakwau.xplore.filemanager.ui.state.DualPaneState
// [Penjelasan]: State immutable panel ganda dengan integrasi state rincian metadata berkas terpilih (fileDetailState).
data class DualPaneState(
    val leftPanel: PanelState = PanelState(id = PanelId.LEFT),
    val rightPanel: PanelState = PanelState(id = PanelId.RIGHT),
    val activePanelId: PanelId = PanelId.LEFT,
    val operationState: OperationUiState = OperationUiState.Idle,
    val fileDetailState: FileDetailState = FileDetailState(),
    val searchUiState: SearchUiState = SearchUiState()
) {
    val activePanel: PanelState
        get() = if (activePanelId == PanelId.LEFT) leftPanel else rightPanel

    val inactivePanel: PanelState
        get() = if (activePanelId == PanelId.LEFT) rightPanel else leftPanel
}
