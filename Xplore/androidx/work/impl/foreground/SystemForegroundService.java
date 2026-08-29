package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import defpackage.b20;
import defpackage.ns7;
import defpackage.oc8;
import defpackage.pv6;
import defpackage.u7c;
import defpackage.ue4;
import defpackage.up7;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends ue4 {
    public static final String e = b20.o("SystemFgService");
    public boolean b;
    public up7 c;
    public NotificationManager d;

    public final void a() {
        this.d = (NotificationManager) getApplicationContext().getSystemService("notification");
        up7 up7Var = new up7(getApplicationContext());
        this.c = up7Var;
        if (up7Var.L != null) {
            b20.h().f(up7.M, "A callback already exists.");
        } else {
            up7Var.L = this;
        }
    }

    @Override // defpackage.ue4, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // defpackage.ue4, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.c.e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.b;
        boolean z2 = false;
        String str = e;
        if (z) {
            b20.h().m(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.c.e();
            a();
            this.b = false;
        }
        if (intent == null) {
            return 3;
        }
        up7 up7Var = this.c;
        up7Var.getClass();
        String str2 = up7.M;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            b20.h().m(str2, "Started foreground service " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            ns7 ns7Var = up7Var.b;
            u7c u7cVar = new u7c(up7Var, stringExtra, z2, 6);
            ns7Var.getClass();
            ((pv6) ((oc8) ns7Var).b).execute(u7cVar);
            up7Var.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            up7Var.d(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            b20.h().m(str2, "Stopping foreground work for " + intent);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            up7Var.a.a(UUID.fromString(stringExtra2));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        b20.h().m(str2, "Stopping foreground service");
        SystemForegroundService systemForegroundService = up7Var.L;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.b = true;
        b20.h().b(str, "Shutting down.");
        systemForegroundService.stopForeground(true);
        systemForegroundService.stopSelf(i2);
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.c.f(i, 2048);
    }

    public final void onTimeout(int i, int i2) {
        this.c.f(i, i2);
    }
}
