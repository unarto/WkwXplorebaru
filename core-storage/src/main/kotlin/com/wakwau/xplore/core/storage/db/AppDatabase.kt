// [Jalur Class]: com.wakwau.xplore.core.storage.db.AppDatabase
// [Penjelasan]: Room Database utama penyimpan skema RecentFileEntity, FileIndexEntity, dan FileOperationQueueEntity.
package com.wakwau.xplore.core.storage.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.wakwau.xplore.core.storage.db.dao.FileIndexDao
import com.wakwau.xplore.core.storage.db.dao.FileOperationQueueDao
import com.wakwau.xplore.core.storage.db.dao.RecentFileDao
import com.wakwau.xplore.core.storage.db.entity.FileIndexEntity
import com.wakwau.xplore.core.storage.db.entity.FileOperationQueueEntity
import com.wakwau.xplore.core.storage.db.entity.RecentFileEntity

@Database(
    entities = [
        RecentFileEntity::class,
        FileIndexEntity::class,
        FileOperationQueueEntity::class
    ],
    version = 2,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun recentFileDao(): RecentFileDao
    abstract fun fileIndexDao(): FileIndexDao
    abstract fun fileOperationQueueDao(): FileOperationQueueDao
}
