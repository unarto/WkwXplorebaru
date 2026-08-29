package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import defpackage.eha;
import defpackage.f0b;
import defpackage.idb;
import defpackage.nra;
import defpackage.r8b;
import defpackage.rva;
import defpackage.vxa;
import defpackage.xoa;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementSdk {
    public final idb a;

    public AppMeasurementSdk(idb idbVar) {
        this.a = idbVar;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return idb.e(context, null).b;
    }

    public final void a(xoa xoaVar) {
        idb idbVar = this.a;
        ArrayList arrayList = idbVar.c;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (xoaVar.equals(((Pair) arrayList.get(i)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            r8b r8bVar = new r8b(xoaVar);
            arrayList.add(new Pair(xoaVar, r8bVar));
            if (idbVar.f != null) {
                try {
                    idbVar.f.registerOnMeasurementEventListener(r8bVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            idbVar.c(new nra(idbVar, r8bVar, 4));
        }
    }

    public void beginAdUnitExposure(String str) {
        idb idbVar = this.a;
        idbVar.c(new rva(idbVar, str, 0));
    }

    public void endAdUnitExposure(String str) {
        idb idbVar = this.a;
        idbVar.c(new rva(idbVar, str, 1));
    }

    public long generateEventId() {
        return this.a.g();
    }

    public String getAppInstanceId() {
        eha ehaVar = new eha();
        idb idbVar = this.a;
        idbVar.c(new vxa(idbVar, ehaVar, 1));
        return (String) eha.j0(ehaVar.h0(50L), String.class);
    }

    public String getGmpAppId() {
        eha ehaVar = new eha();
        idb idbVar = this.a;
        idbVar.c(new vxa(idbVar, ehaVar, 0));
        return (String) eha.j0(ehaVar.h0(500L), String.class);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        idb idbVar = this.a;
        idbVar.c(new f0b(idbVar, str, str2, bundle, true));
    }
}
