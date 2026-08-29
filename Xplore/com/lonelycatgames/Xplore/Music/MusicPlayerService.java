package com.lonelycatgames.Xplore.Music;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.session.MediaSessionService;
import com.lonelycatgames.Xplore.App;
import defpackage.bj3;
import defpackage.bva;
import defpackage.dv4;
import defpackage.eu4;
import defpackage.h75;
import defpackage.hm3;
import defpackage.i75;
import defpackage.iu4;
import defpackage.j75;
import defpackage.ku4;
import defpackage.l70;
import defpackage.sd4;
import defpackage.taa;
import defpackage.th;
import defpackage.un2;
import defpackage.ve6;
import defpackage.xja;
import defpackage.yf3;
import defpackage.yj1;
import defpackage.z1;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class MusicPlayerService extends MediaSessionService {
    public static final /* synthetic */ int Q = 0;
    public App M;
    public h75 N;
    public j75 O;
    public ku4 P;

    @Override // androidx.media3.session.MediaSessionService
    public final ku4 f(iu4 iu4Var) {
        ku4 ku4Var = this.P;
        if (ku4Var != null) {
            return ku4Var;
        }
        hm3.l("mediaSession");
        throw null;
    }

    @Override // androidx.media3.session.MediaSessionService, defpackage.ue4, android.app.Service
    public final void onCreate() {
        l70 yj1Var;
        super.onCreate();
        Application application = getApplication();
        application.getClass();
        this.M = (App) application;
        this.O = new j75(this);
        App app = this.M;
        if (app == null) {
            hm3.l("app");
            throw null;
        }
        PendingIntent pendingIntentB = th.b(app, ve6.a.b(MusicPlayerUi.class), "android.intent.action.MAIN", new sd4(13));
        j75 j75Var = this.O;
        if (j75Var == null) {
            hm3.l("bridgePlayer");
            throw null;
        }
        eu4 eu4Var = new eu4(this, j75Var);
        eu4Var.c = "X-plore Music";
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            taa.d(pendingIntentB.isActivity());
        }
        eu4Var.e = pendingIntentB;
        taa.l(!eu4Var.l);
        eu4Var.l = true;
        Object obj = ku4.b;
        int iIntValue = ((Integer) dv4.F.get()).intValue();
        Context context = eu4Var.a;
        if (i < 27) {
            iIntValue = Math.max(iIntValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
        }
        l70 l70Var = eu4Var.h;
        if (l70Var == null) {
            z1 z1Var = new z1(context);
            z1Var.a = iIntValue;
            z1Var.b = true;
            yj1Var = new yj1(z1Var);
            eu4Var.h = yj1Var;
        } else {
            l70 xjaVar = new xja(l70Var, iIntValue, 17);
            eu4Var.h = xjaVar;
            yj1Var = xjaVar;
        }
        if (i == 29) {
            AtomicReference atomicReference = eu4.m;
            yf3 yf3Var = (yf3) atomicReference.get();
            if (yf3Var == null) {
                Display defaultDisplay = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                Point point2 = new Point();
                defaultDisplay.getRealSize(point2);
                int i2 = point2.y;
                int i3 = point2.x;
                Point point3 = new Point(i2 - (i3 - point.x), i3 - (i2 - point.y));
                yf3 yf3Var2 = new yf3(new int[]{Math.max(point.x / 6, point.y / 6), Math.max(point3.x / 6, point3.y / 6)});
                atomicReference.set(yf3Var2);
                yf3Var = yf3Var2;
            }
            l70 bvaVar = new bva(yj1Var, 28, yf3Var);
            eu4Var.h = bvaVar;
            yj1Var = bvaVar;
        }
        eu4Var.h = new bj3(yj1Var);
        ku4 ku4Var = new ku4(context, eu4Var.c, eu4Var.b, eu4Var.e, eu4Var.i, eu4Var.j, eu4Var.k, eu4Var.d, eu4Var.f, eu4Var.g, eu4Var.h);
        this.P = ku4Var;
        a(ku4Var);
    }

    @Override // androidx.media3.session.MediaSessionService, defpackage.ue4, android.app.Service
    public final void onDestroy() {
        h75 h75Var = this.N;
        if (h75Var != null) {
            j75 j75Var = this.O;
            if (j75Var == null) {
                hm3.l("bridgePlayer");
                throw null;
            }
            i75 i75Var = j75Var.S;
            i75Var.getClass();
            h75Var.d.remove(i75Var);
        }
        j75 j75Var2 = this.O;
        if (j75Var2 == null) {
            hm3.l("bridgePlayer");
            throw null;
        }
        j75Var2.y3();
        if (j75Var2.w3(32)) {
            un2.j("Missing implementation to handle COMMAND_RELEASE");
            return;
        }
        ku4 ku4Var = this.P;
        if (ku4Var == null) {
            hm3.l("mediaSession");
            throw null;
        }
        try {
            synchronized (ku4.b) {
                ku4.c.remove(ku4Var.a.i);
            }
            ku4Var.a.s();
        } catch (Exception unused) {
        }
        App app = this.M;
        if (app == null) {
            hm3.l("app");
            throw null;
        }
        if (hm3.b(app.C0, this)) {
            app.C0 = null;
        }
        super.onDestroy();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.media3.session.MediaSessionService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (intent == null) {
            Handler handler = App.M0;
            Log.i("X-plore", "MusicPlayerService: no start intent");
            stopSelf();
            return 2;
        }
        App app = this.M;
        if (app == null) {
            hm3.l("app");
            throw null;
        }
        h75 h75Var = app.A0;
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -1273775369:
                    if (action.equals("previous")) {
                        if (h75Var == null) {
                            return 1;
                        }
                        h75Var.r();
                        return 1;
                    }
                    break;
                case -934426579:
                    if (action.equals("resume")) {
                        if (h75Var == null) {
                            return 1;
                        }
                        h75Var.u();
                        return 1;
                    }
                    break;
                case 3237136:
                    if (action.equals("init")) {
                        this.N = h75Var;
                        if (h75Var == null) {
                            stopSelf();
                            return 2;
                        }
                        App app2 = this.M;
                        if (app2 == null) {
                            hm3.l("app");
                            throw null;
                        }
                        app2.C0 = this;
                        j75 j75Var = this.O;
                        if (j75Var != null) {
                            h75Var.a(j75Var.S);
                            return 1;
                        }
                        hm3.l("bridgePlayer");
                        throw null;
                    }
                    break;
                case 3377907:
                    if (action.equals("next")) {
                        if (h75Var == null) {
                            return 1;
                        }
                        h75Var.l();
                        return 1;
                    }
                    break;
                case 3540994:
                    if (action.equals("stop")) {
                        App app3 = this.M;
                        if (app3 != null) {
                            app3.o0();
                            return 1;
                        }
                        hm3.l("app");
                        throw null;
                    }
                    break;
                case 106440182:
                    if (action.equals("pause")) {
                        if (h75Var == null) {
                            return 1;
                        }
                        h75Var.q();
                        return 1;
                    }
                    break;
            }
        }
        Handler handler2 = App.M0;
        return 1;
    }
}
