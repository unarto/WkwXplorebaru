# Laporan Audit Fitur Pencarian

Setelah dilakukan inspeksi mendalam terhadap seluruh alur *source code* fitur pencarian yang baru saja diimplementasikan, ditemukan sejumlah masalah arsitektur, *bugs*, dan pola implementasi yang keliru (over-engineering dan simulasi *fake index*). Berikut adalah rincian temuannya:

## 1. Lokasi Antarmuka (UI) yang Salah (Tidak Sesuai Referensi Asli)
- **Status:** **DITEMUKAN** (Bug/UI Mismatch)
- **File:** `SideActionBar.kt`, `DualPaneFileManagerScreen.kt`
- **Masalah:** Tombol pencarian awalnya diletakkan sebagai *action button* biasa di `SideActionBar`, dan posisinya bisa terpotong jika resolusi layar tidak cukup.
- **Standar X-plore:** Fitur pencarian ("Find") dalam aplikasi Lonely Cat Games X-plore yang asli **tidak pernah** berada di Side Action Bar, melainkan selalu berada sebagai **Virtual Root Node** di bagian teratas panel Tree View (sejajar dengan *Internal Storage*, *Root*, dll).
- **Tindak Lanjut:** Tombol Cari (Search) harus dicabut dari `SideActionBar.kt` dan diubah menjadi `StorageVolumeItem` (Tipe `VIRTUAL_FIND`) yang selalu di-render di `FileTreeEngine` sebagai node root.

## 2. Implementasi Fake/Simulasi "Indexer" yang Sangat Tidak Efisien
- **Status:** **DITEMUKAN** (Over-engineering / Fake Implementation)
- **File:** `FileSearchServiceImpl.kt`, `FileIndexDao.kt`
- **Masalah:** 
  Penerapan Room Database sebagai mesin pencari (`FileSearchServiceImpl`) terbukti merupakan bentuk *over-engineering* yang keliru. Saat ini, setiap kali pengguna melakukan pencarian, sistem akan memicu `crawlAndIndex()` yang secara harfiah melintasi (membaca) *seluruh* direktori menggunakan `directoryRepository.list()`, lalu meng-insert **semua* file yang ditemukan ke dalam tabel Room SQLite (`FileIndexEntity`), baru kemudian mem-filter datanya menggunakan query SQL `LIKE %keyword%`. 
- **Dampak:** 
  - Jika pengguna melakukan pencarian di `Internal Storage` (root folder `/storage/emulated/0`), sistem akan membaca paksa puluhan ribu file dan menyalin metadatanya ke Room DB saat itu juga. Ini membuat aplikasi *hang*, memboroskan memori secara masif, dan merusak performa *Disk I/O*.
  - Ini bukan mekanisme "Indeks" sejati, melainkan hanya *duplikasi* file system ke SQLite secara *on-the-fly*.
- **Tindak Lanjut:** Keseluruhan konsep penggunaan Room DB untuk pencarian file *real-time* ini wajib dihapus (*Dead/Bad Code*). Pencarian harus dikembalikan menggunakan eksekusi asinkron I/O standar (misal `Files.walkFileTree` atau DFS standar Kotlin) yang langsung menghasilkan emisi `Flow<FileItem>` ke UI (tanpa disimpan ke SQLite terlebih dahulu).

## 3. Komponen Dialog yang "Overkill" dan Tumpang Tindih
- **Status:** **DITEMUKAN** (UI Inconsistency)
- **File:** `FileSearchDialog.kt`, `DualPaneEvent.kt`
- **Masalah:** Alur saat ini memunculkan `FileSearchDialog` melayang (floating), padahal jika mengikuti konsep X-plore asli, saat node "Find" diklik, ia akan meluaskan (expand) sebuah menu masukan parameter secara *inline* di dalam *Tree View*, atau membuka dialog yang hasilnya langsung dimasukkan sebagai *children node* dari "Find".

## Kesimpulan & Rekomendasi
Implementasi saat ini menyimpang jauh dari perilaku asli X-plore dan sangat membebani sistem karena pendekatan *Fake Indexing*. 

**Langkah Perbaikan (Menunggu Instruksi Anda):**
1. Hapus (Delete) `FileSearchServiceImpl`, `FileIndexDao`, dan entitas Room DB terkait pencarian untuk menghentikan pemborosan resource I/O.
2. Pindahkan akses fitur pencarian dari `SideActionBar.kt` menjadi node Root Khusus (`StorageVolumeItem` dengan tipe Virtual) agar sejajar dengan Internal Storage.
3. Tulis ulang `FileSearchService` agar melakukan pencarian langsung ke *File System* murni menggunakan *Kotlin Coroutines* & `Sequence`/`Flow`, lalu me-render hasilnya sebagai daftar berkas biasa tanpa melibatkan *Database Engine*.
