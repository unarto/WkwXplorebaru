// [Jalur Class]: com.wakwau.xplore.filemanager.ui.detail.AppIntentResolver
// [Penjelasan]: Utilitas penyelesai intent Android di modul filemanager-ui untuk mendeteksi dan membuka daftar aplikasi kompatibel di perangkat bagi berkas atau tipe MIME tertentu secara aman.
package com.wakwau.xplore.filemanager.ui.detail

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.ResolveInfo
import android.graphics.drawable.Drawable
import android.net.Uri
import androidx.core.content.FileProvider
import com.wakwau.xplore.core.util.MimeTypeDetector
import java.io.File

data class CompatibleAppInfo(
    val packageName: String,
    val activityName: String,
    val label: String,
    val icon: Drawable?,
    val isDefault: Boolean = false
)

object AppIntentResolver {

    private fun getSafeUri(context: Context, filePath: String): Uri {
        return if (filePath.startsWith("content://")) {
            Uri.parse(filePath)
        } else {
            FileProvider.getUriForFile(
                context,
                "${context.packageName}.fileprovider",
                File(filePath)
            )
        }
    }

    fun queryCompatibleApps(context: Context, filePath: String, mimeType: String): List<CompatibleAppInfo> {
        val packageManager = context.packageManager
        val fallbackName = if (filePath.startsWith("content://")) "" else File(filePath).name
        val effectiveMimeType = if (mimeType.isNotBlank()) mimeType else MimeTypeDetector.getMimeType(fallbackName)

        val intent = Intent(Intent.ACTION_VIEW).apply {
            setDataAndType(getSafeUri(context, filePath), effectiveMimeType)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        }

        val resolveInfoList: List<ResolveInfo> = try {
            packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)
        } catch (_: Throwable) {
            emptyList()
        }

        val resultList = mutableListOf<CompatibleAppInfo>()
        for (resolveInfo in resolveInfoList) {
            val packageName = resolveInfo.activityInfo.packageName
            val activityName = resolveInfo.activityInfo.name
            val label = resolveInfo.loadLabel(packageManager).toString()
            val icon = resolveInfo.loadIcon(packageManager)

            resultList.add(
                CompatibleAppInfo(
                    packageName = packageName,
                    activityName = activityName,
                    label = label,
                    icon = icon,
                    isDefault = false
                )
            )
        }

        return resultList.distinctBy { it.packageName }
    }

    fun openWithApp(context: Context, filePath: String, mimeType: String, packageName: String, activityName: String) {
        val fallbackName = if (filePath.startsWith("content://")) "" else File(filePath).name
        val effectiveMimeType = if (mimeType.isNotBlank()) mimeType else MimeTypeDetector.getMimeType(fallbackName)
        val uri = getSafeUri(context, filePath)

        val intent = Intent(Intent.ACTION_VIEW).apply {
            setDataAndType(uri, effectiveMimeType)
            setClassName(packageName, activityName)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        }

        try {
            context.startActivity(intent)
        } catch (_: Throwable) {
            val fallbackIntent = Intent(Intent.ACTION_VIEW).apply {
                setDataAndType(uri, effectiveMimeType)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            }
            try {
                context.startActivity(fallbackIntent)
            } catch (_: Throwable) {}
        }
    }
}
