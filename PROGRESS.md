# Progress Tracking

| Task ID | Deskripsi Task | Modul/File Terkait | Status |
|---|---|---|---|
| TASK-001 | Mengubah `applicationId` menjadi `com.wakwau.xplore` | `app/build.gradle.kts` | SELESAI |
| TASK-002 | Melakukan audit dead code, unused code, dan duplikat | `Auditcodemati.md` | SELESAI |
| TASK-003 | Menghapus `FileStreamProvider.kt` (Dead code/YAGNI) | `core-storage-api/.../FileStreamProvider.kt` | SELESAI |
| TASK-004 | Ekstraksi Hardcoded UI String ke strings.xml | `filemanager-ui/...` | SELESAI |
| TASK-005 | Hapus Fake Data kapasitas storage dan gunakan `StatFs` | `FileManagerStorageHeader.kt` | SELESAI |
| TASK-006 | Refactor Hardcoded Global Constants (Pesan Berhasil/Gagal) menggunakan `R.string` | `FileOperationConstants.kt`, `DualPaneEvent`, `Reducer`, `StorageConstants.kt` | SELESAI |
| TASK-007 | Refactor Hardcoded Path `/storage/emulated/0` menggunakan `System.getenv("EXTERNAL_STORAGE")` | `StorageConstants.kt`, `FileManagerStorageHeader.kt` | SELESAI |
| TASK-008 | Mengubah `applicationId` dari `com.wakwau.hxsqtd` menjadi `com.wakwau.xplore` | `app/build.gradle.kts` | SELESAI |
| TASK-009 | Memperbaiki NoSuchMethodError getOPERATION_DELETE pada `FileOperationConstants` dengan beralih ke JVM getter properties | `FileOperationConstants.kt` | SELESAI |
| TASK-010 | Memperbaiki aksi Side Action Bar (Copy, Move, Delete, Toggle Hidden) agar selaras dengan tree view state dan destinasi fallback | `FileManagerContent.kt`, `DualPaneViewModel.kt`, `DualPaneEvent.kt`, `FileTreeEngine.kt`, `CopyOperationHandler.kt`, `MoveOperationHandler.kt` | SELESAI |
| TASK-011 | Menambahkan fitur "Tandai (Mark)" dan "Hapus Tanda (Unmark)" ke Side Action Bar dan sinkronisasi status seleksi file tree | `SideActionBar.kt`, `FileManagerContent.kt`, `strings.xml`, `DualPaneViewModel.kt` | SELESAI |
| TASK-012 | Menghapus aksi Detail dari SideActionBar dan mengimplementasikan Dialog Detail Berkas (Tab File dan Tab SHA MD5) saat menekan ikon bundar atau ikon berkas | `FileDetailDialog.kt`, `FileDetailInfoTab.kt`, `FileDetailChecksumTab.kt`, `FileDetailRow.kt`, `AppIntentResolver.kt`, `FileListItem.kt`, `FileManagerContent.kt`, `strings.xml` | SELESAI |
| TASK-013 | Audit implementasi nyata (tanpa fake/placeholder/mock di production): pembuatan direktori SAF via DocumentFile (`SafDirectoryCreator`), kalkulasi hash kriptografis nyata (MD5, SHA-1, SHA-256) via I/O stream (lokal & SAF), dan pembacaan metadata nyata | `SafDirectoryCreator.kt`, `DirectoryRepositoryImpl.kt`, `LocalFileChecksumCalculator.kt`, `LocalDetailedMetadataReader.kt`, `StorageModule.kt` | SELESAI |

| TASK-014 | Implementasi layanan pencarian asinkron (FileSearchService), dialog pencarian (FileSearchDialog), handler aksi pencarian, dan tombol Search di Side Action Bar | `core-storage`, `filemanager`, `filemanager-ui` | SELESAI |
| TASK-015 | Implementasi fitur Room Database untuk index pencarian (FileIndexEntity, FileIndexDao, FileIndexRepository) dan real-time filtering search stream | `core-storage`, `app` | SELESAI |
| TASK-016 | Refactor Arsitektur Pencarian: Inkremental Indexing via `ListDirectoryUseCase`, Invalidation via `Move/Copy/Rename/Delete`, dan menampilkan hasil pencarian pada panel utama sebagai virtual root node | `core-storage-api`, `filemanager`, `filemanager-ui`, `FileSearchServiceImpl.kt`, `FileTreeEngine.kt`, `TreeNavigationAdapter.kt` | SELESAI |
| TASK-017 | Mengubah `applicationId` dari `com.wakwau.pimghh` menjadi `com.wakwau.xplore` | `app/build.gradle.kts` | SELESAI |
| TASK-018 | Menghapus konfigurasi ABI splits dan menyertakan abiFilters x86/x86_64/arm ke default single APK agar kompatibel dengan instalasi otomatis emulator preview | `app/build.gradle.kts` | SELESAI |
