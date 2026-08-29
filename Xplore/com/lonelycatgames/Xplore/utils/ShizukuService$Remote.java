package com.lonelycatgames.Xplore.utils;

import android.os.Binder;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import com.lonelycatgames.Xplore.App;
import defpackage.e;
import defpackage.k47;
import defpackage.l47;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/lonelycatgames/Xplore/utils/ShizukuService$Remote", "Landroid/os/Binder;", "<init>", "()V", "", "code", "Landroid/os/Parcel;", "data", "reply", "flags", "", "onTransact", "(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ShizukuService$Remote extends Binder {
    public static final int $stable = 8;

    @Override // android.os.Binder
    public boolean onTransact(int code, Parcel data, Parcel reply, int flags) {
        Object next;
        data.getClass();
        if (reply == null) {
            e.k("Required value was null.");
            return false;
        }
        if (1 <= code && code < 16777216) {
            data.enforceInterface("com.lonelycatgames.Xplore.ShizukuService");
        }
        Iterator it = l47.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((k47) next).a == code) {
                break;
            }
        }
        k47 k47Var = (k47) next;
        if (k47Var != null) {
            k47Var.b(data, reply);
            return true;
        }
        Handler handler = App.M0;
        Log.i("X-plore", "Shizuku Remote unknown transaction: " + code);
        return super.onTransact(code, data, reply, flags);
    }
}
