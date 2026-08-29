package com.wakwau.xplore.core.storage.permission

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.os.Environment
import androidx.core.content.ContextCompat
import com.wakwau.xplore.core.storage.permission.StoragePermissionChecker
import com.wakwau.xplore.core.storage.permission.StoragePermissionType

class AndroidStoragePermissionChecker(
    private val context: Context
) : StoragePermissionChecker {

    override fun hasAccess(): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            Environment.isExternalStorageManager()
        } else {
            ContextCompat.checkSelfPermission(
                context,
                Manifest.permission.READ_EXTERNAL_STORAGE
            ) == PackageManager.PERMISSION_GRANTED &&
            ContextCompat.checkSelfPermission(
                context,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            ) == PackageManager.PERMISSION_GRANTED
        }
    }

    override fun getRequiredPermissionType(): StoragePermissionType {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            StoragePermissionType.MANAGE_EXTERNAL_STORAGE
        } else {
            StoragePermissionType.READ_WRITE_STORAGE
        }
    }
}
