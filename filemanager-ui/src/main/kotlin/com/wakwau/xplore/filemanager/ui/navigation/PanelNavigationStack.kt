package com.wakwau.xplore.filemanager.ui.navigation

import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.filemanager.ui.state.PanelId

class PanelNavigationStack {
    private val leftStack = mutableListOf<StorageLocation>()
    private val rightStack = mutableListOf<StorageLocation>()

    private fun getStack(panelId: PanelId) = if (panelId == PanelId.LEFT) leftStack else rightStack

    fun push(panelId: PanelId, location: StorageLocation) {
        val stack = getStack(panelId)
        if (stack.lastOrNull() != location) {
            stack.add(location)
        }
    }

    fun pop(panelId: PanelId): StorageLocation? {
        val stack = getStack(panelId)
        if (stack.size > 1) {
            stack.removeAt(stack.size - 1)
            return stack.last()
        }
        return null
    }

    fun peek(panelId: PanelId): StorageLocation? {
        return getStack(panelId).lastOrNull()
    }

    fun clear(panelId: PanelId) {
        getStack(panelId).clear()
    }
}
