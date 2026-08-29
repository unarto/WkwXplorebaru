package com.lonelycatgames.Xplore.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import com.lonelycatgames.Xplore.App;
import com.lonelycatgames.Xplore.R;
import defpackage.aw0;
import defpackage.ax0;
import defpackage.b22;
import defpackage.b52;
import defpackage.b81;
import defpackage.bf5;
import defpackage.d44;
import defpackage.dl2;
import defpackage.dyc;
import defpackage.ec;
import defpackage.ed6;
import defpackage.fwc;
import defpackage.gh1;
import defpackage.gw0;
import defpackage.ha;
import defpackage.hk;
import defpackage.hx5;
import defpackage.j72;
import defpackage.jt5;
import defpackage.jxc;
import defpackage.kab;
import defpackage.kc6;
import defpackage.ng4;
import defpackage.nu3;
import defpackage.pf;
import defpackage.pq;
import defpackage.qp9;
import defpackage.qy1;
import defpackage.rr;
import defpackage.tq4;
import defpackage.tx2;
import defpackage.uc4;
import defpackage.ue5;
import defpackage.v61;
import defpackage.va6;
import defpackage.vc0;
import defpackage.ve5;
import defpackage.vs0;
import defpackage.vu5;
import defpackage.vx8;
import defpackage.w15;
import defpackage.w91;
import defpackage.ws0;
import defpackage.xo4;
import defpackage.xr0;
import defpackage.y2b;
import defpackage.y91;
import defpackage.yzc;
import defpackage.zv0;
import defpackage.zz2;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
public final class CopyToActivity extends vc0 {
    public static final /* synthetic */ int b1 = 0;
    public final vu5 Y0 = yzc.c(Boolean.FALSE);
    public Collection Z0;
    public boolean a1;

    @Override // defpackage.vc0
    public final boolean A0(dl2 dl2Var) {
        dl2Var.getClass();
        if ((dl2Var instanceof pq) || (dl2Var instanceof b22)) {
            return false;
        }
        return super.A0(dl2Var);
    }

    @Override // defpackage.vc0
    public final void B0() {
        Object objC0;
        if (this.a1 || (objC0 = C0()) == null) {
            return;
        }
        this.a1 = true;
        this.X0.setValue(Boolean.FALSE);
        qy1 qy1Var = (qy1) ((ng4) objC0);
        int iC = va6.a.c(10000) + 10000;
        String strJ = ve5.j(iC, "com.lonelycatgames.Xplore.COPY_TO_STOP.");
        bf5 bf5Var = new bf5(w());
        rr rrVar = new rr();
        ue5 ue5Var = new ue5(w(), "copy");
        Notification notification = ue5Var.B;
        notification.icon = R.drawable.op_copy;
        String string = w().getString(R.string.copying_);
        string.getClass();
        ue5Var.e(string);
        notification.tickerText = ue5.c(string);
        ue5Var.i(1000, 0, false);
        notification.deleteIntent = PendingIntent.getBroadcast(w(), 0, new Intent(strJ), 201326592);
        w().Z(iC, ue5Var);
        y91 y91Var = new y91(ue5Var, rrVar, this, iC);
        ec ecVar = new ec(3, y91Var);
        gh1.j(w(), ecVar, new IntentFilter(strJ), null, 4);
        ed6 ed6Var = new ed6();
        ed6Var.a = this;
        kab.d(w().L0, null, null, new v61(this, bf5Var, iC, ecVar, ed6Var, qy1Var, y91Var, (b81) null), 3);
    }

    public final xo4 C0() {
        jt5 jt5VarG = b0().g();
        int size = jt5VarG.l.size();
        if (size == 0) {
            return jt5VarG.y;
        }
        if (size != 1) {
            return null;
        }
        return (xo4) xr0.y(jt5VarG.l);
    }

    @Override // com.lonelycatgames.Xplore.Browser
    public final void O(w15 w15Var, zz2 zz2Var, int i) {
        int i2;
        w15Var.getClass();
        zz2Var.Y(233175599);
        if ((i & 6) == 0) {
            i2 = (zz2Var.f(w15Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zz2Var.h(this) ? 32 : 16;
        }
        if (zz2Var.O(i2 & 1, (i2 & 19) != 18)) {
            ws0 ws0VarA = vs0.a(b52.c, j72.Q, zz2Var, 0);
            int iHashCode = Long.hashCode(zz2Var.T);
            hx5 hx5VarL = zz2Var.l();
            w15 w15VarH = dyc.h(zz2Var, w15Var);
            aw0.j.getClass();
            ax0 ax0Var = zv0.b;
            zz2Var.a0();
            if (zz2Var.S) {
                zz2Var.k(ax0Var);
            } else {
                zz2Var.j0();
            }
            tq4.g(zv0.f, zz2Var, ws0VarA);
            tq4.g(zv0.e, zz2Var, hx5VarL);
            tq4.g(zv0.g, zz2Var, Integer.valueOf(iHashCode));
            tq4.f(zz2Var, zv0.h);
            tq4.g(zv0.d, zz2Var, w15VarH);
            super.O(uc4.a.e(new d44(1.0f, true)), zz2Var, i2 & 112);
            boolean zBooleanValue = ((Boolean) this.X0.getValue()).booleanValue();
            boolean zH = zz2Var.h(this);
            Object objL = zz2Var.L();
            if (zH || objL == gw0.a) {
                ha haVar = new ha(0, this, CopyToActivity.class, "onButtonClick", "onButtonClick()V", 0, 15);
                zz2Var.g0(haVar);
                objL = haVar;
            }
            nu3 nu3Var = (nu3) objL;
            if (w().b) {
                nu3Var = null;
            }
            y2b.a(zBooleanValue, (tx2) nu3Var, jxc.g(755216801, new pf(13, this), zz2Var), zz2Var, 384);
            zz2Var.p(true);
        } else {
            zz2Var.R();
        }
        kc6 kc6VarR = zz2Var.r();
        if (kc6VarR != null) {
            kc6VarR.d = new hk(this, w15Var, i, 8);
        }
    }

    @Override // com.lonelycatgames.Xplore.Browser
    public final vx8 X() {
        return new w91(this, w(), 0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    @Override // com.lonelycatgames.Xplore.Browser, defpackage.j30, defpackage.jv2, defpackage.mu0, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -1173264947:
                    if (action.equals("android.intent.action.SEND")) {
                        if (action.equals("android.intent.action.SEND_MULTIPLE")) {
                            collectionG = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                        } else {
                            try {
                                Uri uri = (Uri) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("android.intent.extra.STREAM", Uri.class) : (Uri) intent.getParcelableExtra("android.intent.extra.STREAM"));
                                if (uri != null) {
                                    collectionG = fwc.g(uri);
                                } else {
                                    CharSequence charSequenceExtra = intent.getCharSequenceExtra("android.intent.extra.TEXT");
                                    if (charSequenceExtra != null) {
                                        collectionG = fwc.g(charSequenceExtra.toString());
                                    }
                                }
                            } catch (Exception e) {
                                Handler handler = App.M0;
                                qp9.d(e);
                            }
                        }
                        collectionG = collectionG;
                    }
                    break;
                case -1173171990:
                    if (action.equals("android.intent.action.VIEW")) {
                        Uri data = intent.getData();
                        collectionG = data != null ? fwc.g(data) : null;
                    }
                    break;
                case -58484670:
                    if (action.equals("android.intent.action.SEND_MULTIPLE")) {
                    }
                    break;
                case 2068787464:
                    if (action.equals("android.intent.action.SENDTO")) {
                    }
                    break;
            }
        }
        this.Z0 = collectionG;
        if (collectionG == null || collectionG.isEmpty()) {
            w().k0("Error: can't get files to be copied.", true);
            finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // com.lonelycatgames.Xplore.Browser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0(boolean z) {
        boolean zI;
        Object objC0;
        super.q0(z);
        if (this.a1 || (objC0 = C0()) == null) {
            zI = false;
        } else {
            ng4 ng4Var = (ng4) objC0;
            if (ng4Var instanceof qy1) {
                zI = ng4Var.J.i((qy1) ng4Var);
            }
        }
        this.X0.setValue(Boolean.valueOf(zI));
    }
}
