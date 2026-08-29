package com.lonelycatgames.Xplore.FileSystem.ftp;

import android.app.Notification;
import android.content.Intent;
import android.os.Handler;
import com.google.android.gms.measurement.api.Uan.ALMQWMUKkdzmOl;
import com.google.firebase.remoteconfig.internal.EX.UYfy;
import com.lonelycatgames.Xplore.App;
import defpackage.e27;
import defpackage.f44;
import defpackage.fr9;
import defpackage.hm3;
import defpackage.ik;
import defpackage.il1;
import defpackage.jf2;
import defpackage.jyc;
import defpackage.n84;
import defpackage.qk2;
import defpackage.qx2;
import defpackage.re8;
import defpackage.s96;
import defpackage.se8;
import defpackage.tv0;
import defpackage.ue5;
import defpackage.uo4;
import defpackage.xr0;
import defpackage.yr0;
import defpackage.yu4;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public final class FtpShareServer extends e27 {
    public static final /* synthetic */ int U = 0;
    public boolean M;
    public jf2 N;
    public int O;
    public ArrayList P;
    public LinkedHashMap Q;
    public String R;
    public final fr9 S;
    public final f44 T;

    public FtpShareServer() {
        super("FTP", 6);
        this.S = new fr9(12, this);
        qk2 qk2Var = new qk2(5, this);
        String[] strArr = se8.a;
        this.T = jyc.b(n84.b, qk2Var);
    }

    @Override // defpackage.e27
    public final Notification c() {
        ue5 ue5Var = (ue5) this.T.getValue();
        ue5Var.d(g());
        Notification notificationB = ue5Var.b();
        notificationB.getClass();
        return notificationB;
    }

    @Override // defpackage.e27
    public final void e() {
        a().i(new Object[0], 2);
        f();
    }

    public final String g() {
        s96 s96Var = this.K;
        if (s96Var == null) {
            return "No IP address";
        }
        int i = s96Var.a;
        StringBuilder sb = new StringBuilder();
        sb.append((i >> 24) & 255);
        sb.append(".");
        sb.append((i >> 16) & 255);
        sb.append(".");
        sb.append((i >> 8) & 255);
        return "ftp://" + yu4.i(i & 255, ".", sb) + ":" + this.O;
    }

    @Override // defpackage.jp7, android.app.Service
    public final void onCreate() {
        super.onCreate();
        il1 il1VarL = a().l();
        String[] strArr = il1.d;
        this.M = il1VarL.h("ftp_share_read_only", false);
        this.O = (int) il1VarL.i("ftp_share_port", 2222L);
        List listP = a().p();
        int iH = uo4.h(yr0.o(listP, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (Object obj : listP) {
            linkedHashMap.put(((qx2) obj).a, obj);
        }
        this.Q = linkedHashMap;
        qx2 qx2Var = (qx2) xr0.B(a().p());
        this.R = qx2Var != null ? tv0.k("/", qx2Var.a) : null;
        f();
    }

    @Override // defpackage.e27, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        jf2 jf2Var = this.N;
        if (jf2Var != null) {
            String[] strArr = se8.a;
            try {
                re8.t(jf2Var);
            } catch (Exception unused) {
            }
        }
        this.N = null;
        a().i(new Object[]{this}, 1);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (hm3.b(intent != null ? intent.getAction() : null, ALMQWMUKkdzmOl.czOvMyIZuyG)) {
            Handler handler = App.M0;
            stopSelf();
            return 2;
        }
        if (this.N == null) {
            try {
                d();
                il1 il1VarL = a().l();
                this.N = new jf2((int) il1VarL.i("ftp_share_port", 2222L), this.S, a().r(), a().q(), il1VarL.h(UYfy.tBtarhD, false));
                if (a().m0) {
                    ArrayList arrayList = new ArrayList();
                    this.P = arrayList;
                    jf2 jf2Var = this.N;
                    if (jf2Var != null) {
                        jf2Var.I = new fr9(new ik(5, arrayList));
                    }
                }
            } catch (Exception e) {
                App appA = a();
                appA.j0(appA, se8.k(e), true);
                stopSelf();
                return 2;
            }
        }
        f();
        a().i(new Object[]{this}, 0);
        return 1;
    }
}
