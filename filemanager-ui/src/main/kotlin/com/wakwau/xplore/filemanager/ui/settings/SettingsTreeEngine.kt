package com.wakwau.xplore.filemanager.ui.settings

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Palette
import com.wakwau.xplore.core.settings.AppLanguage
import com.wakwau.xplore.core.settings.AppThemeMode
import com.wakwau.xplore.core.settings.SettingsState
import com.wakwau.xplore.filemanager.ui.R
import com.wakwau.xplore.treeview.model.TreeNode
import com.wakwau.xplore.treeview.state.TreeState

class SettingsTreeEngine(val treeState: TreeState<SettingsItem> = TreeState()) {

    fun updateState(settingsState: SettingsState) {
        val oldThemeGroupExpanded = treeState.roots.find { (it.data as? SettingsItem.Group)?.id == "theme" }?.isExpanded ?: true
        val oldLangGroupExpanded = treeState.roots.find { (it.data as? SettingsItem.Group)?.id == "lang" }?.isExpanded ?: true

        val themeGroup = TreeNode<SettingsItem>(SettingsItem.Group("theme", R.string.group_theme_display, Icons.Default.Palette))
        themeGroup.addChild(TreeNode(SettingsItem.ThemeOption(AppThemeMode.DARK, R.string.theme_option_dark, settingsState.themeMode == AppThemeMode.DARK)))
        themeGroup.addChild(TreeNode(SettingsItem.ThemeOption(AppThemeMode.LIGHT, R.string.theme_option_light, settingsState.themeMode == AppThemeMode.LIGHT)))
        themeGroup.addChild(TreeNode(SettingsItem.ThemeOption(AppThemeMode.SYSTEM, R.string.theme_option_system, settingsState.themeMode == AppThemeMode.SYSTEM)))

        val langGroup = TreeNode<SettingsItem>(SettingsItem.Group("lang", R.string.group_language, Icons.Default.Language))
        langGroup.addChild(TreeNode(SettingsItem.LanguageOption(AppLanguage.INDONESIAN, R.string.lang_option_indonesian, settingsState.language == AppLanguage.INDONESIAN)))
        langGroup.addChild(TreeNode(SettingsItem.LanguageOption(AppLanguage.ENGLISH, R.string.lang_option_english, settingsState.language == AppLanguage.ENGLISH)))
        langGroup.addChild(TreeNode(SettingsItem.LanguageOption(AppLanguage.SYSTEM, R.string.lang_option_system, settingsState.language == AppLanguage.SYSTEM)))

        treeState.setRoots(listOf(themeGroup, langGroup))
        
        if (oldThemeGroupExpanded) {
            treeState.expand(themeGroup)
        }
        if (oldLangGroupExpanded) {
            treeState.expand(langGroup)
        }
    }

    fun toggleNode(node: TreeNode<SettingsItem>) {
        treeState.toggle(node)
    }
}
