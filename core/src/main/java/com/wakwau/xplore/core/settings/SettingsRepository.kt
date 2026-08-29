package com.wakwau.xplore.core.settings

import kotlinx.coroutines.flow.StateFlow

interface SettingsRepository {
    val settingsState: StateFlow<SettingsState>
    suspend fun setThemeMode(mode: AppThemeMode)
    suspend fun setLanguage(language: AppLanguage)
}
