// [Jalur Class]: com.wakwau.xplore.core.storage.db.entity.FileOperationQueueEntity
// [Penjelasan]: Entity Room untuk antrean tugas operasi berkas (copy/move/extract) mencakup status dan tingkat progres.
package com.wakwau.xplore.core.storage.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "file_operation_queue")
data class FileOperationQueueEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val sourcePath: String,
    val targetPath: String,
    val operationType: String,
    val status: String,
    val progress: Float
)
