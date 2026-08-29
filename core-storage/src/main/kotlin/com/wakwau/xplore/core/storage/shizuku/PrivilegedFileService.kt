// [Jalur Class]: com.wakwau.xplore.core.storage.shizuku.PrivilegedFileService
// [Penjelasan]: Implementasi dari IPrivilegedFileService yang berjalan di proses Shizuku, memberikan akses file system tingkat tinggi.
package com.wakwau.xplore.core.storage.shizuku

import android.os.Bundle
import java.io.File
import kotlin.system.exitProcess

class PrivilegedFileService : IPrivilegedFileService.Stub() {
    override fun destroy() {
        exitProcess(0)
    }

    override fun listDirectory(path: String): List<Bundle> {
        val dir = File(path)
        val files = dir.listFiles() ?: return emptyList()
        return files.map { file ->
            Bundle().apply {
                putString(ShizukuIpcConstants.KEY_NAME, file.name)
                putString(ShizukuIpcConstants.KEY_PATH, file.absolutePath)
                putLong(ShizukuIpcConstants.KEY_SIZE, file.length())
                putLong(ShizukuIpcConstants.KEY_LAST_MODIFIED, file.lastModified())
                putBoolean(ShizukuIpcConstants.KEY_IS_DIRECTORY, file.isDirectory)
                putBoolean(ShizukuIpcConstants.KEY_IS_HIDDEN, file.isHidden)
            }
        }
    }

    override fun exists(path: String): Boolean = File(path).exists()
    
    override fun delete(path: String): Boolean {
        val file = File(path)
        return if (file.isDirectory) file.deleteRecursively() else file.delete()
    }
    
    override fun rename(sourcePath: String, destPath: String): Boolean =
        File(sourcePath).renameTo(File(destPath))
        
    override fun createDirectory(path: String): Boolean = File(path).mkdirs()
    
    override fun length(path: String): Long = File(path).length()
    
    override fun lastModified(path: String): Long = File(path).lastModified()
    
    override fun isDirectory(path: String): Boolean = File(path).isDirectory
}
