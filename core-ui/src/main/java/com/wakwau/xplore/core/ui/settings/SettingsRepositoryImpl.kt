// [Jalur Class]: com.wakwau.xplore.core.ui.settings.SettingsRepositoryImpl
// [Penjelasan]: Implementasi SettingsRepository yang menyimpan preferensi tema dan bahasa ke MMKV menggunakan StorageConstants.
package com.wakwau.xplore.core.ui.settings

import com.tencent.mmkv.MMKV
import com.wakwau.xplore.core.settings.AppLanguage
import com.wakwau.xplore.core.settings.AppThemeMode
import com.wakwau.xplore.core.settings.SettingsRepository
import com.wakwau.xplore.core.settings.SettingsState
import com.wakwau.xplore.core.storage.constant.StorageConstants
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SettingsRepositoryImpl(
    private val mmkv: MMKV = MMKV.defaultMMKV()
) : SettingsRepository {

    private val _settingsState = MutableStateFlow(loadSettings())
    override val settingsState: StateFlow<SettingsState> = _settingsState.asStateFlow()

    private fun loadSettings(): SettingsState {
        val themeString = mmkv.decodeString(StorageConstants.Preferences.KEY_THEME_MODE, AppThemeMode.DARK.name) ?: AppThemeMode.DARK.name
        val themeMode = runCatching { AppThemeMode.valueOf(themeString) }.getOrDefault(AppThemeMode.DARK)

        val langString = mmkv.decodeString(StorageConstants.Preferences.KEY_LANGUAGE, AppLanguage.SYSTEM.name) ?: AppLanguage.SYSTEM.name
        val language = runCatching { AppLanguage.valueOf(langString) }.getOrDefault(AppLanguage.SYSTEM)

        return SettingsState(
            themeMode = themeMode,
            language = language
        )
    }

    override suspend fun setThemeMode(mode: AppThemeMode) {
        mmkv.encode(StorageConstants.Preferences.KEY_THEME_MODE, mode.name)
        _settingsState.value = _settingsState.value.copy(themeMode = mode)
    }

    override suspend fun setLanguage(language: AppLanguage) {
        mmkv.encode(StorageConstants.Preferences.KEY_LANGUAGE, language.name)
        _settingsState.value = _settingsState.value.copy(language = language)
    }
}
