# Analisis Side Action Bar: X-plore Original vs Implementasi Saat Ini

Berdasarkan penelusuran terhadap source code dekompilasi X-plore Java (`/Xplore/com/lonelycatgames/Xplore/`) dan perbandingannya dengan aplikasi kita (`/filemanager-ui/src/main/kotlin/com/wakwau/xplore/filemanager/ui/component/SideActionBar.kt`), berikut adalah analisis komponen Side Action Bar untuk fungsi-fungsi utama: Pindah (Move), Salin (Copy), Hapus (Delete), Pilih (Select), Urutan (Sort), File Tersembunyi (Hidden Files), Folder Baru (New Folder), dan Rincian (Details).

## 1. Arsitektur dan Tata Letak (Layout)
*   **X-plore Original (Java):** Action Bar biasanya diletakkan secara vertikal di antara kedua panel (pada mode Dual Pane) atau di sisi layar. Menggunakan sistem grid/linear custom yang diikat kuat dengan `Browser.java` dan memuat icon statis yang merujuk pada `R.id` aksi.
*   **Aplikasi Kita (Jetpack Compose):** Menggunakan `Column` vertikal (`60.dp` width) dalam `SideActionBar.kt`. Bergantung pada status `FileOperationPanelPosition`, action bar bisa menempel di panel KIRI atau KANAN dengan border pemisah yang dinamis.

## 2. Aksi Operasi File (Copy, Move, Delete)
*   **X-plore Original:** Operasi intensif dijalankan oleh service background terpisah (terlihat pada eksistensi `CopyMoveService.java`), sehingga UI tidak terblokir (asynchronous).
*   **Aplikasi Kita:** Menggunakan Handler spesifik (`CopyOperationHandler.kt`, `MoveOperationHandler.kt`, `DeleteOperationHandler.kt`). Aksi-aksi ini merespons langsung state jumlah file terpilih (`selectedCount`). Jika `selectedCount > 0`, warna icon berubah menjadi Primary (aktif) dan label menunjukkan jumlah file (contoh: "Salin 2"). Operasi ini dieksekusi secara asinkron menggunakan Kotlin Coroutines di `DualPaneViewModel`.

## 3. Fitur Pilihan (Select / Mark)
*   **X-plore Original:** Memiliki tombol "Mark" spesifik pada baris UI utama untuk memudahkan pemilihan massal.
*   **Aplikasi Kita:** Pemilihan ditangani oleh `TreeSelectionHandler` di dalam list/tree secara mandiri (tap ikon/checkbox). Saat ini, *Side Action Bar belum memiliki tombol dedicated untuk "Pilih Semua" atau "Pilih Mode"*, hanya bereaksi terhadap hasil pilihan file (menghitung jumlah).

## 4. Urutan (Sort) dan File Tersembunyi (Hidden Files)
*   **X-plore Original:** Merupakan toggle status yang tersimpan di preferensi. Aksi `show_hidden_files` akan me-refresh daftar file.
*   **Aplikasi Kita:** 
    *   **Urutan:** Sudah terimplementasi via `SideAction.SORT`. Mengklik tombol ini akan memanggil `SortDialog.kt` yang memberikan opsi pengurutan (Berdasarkan Nama, Tanggal, Ukuran, dan Arah Ascending/Descending).
    *   **Tersembunyi:** Sudah terimplementasi via `SideAction.TOGGLE_HIDDEN`. Icon merespons state `showHiddenFiles` (Visibility / VisibilityOff) dan langsung memicu perubahan preferensi (via `ToggleShowHiddenFilesUseCase`).

## 5. Folder Baru (New Folder / Mkdir)
*   **X-plore Original:** Terdapat aksi langsung dari UI utama untuk membuat folder baru.
*   **Aplikasi Kita:** **Kekurangan saat ini.** Dalam `SideActionBar.kt` (dan enum `SideAction`), aksi `NEW_FOLDER` belum ada. Pengguna belum dapat membuat folder baru langsung melalui Side Action Bar, meskipun handler `CreateDirectoryOperationHandler.kt` sudah ada di sistem. Ini perlu ditambahkan di iterasi perbaikan berikutnya.

## 6. Rincian (Details / Properties)
*   **X-plore Original:** Aksi properti file.
*   **Aplikasi Kita:** Terimplementasi melalui `SideAction.DETAIL` dengan tombol `Info`. Ini akan memicu `FileDetailHandler.kt` yang kemudian menampilkan `FileMetadataBottomSheet.kt` untuk menampilkan rincian dari satu atau beberapa file yang dipilih.

## Rekomendasi Perbaikan Bertahap (Menunggu Instruksi)
1.  **Menambahkan Tombol Folder Baru:** Memasukkan `SideAction.NEW_FOLDER` ke enum dan menambahkan `SideActionButton` terkait di `SideActionBar.kt`.
2.  **Menambahkan Fitur "Pilih Semua / Batal Pilih" (Select All):** Jika diperlukan, menambahkan tombol atau toggle pemilihan untuk memudahkan user mengelola file dalam jumlah besar.
3.  **Menambahkan Tombol "Rename" (Ubah Nama):** Tombol Ubah Nama juga bisa diintegrasikan ke action bar jika hanya ada satu file yang dipilih (sama seperti Delete).

Catatan analisis ini disimpan untuk acuan perbaikan selanjutnya.
