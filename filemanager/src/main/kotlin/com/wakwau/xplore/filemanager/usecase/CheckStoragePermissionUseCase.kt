package com.wakwau.xplore.filemanager.usecase

import com.wakwau.xplore.core.storage.permission.StoragePermissionChecker
import com.wakwau.xplore.core.storage.permission.StoragePermissionType

class CheckStoragePermissionUseCase(private val permissionChecker: StoragePermissionChecker) {
    fun hasPermission(): Boolean {
        return permissionChecker.hasAccess()
    }
    
    fun getRequiredPermission(): StoragePermissionType {
        return permissionChecker.getRequiredPermissionType()
    }
}
