# Laporan Audit Fitur Detail Berkas

**Waktu Audit**: 28 Agustus 2026
**Target Audit**: Modul `filemanager-ui/src/main/kotlin/com/wakwau/xplore/filemanager/ui/detail/` dan sekitarnya (Dialog, Tab Info, Tab Checksum, Intent Resolver, Checksum Calculator, Metadata Reader).
**Tujuan**: Menemukan bug, kode tiruan (mock/fake/dummy), *hardcoded string*, *dead code*, *duplicate code*, dan praktik yang tidak aman pada kode produksi (SRP, Arsitektur, Implementasi).

---

## 1. Status Implementasi Nyata (Mock/Fake/Dummy/Placeholder)
* **Status**: **LULUS (100% Nyata)**
* **Penjelasan**: Tidak ditemukan lagi implementasi palsu/mocking di kode produksi. 
    * `LocalFileChecksumCalculator` dan `LocalDetailedMetadataReader` (dari `core-storage`) murni memanggil I/O *Stream* nyata, `java.security.MessageDigest`, dan Android `DocumentFile` secara riil. 
    * `FileTreeEngine` tidak menggunakan *placeholder* buatan untuk fitur ini. 
    * `FileDetailDialog` langsung memetakan state tanpa data tiruan.

## 2. Temuan Bug & Praktik Tidak Aman

### a) Cacat Keamanan / Crash pada `AppIntentResolver.kt` (Prioritas: TINGGI)
* **File**: `AppIntentResolver.kt`
* **Masalah**: Menggunakan metode lawas `Uri.fromFile(File(filePath))` untuk membagikan berkas ke aplikasi eksternal (via `Intent.ACTION_VIEW`).
* **Dampak**: 
  1. Pada Android 7.0+ (Nougat / API 24+), ini akan memicu *Crash* `FileUriExposedException` karena kebijakan `StrictMode` Android. 
  2. Untuk direktori/file SAF (*Storage Access Framework*), format path adalah `content://...`, namun dengan logika saat ini akan dikonversi menjadi `file:///content://...` yang mana sama sekali tidak valid (cacat absolut).
* **Saran Perbaikan**:
  * Harus mengimplementasikan pengecekan `content://` (gunakan `Uri.parse()`).
  * Jika path merupakan file lokal murni (`/storage/...`), maka wajib menggunakan `FileProvider.getUriForFile` yang sudah terdaftar di `AndroidManifest.xml` (ber-otoritas `${applicationId}.fileprovider`).

### b) Error Message Tertukar pada `FileDetailHandler.kt` (Prioritas: SEDANG)
* **File**: `FileDetailHandler.kt` (Baris 19)
* **Masalah**: Pada saat `loadDetails(item)` gagal (catch block), event yang dikirimkan menggunakan pesan error dari kalkulasi checksum:
  `dispatch(DualPaneEvent.FileDetailsFailed(R.string.err_calculate_checksum, e.message))`
* **Dampak**: Jika gagal memuat detail info (metadata) dari file, *error message* akan menampilkan teks yang salah (menyebutkan gagal hitung checksum, bukan gagal memuat info).
* **Saran Perbaikan**: Ganti parameter error menjadi error spesifik (misalnya `R.string.err_load_file`).

### c) Pendeteksian MIME Type Potensial Gagal untuk SAF (Prioritas: RENDAH)
* **File**: `AppIntentResolver.kt`
* **Masalah**: Pendeteksian MIME type alternatif `MimeTypeDetector.getMimeType(filePath)` tidak reliabel untuk URI milik SAF karena URI SAF (misal `content://...`) seringkali tidak memiliki ekstensi yang terbaca (*opaque URI*).
* **Saran Perbaikan**: Idealnya menggunakan MIME Type yang sudah ada dari `metadata.mimeType` hasil pembacaan `LocalDetailedMetadataReader`.

## 3. String Hardcoded
* **File**: `FileDetailInfoTab.kt` (Baris 241)
* **Masalah**: Penggunaan format indeks `text = "${index + 1}:"` masih semi-hardcoded dan tidak melalui resource string (seharusnya menggunakan interpolasi parameter xml seperti `<string name="label_index_format">%1$d:</string>`). 
* **Saran**: Sangat *minor*, tapi untuk standar tertinggi, bisa dipindahkan ke `strings.xml`.

## 4. Code Mati (Dead Code) / Duplikat (Duplicate Code)
* **Status**: **BERSIH**
* **Penjelasan**: Seluruh kelas dan fungsi di dalam paket `detail` dan dependensinya tereksekusi pada hierarki `FileDetailDialog` dan `FileDetailHandler`. *Event handler* dan *reducer* terpisah (SRP baik) dan tidak ada duplikasi algoritma kalkulasi hash.

## Kesimpulan
Sistem Detail Berkas saat ini **TIDAK MENGGUNAKAN** tiruan/mock. Namun, ditemukan **Bug Kritis (Android 7+ Crash)** pada `AppIntentResolver` yang akan menggagalkan fitur *"Buka dengan / Open With"* saat berjalan di *device* asli, serta beberapa bug tata letak error ringan.

*Menunggu instruksi lebih lanjut untuk eksekusi perbaikan.*
