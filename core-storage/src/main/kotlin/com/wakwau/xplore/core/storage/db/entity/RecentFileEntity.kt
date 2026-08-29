// [Jalur Class]: com.wakwau.xplore.core.storage.db.entity.RecentFileEntity
// [Penjelasan]: Entity Room untuk menyimpan riwayat berkas yang baru diakses beserta tipe dan timestamp.
package com.wakwau.xplore.core.storage.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recent_files")
data class RecentFileEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val filePath: String,
    val lastAccessedTimestamp: Long,
    val fileType: String
)
