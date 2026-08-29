package com.wakwau.xplore.core.storage.io

import java.io.File
import java.io.FileNotFoundException
import java.io.IOException

// [Jalur Class]: com.wakwau.xplore.core.storage.io.LocalFileRenamer
// [Penjelasan]: Mengubah nama file/folder dengan sanitasi nama dan validasi canonicalPath terhadap parent directory.
class LocalFileRenamer {
    fun rename(path: String, newName: String): File {
        if (newName.contains("/") || newName.contains("\\") || newName == ".." || newName == ".") {
            throw IllegalArgumentException("Invalid name: $newName")
        }
        val file = File(path)
        if (!file.exists()) {
            throw FileNotFoundException("File not found: $path")
        }
        val parent = file.parentFile ?: throw IOException("Parent directory not found for: $path")
        val target = File(parent, newName)
        
        // Validasi Sanitasi Path Traversal
        val parentCanonical = parent.canonicalPath
        val targetCanonical = target.canonicalPath
        if (!targetCanonical.startsWith(parentCanonical + File.separator) && targetCanonical != parentCanonical) {
            throw SecurityException("Path traversal attempt detected: $newName")
        }

        if (target.exists()) {
            throw IOException("EEXIST: Target already exists: $newName")
        }
        if (!file.renameTo(target)) {
            throw IOException("Failed to rename file to: $newName")
        }
        return target
    }
}
