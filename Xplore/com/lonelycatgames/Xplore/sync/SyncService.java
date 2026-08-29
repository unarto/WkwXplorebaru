package com.lonelycatgames.Xplore.sync;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import com.lonelycatgames.Xplore.App;
import defpackage.b81;
import defpackage.bf5;
import defpackage.bk2;
import defpackage.cs0;
import defpackage.ek2;
import defpackage.fp7;
import defpackage.gk2;
import defpackage.he;
import defpackage.hm3;
import defpackage.ib1;
import defpackage.jp7;
import defpackage.kab;
import defpackage.lf;
import defpackage.n1c;
import defpackage.pg7;
import defpackage.sr;
import defpackage.v0d;
import defpackage.z71;
import defpackage.za1;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
public final class SyncService extends jp7 implements ib1 {
    public static final /* synthetic */ int J = 0;
    public pg7 e;
    public final /* synthetic */ z71 c = v0d.c();
    public final sr d = new sr();
    public long I = -1;

    public final void c() {
        if (this.e != null) {
            return;
        }
        sr srVar = this.d;
        b81 b81Var = null;
        fp7 fp7Var = (fp7) (srVar.isEmpty() ? null : srVar.removeFirst());
        if (fp7Var == null) {
            stopSelf();
            return;
        }
        gk2 gk2Var = fp7Var.a;
        if (!a().n().c.contains(gk2Var)) {
            c();
            return;
        }
        boolean z = gk2Var.d;
        ek2 ek2Var = gk2Var.b;
        if (z) {
            Handler handler = App.M0;
            String str = ek2Var.a;
            c();
        } else {
            if (gk2Var.d() || fp7Var.b == bk2.c) {
                this.e = kab.d(this, null, null, new lf(this, gk2Var, fp7Var, b81Var, 25), 3);
                return;
            }
            Handler handler2 = App.M0;
            String str2 = ek2Var.a;
            c();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        bf5 bf5Var = this.b;
        if (bf5Var == null) {
            hm3.l("nm");
            throw null;
        }
        bf5Var.a(4);
        n1c.b(this.c.b, null);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        pg7 pg7Var;
        Object obj = null;
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int iHashCode = action.hashCode();
            sr srVar = this.d;
            if (iHashCode != -1571636182) {
                if (iHashCode != -1367724422) {
                    if (iHashCode == -1235832221 && action.equals("add_task")) {
                        long longExtra = intent.getLongExtra("task_id", -1L);
                        Iterator it = a().n().c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((gk2) next).a == longExtra) {
                                obj = next;
                                break;
                            }
                        }
                        gk2 gk2Var = (gk2) obj;
                        if (gk2Var == null) {
                            if (this.e == null) {
                                stopSelf();
                                return 1;
                            }
                            return 1;
                        }
                        bk2 bk2Var = (bk2) (Build.VERSION.SDK_INT >= 33 ? intent.getSerializableExtra("sync_mode", bk2.class) : (bk2) intent.getSerializableExtra("sync_mode"));
                        if (bk2Var == null) {
                            bk2Var = bk2.c;
                        }
                        srVar.addLast(new fp7(gk2Var, bk2Var));
                        Handler handler = App.M0;
                        c();
                        return 1;
                    }
                } else if (action.equals("cancel")) {
                    pg7 pg7Var2 = this.e;
                    if (pg7Var2 != null) {
                        pg7Var2.d(null);
                    }
                    srVar.clear();
                    stopSelf();
                    return 1;
                }
            } else if (action.equals("cancel_task")) {
                long longExtra2 = intent.getLongExtra("task_id", -1L);
                cs0.r(srVar, new he(longExtra2, 4));
                if (this.I == longExtra2 && (pg7Var = this.e) != null) {
                    pg7Var.d(null);
                }
                return 1;
            }
        }
        Handler handler2 = App.M0;
        return 1;
    }

    @Override // defpackage.ib1
    public final za1 q() {
        return this.c.b;
    }
}
