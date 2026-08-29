package rikka.shizuku;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.amazon.device.iap.internal.a.ns.SFLvitRFwnxtcs;
import com.google.android.gms.measurement.api.Uan.bD.NLFulsVnkNPUjZ;
import com.google.maps.android.compose.utils.attribution.njD.VUd.OwOi;
import defpackage.eq7;
import defpackage.p37;
import defpackage.s4d;
import defpackage.un2;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import moe.shizuku.api.BinderContainer;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
public class ShizukuProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.multiprocess) {
            un2.j("android:multiprocess must be false");
        } else {
            if (providerInfo.exported) {
                return;
            }
            un2.j("android:exported must be true");
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return ((Integer) OwOi.vpEONGWhGCwGQEm.invoke(null, this, uri, str, strArr)).intValue();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return (Uri) OwOi.tMILQdQY.invoke(null, this, uri, contentValues);
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        IBinder strongBinder;
        if (s4d.d) {
            return true;
        }
        String packageName = getContext().getPackageName();
        HashMap map = eq7.a;
        IBinder iBinder = (IBinder) map.get("activity");
        IBinder iBinder2 = null;
        if (iBinder == null) {
            try {
                iBinder = (IBinder) eq7.b.invoke(null, "activity");
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.w("SystemServiceHelper", Log.getStackTraceString(e));
            }
            map.put("activity", iBinder);
        }
        boolean z = false;
        if (iBinder != null) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("android.app.IActivityManager");
                parcelObtain.writeInt(2);
                iBinder.transact(1599296841, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                strongBinder = parcelObtain2.readStrongBinder();
            } finally {
                try {
                } finally {
                }
            }
            if (strongBinder != null) {
                parcelObtain.recycle();
                parcelObtain2.recycle();
                iBinder2 = strongBinder;
            }
        }
        if (iBinder2 != null) {
            p37.e(iBinder2, packageName);
            s4d.d = true;
            z = true;
        } else {
            s4d.d = false;
        }
        Log.d("ShizukuProvider", "Initialize Sui: " + z);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return (Cursor) NLFulsVnkNPUjZ.TyiAGG.invoke(null, this, uri, strArr, str, strArr2, str2);
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return ((Integer) OwOi.NhRiozxbyxfEPt.invoke(null, this, uri, contentValues, str, strArr)).intValue();
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        IBinder iBinder;
        if (s4d.d) {
            Log.w("ShizukuProvider", "Provider called when Sui is available. Are you using Shizuku and Sui at the same time?");
            return new Bundle();
        }
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(BinderContainer.class.getClassLoader());
        Bundle bundle2 = new Bundle();
        str.getClass();
        boolean zEquals = str.equals("sendBinder");
        String str3 = SFLvitRFwnxtcs.aNgWgBpvRoa;
        if (zEquals) {
            IBinder iBinder2 = p37.a;
            if (iBinder2 != null && iBinder2.pingBinder()) {
                Log.d("ShizukuProvider", "sendBinder is called when already a living binder");
                return bundle2;
            }
            BinderContainer binderContainer = (BinderContainer) bundle.getParcelable(str3);
            if (binderContainer != null && (iBinder = binderContainer.a) != null) {
                Log.d("ShizukuProvider", "binder received");
                p37.e(iBinder, getContext().getPackageName());
            }
        } else if (str.equals("getBinder")) {
            IBinder iBinder3 = p37.a;
            if (iBinder3 == null || !iBinder3.pingBinder()) {
                return null;
            }
            BinderContainer binderContainer2 = new BinderContainer();
            binderContainer2.a = iBinder3;
            bundle2.putParcelable(str3, binderContainer2);
            return bundle2;
        }
        return bundle2;
    }
}
