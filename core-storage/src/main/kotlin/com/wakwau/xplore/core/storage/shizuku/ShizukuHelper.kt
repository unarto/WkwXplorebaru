// [Jalur Class]: com.wakwau.xplore.core.storage.shizuku.ShizukuHelper
// [Penjelasan]: Kelas pembantu untuk mengelola IPC Shizuku dan berkomunikasi dengan PrivilegedFileService.
package com.wakwau.xplore.core.storage.shizuku

import android.content.ComponentName
import android.content.ServiceConnection
import android.os.IBinder
import kotlinx.coroutines.suspendCancellableCoroutine
import rikka.shizuku.Shizuku
import kotlin.coroutines.resume

object ShizukuHelper {
    private var service: IPrivilegedFileService? = null

    suspend fun getPrivilegedService(packageName: String): IPrivilegedFileService? = suspendCancellableCoroutine { cont ->
        if (service != null) {
            cont.resume(service)
            return@suspendCancellableCoroutine
        }

        if (!Shizuku.pingBinder()) {
            cont.resume(null)
            return@suspendCancellableCoroutine
        }

        val args = Shizuku.UserServiceArgs(
            ComponentName(packageName, PrivilegedFileService::class.java.name)
        ).daemon(false).processNameSuffix(ShizukuIpcConstants.PROCESS_NAME_SUFFIX)

        val connection = object : ServiceConnection {
            override fun onServiceConnected(name: ComponentName?, binder: IBinder?) {
                service = IPrivilegedFileService.Stub.asInterface(binder)
                cont.resume(service)
            }

            override fun onServiceDisconnected(name: ComponentName?) {
                service = null
            }
        }

        Shizuku.bindUserService(args, connection)

        cont.invokeOnCancellation {
            Shizuku.unbindUserService(args, connection, true)
        }
    }
}

