package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.pairip.VMRunner;
import defpackage.a6a;
import defpackage.ao9;
import defpackage.hm9;
import defpackage.m8a;
import defpackage.ph4;
import defpackage.v99;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public class OfflineNotificationPoster extends Worker {
    public final m8a e;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        hm9 hm9Var = ao9.g.b;
        a6a a6aVar = new a6a();
        hm9Var.getClass();
        this.e = (m8a) new v99(hm9Var, context, a6aVar).d(context, false);
    }

    @Override // androidx.work.Worker
    public final ph4 doWork() {
        return (ph4) VMRunner.invoke("MoeMHz6qFgWId7Fs", new Object[]{this});
    }
}
