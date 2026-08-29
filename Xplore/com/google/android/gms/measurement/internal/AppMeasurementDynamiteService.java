package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import defpackage.afd;
import defpackage.ahd;
import defpackage.bma;
import defpackage.bs;
import defpackage.bu9;
import defpackage.c4b;
import defpackage.coc;
import defpackage.dpa;
import defpackage.e7d;
import defpackage.el0;
import defpackage.fka;
import defpackage.gvb;
import defpackage.h2d;
import defpackage.h65;
import defpackage.hhd;
import defpackage.hna;
import defpackage.hpb;
import defpackage.ifd;
import defpackage.iia;
import defpackage.imc;
import defpackage.iv9;
import defpackage.j7d;
import defpackage.kec;
import defpackage.lqa;
import defpackage.ma3;
import defpackage.n0d;
import defpackage.nc3;
import defpackage.o6d;
import defpackage.ppa;
import defpackage.q7a;
import defpackage.q7d;
import defpackage.qd9;
import defpackage.qn;
import defpackage.qoa;
import defpackage.r3d;
import defpackage.rg5;
import defpackage.s1b;
import defpackage.s2b;
import defpackage.s6a;
import defpackage.t3d;
import defpackage.u2d;
import defpackage.u8d;
import defpackage.un2;
import defpackage.x1d;
import defpackage.yfd;
import defpackage.z0c;
import defpackage.zc0;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementDynamiteService extends iia {
    public coc a;
    public final bs b;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.a = null;
        this.b = new bs(0);
    }

    @Override // defpackage.tia
    public void beginAdUnitExposure(String str, long j) {
        h0();
        qoa qoaVar = this.a.Q;
        coc.d(qoaVar);
        qoaVar.k3(str, j);
    }

    @Override // defpackage.tia
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        o6dVar.x3(str, bundle, str2);
    }

    @Override // defpackage.tia
    public void clearMeasurementEnabled(long j) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        o6dVar.k3();
        imc imcVar = ((coc) o6dVar.b).J;
        coc.g(imcVar);
        Object obj = null;
        imcVar.s3(new s2b(o6dVar, obj, false, 17));
    }

    @Override // defpackage.tia
    public void endAdUnitExposure(String str, long j) {
        h0();
        qoa qoaVar = this.a.Q;
        coc.d(qoaVar);
        qoaVar.l3(str, j);
    }

    @Override // defpackage.tia
    public void generateEventId(fka fkaVar) {
        h0();
        ahd ahdVar = this.a.L;
        coc.e(ahdVar);
        long jG4 = ahdVar.g4();
        h0();
        ahd ahdVar2 = this.a.L;
        coc.e(ahdVar2);
        ahdVar2.W3(fkaVar, jG4);
    }

    @Override // defpackage.tia
    public void getAppInstanceId(fka fkaVar) {
        h0();
        imc imcVar = this.a.J;
        coc.g(imcVar);
        imcVar.s3(new s1b((Object) this, (Object) fkaVar, false, 13));
    }

    @Override // defpackage.tia
    public void getCachedAppInstanceId(fka fkaVar) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        j0((String) o6dVar.K.get(), fkaVar);
    }

    @Override // defpackage.tia
    public void getConditionalUserProperties(String str, String str2, fka fkaVar) {
        h0();
        imc imcVar = this.a.J;
        coc.g(imcVar);
        imcVar.s3(new el0(this, fkaVar, str, str2, 15));
    }

    @Override // defpackage.tia
    public void getCurrentScreenClass(fka fkaVar) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        u8d u8dVar = ((coc) o6dVar.b).O;
        coc.f(u8dVar);
        q7d q7dVar = u8dVar.d;
        j0(q7dVar != null ? q7dVar.b : null, fkaVar);
    }

    @Override // defpackage.tia
    public void getCurrentScreenName(fka fkaVar) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        u8d u8dVar = ((coc) o6dVar.b).O;
        coc.f(u8dVar);
        q7d q7dVar = u8dVar.d;
        j0(q7dVar != null ? q7dVar.a : null, fkaVar);
    }

    @Override // defpackage.tia
    public void getGmpAppId(fka fkaVar) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        j0(o6dVar.y3(), fkaVar);
    }

    @Override // defpackage.tia
    public void getMaxUserProperties(String str, fka fkaVar) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        q7a.f(str);
        qd9 qd9Var = ((coc) o6dVar.b).d;
        h0();
        ahd ahdVar = this.a.L;
        coc.e(ahdVar);
        ahdVar.X3(fkaVar, 25);
    }

    @Override // defpackage.tia
    public void getSessionId(fka fkaVar) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        imc imcVar = ((coc) o6dVar.b).J;
        coc.g(imcVar);
        imcVar.s3(new c4b(o6dVar, fkaVar));
    }

    @Override // defpackage.tia
    public void getTestFlag(fka fkaVar, int i) {
        h0();
        if (i == 0) {
            ahd ahdVar = this.a.L;
            coc.e(ahdVar);
            o6d o6dVar = this.a.P;
            coc.f(o6dVar);
            AtomicReference atomicReference = new AtomicReference();
            imc imcVar = ((coc) o6dVar.b).J;
            coc.g(imcVar);
            ahdVar.V3((String) imcVar.t3(atomicReference, 15000L, "String test flag value", new r3d(o6dVar, atomicReference, 0)), fkaVar);
            return;
        }
        if (i == 1) {
            ahd ahdVar2 = this.a.L;
            coc.e(ahdVar2);
            o6d o6dVar2 = this.a.P;
            coc.f(o6dVar2);
            AtomicReference atomicReference2 = new AtomicReference();
            imc imcVar2 = ((coc) o6dVar2.b).J;
            coc.g(imcVar2);
            ahdVar2.W3(fkaVar, ((Long) imcVar2.t3(atomicReference2, 15000L, "long test flag value", new t3d(o6dVar2, atomicReference2, 0))).longValue());
            return;
        }
        if (i == 2) {
            ahd ahdVar3 = this.a.L;
            coc.e(ahdVar3);
            o6d o6dVar3 = this.a.P;
            coc.f(o6dVar3);
            AtomicReference atomicReference3 = new AtomicReference();
            imc imcVar3 = ((coc) o6dVar3.b).J;
            coc.g(imcVar3);
            double dDoubleValue = ((Double) imcVar3.t3(atomicReference3, 15000L, "double test flag value", new r3d(o6dVar3, atomicReference3, 1))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                fkaVar.L3(bundle);
                return;
            } catch (RemoteException e) {
                z0c z0cVar = ((coc) ahdVar3.b).I;
                coc.g(z0cVar);
                z0cVar.M.f(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            ahd ahdVar4 = this.a.L;
            coc.e(ahdVar4);
            o6d o6dVar4 = this.a.P;
            coc.f(o6dVar4);
            AtomicReference atomicReference4 = new AtomicReference();
            imc imcVar4 = ((coc) o6dVar4.b).J;
            coc.g(imcVar4);
            ahdVar4.X3(fkaVar, ((Integer) imcVar4.t3(atomicReference4, 15000L, "int test flag value", new u2d(o6dVar4, atomicReference4, 1))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        ahd ahdVar5 = this.a.L;
        coc.e(ahdVar5);
        o6d o6dVar5 = this.a.P;
        coc.f(o6dVar5);
        AtomicReference atomicReference5 = new AtomicReference();
        imc imcVar5 = ((coc) o6dVar5.b).J;
        coc.g(imcVar5);
        ahdVar5.Z3(fkaVar, ((Boolean) imcVar5.t3(atomicReference5, 15000L, "boolean test flag value", new u2d(o6dVar5, atomicReference5, 0))).booleanValue());
    }

    @Override // defpackage.tia
    public void getUserProperties(String str, String str2, boolean z, fka fkaVar) {
        h0();
        imc imcVar = this.a.J;
        coc.g(imcVar);
        imcVar.s3(new x1d(this, fkaVar, str, str2, z));
    }

    public final void h0() {
        if (this.a != null) {
            return;
        }
        un2.j("Attempting to perform action before initialize.");
    }

    @Override // defpackage.tia
    public void initForTests(Map map) {
        h0();
    }

    @Override // defpackage.tia
    public void initialize(nc3 nc3Var, ppa ppaVar, long j) {
        coc cocVar = this.a;
        if (cocVar == null) {
            Context context = (Context) rg5.Y1(nc3Var);
            q7a.i(context);
            this.a = coc.l(context, ppaVar, Long.valueOf(j), null);
        } else {
            z0c z0cVar = cocVar.I;
            coc.g(z0cVar);
            z0cVar.M.e("Attempting to initialize multiple times");
        }
    }

    @Override // defpackage.tia
    public void initializeWithElapsedTime(nc3 nc3Var, ppa ppaVar, long j, long j2) {
        coc cocVar = this.a;
        if (cocVar == null) {
            Context context = (Context) rg5.Y1(nc3Var);
            q7a.i(context);
            this.a = coc.l(context, ppaVar, Long.valueOf(j), Long.valueOf(j2));
        } else {
            z0c z0cVar = cocVar.I;
            coc.g(z0cVar);
            z0cVar.M.e("Attempting to initialize multiple times");
        }
    }

    @Override // defpackage.tia
    public void isDataCollectionEnabled(fka fkaVar) {
        h0();
        imc imcVar = this.a.J;
        coc.g(imcVar);
        imcVar.s3(new c4b(this, fkaVar, false, 19));
    }

    public final void j0(String str, fka fkaVar) {
        h0();
        ahd ahdVar = this.a.L;
        coc.e(ahdVar);
        ahdVar.V3(str, fkaVar);
    }

    @Override // defpackage.tia
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        o6dVar.o3(str, str2, bundle, z, z2, j, 0L);
    }

    @Override // defpackage.tia
    public void logEventAndBundle(String str, String str2, Bundle bundle, fka fkaVar, long j) {
        h0();
        q7a.f(str2);
        String str3 = true != this.a.d.u3(null, hpb.f1) ? "app" : "auto";
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str3);
        iv9 iv9Var = new iv9(str2, new bu9(bundle), str3, j, 0L);
        imc imcVar = this.a.J;
        coc.g(imcVar);
        imcVar.s3(new el0(this, fkaVar, iv9Var, str, 10));
    }

    @Override // defpackage.tia
    public void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        o6dVar.o3(str, str2, bundle, z, z2, j, j2);
    }

    @Override // defpackage.tia
    public void logHealthData(int i, String str, nc3 nc3Var, nc3 nc3Var2, nc3 nc3Var3) {
        h0();
        Object objY1 = nc3Var == null ? null : rg5.Y1(nc3Var);
        Object objY12 = nc3Var2 == null ? null : rg5.Y1(nc3Var2);
        Object objY13 = nc3Var3 != null ? rg5.Y1(nc3Var3) : null;
        z0c z0cVar = this.a.I;
        coc.g(z0cVar);
        z0cVar.o3(i, true, false, str, objY1, objY12, objY13);
    }

    @Override // defpackage.tia
    public void onActivityCreated(nc3 nc3Var, Bundle bundle, long j) {
        h0();
        Activity activity = (Activity) rg5.Y1(nc3Var);
        q7a.i(activity);
        onActivityCreatedByScionActivityInfo(lqa.b(activity), bundle, j);
    }

    @Override // defpackage.tia
    public void onActivityCreatedByScionActivityInfo(lqa lqaVar, Bundle bundle, long j) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        qn qnVar = o6dVar.d;
        if (qnVar != null) {
            o6d o6dVar2 = this.a.P;
            coc.f(o6dVar2);
            o6dVar2.C3();
            qnVar.i(lqaVar, bundle);
        }
    }

    @Override // defpackage.tia
    public void onActivityDestroyed(nc3 nc3Var, long j) {
        h0();
        Activity activity = (Activity) rg5.Y1(nc3Var);
        q7a.i(activity);
        onActivityDestroyedByScionActivityInfo(lqa.b(activity), j);
    }

    @Override // defpackage.tia
    public void onActivityDestroyedByScionActivityInfo(lqa lqaVar, long j) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        qn qnVar = o6dVar.d;
        if (qnVar != null) {
            o6d o6dVar2 = this.a.P;
            coc.f(o6dVar2);
            o6dVar2.C3();
            qnVar.j(lqaVar);
        }
    }

    @Override // defpackage.tia
    public void onActivityPaused(nc3 nc3Var, long j) {
        h0();
        Activity activity = (Activity) rg5.Y1(nc3Var);
        q7a.i(activity);
        onActivityPausedByScionActivityInfo(lqa.b(activity), j);
    }

    @Override // defpackage.tia
    public void onActivityPausedByScionActivityInfo(lqa lqaVar, long j) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        qn qnVar = o6dVar.d;
        if (qnVar != null) {
            o6d o6dVar2 = this.a.P;
            coc.f(o6dVar2);
            o6dVar2.C3();
            qnVar.k(lqaVar);
        }
    }

    @Override // defpackage.tia
    public void onActivityResumed(nc3 nc3Var, long j) {
        h0();
        Activity activity = (Activity) rg5.Y1(nc3Var);
        q7a.i(activity);
        onActivityResumedByScionActivityInfo(lqa.b(activity), j);
    }

    @Override // defpackage.tia
    public void onActivityResumedByScionActivityInfo(lqa lqaVar, long j) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        qn qnVar = o6dVar.d;
        if (qnVar != null) {
            o6d o6dVar2 = this.a.P;
            coc.f(o6dVar2);
            o6dVar2.C3();
            qnVar.l(lqaVar);
        }
    }

    @Override // defpackage.tia
    public void onActivitySaveInstanceState(nc3 nc3Var, fka fkaVar, long j) {
        h0();
        Activity activity = (Activity) rg5.Y1(nc3Var);
        q7a.i(activity);
        onActivitySaveInstanceStateByScionActivityInfo(lqa.b(activity), fkaVar, j);
    }

    @Override // defpackage.tia
    public void onActivitySaveInstanceStateByScionActivityInfo(lqa lqaVar, fka fkaVar, long j) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        qn qnVar = o6dVar.d;
        Bundle bundle = new Bundle();
        if (qnVar != null) {
            o6d o6dVar2 = this.a.P;
            coc.f(o6dVar2);
            o6dVar2.C3();
            qnVar.m(lqaVar, bundle);
        }
        try {
            fkaVar.L3(bundle);
        } catch (RemoteException e) {
            z0c z0cVar = this.a.I;
            coc.g(z0cVar);
            z0cVar.M.f(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // defpackage.tia
    public void onActivityStarted(nc3 nc3Var, long j) {
        h0();
        Activity activity = (Activity) rg5.Y1(nc3Var);
        q7a.i(activity);
        onActivityStartedByScionActivityInfo(lqa.b(activity), j);
    }

    @Override // defpackage.tia
    public void onActivityStartedByScionActivityInfo(lqa lqaVar, long j) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        if (o6dVar.d != null) {
            o6d o6dVar2 = this.a.P;
            coc.f(o6dVar2);
            o6dVar2.C3();
        }
    }

    @Override // defpackage.tia
    public void onActivityStopped(nc3 nc3Var, long j) {
        h0();
        Activity activity = (Activity) rg5.Y1(nc3Var);
        q7a.i(activity);
        onActivityStoppedByScionActivityInfo(lqa.b(activity), j);
    }

    @Override // defpackage.tia
    public void onActivityStoppedByScionActivityInfo(lqa lqaVar, long j) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        if (o6dVar.d != null) {
            o6d o6dVar2 = this.a.P;
            coc.f(o6dVar2);
            o6dVar2.C3();
        }
    }

    @Override // defpackage.tia
    public void performAction(Bundle bundle, fka fkaVar, long j) {
        h0();
        fkaVar.L3(null);
    }

    @Override // defpackage.tia
    public void registerOnMeasurementEventListener(hna hnaVar) {
        Object hhdVar;
        h0();
        bs bsVar = this.b;
        synchronized (bsVar) {
            try {
                hhdVar = (n0d) bsVar.get(Integer.valueOf(hnaVar.b()));
                if (hhdVar == null) {
                    hhdVar = new hhd(this, hnaVar);
                    bsVar.put(Integer.valueOf(hnaVar.b()), hhdVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        o6dVar.k3();
        if (o6dVar.I.add(hhdVar)) {
            return;
        }
        z0c z0cVar = ((coc) o6dVar.b).I;
        coc.g(z0cVar);
        z0cVar.M.e("OnEventListener already registered");
    }

    @Override // defpackage.tia
    @Deprecated
    public void resetAnalyticsData(long j) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        o6dVar.K.set(null);
        imc imcVar = ((coc) o6dVar.b).J;
        coc.g(imcVar);
        imcVar.s3(new h2d(o6dVar, j, 1));
    }

    @Override // defpackage.tia
    public void resetAnalyticsDataWithElapsedTime(long j, long j2) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        o6dVar.K.set(null);
        imc imcVar = ((coc) o6dVar.b).J;
        coc.g(imcVar);
        imcVar.s3(new h2d(o6dVar, j, 1));
    }

    @Override // defpackage.tia
    public void retrieveAndUploadBatches(bma bmaVar) {
        int i;
        j7d j7dVar;
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        o6dVar.k3();
        coc cocVar = (coc) o6dVar.b;
        imc imcVar = cocVar.J;
        coc.g(imcVar);
        if (imcVar.p3()) {
            z0c z0cVar = cocVar.I;
            coc.g(z0cVar);
            z0cVar.J.e("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        imc imcVar2 = cocVar.J;
        coc.g(imcVar2);
        if (Thread.currentThread() == imcVar2.e) {
            z0c z0cVar2 = cocVar.I;
            coc.g(z0cVar2);
            z0cVar2.J.e("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        boolean zK = h65.k();
        z0c z0cVar3 = cocVar.I;
        if (zK) {
            coc.g(z0cVar3);
            z0cVar3.J.e("Cannot retrieve and upload batches from main thread");
            return;
        }
        coc.g(z0cVar3);
        z0cVar3.R.e("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        int size = 0;
        int i2 = 0;
        while (!z) {
            z0c z0cVar4 = cocVar.I;
            coc.g(z0cVar4);
            z0cVar4.R.e("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            imc imcVar3 = cocVar.J;
            coc.g(imcVar3);
            imcVar3.t3(atomicReference, 10000L, "[sgtm] Getting upload batches", new t3d(o6dVar, atomicReference, 1));
            ifd ifdVar = (ifd) atomicReference.get();
            if (ifdVar == null) {
                break;
            }
            List list = ifdVar.a;
            if (list.isEmpty()) {
                break;
            }
            z0c z0cVar5 = cocVar.I;
            coc.g(z0cVar5);
            z0cVar5.R.f(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                afd afdVar = (afd) it.next();
                try {
                    URL url = new URI(afdVar.c).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    gvb gvbVarK = ((coc) o6dVar.b).k();
                    gvbVarK.k3();
                    q7a.i(gvbVarK.K);
                    String str = gvbVarK.K;
                    coc cocVar2 = (coc) o6dVar.b;
                    z0c z0cVar6 = cocVar2.I;
                    coc.g(z0cVar6);
                    s6a s6aVar = z0cVar6.R;
                    i = size;
                    Long lValueOf = Long.valueOf(afdVar.a);
                    s6aVar.h("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, afdVar.c, Integer.valueOf(afdVar.b.length));
                    if (!TextUtils.isEmpty(afdVar.J)) {
                        z0c z0cVar7 = cocVar2.I;
                        coc.g(z0cVar7);
                        z0cVar7.R.g(lValueOf, afdVar.J, "[sgtm] Uploading data from app. row_id");
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = afdVar.d;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    e7d e7dVar = cocVar2.R;
                    coc.g(e7dVar);
                    byte[] bArr = afdVar.b;
                    kec kecVar = new kec(26, o6dVar, atomicReference2, afdVar);
                    e7dVar.l3();
                    q7a.i(url);
                    q7a.i(bArr);
                    imc imcVar4 = ((coc) e7dVar.b).J;
                    coc.g(imcVar4);
                    imcVar4.v3(new ma3(e7dVar, str, url, bArr, map, kecVar));
                    try {
                        ahd ahdVar = cocVar2.L;
                        coc.e(ahdVar);
                        coc cocVar3 = (coc) ahdVar.b;
                        cocVar3.N.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    cocVar3.N.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        z0c z0cVar8 = ((coc) o6dVar.b).I;
                        coc.g(z0cVar8);
                        z0cVar8.M.e("[sgtm] Interrupted waiting for uploading batch");
                    }
                    j7dVar = atomicReference2.get() == null ? j7d.UNKNOWN : (j7d) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e) {
                    i = size;
                    z0c z0cVar9 = ((coc) o6dVar.b).I;
                    coc.g(z0cVar9);
                    z0cVar9.J.h("[sgtm] Bad upload url for row_id", afdVar.c, Long.valueOf(afdVar.a), e);
                    j7dVar = j7d.FAILURE;
                }
                if (j7dVar != j7d.SUCCESS) {
                    if (j7dVar == j7d.BACKOFF) {
                        z = true;
                        size = i;
                        break;
                    }
                } else {
                    i2++;
                }
                size = i;
            }
        }
        z0c z0cVar10 = cocVar.I;
        coc.g(z0cVar10);
        z0cVar10.R.g(Integer.valueOf(size), Integer.valueOf(i2), "[sgtm] Completed client-side batch upload work. total, success");
        try {
            bmaVar.a();
        } catch (RemoteException e2) {
            coc cocVar4 = this.a;
            q7a.i(cocVar4);
            z0c z0cVar11 = cocVar4.I;
            coc.g(z0cVar11);
            z0cVar11.M.f(e2, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // defpackage.tia
    public void setConditionalUserProperty(Bundle bundle, long j) {
        h0();
        coc cocVar = this.a;
        if (bundle == null) {
            z0c z0cVar = cocVar.I;
            coc.g(z0cVar);
            z0cVar.J.e("Conditional user property must not be null");
        } else {
            o6d o6dVar = cocVar.P;
            coc.f(o6dVar);
            o6dVar.w3(bundle, j);
        }
    }

    @Override // defpackage.tia
    public void setConsentThirdParty(Bundle bundle, long j) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        o6dVar.D3(bundle, -20, j);
    }

    @Override // defpackage.tia
    public void setCurrentScreen(nc3 nc3Var, String str, String str2, long j) {
        h0();
        Activity activity = (Activity) rg5.Y1(nc3Var);
        q7a.i(activity);
        setCurrentScreenByScionActivityInfo(lqa.b(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r2 > 500) goto L27;
     */
    @Override // defpackage.tia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCurrentScreenByScionActivityInfo(lqa lqaVar, String str, String str2, long j) {
        h0();
        u8d u8dVar = this.a.O;
        coc.f(u8dVar);
        coc cocVar = (coc) u8dVar.b;
        if (!cocVar.d.y3()) {
            z0c z0cVar = cocVar.I;
            coc.g(z0cVar);
            z0cVar.O.e("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        q7d q7dVar = u8dVar.d;
        if (q7dVar == null) {
            z0c z0cVar2 = cocVar.I;
            coc.g(z0cVar2);
            z0cVar2.O.e("setCurrentScreen cannot be called while no activity active");
            return;
        }
        ConcurrentHashMap concurrentHashMap = u8dVar.J;
        Integer numValueOf = Integer.valueOf(lqaVar.a);
        if (concurrentHashMap.get(numValueOf) == null) {
            z0c z0cVar3 = cocVar.I;
            coc.g(z0cVar3);
            z0cVar3.O.e("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = u8dVar.o3(lqaVar.b);
        }
        String str3 = q7dVar.b;
        String str4 = q7dVar.a;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            z0c z0cVar4 = cocVar.I;
            coc.g(z0cVar4);
            z0cVar4.O.e("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                int length = str.length();
                cocVar.d.getClass();
            }
            z0c z0cVar5 = cocVar.I;
            coc.g(z0cVar5);
            z0cVar5.O.f(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2.length() > 0) {
            int length2 = str2.length();
            cocVar.d.getClass();
            if (length2 <= 500) {
                z0c z0cVar6 = cocVar.I;
                coc.g(z0cVar6);
                z0cVar6.R.g(str == null ? "null" : str, str2, "Setting current screen to name, class");
                ahd ahdVar = cocVar.L;
                coc.e(ahdVar);
                q7d q7dVar2 = new q7d(ahdVar.g4(), str, str2);
                concurrentHashMap.put(numValueOf, q7dVar2);
                u8dVar.r3(lqaVar.b, q7dVar2, true);
                return;
            }
        }
        z0c z0cVar7 = cocVar.I;
        coc.g(z0cVar7);
        z0cVar7.O.f(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
    }

    @Override // defpackage.tia
    public void setDataCollectionEnabled(boolean z) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        o6dVar.k3();
        imc imcVar = ((coc) o6dVar.b).J;
        coc.g(imcVar);
        imcVar.s3(new zc0(o6dVar, z));
    }

    @Override // defpackage.tia
    public void setDefaultEventParameters(Bundle bundle) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        imc imcVar = ((coc) o6dVar.b).J;
        coc.g(imcVar);
        imcVar.s3(new c4b(o6dVar, 17, bundle2));
    }

    @Override // defpackage.tia
    public void setEventInterceptor(hna hnaVar) {
        h0();
        yfd yfdVar = new yfd(this, hnaVar);
        imc imcVar = this.a.J;
        coc.g(imcVar);
        boolean zP3 = imcVar.p3();
        coc cocVar = this.a;
        if (!zP3) {
            imc imcVar2 = cocVar.J;
            coc.g(imcVar2);
            imcVar2.s3(new s2b(this, yfdVar, z, 18));
            return;
        }
        o6d o6dVar = cocVar.P;
        coc.f(o6dVar);
        o6dVar.N2();
        o6dVar.k3();
        yfd yfdVar2 = o6dVar.e;
        if (yfdVar != yfdVar2) {
            q7a.k("EventInterceptor already set.", yfdVar2 == null);
        }
        o6dVar.e = yfdVar;
    }

    @Override // defpackage.tia
    public void setInstanceIdProvider(dpa dpaVar) {
        h0();
    }

    @Override // defpackage.tia
    public void setMeasurementEnabled(boolean z, long j) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        Boolean boolValueOf = Boolean.valueOf(z);
        o6dVar.k3();
        imc imcVar = ((coc) o6dVar.b).J;
        coc.g(imcVar);
        imcVar.s3(new s2b(o6dVar, boolValueOf, false, 17));
    }

    @Override // defpackage.tia
    public void setMinimumSessionDuration(long j) {
        h0();
    }

    @Override // defpackage.tia
    public void setSessionTimeoutDuration(long j) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        imc imcVar = ((coc) o6dVar.b).J;
        coc.g(imcVar);
        imcVar.s3(new h2d(o6dVar, j, 0));
    }

    @Override // defpackage.tia
    public void setSgtmDebugInfo(Intent intent) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        coc cocVar = (coc) o6dVar.b;
        Uri data = intent.getData();
        if (data == null) {
            z0c z0cVar = cocVar.I;
            coc.g(z0cVar);
            z0cVar.P.e("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            z0c z0cVar2 = cocVar.I;
            coc.g(z0cVar2);
            z0cVar2.P.e("[sgtm] Preview Mode was not enabled.");
            cocVar.d.d = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        z0c z0cVar3 = cocVar.I;
        coc.g(z0cVar3);
        z0cVar3.P.f(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        cocVar.d.d = queryParameter2;
    }

    @Override // defpackage.tia
    public void setUserId(String str, long j) {
        h0();
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        coc cocVar = (coc) o6dVar.b;
        if (str != null && TextUtils.isEmpty(str)) {
            z0c z0cVar = cocVar.I;
            coc.g(z0cVar);
            z0cVar.M.e("User ID must be non-empty or null");
        } else {
            imc imcVar = cocVar.J;
            coc.g(imcVar);
            imcVar.s3(new s1b(o6dVar, 19, str));
            o6dVar.t3(null, "_id", str, true, j);
        }
    }

    @Override // defpackage.tia
    public void setUserProperty(String str, String str2, nc3 nc3Var, boolean z, long j) {
        h0();
        Object objY1 = rg5.Y1(nc3Var);
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        o6dVar.t3(str, str2, objY1, z, j);
    }

    @Override // defpackage.tia
    public void unregisterOnMeasurementEventListener(hna hnaVar) {
        Object hhdVar;
        h0();
        bs bsVar = this.b;
        synchronized (bsVar) {
            hhdVar = (n0d) bsVar.remove(Integer.valueOf(hnaVar.b()));
        }
        if (hhdVar == null) {
            hhdVar = new hhd(this, hnaVar);
        }
        o6d o6dVar = this.a.P;
        coc.f(o6dVar);
        o6dVar.k3();
        if (o6dVar.I.remove(hhdVar)) {
            return;
        }
        z0c z0cVar = ((coc) o6dVar.b).I;
        coc.g(z0cVar);
        z0cVar.M.e("OnEventListener had not been registered");
    }

    @Override // defpackage.tia
    public void setConsent(Bundle bundle, long j) {
    }
}
