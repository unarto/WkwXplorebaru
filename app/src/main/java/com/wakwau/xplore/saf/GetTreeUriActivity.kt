package com.wakwau.xplore.saf

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.result.contract.ActivityResultContracts

// [Jalur Class]: com.wakwau.xplore.saf.GetTreeUriActivity
// [Penjelasan]: Mengadopsi kemampuan CustomStorageFrameworkFileSystem$GetTreeUriActivity dari X-plore. Activity transparan ini bertugas sebagai trampoline untuk meminta hak akses Document Tree (SAF) menggunakan ACTION_OPEN_DOCUMENT_TREE, kemudian menyimpan persistable URI permission agar aplikasi bisa mengakses folder tersebut di masa depan.
class GetTreeUriActivity : ComponentActivity() {

    companion object {
        const val EXTRA_INITIAL_URI = "EXTRA_INITIAL_URI"
    }

    private val treeUriLauncher = registerForActivityResult(ActivityResultContracts.OpenDocumentTree()) { uri: Uri? ->
        if (uri != null) {
            val takeFlags: Int = Intent.FLAG_GRANT_READ_URI_PERMISSION or Intent.FLAG_GRANT_WRITE_URI_PERMISSION
            contentResolver.takePersistableUriPermission(uri, takeFlags)
            
            val resultIntent = Intent().apply {
                data = uri
            }
            setResult(RESULT_OK, resultIntent)
        } else {
            setResult(RESULT_CANCELED)
        }
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        if (savedInstanceState == null) {
            val initialUri: Uri? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                intent.getParcelableExtra(EXTRA_INITIAL_URI, Uri::class.java)
            } else {
                @Suppress("DEPRECATION")
                intent.getParcelableExtra(EXTRA_INITIAL_URI)
            }
            treeUriLauncher.launch(initialUri)
        }
    }
}
