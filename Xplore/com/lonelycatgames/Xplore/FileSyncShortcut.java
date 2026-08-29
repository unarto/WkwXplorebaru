package com.lonelycatgames.Xplore;

import android.os.Bundle;
import defpackage.bk2;
import defpackage.g71;
import defpackage.gk2;
import defpackage.hk;
import defpackage.hm3;
import defpackage.j30;
import defpackage.kc6;
import defpackage.pg;
import defpackage.qq5;
import defpackage.qsb;
import defpackage.yr0;
import defpackage.zz2;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
public final class FileSyncShortcut extends j30 {
    public static final /* synthetic */ int e0 = 0;
    public final qsb d0 = new qsb(10);

    @Override // defpackage.j30, defpackage.jv2, defpackage.mu0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object next;
        super.onCreate(bundle);
        C();
        ArrayList arrayList = w().n().c;
        if (arrayList.isEmpty()) {
            w().k0("No tasks available", false);
            finish();
            return;
        }
        if (!hm3.b(getIntent().getAction(), "android.intent.action.SYNC")) {
            ArrayList arrayList2 = new ArrayList(yr0.o(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((gk2) it.next()).b.a);
            }
            qsb.D(this.d0, arrayList2, null, Integer.valueOf(R.string.choose_task), null, new g71(arrayList, 12, this), 10).K = new pg(29, this);
            return;
        }
        long longExtra = getIntent().getLongExtra("taskId", -1L);
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (((gk2) next).a == longExtra) {
                    break;
                }
            }
        }
        gk2 gk2Var = (gk2) next;
        if (gk2Var != null) {
            w().n().k(gk2Var, bk2.d);
        } else {
            j30.I(this, R.string.task_not_found);
        }
        finish();
    }

    @Override // defpackage.j30
    public final void r(qq5 qq5Var, zz2 zz2Var, int i) {
        zz2Var.Y(196363927);
        int i2 = i & 1;
        if (!zz2Var.O(i2, i2 != 0)) {
            zz2Var.R();
        }
        kc6 kc6VarR = zz2Var.r();
        if (kc6VarR != null) {
            kc6VarR.d = new hk(this, qq5Var, i, 13);
        }
    }

    @Override // defpackage.j30
    public final qsb y() {
        return this.d0;
    }
}
