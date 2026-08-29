# Laporan Audit: Hardcoded (Tulisan/Strings, Warna, Jalur & Nilai)

## Ringkasan Eksekutif
Audit telah dilakukan terhadap *source code* pada komponen UI, *domain*, dan *data layer* (mengecualikan direktori referensi `Xplore` dan berkas pengujian). Ditemukan banyak implementasi **hardcoded** pada teks antarmuka (*UI strings*), nilai palsu pada komponen penyimpanan, penetapan warna (*colors*) di luar tema (khususnya pada *breadcrumb*), hingga *hardcoded absolute path* untuk penyimpanan perangkat.

Berikut adalah rincian temuannya:

## 1. Hardcoded UI Strings (Teks Antarmuka Pengguna)
Berbagai *string* teks langsung ditulis di dalam komponen Jetpack Compose, alih-alih menggunakan `stringResource(R.string...)`. Ini membuat aplikasi tidak mendukung pelokalan (multibahasa).
- **`FileManagerStorageHeader.kt`**: 
  - `"Kartu SD"`
  - `"Root"`
  - `"Penyimpanan bersama internal"`
- **`InactivePanelStrip.kt`**:
  - `"Penyimpanan..."`
  - `contentDescription = "Switch to panel"`
- **`PanelSwitcher.kt`**:
  - `"PANEL KIRI"`
  - `"PANEL KANAN"`
- **`FileManagerContent.kt`**: 
  - Dialog judul: `"$opName Items"`
  - Dialog konfirmasi: `"$opName ${state.operationState.items.size} items to:\n${state.operationState.targetPath}?"`
- **`ProgressDialog.kt`**: 
  - Status teks: `"$operationName..."`
- **`FileMetadataBottomSheet.kt`**:
  - Pemanggilan _Toast_: `Toast.makeText(context, context.getString(R.string.toast_copied_to_clipboard, label), Toast.LENGTH_SHORT).show()` (Pesan toast dicampur, sebagian pakai string resource sebagian tidak).
- **`SideActionBar.kt`**:
  - `contentDescription = label.ifEmpty { "Action" }`

## 2. Hardcoded Nilai Simulasi (Fake Data)
Ditemukan nilai *hardcoded* untuk kapasitas penyimpanan pada komponen header utama. Komponen ini tidak mengambil data dari *storage* (seperti `StatFs`), melainkan menggunakan angka palsu/fiktif:
- **`FileManagerStorageHeader.kt` (baris 28-30)**:
  ```kotlin
  freeSpaceText = "6.4GB",
  totalSpaceText = "47GB",
  usedPercentage = 0.86f,
  ```

## 3. Hardcoded Pesan Error & Notifikasi Operasi
Konstanta global (*Constants*) menggunakan *string* bahasa yang ditetapkan mati (tidak adaptif via resource Android):
- **`FileOperationConstants.kt`**:
  - `OPERATION_COPY = "Copy"`, `"Move"`, `"Delete"`
  - `SUCCESS_COPY = "Copy completed"`, dll.
- **`StorageConstants.kt`**:
  - `ERROR_GENERIC_METADATA = "Gagal memuat rincian berkas"`
  - `ERROR_GENERIC_CHECKSUM = "Gagal menghitung checksum berkas"`
- **`StorageFailure.kt`**:
  - Pesan Exception standar: `"Storage permission denied"`, `"Insufficient storage space"`, dll.

## 4. Hardcoded Wana (Colors di Luar Desain Tema)
Meskipun proyek sudah menggunakan pola injeksi tema `XPloreColorScheme`, ada satu file yang menetapkan warna *hex* mati (tanpa melalui variabel tema):
- **`BreadcrumbBar.kt`**:
  - `Color(0xFF0F1722)`
  - `Color(0xFF1E88E5)`
  - `Color(0xFF152A4A)`
  - `Color(0xFF90CAF9)`
  - `Color(0xFF64B5F6)`

## 5. Hardcoded Absolute Path
Penetapan letak memori utama tidak menggunakan API sistem Android standar secara terpusat, melainkan *hardcoded path* yang berpotensi rusak pada OS atau pabrikan tertentu.
- **`StorageConstants.kt`** & **`FileManagerStorageHeader.kt`**:
  - `"/storage/emulated/0"` 

---
**Rekomendasi Perbaikan Menunggu Instruksi:**
1. Ekstraksi semua UI String ke `res/values/strings.xml`.
2. Hapus *Fake Data* `6.4GB` / `47GB` dan hubungkan header ke real data (*StorageSpaceReader* atau State).
3. Ganti warna HEX statis di `BreadcrumbBar.kt` menjadi token warna dari `Theme`.
4. Ganti konstanta *path* memori menjadi pencarian memori dinamis dari `Environment.getExternalStorageDirectory()`.
