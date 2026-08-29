package androidx.media3.session;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Pair;
import com.google.android.material.search.dFm.JqdnMO;
import com.lonelycatgames.Xplore.R;
import defpackage.ac3;
import defpackage.bj0;
import defpackage.bs;
import defpackage.du4;
import defpackage.dv4;
import defpackage.e;
import defpackage.el7;
import defpackage.hz1;
import defpackage.ie8;
import defpackage.iu4;
import defpackage.j10;
import defpackage.jxc;
import defpackage.kad;
import defpackage.kg2;
import defpackage.kr4;
import defpackage.ku4;
import defpackage.l2;
import defpackage.m2;
import defpackage.m3b;
import defpackage.o0c;
import defpackage.ou4;
import defpackage.rv4;
import defpackage.su4;
import defpackage.taa;
import defpackage.ue4;
import defpackage.ue5;
import defpackage.uv4;
import defpackage.vo1;
import defpackage.vv4;
import defpackage.vx8;
import defpackage.vy6;
import defpackage.wf0;
import defpackage.wr;
import defpackage.wv4;
import defpackage.xd;
import defpackage.xv4;
import defpackage.zr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MediaSessionService extends ue4 {
    public static final /* synthetic */ int L = 0;
    public vx8 I;
    public boolean K;
    public wv4 d;
    public du4 e;
    public final Object b = new Object();
    public final Handler c = new Handler(Looper.getMainLooper());
    public final bs J = new bs(0);

    public static iu4 b(Intent intent) {
        ComponentName component = intent.getComponent();
        String packageName = component != null ? component.getPackageName() : "androidx.media3.session.MediaSessionService";
        Bundle bundle = new Bundle();
        bundle.putString("androidx.media3.session.hint.controller_info_type", "android.intent.action.MEDIA_BUTTON");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            bundle.putBundle("androidx.media3.session.hint.intent_extras", extras);
        }
        Uri data = intent.getData();
        if (data != null) {
            vy6 vy6Var = dv4.E;
            List<String> pathSegments = data.getPathSegments();
            bundle.putString("androidx.media3.session.hint.session_id", (Objects.equals(data.getScheme(), "androidx") && Objects.equals(data.getAuthority(), "media3.session") && !pathSegments.isEmpty()) ? pathSegments.get(0) : "");
        }
        return new iu4(new rv4(packageName, -1, -1), 1010001300, 9, false, null, bundle);
    }

    public final void a(ku4 ku4Var) {
        ku4 ku4Var2;
        int i;
        boolean z = true;
        taa.c("session is already released", !ku4Var.a.j());
        synchronized (this.b) {
            ku4Var2 = (ku4) this.J.get(ku4Var.a.i);
            i = 0;
            if (ku4Var2 != null && ku4Var2 != ku4Var) {
                z = false;
            }
            taa.c("Session ID should be unique", z);
            this.J.put(ku4Var.a.i, ku4Var);
        }
        if (ku4Var2 == null) {
            ie8.f(this.c, new uv4(this, ku4Var, i));
        }
    }

    public final du4 c() {
        du4 du4Var = this.e;
        if (du4Var == null) {
            taa.h(getBaseContext(), "Accessing service context before onCreate()");
            Context applicationContext = getApplicationContext();
            wf0 wf0Var = new wf0();
            wf0Var.c = applicationContext;
            wf0Var.d = new e(28);
            el7 el7Var = vo1.h;
            wf0Var.a = R.string.default_notification_channel_name;
            taa.l(!wf0Var.b);
            vo1 vo1Var = new vo1(wf0Var);
            wf0Var.b = true;
            vx8 vx8Var = this.I;
            if (vx8Var == null) {
                vx8Var = new vx8(10, this);
                this.I = vx8Var;
            }
            du4Var = new du4(this, vo1Var, vx8Var);
            this.e = du4Var;
        }
        return du4Var;
    }

    public final ArrayList d() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.J.values());
        }
        return arrayList;
    }

    public final boolean e(ku4 ku4Var) {
        boolean zContainsKey;
        synchronized (this.b) {
            zContainsKey = this.J.containsKey(ku4Var.a.i);
        }
        return zContainsKey;
    }

    public abstract ku4 f(iu4 iu4Var);

    public final void i(ku4 ku4Var, boolean z) {
        bj0 bj0VarA = o0c.a(new kg2(c(), ku4Var, c().c(z)));
        vv4 vv4Var = new vv4(0, this);
        int i = m2.O;
        l2 l2Var = new l2(bj0VarA, RuntimeException.class, vv4Var);
        bj0VarA.a(l2Var, kad.c(hz1.a, l2Var));
    }

    public final void j(ku4 ku4Var) {
        synchronized (this.b) {
            taa.c("session not found", this.J.containsKey(ku4Var.a.i));
            this.J.remove(ku4Var.a.i);
        }
        ie8.f(this.c, new uv4(this, ku4Var, 1));
    }

    public final void k() {
        du4 du4VarC = c();
        vo1 vo1Var = du4VarC.L;
        String string = vo1Var.a.getString(vo1Var.b);
        NotificationManager notificationManager = du4VarC.c;
        String str = ie8.a;
        if (notificationManager.getNotificationChannel("default_channel_id") == null) {
            NotificationChannel notificationChannel = new NotificationChannel("default_channel_id", string, 2);
            if (Build.VERSION.SDK_INT <= 27) {
                notificationChannel.setShowBadge(false);
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
        ue5 ue5Var = new ue5(this, "default_channel_id");
        if (Build.VERSION.SDK_INT >= 31) {
            ue5Var.z = 2;
        }
        ue5Var.f(8, true);
        ue5Var.B.icon = R.drawable.media3_notification_small_icon;
        ue5Var.x = -1;
        ue5Var.f(2, false);
        Pair pair = new Pair(20938, ue5Var.b());
        ie8.g(this, ((Integer) pair.first).intValue(), (Notification) pair.second);
        c().a();
        stopForeground(1);
        stopSelf();
    }

    @Override // defpackage.ue4, android.app.Service
    public final IBinder onBind(Intent intent) {
        xv4 xv4Var;
        String str = ie8.a;
        super.onBind(intent);
        String action = intent.getAction();
        if (action == null) {
            return null;
        }
        if (action.equals("androidx.media3.session.MediaSessionService")) {
            wv4 wv4Var = this.d;
            wv4Var.getClass();
            return wv4Var;
        }
        if (!action.equals("android.media.browse.MediaBrowserService")) {
            return null;
        }
        ku4 ku4VarF = f(new iu4(new rv4("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY));
        a(ku4VarF);
        dv4 dv4Var = ku4VarF.a;
        synchronized (dv4Var.a) {
            try {
                xv4Var = dv4Var.x;
                if (xv4Var == null) {
                    su4 su4Var = ((ou4) dv4Var.h.m.b).c;
                    xv4 xv4Var2 = new xv4(dv4Var);
                    xv4Var2.a(su4Var);
                    dv4Var.x = xv4Var2;
                    xv4Var = xv4Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return xv4Var.onBind(new Intent("android.media.browse.MediaBrowserService"));
    }

    @Override // defpackage.ue4, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.d = new wv4(this);
    }

    @Override // defpackage.ue4, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        du4 du4Var = this.e;
        if (du4Var != null) {
            du4Var.a();
        }
        wv4 wv4Var = this.d;
        if (wv4Var != null) {
            wv4Var.a.clear();
            wv4Var.b.removeCallbacksAndMessages(null);
            Set set = wv4Var.c;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                jxc.e((ac3) it.next());
            }
            set.clear();
            this.d = null;
        }
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        if (c().O) {
            ArrayList arrayListD = d();
            for (int i = 0; i < arrayListD.size(); i++) {
                if (((ku4) arrayListD.get(i)).a().e1()) {
                    return;
                }
            }
        }
        c().a();
        ArrayList arrayListD2 = d();
        for (int i2 = 0; i2 < arrayListD2.size(); i2++) {
            ((ku4) arrayListD2.get(i2)).a().J0(false);
        }
        stopSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int onStartCommand(Intent intent, int i, int i2) {
        ku4 ku4VarF;
        Object obj;
        String str;
        Bundle bundle;
        boolean zEquals;
        super.onStartCommand(intent, i, i2);
        if (intent != null) {
            if (this.I == null) {
                this.I = new vx8(10, this);
            }
            Uri data = intent.getData();
            if (JqdnMO.ZoZ.equals(intent.getAction()) || "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION".equals(intent.getAction())) {
                Object obj2 = null;
                if (data != null) {
                    synchronized (this.b) {
                        try {
                            Iterator it = ((zr) this.J.values()).iterator();
                            do {
                                wr wrVar = (wr) it;
                                if (wrVar.hasNext()) {
                                    ku4VarF = (ku4) wrVar.next();
                                } else {
                                    ku4VarF = null;
                                    break;
                                }
                            } while (!Objects.equals(ku4VarF.a.b, data));
                        } finally {
                        }
                    }
                    if (ku4VarF == null) {
                        ku4VarF = f(b(intent));
                        a(ku4VarF);
                    }
                    ku4 ku4Var = ku4VarF;
                    if (!"android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
                        dv4 dv4Var = ku4Var.a;
                        dv4Var.l.post(new xd(dv4Var, 21, intent));
                    } else {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            obj = extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION");
                        } else {
                            obj = null;
                        }
                        if (obj instanceof String) {
                            str = (String) obj;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            if (!this.K) {
                                k();
                                return 1;
                            }
                        } else {
                            Bundle extras2 = intent.getExtras();
                            if (extras2 != null) {
                                obj2 = extras2.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS");
                            }
                            if (obj2 instanceof Bundle) {
                                bundle = (Bundle) obj2;
                            } else {
                                bundle = Bundle.EMPTY;
                            }
                            Bundle bundle2 = bundle;
                            du4 du4VarC = c();
                            kr4 kr4VarB = du4VarC.b(ku4Var);
                            if (kr4VarB != null) {
                                ie8.f(new Handler(ku4Var.a().K1()), new j10(du4VarC, ku4Var, str, bundle2, kr4VarB));
                            }
                        }
                    }
                    if (!this.K && intent.hasExtra("androidx.media3.session.intent.uid")) {
                        zEquals = Objects.equals(c().J, intent.getStringExtra("androidx.media3.session.intent.uid"));
                        this.K = zEquals;
                        if (!zEquals) {
                            m3b.j("MSessionService", "Terminating service that was started by a stale start intent");
                            k();
                        }
                    }
                } else {
                    ku4VarF = null;
                    if (ku4VarF == null) {
                    }
                    ku4 ku4Var2 = ku4VarF;
                    if (!"android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
                    }
                    if (!this.K) {
                        zEquals = Objects.equals(c().J, intent.getStringExtra("androidx.media3.session.intent.uid"));
                        this.K = zEquals;
                        if (!zEquals) {
                        }
                    }
                }
            } else if (!this.K) {
            }
        }
        return 1;
    }
}
