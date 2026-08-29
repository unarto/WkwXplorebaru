// [Jalur Class]: com.wakwau.xplore.core.storage.constant.StorageConstants
// [Penjelasan]: Konstanta terpusat untuk konfigurasi database, key preferensi MMKV, buffer I/O, volume penyimpanan, dan preferensi.
package com.wakwau.xplore.core.storage.constant

object StorageConstants {
    const val DATABASE_NAME = "xplore_filemanager.db"
    val DEFAULT_PRIMARY_STORAGE_PATH = System.getenv("EXTERNAL_STORAGE") ?: "/storage/emulated/0"
    const val ROOT_PATH = "/"
    const val PRIMARY_INTERNAL_VOLUME_ID = "primary_internal"
    const val DEFAULT_PRIMARY_VOLUME_NAME = "Internal Storage"
    const val EMPTY_NODE_ID_SUFFIX = "/__empty__"

    object Preferences {
        const val KEY_THEME_MODE = "setting_theme_mode"
        const val KEY_LANGUAGE = "setting_language"
        const val KEY_SORT_ORDER = "pref_sort_order"
        const val KEY_SORT_DIRECTION = "pref_sort_direction"
        const val KEY_LAYOUT_MODE = "pref_layout_mode"
        const val KEY_SHOW_HIDDEN_FILES = "pref_show_hidden_files"
        const val KEY_LAST_VISITED_PATH = "pref_last_visited_path"
    }

    object Buffer {
        const val DEFAULT_I_O_BUFFER_SIZE_BYTES = 8192
    }

    object ChecksumAlgorithm {
        const val MD5 = "MD5"
        const val SHA1 = "SHA-1"
        const val SHA256 = "SHA-256"
        const val HEX_CHARS = "0123456789abcdef"
    }
}
