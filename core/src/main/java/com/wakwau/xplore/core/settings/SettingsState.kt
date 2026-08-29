package com.wakwau.xplore.core.settings

data class SettingsState(
    val themeMode: AppThemeMode = AppThemeMode.DARK,
    val language: AppLanguage = AppLanguage.SYSTEM
)
