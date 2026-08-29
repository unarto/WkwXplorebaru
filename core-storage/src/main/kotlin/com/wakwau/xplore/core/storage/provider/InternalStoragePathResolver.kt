package com.wakwau.xplore.core.storage.provider

import android.os.Environment
import java.io.File

class InternalStoragePathResolver {
    fun getPrimaryInternalStoragePath(): String {
        return Environment.getExternalStorageDirectory().absolutePath
    }
    
    fun getRootPath(): String {
        return "/"
    }
}
