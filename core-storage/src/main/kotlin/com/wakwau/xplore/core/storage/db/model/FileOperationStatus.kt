// [Jalur Class]: com.wakwau.xplore.core.storage.db.model.FileOperationStatus
// [Penjelasan]: Enum status antrean operasi berkas untuk menghindari penggunaan hardcoded string.
package com.wakwau.xplore.core.storage.db.model

enum class FileOperationStatus {
    PENDING,
    IN_PROGRESS,
    COMPLETED,
    FAILED,
    CANCELLED
}
