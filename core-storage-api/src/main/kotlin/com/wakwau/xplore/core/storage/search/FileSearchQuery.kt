package com.wakwau.xplore.core.storage.search

import com.wakwau.xplore.core.storage.model.StorageLocation

data class FileSearchQuery(
    val location: StorageLocation,
    val keyword: String = "",
    val minSize: Long? = null,
    val maxSize: Long? = null,
    val extension: String? = null
)
