// [Jalur Class]: com.wakwau.xplore.core.storage.db.entity.FileIndexEntity
// [Penjelasan]: Entity Room untuk indeks metadata berkas guna mempercepat operasi pencarian dan pengelompokan kategori.
package com.wakwau.xplore.core.storage.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "file_index")
data class FileIndexEntity(
    @PrimaryKey
    val filePath: String,
    val fileName: String,
    val size: Long,
    val extension: String,
    val category: String,
    val dateModified: Long,
    val isDirectory: Boolean = false
)
