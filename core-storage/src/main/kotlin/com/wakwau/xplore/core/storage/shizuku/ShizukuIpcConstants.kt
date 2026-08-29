// [Jalur Class]: com.wakwau.xplore.core.storage.shizuku.ShizukuIpcConstants
// [Penjelasan]: Konstanta terpusat untuk bundle keys IPC Shizuku dan process name suffix.
package com.wakwau.xplore.core.storage.shizuku

internal object ShizukuIpcConstants {
    const val PROCESS_NAME_SUFFIX = "privileged_storage"
    const val KEY_NAME = "name"
    const val KEY_PATH = "path"
    const val KEY_SIZE = "size"
    const val KEY_LAST_MODIFIED = "lastModified"
    const val KEY_IS_DIRECTORY = "isDirectory"
    const val KEY_IS_HIDDEN = "isHidden"
}
