package com.wakwau.xplore.core.storage.permission

interface StoragePermissionChecker {
    fun hasAccess(): Boolean
    fun getRequiredPermissionType(): StoragePermissionType
}
