// [Jalur Class]: com.wakwau.xplore.core.storage.io.LocalDirectoryLister
// [Penjelasan]: Menangani pembacaan dan pemfilteran berkas direktori lokal, termasuk opsi berkas tersembunyi (hidden files).
package com.wakwau.xplore.core.storage.io

import java.io.File
import java.io.FileNotFoundException

class LocalDirectoryLister {
    fun listFiles(path: String, showHidden: Boolean = true): List<File> {
        val directory = File(path)
        if (!directory.exists() || !directory.isDirectory) {
            throw FileNotFoundException("Directory not found or is not a directory: $path")
        }
        
        var files = directory.listFiles()?.toList() ?: emptyList()
        
        if (!showHidden) {
            files = files.filter { !it.isHidden && !it.name.startsWith(".") }
        }
        
        // Default sort: directories first, then alphabetical
        return files.sortedWith(compareBy({ !it.isDirectory }, { it.name.lowercase() }))
    }
}

