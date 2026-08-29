package com.wakwau.xplore.core.storage.permission

import java.io.File

object FilePermissionConstants {
    const val FLAG_READ = "Baca (Read)"
    const val FLAG_WRITE = "Tulis (Write)"
    const val FLAG_EXECUTE = "Eksekusi (Execute)"
    const val FLAG_HIDDEN = "Tersembunyi (Hidden)"
    const val NO_SPECIAL_PERMISSIONS = "Tidak ada izin khusus"
    const val POSIX_READ = "r"
    const val POSIX_WRITE = "w"
    const val POSIX_EXECUTE = "x"
    const val POSIX_NONE = "-"
}

// [Jalur Class]: com.wakwau.xplore.core.storage.permission.FilePermissionFormatter
// [Penjelasan]: Membaca dan memformat status perizinan berkas (read, write, execute) ke format standar POSIX (misalnya rwxr-xr-x atau rw-r--r--) dengan konstanta terstruktur.
class FilePermissionFormatter {

    fun formatPosixPermissions(file: File): String {
        val r = if (file.canRead()) FilePermissionConstants.POSIX_READ else FilePermissionConstants.POSIX_NONE
        val w = if (file.canWrite()) FilePermissionConstants.POSIX_WRITE else FilePermissionConstants.POSIX_NONE
        val x = if (file.canExecute()) FilePermissionConstants.POSIX_EXECUTE else FilePermissionConstants.POSIX_NONE
        return "$r$w$x$r-$x$r--"
    }

    fun formatPermissionSummary(file: File): String {
        val flags = mutableListOf<String>()
        if (file.canRead()) flags.add(FilePermissionConstants.FLAG_READ)
        if (file.canWrite()) flags.add(FilePermissionConstants.FLAG_WRITE)
        if (file.canExecute()) flags.add(FilePermissionConstants.FLAG_EXECUTE)
        if (file.isHidden) flags.add(FilePermissionConstants.FLAG_HIDDEN)
        return if (flags.isEmpty()) FilePermissionConstants.NO_SPECIAL_PERMISSIONS else flags.joinToString(", ")
    }
}
