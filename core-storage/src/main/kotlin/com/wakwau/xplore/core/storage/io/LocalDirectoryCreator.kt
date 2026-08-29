package com.wakwau.xplore.core.storage.io

import java.io.File
import java.io.IOException

// [Jalur Class]: com.wakwau.xplore.core.storage.io.LocalDirectoryCreator
// [Penjelasan]: Membuat direktori lokal baru dengan sanitasi nama dan validasi canonicalPath terhadap parent directory untuk mencegah Path Traversal.
class LocalDirectoryCreator {
    fun createDirectory(parentPath: String, name: String): File {
        if (name.contains("/") || name.contains("\\") || name == ".." || name == ".") {
            throw IllegalArgumentException("Invalid directory name: $name")
        }
        val parent = File(parentPath)
        if (!parent.exists() || !parent.isDirectory) {
            throw IOException("Parent directory not found: $parentPath")
        }
        val dir = File(parent, name)
        
        // Validasi Sanitasi Path Traversal
        val parentCanonical = parent.canonicalPath
        val dirCanonical = dir.canonicalPath
        if (!dirCanonical.startsWith(parentCanonical + File.separator) && dirCanonical != parentCanonical) {
            throw SecurityException("Path traversal attempt detected: $name")
        }

        if (dir.exists()) {
            throw IOException("EEXIST: Directory already exists: $name")
        }
        if (!dir.mkdirs()) {
            throw IOException("Failed to create directory: $name")
        }
        return dir
    }
}
