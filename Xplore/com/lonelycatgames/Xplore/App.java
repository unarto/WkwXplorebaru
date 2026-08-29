package com.lonelycatgames.Xplore;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Application;
import android.app.LocaleManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.UiModeManager;
import android.app.backup.BackupManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadSystemException;
import android.os.Environment;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Vibrator;
import android.os.storage.StorageVolume;
import android.support.v4.media.session.VfM.KzDmFRBaJE;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Window;
import android.widget.Toast;
import androidx.annotation.Lz.ZBitir;
import androidx.lifecycle.Jzx.CKwXgHrxgKQXKh;
import com.amazon.device.iap.internal.a.ns.SFLvitRFwnxtcs;
import com.google.android.material.bottomsheet.wsN.bEPuzF;
import com.google.android.material.floatingactionbutton.lGl.OGXZhi;
import com.google.android.material.floatingactionbutton.lGl.osBQGmRW;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.internal.EX.nfosBL;
import com.google.mlkit.vision.face.internal.oO.LZeryzq;
import com.lonelycatgames.Xplore.App;
import com.lonelycatgames.Xplore.FileSystem.ftp.FtpShareServer;
import com.lonelycatgames.Xplore.FileSystem.wifi.WifiShareServer;
import com.lonelycatgames.Xplore.FileSystem.wifi.WifiStarterJob;
import com.lonelycatgames.Xplore.ImgViewer.ImageViewer;
import com.lonelycatgames.Xplore.ImgViewer.PdfViewer;
import com.lonelycatgames.Xplore.Music.MusicPlayerService;
import com.lonelycatgames.Xplore.Music.MusicPlayerUi;
import com.lonelycatgames.Xplore.ops.copy.CopyMoveService;
import com.lonelycatgames.Xplore.ops.copy.Ww.EQvrnCmT;
import com.lonelycatgames.Xplore.ui.TextViewer;
import com.lonelycatgames.Xplore.utils.FtpTileService;
import com.lonelycatgames.Xplore.utils.WiFiTileService;
import com.lonelycatgames.Xplore.video.VideoPlayer;
import com.pairip.StartupLauncher;
import com.pairip.VMRunner;
import defpackage.a60;
import defpackage.a67;
import defpackage.aj4;
import defpackage.ak2;
import defpackage.ar5;
import defpackage.ay0;
import defpackage.b10;
import defpackage.b81;
import defpackage.ba;
import defpackage.bd8;
import defpackage.bf5;
import defpackage.bf6;
import defpackage.bh6;
import defpackage.bj3;
import defpackage.bl6;
import defpackage.bn;
import defpackage.bo2;
import defpackage.by0;
import defpackage.bz1;
import defpackage.c02;
import defpackage.c27;
import defpackage.c62;
import defpackage.co2;
import defpackage.cx5;
import defpackage.d27;
import defpackage.d60;
import defpackage.d81;
import defpackage.dd2;
import defpackage.dd5;
import defpackage.dg6;
import defpackage.di2;
import defpackage.di7;
import defpackage.du5;
import defpackage.e;
import defpackage.e1;
import defpackage.e56;
import defpackage.e62;
import defpackage.e73;
import defpackage.ec;
import defpackage.ed3;
import defpackage.eg6;
import defpackage.es5;
import defpackage.ew3;
import defpackage.ey0;
import defpackage.f0b;
import defpackage.f44;
import defpackage.f62;
import defpackage.f90;
import defpackage.fc1;
import defpackage.fwc;
import defpackage.fy0;
import defpackage.fz1;
import defpackage.gg6;
import defpackage.gh1;
import defpackage.gk2;
import defpackage.gm2;
import defpackage.gu7;
import defpackage.gx6;
import defpackage.h75;
import defpackage.hc8;
import defpackage.he4;
import defpackage.hm3;
import defpackage.hx6;
import defpackage.i1;
import defpackage.ia8;
import defpackage.ibd;
import defpackage.idb;
import defpackage.ij5;
import defpackage.il1;
import defpackage.in;
import defpackage.is;
import defpackage.iw3;
import defpackage.iwb;
import defpackage.j30;
import defpackage.j62;
import defpackage.j73;
import defpackage.j83;
import defpackage.jb1;
import defpackage.jc5;
import defpackage.jc6;
import defpackage.jg2;
import defpackage.jj7;
import defpackage.jl2;
import defpackage.jq3;
import defpackage.jt5;
import defpackage.jyc;
import defpackage.k37;
import defpackage.k5d;
import defpackage.k85;
import defpackage.kab;
import defpackage.kg4;
import defpackage.kl2;
import defpackage.kn;
import defpackage.kn2;
import defpackage.kp7;
import defpackage.ky0;
import defpackage.l11;
import defpackage.la;
import defpackage.lj9;
import defpackage.ln2;
import defpackage.lod;
import defpackage.lx1;
import defpackage.m0;
import defpackage.m23;
import defpackage.m91;
import defpackage.md7;
import defpackage.mjb;
import defpackage.ml;
import defpackage.ml3;
import defpackage.mn;
import defpackage.ms7;
import defpackage.n1c;
import defpackage.n20;
import defpackage.n23;
import defpackage.n84;
import defpackage.ng4;
import defpackage.nn;
import defpackage.nn2;
import defpackage.nz5;
import defpackage.o37;
import defpackage.o47;
import defpackage.o6;
import defpackage.o83;
import defpackage.od0;
import defpackage.on;
import defpackage.p05;
import defpackage.p37;
import defpackage.p57;
import defpackage.pb0;
import defpackage.pd1;
import defpackage.pn;
import defpackage.pp7;
import defpackage.psc;
import defpackage.pu0;
import defpackage.pu8;
import defpackage.py0;
import defpackage.q15;
import defpackage.q37;
import defpackage.q47;
import defpackage.qc5;
import defpackage.qj7;
import defpackage.qn;
import defpackage.qp9;
import defpackage.qq3;
import defpackage.qx2;
import defpackage.qy1;
import defpackage.r37;
import defpackage.re8;
import defpackage.rk5;
import defpackage.rn;
import defpackage.ro7;
import defpackage.rtb;
import defpackage.s37;
import defpackage.sa8;
import defpackage.se8;
import defpackage.sn;
import defpackage.su8;
import defpackage.sx0;
import defpackage.sx2;
import defpackage.t1;
import defpackage.t24;
import defpackage.t50;
import defpackage.t81;
import defpackage.taa;
import defpackage.th;
import defpackage.tm8;
import defpackage.tn;
import defpackage.tqb;
import defpackage.tv0;
import defpackage.tx2;
import defpackage.u37;
import defpackage.ue5;
import defpackage.uh2;
import defpackage.un2;
import defpackage.uo4;
import defpackage.ur;
import defpackage.uz7;
import defpackage.v37;
import defpackage.v47;
import defpackage.va6;
import defpackage.ve6;
import defpackage.vo4;
import defpackage.w37;
import defpackage.w73;
import defpackage.we6;
import defpackage.wf8;
import defpackage.wg6;
import defpackage.wi7;
import defpackage.wi9;
import defpackage.wo4;
import defpackage.wp0;
import defpackage.wq5;
import defpackage.x2d;
import defpackage.x73;
import defpackage.x87;
import defpackage.xc5;
import defpackage.xd;
import defpackage.xk6;
import defpackage.xl2;
import defpackage.xr0;
import defpackage.xz7;
import defpackage.y1;
import defpackage.y57;
import defpackage.y73;
import defpackage.y82;
import defpackage.ye0;
import defpackage.yl2;
import defpackage.ym;
import defpackage.ym2;
import defpackage.yr0;
import defpackage.yu4;
import defpackage.yv3;
import defpackage.yx0;
import defpackage.z5;
import defpackage.z57;
import defpackage.z90;
import defpackage.z91;
import defpackage.z9d;
import defpackage.zcd;
import defpackage.zr5;
import defpackage.zs1;
import eM.OGxGQu;
import eM.RJRxBMfzzSpiPT;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public class App extends Application {
    public static final Handler M0;
    public static final Thread N0;
    public static final Set O0;
    public static final boolean P0;
    public static final List Q0;
    public static final long R0;
    public static final String S0;
    public h75 A0;
    public final LinkedHashSet B0;
    public MusicPlayerService C0;
    public Browser D0;
    public final pp7 E0;
    public Boolean F0;
    public final pp7 G0;
    public final List H0;
    public c62 I;
    public final List I0;
    public jc6 J;
    public String J0;
    public il1 K;
    public final pp7 K0;
    public uz7 L;
    public final he4 L0;
    public ConnectivityManager M;
    public boolean N;
    public final pn O;
    public wi7 P;
    public CopyMoveService Q;
    public t81 R;
    public ew3 S;
    public ShortcutManager T;
    public ln2 U;
    public ak2 V;
    public bj3 W;
    public Locale X;
    public j30 Y;
    public dg6 Z = new dg6();
    public Vibrator a;
    public final pp7 a0;
    public boolean b;
    public long b0;
    public sx0 c;
    public final pp7 c0;
    public di2 d;
    public final pp7 d0;
    public b10 e;
    public ArrayList e0;
    public int f0;
    public ml g0;
    public FirebaseAnalytics h0;
    public Browser i0;
    public long j0;
    public WifiShareServer k0;
    public FtpShareServer l0;
    public boolean m0;
    public final pp7 n0;
    public ed3 o0;
    public final f44 p0;
    public final f44 q0;
    public final f44 r0;
    public final f44 s0;
    public final f44 t0;
    public final f44 u0;
    public final f44 v0;
    public wf8 w0;
    public final f44 x0;
    public final f44 y0;
    public bl6 z0;

    /* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
    public static final class BootReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            VMRunner.invoke("c7y56h2Elfveuu7H", new Object[]{this, context, intent});
        }
    }

    public static String I() {
        return String.format(Locale.ROOT, "%d.%02d.%02d", Arrays.copyOf(new Object[]{4, 49, 10}, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void W(co2 co2Var, App app) throws JSONException {
        String string;
        fy0 fy0Var = co2Var.f;
        ay0 ay0VarC = fy0Var.c.c();
        if (ay0VarC == null) {
            string = null;
        } else {
            try {
                string = ay0VarC.b.getString("ApiConfig");
            } catch (JSONException unused) {
                string = null;
            }
        }
        if (string != null) {
            ay0 ay0VarC2 = fy0Var.c.c();
            if (ay0VarC2 != null) {
                synchronized (fy0Var.a) {
                    try {
                        Iterator it = fy0Var.a.iterator();
                        while (it.hasNext()) {
                            fy0Var.b.execute(new xd((eg6) it.next(), 5, ay0VarC2));
                        }
                    } finally {
                    }
                }
            }
        } else {
            ay0 ay0VarC3 = fy0Var.d.c();
            if (ay0VarC3 == null) {
                string = null;
                if (string == null) {
                    Log.w("FirebaseRemoteConfig", "No value of type 'String' exists for parameter key 'ApiConfig'.");
                    string = "";
                }
            } else {
                try {
                    string = ay0VarC3.b.getString("ApiConfig");
                } catch (JSONException unused2) {
                    string = null;
                }
                if (string == null) {
                }
            }
        }
        String str = string.length() > 0 ? string : null;
        if (str != null) {
            try {
                jq3 jq3Var = se8.b;
                k85 k85Var = jq3Var.b;
                app.Z = (dg6) jq3Var.b(dg6.Companion.serializer(), str);
            } catch (Exception unused3) {
                Log.e("X-plore", "Failed to decode remote config");
            }
        }
    }

    public static void d(App app, CharSequence charSequence, String str, boolean z, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        app.getClass();
        charSequence.getClass();
        Object systemService = app.getSystemService("clipboard");
        systemService.getClass();
        try {
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str, charSequence));
            if (z) {
                CharSequence text = app.getText(R.string.copied_to_clipboard);
                text.getClass();
                app.k0(text, false);
            }
        } catch (Exception e) {
            app.j0(app, se8.k(e), true);
        }
    }

    public static void h(Intent intent) {
        Uri data;
        if (intent.getComponent() == null && (data = intent.getData()) != null && th.n(data)) {
            String[] strArr = FileContentProvider.d;
            intent.setDataAndType(n20.d(th.l(data)), intent.getType()).getClass();
        }
        Uri data2 = intent.getData();
        String scheme = data2 != null ? data2.getScheme() : null;
        if (scheme != null) {
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3143036) {
                if (iHashCode != 951530617 || !scheme.equals("content")) {
                    return;
                }
            } else if (!scheme.equals("file")) {
                return;
            }
            intent.addFlags(3);
        }
    }

    public static /* synthetic */ void n0(App app, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        app.m0(null, z);
    }

    public final String A(String str) {
        str.getClass();
        return z(se8.f(str));
    }

    public final SharedPreferences B() {
        SharedPreferences sharedPreferences = getSharedPreferences("prefs", 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    public final ml C() {
        ml mlVar = this.g0;
        if (mlVar != null) {
            return mlVar;
        }
        hm3.l("operationButtons");
        throw null;
    }

    public final List D() {
        ArrayList arrayList = this.e0;
        if (arrayList != null) {
            return arrayList;
        }
        hm3.l("operations");
        throw null;
    }

    public final ArrayList E() {
        List list = this.H0;
        if (!xr0.v(list, (String) this.d0.getValue())) {
            List list2 = this.I0;
            List list3 = list2;
            il1 il1VarL = l();
            String[] strArr = il1.d;
            String strG = il1VarL.g("language", null);
            if (!xr0.v(list3, hm3.b(strG, "ru") ? null : strG)) {
                Locale locale = Locale.getDefault();
                if (!list.contains(locale.getCountry()) && !list2.contains(locale.getLanguage())) {
                    List list4 = v47.f;
                    return jyc.a();
                }
            }
        }
        return xr0.P(v47.g, xr0.a0(2, v47.f));
    }

    public final bl6 F() {
        bl6 bl6Var = this.z0;
        if (bl6Var != null) {
            return bl6Var;
        }
        bl6 bl6Var2 = new bl6(this);
        this.z0 = bl6Var2;
        return bl6Var2;
    }

    public final ml3 G() {
        return k().j.b() ? F() : v37.a != null ? (w37) this.K0.getValue() : (xk6) this.G0.getValue();
    }

    public final File H(boolean z) {
        File file = new File(tv0.x(j(), "temp/"));
        if (z) {
            file.mkdirs();
        }
        return file;
    }

    public final fz1 J(Collection collection, boolean z) {
        String strC;
        int iHashCode;
        o0();
        if (collection.size() == 1) {
            ng4 ng4Var = (ng4) xr0.y(collection);
            if ((ng4Var instanceof uh2) && (strC = ((uh2) ng4Var).c()) != null && ((iHashCode = strC.hashCode()) == -1165508903 ? strC.equals("audio/x-scpls") : !(iHashCode == -432766831 ? !strC.equals("audio/mpegurl") : !(iHashCode == 264230524 && strC.equals("audio/x-mpegurl"))))) {
                fz1 fz1Var = new fz1(this, ng4Var, strC);
                i0(fz1Var);
                return fz1Var;
            }
        }
        fz1 fz1Var2 = new fz1(this);
        ng4 ng4Var2 = (ng4) xr0.V(collection);
        if (ng4Var2 == null || !z || ng4Var2.k0()) {
            ng4Var2 = null;
        }
        fz1Var2.w = new bz1(fz1Var2, collection, ng4Var2);
        i0(fz1Var2);
        K();
        return fz1Var2;
    }

    public final void K() {
        if (this.A0 != null && this.C0 == null) {
            try {
                startService(new Intent("init", null, this, MusicPlayerService.class));
            } catch (Exception e) {
                k0(se8.k(e), false);
            }
        }
    }

    public final boolean L() {
        if (l().g("dark_theme", null) != null) {
            return l().h("dark_theme", false);
        }
        if (P0) {
            return se8.o(getResources().getConfiguration().uiMode, 32);
        }
        return true;
    }

    public final boolean M() {
        il1 il1VarL = l();
        String[] strArr = il1.d;
        return il1VarL.h("debug", false);
    }

    public final boolean N() {
        return this.l0 != null;
    }

    public final boolean O() {
        if (!((Boolean) this.E0.getValue()).booleanValue()) {
            return false;
        }
        Uri uri = du5.f;
        return wi9.d(this);
    }

    public final boolean P() {
        try {
            PackageManager packageManager = getPackageManager();
            packageManager.getClass();
            if (Build.VERSION.SDK_INT >= 33) {
                packageManager.getApplicationInfo("com.android.vending", PackageManager.ApplicationInfoFlags.of(0L)).getClass();
                return true;
            }
            packageManager.getApplicationInfo("com.android.vending", 0).getClass();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean Q() {
        return this.k0 != null;
    }

    public final void R() {
        int i;
        ComponentName componentName = new ComponentName(this, (Class<?>) BootReceiver.class);
        il1 il1VarL = l();
        String[] strArr = il1.d;
        if (il1VarL.h("wifi_share_auto_start", false) || l().h("ftp_share_auto_start", false)) {
            i = 1;
            break;
        }
        ArrayList arrayList = n().c;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((gk2) it.next()).b.e != -1) {
                    i = 1;
                    break;
                }
            }
        }
        i = 2;
        if (getPackageManager().getComponentEnabledSetting(componentName) != i) {
            getPackageManager().setComponentEnabledSetting(componentName, i, 1);
        }
    }

    public final void S() {
        Window window;
        Browser browser = this.i0;
        if (browser == null || (window = browser.getWindow()) == null) {
            return;
        }
        window.setFlags((N() || Q() || this.R != null) ? 128 : 0, 128);
    }

    public final void T(String str) {
        Vibrator vibrator;
        if (k().n && (vibrator = this.a) != null) {
            vibrator.vibrate(50L);
        }
        if (str != null) {
            k0(str, false);
        }
    }

    public final void U(String str) {
        str.getClass();
        synchronized (this) {
            il1 il1VarL = l();
            String[] strArr = il1.d;
            if (str.equals(il1VarL.g("firebase_token", null))) {
                return;
            }
            this.J0 = str;
            if (q15.J != null) {
                int i = z5.c;
                AccountManager accountManager = q15.I;
                if (accountManager == null) {
                    hm3.l("am");
                    throw null;
                }
                if (z90.e(accountManager) == null) {
                    Log.i("X-plore", "Forget API tokens");
                    ym ymVar = q15.J;
                    if (ymVar != null) {
                        AccountManager accountManager2 = q15.I;
                        if (accountManager2 == null) {
                            hm3.l("am");
                            throw null;
                        }
                        accountManager2.invalidateAuthToken("com.lonelycatgames.Xplore", ymVar.a);
                    }
                    q15.J = null;
                }
            }
            if (q15.J != null) {
                rtb.d(new t1(this, str, (b81) null));
            }
        }
    }

    public final void X() {
        new BackupManager(this).dataChanged();
    }

    public final void Y() {
        if (N()) {
            FtpShareServer ftpShareServer = this.l0;
            if (ftpShareServer != null) {
                ftpShareServer.stopSelf();
            }
            l0(false);
        }
    }

    public final void Z(int i, ue5 ue5Var) {
        if (gh1.b(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            new bf5(this).b(i, ue5Var.b());
        }
    }

    public final void a(Resources resources, boolean z) {
        boolean z2 = true;
        boolean z3 = z && Build.VERSION.SDK_INT < 33;
        il1 il1VarL = l();
        String[] strArr = il1.d;
        String strG = il1VarL.g("language", null);
        if (hm3.b(strG, "ru")) {
            strG = null;
        }
        Configuration configuration = resources.getConfiguration();
        Locale localeH = qp9.h(strG);
        boolean z4 = Build.VERSION.SDK_INT >= 33;
        if (z4) {
            z2 = z3;
            strG = null;
        } else if (localeH == null || hm3.b(configuration.locale, localeH)) {
            z2 = z3;
        }
        if (z2 || !(strG == null || strG.length() == 0)) {
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            if (!z4 && z2) {
                if (localeH == null && (localeH = this.X) == null) {
                    hm3.l(LZeryzq.XHPs);
                    throw null;
                }
                configuration.locale = localeH;
                resources.updateConfiguration(configuration, displayMetrics);
                Locale.setDefault(configuration.locale);
            }
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public final void a0(boolean z) {
        if (z) {
            b0(11, va6.a.c(48) + 48);
        } else {
            b0(6, va6.a.c(15) + 5);
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        long j;
        context.getClass();
        super.attachBaseContext(context);
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(new File(getFilesDir(), "uniqueId")));
            try {
                j = dataInputStream.readLong();
                dataInputStream.close();
            } finally {
            }
        } catch (Exception unused) {
            while (true) {
                j = lj9.h().b;
                if (j != 0 && j != 4086069485049307552L) {
                    break;
                }
            }
            v0(j);
        }
        this.b0 = j;
        Object systemService = getSystemService("uimode");
        systemService.getClass();
        this.b = ((UiModeManager) systemService).getCurrentModeType() == 4;
        this.W = new bj3(this);
        Object systemService2 = getSystemService("connectivity");
        systemService2.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService2;
        connectivityManager.registerDefaultNetworkCallback(this.O);
        this.M = connectivityManager;
        s0();
        this.K = new il1(this);
        this.c = new sx0(this);
        this.d = new di2(this);
        this.I = new c62(this);
        Object systemService3 = getSystemService("vibrator");
        systemService3.getClass();
        this.a = (Vibrator) systemService3;
        this.L = new uz7(this);
        yl2.i(H(false));
        aj4 aj4Var = aj4.k;
        k5d.l(this);
        v37.b = this;
        q37 q37Var = new q37();
        u37 u37Var = v37.c;
        ArrayList arrayList = p37.i;
        synchronized (arrayList) {
            arrayList.add(new o37(q37Var, u37Var));
        }
        r37 r37Var = new r37();
        synchronized (arrayList) {
            p37.j.add(new o37(r37Var, null));
        }
        s37 s37Var = new s37();
        synchronized (arrayList) {
            p37.k.add(new o37(s37Var, null));
        }
        this.J = new jc6(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(kl2 kl2Var) {
        boolean z;
        Intent intentCreateAccessIntent;
        Boolean bool = this.F0;
        if (bool != null) {
            return bool.booleanValue();
        }
        PackageManager packageManager = getPackageManager();
        if (!((Boolean) this.E0.getValue()).booleanValue()) {
            z = false;
            if (kl2Var instanceof jl2) {
                StorageVolume storageVolumeA = ((jl2) kl2Var).a();
                ResolveInfo resolveInfoResolveActivity = null;
                if (storageVolumeA != null && (intentCreateAccessIntent = storageVolumeA.createAccessIntent(null)) != null) {
                    resolveInfoResolveActivity = packageManager.resolveActivity(intentCreateAccessIntent, 0);
                }
                if (resolveInfoResolveActivity != null) {
                    z = true;
                }
            }
        }
        this.F0 = Boolean.valueOf(z);
        return z;
    }

    public final void b0(int i, int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.add(i, i2);
        SharedPreferences.Editor editorEdit = B().edit();
        editorEdit.getClass();
        editorEdit.putLong("scc", gregorianCalendar.getTimeInMillis() / 1000);
        editorEdit.apply();
    }

    public final void c() {
        try {
            wi7 wi7Var = this.P;
            if (wi7Var != null) {
                yu4.v(wi7Var);
            }
        } catch (Exception e) {
            qp9.d(e);
        } finally {
            this.P = null;
        }
    }

    public final void c0() {
        Object systemService = getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        jobScheduler.cancel(10000);
        il1 il1VarL = l();
        String[] strArr = il1.d;
        if (il1VarL.h("wifi_share_auto_start", false) || l().h("ftp_share_auto_start", false)) {
            JobInfo.Builder backoffCriteria = new JobInfo.Builder(10000, new ComponentName(this, (Class<?>) WifiStarterJob.class)).setBackoffCriteria(5000L, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                backoffCriteria.setRequiredNetwork(new NetworkRequest.Builder().addTransportType(1).addTransportType(3).build());
            } else {
                backoffCriteria.setRequiredNetworkType(2);
            }
            try {
                jobScheduler.schedule(backoffCriteria.build());
            } catch (IllegalStateException e) {
                Log.e("X-plore", "scheduleSharingAutostart: " + e + " - cancelling all jobs and retrying");
                jobScheduler.cancelAll();
                try {
                    jobScheduler.schedule(backoffCriteria.build());
                } catch (IllegalStateException e2) {
                    Log.e("X-plore", "scheduleSharingAutostart retry failed: " + e2);
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public final boolean d0() {
        boolean z;
        Object obj;
        String str;
        try {
            Object objInvoke = PackageManager.class.getMethod(se8.v(16, "wudY~cdq||ut@qs{qwuc"), Integer.TYPE).invoke(getPackageManager(), 0);
            objInvoke.getClass();
            z = false;
            obj = null;
            for (Object obj2 : (List) objInvoke) {
                if (hm3.b(((PackageInfo) obj2).packageName, getPackageName())) {
                    if (z) {
                        throw new IllegalArgumentException(KzDmFRBaJE.dBSQSsBqZEbft);
                    }
                    obj = obj2;
                    z = true;
                }
            }
        } catch (Exception unused) {
        }
        if (!z) {
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        ApplicationInfo applicationInfo = ((PackageInfo) obj).applicationInfo;
        if (applicationInfo != null && (str = applicationInfo.sourceDir) != null) {
            su8 su8Var = new su8(new File(str));
            try {
                Collection collectionValues = su8Var.c.values();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : collectionValues) {
                    if (((pu8) obj3).i >= 2097152) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InputStream inputStreamE = ((pu8) it.next()).e(0L);
                    try {
                        if (inputStreamE.read() == 80 && inputStreamE.read() == 75) {
                            inputStreamE.close();
                            taa.m(su8Var, null);
                            return false;
                        }
                        inputStreamE.close();
                    } finally {
                    }
                }
                taa.m(su8Var, null);
                return true;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    taa.m(su8Var, th);
                    throw th2;
                }
            }
        }
        return false;
    }

    public final void e(Throwable th) {
        ln2 ln2Var = this.U;
        if (ln2Var == null) {
            hm3.l("crashlytics");
            throw null;
        }
        fc1 fc1Var = ln2Var.a;
        Map map = Collections.EMPTY_MAP;
        ((pd1) fc1Var.o.b).a(new xd(fc1Var, th));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e0(String str, d81 d81Var) {
        sn snVar;
        if (d81Var instanceof sn) {
            snVar = (sn) d81Var;
            int i = snVar.J;
            if ((i & Integer.MIN_VALUE) != 0) {
                snVar.J = i - Integer.MIN_VALUE;
            } else {
                snVar = new sn(this, d81Var);
            }
        }
        Object obj = snVar.e;
        int i2 = snVar.J;
        try {
            if (i2 == 0) {
                n1c.j(obj);
                q15 q15Var = q15.b;
                snVar.d = str;
                snVar.J = 1;
                Object objT0 = q15Var.T0(str, snVar);
                jb1 jb1Var = jb1.a;
                if (objT0 == jb1Var) {
                    return jb1Var;
                }
            } else {
                if (i2 != 1) {
                    un2.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = snVar.d;
                n1c.j(obj);
            }
            l().v("firebase_token", str);
        } catch (Exception e) {
            se8.k(e);
        }
        return sa8.a;
    }

    public final bh6 f(kg4 kg4Var, String str) {
        str.getClass();
        return new bh6(this, new od0(kg4Var, 262144, 32), str);
    }

    public final void f0(hx6 hx6Var, lx1 lx1Var) {
        hx6Var.getClass();
        lx1Var.getClass();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        ue5 ue5Var = new ue5(this, "server_message");
        ue5Var.e = ue5.c(lx1Var.b);
        ue5Var.f = ue5.c(lx1Var.c);
        ue5Var.B.icon = R.drawable.notify_icon;
        ue5Var.f(16, true);
        ue5Var.g = th.c(this, ve6.a.b(Browser.class), new i1(7, hx6Var), 2);
        notificationManager.notify(8, ue5Var.b());
    }

    public final File g(String str, boolean z) {
        File fileH;
        str.getClass();
        xl2 xl2Var = xl2.a;
        String strA = xl2.a(str, xl2.c);
        String[] strArr = se8.a;
        String strH0 = jj7.h0(strA, '.');
        String strF = se8.f(strA);
        if (strF == null) {
            strF = "tmp";
        }
        if (z) {
            fileH = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            fileH.getClass();
        } else {
            fileH = H(true);
        }
        while (true) {
            File file = new File(fileH, strA);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            if (file.createNewFile()) {
                return file;
            }
            strA = strH0 + va6.a.c(Integer.MAX_VALUE) + "." + strF;
        }
    }

    public final void g0(Browser browser) {
        UsbManager usbManager;
        Window window;
        Browser browser2 = this.i0;
        if (browser2 != null && (window = browser2.getWindow()) != null) {
            window.clearFlags(128);
        }
        this.i0 = browser;
        if (browser != null) {
            bd8 bd8Var = bd8.a;
            LinkedHashMap linkedHashMap = bd8.b;
            App appW = browser.w();
            if (appW.k().p && (usbManager = (UsbManager) appW.getSystemService("usb")) != null) {
                try {
                    ec ecVar = bd8.d;
                    if (ecVar != null) {
                        appW.unregisterReceiver(ecVar);
                    }
                    bd8.d = null;
                } catch (Exception unused) {
                }
                ec ecVar2 = new ec(browser);
                bd8.d = ecVar2;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
                intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
                gh1.j(appW, ecVar2, intentFilter, null, 4);
                try {
                    HashMap<String, UsbDevice> deviceList = usbManager.getDeviceList();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (UsbDevice usbDevice : deviceList.values()) {
                        usbDevice.getClass();
                        linkedHashSet.add(usbDevice);
                        if (!linkedHashMap.containsKey(usbDevice)) {
                            bd8.a(browser, usbDevice);
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        Iterator it = new ArrayList(linkedHashMap.keySet()).iterator();
                        it.getClass();
                        while (it.hasNext()) {
                            UsbDevice usbDevice2 = (UsbDevice) it.next();
                            if (!linkedHashSet.contains(usbDevice2)) {
                                usbDevice2.getClass();
                                bd8.b(browser, usbDevice2, true);
                            }
                        }
                    }
                } catch (Exception e) {
                    qp9.d(e);
                }
            }
            S();
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        Context applicationContext = super.getApplicationContext();
        return applicationContext == null ? this : applicationContext;
    }

    public final void h0(String str) {
        LocaleList emptyLocaleList;
        Object systemService = getSystemService((Class<Object>) pu0.h());
        systemService.getClass();
        LocaleManager localeManagerB = o6.b(systemService);
        if (str == null || str.length() == 0) {
            emptyLocaleList = LocaleList.getEmptyLocaleList();
        } else {
            Locale localeH = qp9.h(str);
            if (localeH != null) {
                emptyLocaleList = new LocaleList(localeH);
            } else {
                emptyLocaleList = LocaleList.getEmptyLocaleList();
                emptyLocaleList.getClass();
            }
        }
        localeManagerB.setApplicationLocales(emptyLocaleList);
    }

    public final void i(Object[] objArr, int i) {
        qy1 qy1Var;
        int i2 = 0;
        if (i == 0) {
            Object obj = objArr[0];
            obj.getClass();
            this.l0 = (FtpShareServer) obj;
            kn knVar = new kn(this, i2);
            ShortcutManager shortcutManager = this.T;
            if (shortcutManager != null) {
                try {
                    knVar.a(shortcutManager);
                } catch (Exception e) {
                    qp9.d(e);
                }
            }
            S();
            int i3 = xz7.c;
            ibd.g(this, true, FtpTileService.class);
        } else if (i == 1) {
            this.l0 = null;
            kn knVar2 = new kn(this, i2);
            ShortcutManager shortcutManager2 = this.T;
            if (shortcutManager2 != null) {
                try {
                    knVar2.a(shortcutManager2);
                } catch (Exception e2) {
                    qp9.d(e2);
                }
            }
            S();
            int i4 = xz7.c;
            ibd.g(this, false, FtpTileService.class);
        }
        synchronized (this) {
            Browser browser = this.D0;
            if (browser != null) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                jt5[] jt5VarArr = browser.b0().b;
                int length = jt5VarArr.length;
                while (i2 < length) {
                    jt5 jt5Var = jt5VarArr[i2];
                    Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
                    jt5Var.getClass();
                    if ((i == 0 || i == 1 || i == 2) && (qy1Var = jt5Var.D) != null) {
                        jt5Var.y0(qy1Var);
                    }
                    i2++;
                }
                if (i == 0 || i == 1) {
                    browser.q0(true);
                }
            }
        }
    }

    public final void i0(h75 h75Var) {
        if (hm3.b(this.A0, h75Var)) {
            return;
        }
        this.A0 = h75Var;
        kn knVar = new kn(this, 1);
        ShortcutManager shortcutManager = this.T;
        if (shortcutManager != null) {
            try {
                knVar.a(shortcutManager);
            } catch (Exception e) {
                qp9.d(e);
            }
        }
        Iterator it = this.B0.iterator();
        while (it.hasNext()) {
            ((nn) it.next()).d();
        }
    }

    public final String j() {
        return (String) this.n0.getValue();
    }

    public final void j0(Context context, CharSequence charSequence, boolean z) {
        context.getClass();
        charSequence.getClass();
        if (qp9.f()) {
            try {
                Toast.makeText(context, charSequence, z ? 1 : 0).show();
            } catch (Exception unused) {
            }
        } else {
            kab.d(this.L0, null, null, new tn(context, charSequence, z, null, 0), 3);
        }
    }

    public final sx0 k() {
        sx0 sx0Var = this.c;
        if (sx0Var != null) {
            return sx0Var;
        }
        hm3.l("config");
        throw null;
    }

    public final void k0(CharSequence charSequence, boolean z) {
        charSequence.getClass();
        Context context = this.Y;
        Context context2 = context;
        if (context == null) {
            context2 = this;
        }
        j0(context2, charSequence, z);
    }

    public final il1 l() {
        il1 il1Var = this.K;
        if (il1Var != null) {
            return il1Var;
        }
        hm3.l("database");
        throw null;
    }

    public final void l0(boolean z) {
        try {
            Intent intent = new Intent(this, (Class<?>) FtpShareServer.class);
            if (z) {
                startForegroundService(intent);
            } else {
                startService(intent);
            }
        } catch (Exception e) {
            qp9.d(e);
        }
    }

    public final c62 m() {
        c62 c62Var = this.I;
        if (c62Var != null) {
            return c62Var;
        }
        hm3.l("dummyFileSystem");
        throw null;
    }

    public final void m0(ArrayList arrayList, boolean z) {
        try {
            Intent intent = new Intent(this, (Class<?>) WifiShareServer.class);
            if (arrayList != null) {
                ArrayList arrayList2 = new ArrayList(yr0.o(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ng4) it.next()).f0().toString());
                }
                intent.putExtra("files", (String[]) arrayList2.toArray(new String[0]));
            }
            if (z) {
                startForegroundService(intent);
            } else {
                startService(intent);
            }
        } catch (Exception e) {
            qp9.d(e);
        }
    }

    public final void o0() {
        h75 h75Var = this.A0;
        if (h75Var != null) {
            i0(null);
            h75Var.s();
            MusicPlayerService musicPlayerService = this.C0;
            if (musicPlayerService != null) {
                musicPlayerService.stopSelf();
            }
            this.C0 = null;
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        Locale locale = configuration.locale;
        locale.getClass();
        this.X = locale;
        Resources resources = getResources();
        resources.getClass();
        a(resources, true);
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        try {
            super.onTrimMemory(i);
        } catch (Exception e) {
            se8.k(e);
        }
    }

    public final List p() {
        il1 il1VarL = l();
        String[] strArr = il1.d;
        Object obj = null;
        String strG = il1VarL.g("ftp_share_paths", null);
        if (strG != null) {
            jq3 jq3Var = se8.b;
            k85 k85Var = jq3Var.b;
            List list = (List) jq3Var.b(iwb.h(new ur(qx2.Companion.serializer())), strG);
            if (list != null) {
                return list;
            }
        }
        aj4 aj4Var = aj4.k;
        Iterator it = k5d.k().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((kl2) next).b) {
                obj = next;
                break;
            }
        }
        kl2 kl2Var = (kl2) obj;
        return kl2Var != null ? fwc.g(new qx2(kl2Var.j, tv0.k("file://", kl2Var.a))) : y82.a;
    }

    public final void p0() {
        WifiShareServer wifiShareServer = this.k0;
        if (wifiShareServer != null) {
            wifiShareServer.stopSelf();
        }
    }

    public final String q() {
        il1 il1VarL = l();
        String[] strArr = il1.d;
        String strG = il1VarL.g("ftp_share_pass", null);
        return strG == null ? "123456" : strG;
    }

    public final void q0(String str, Bundle bundle) {
        FirebaseAnalytics firebaseAnalytics = this.h0;
        if (firebaseAnalytics != null) {
            idb idbVar = firebaseAnalytics.a;
            idbVar.getClass();
            idbVar.c(new f0b(idbVar, (String) null, str, bundle, false));
        }
    }

    public final String r() {
        il1 il1VarL = l();
        String[] strArr = il1.d;
        String strG = il1VarL.g("ftp_share_user", null);
        return strG == null ? "admin" : strG;
    }

    public final void r0(String str, String str2, String str3) {
        str3.getClass();
        Bundle bundle = new Bundle();
        bundle.putString(str2, str3);
        q0(str, bundle);
    }

    public final b10 s() {
        b10 b10Var = this.e;
        if (b10Var != null) {
            return b10Var;
        }
        hm3.l("iconFactory");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0() {
        ConnectivityManager connectivityManager;
        boolean z = true;
        try {
            connectivityManager = this.M;
        } catch (Exception unused) {
        }
        if (connectivityManager == null) {
            hm3.l("conMgr");
            throw null;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            z = false;
        } else {
            ConnectivityManager connectivityManager2 = this.M;
            if (connectivityManager2 == null) {
                hm3.l("conMgr");
                throw null;
            }
            NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            }
        }
        this.N = z;
    }

    public final ArrayList t() {
        List list = d60.h;
        ArrayList arrayListE = E();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListE) {
            o47 o47Var = (o47) obj;
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (o47Var.f((q47) it.next())) {
                        break;
                    }
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final void t0() {
        Vibrator vibrator = this.a;
        if (vibrator != null) {
            long[] jArr = new long[6];
            for (int i = 0; i < 6; i++) {
                jArr[i] = 50;
            }
            vibrator.vibrate(jArr, -1);
        }
    }

    public final ew3 u() {
        ew3 ew3Var = this.S;
        if (ew3Var != null) {
            return ew3Var;
        }
        hm3.l("keyBindings");
        throw null;
    }

    public final void u0(Object[] objArr, int i) {
        qy1 qy1Var;
        int i2 = 2;
        if (i == 0) {
            Object obj = objArr[0];
            obj.getClass();
            this.k0 = (WifiShareServer) obj;
            kn knVar = new kn(this, i2);
            ShortcutManager shortcutManager = this.T;
            if (shortcutManager != null) {
                try {
                    knVar.a(shortcutManager);
                } catch (Exception e) {
                    qp9.d(e);
                }
            }
            S();
            int i3 = xz7.c;
            ibd.g(this, true, WiFiTileService.class);
        } else if (i == 1) {
            this.k0 = null;
            kn knVar2 = new kn(this, i2);
            ShortcutManager shortcutManager2 = this.T;
            if (shortcutManager2 != null) {
                try {
                    knVar2.a(shortcutManager2);
                } catch (Exception e2) {
                    qp9.d(e2);
                }
            }
            S();
            int i4 = xz7.c;
            ibd.g(this, false, WiFiTileService.class);
        }
        synchronized (this) {
            Browser browser = this.D0;
            if (browser != null) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                pb0 pb0Var = browser.G0;
                for (jt5 jt5Var : browser.b0().b) {
                    Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
                    jt5Var.getClass();
                    if ((i == 0 || i == 1 || i == 2) && (qy1Var = jt5Var.L) != null) {
                        jt5Var.y0(qy1Var);
                    }
                }
                if (i == 3) {
                    Handler handler = M0;
                    handler.removeCallbacks(pb0Var);
                    handler.postDelayed(pb0Var, 200L);
                }
                if (i == 0 || i == 1) {
                    browser.q0(true);
                }
            }
        }
    }

    public final Comparator v() {
        di2 di2Var = this.d;
        if (di2Var != null) {
            return di2Var;
        }
        hm3.l("listingSorter");
        throw null;
    }

    public final void v0(long j) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(getFilesDir(), "uniqueId")));
            try {
                dataOutputStream.writeLong(j);
                dataOutputStream.close();
            } finally {
            }
        } catch (Exception e) {
            qp9.d(e);
        }
    }

    public final Account w() {
        AccountManager accountManager = AccountManager.get(this);
        accountManager.getClass();
        Account[] accountsByType = accountManager.getAccountsByType("com.lonelycatgames.Xplore");
        accountsByType.getClass();
        if (accountsByType.length == 0) {
            return null;
        }
        return accountsByType[0];
    }

    public final uz7 x() {
        uz7 uz7Var = this.L;
        if (uz7Var != null) {
            return uz7Var;
        }
        hm3.l("mediaInfoLoader");
        throw null;
    }

    public final String z(String str) {
        String lowerCase;
        String strE;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        return (lowerCase == null || (strE = l().e(lowerCase)) == null) ? p05.e(lowerCase) : strE;
    }

    static {
        StartupLauncher.launch();
        M0 = th.a;
        N0 = Thread.currentThread();
        O0 = is.V(new String[]{"jpg", "jpeg", "png", "webp", "mp3", "mp4", "avi", "zip", "apk", "rar"});
        P0 = Build.VERSION.SDK_INT >= 29;
        we6 we6Var = ve6.a;
        Q0 = fwc.h(new es5(we6Var.b(VideoPlayer.class), fwc.h("video/mp4", "video/x-msvideo", "video/x-matroska")), new es5(we6Var.b(ImageViewer.class), fwc.h("image/jpeg", "image/png", "image/gif", "image/heic", "image/heif", "image/svg+xml", "image/x-ms-bmp", "image/tiff")), new es5(we6Var.b(MusicPlayerUi.class), fwc.h("audio/mpeg", "audio/mp4", "audio/flac")), new es5(we6Var.b(PdfViewer.class), fwc.g("application/pdf")), new es5(we6Var.b(TextViewer.class), fwc.g("text/plain")));
        tqb tqbVar = f62.b;
        R0 = z9d.h(30, j62.SECONDS);
        S0 = re8.k(Build.MANUFACTURER, " ", Build.MODEL);
    }

    public App() {
        final int i = 0;
        this.O = new pn(i, this);
        final int i2 = 3;
        this.a0 = new pp7(new e1(i2, this));
        final int i3 = 2;
        this.c0 = new pp7(new tx2(this) { // from class: jn
            public final /* synthetic */ App b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [b81] */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v12 */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.io.File] */
            /* JADX WARN: Type inference failed for: r2v6, types: [java.io.File] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00f7 -> B:60:0x00f8). Please report as a decompilation issue!!! */
            @Override // defpackage.tx2
            public final Object d() {
                String lowerCase;
                TelephonyManager telephonyManager;
                String simCountryIso;
                ResolveInfo resolveInfoResolveActivity;
                int i4 = i3;
                boolean z = false;
                ?? cacheDir = 0;
                cacheDir = 0;
                resolveInfo = null;
                ResolveInfo resolveInfo = null;
                App app = this.b;
                switch (i4) {
                    case 0:
                        Handler handler = App.M0;
                        return new xk6(app);
                    case 1:
                        Handler handler2 = App.M0;
                        return new w37(app);
                    case 2:
                        Handler handler3 = App.M0;
                        return (String) rtb.c(v82.a, new on(app, cacheDir, z ? 1 : 0));
                    case 3:
                        Handler handler4 = App.M0;
                        try {
                            Object systemService = app.getSystemService("phone");
                            systemService.getClass();
                            telephonyManager = (TelephonyManager) systemService;
                            simCountryIso = telephonyManager.getSimCountryIso();
                        } catch (Exception unused) {
                        }
                        if (simCountryIso == null || simCountryIso.length() != 2) {
                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                            if (networkCountryIso == null || networkCountryIso.length() != 2) {
                                lowerCase = null;
                            } else {
                                lowerCase = networkCountryIso.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            }
                        } else {
                            lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        }
                        if (lowerCase == null) {
                            return null;
                        }
                        String lowerCase2 = lowerCase.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        return lowerCase2;
                    case 4:
                        Handler handler5 = App.M0;
                        if (hm3.b(Environment.getExternalStorageState(), "mounted")) {
                            try {
                                cacheDir = app.getExternalCacheDir();
                            } catch (NullPointerException e) {
                                Handler handler6 = App.M0;
                                qp9.d(e);
                            }
                            break;
                        }
                        if (cacheDir == 0) {
                            cacheDir = app.getCacheDir();
                        }
                        return tv0.x(cacheDir.getAbsolutePath(), "/");
                    case 5:
                        Handler handler7 = App.M0;
                        return new h24(app);
                    case 6:
                        Handler handler8 = App.M0;
                        return new pq(app);
                    case 7:
                        Handler handler9 = App.M0;
                        return new yw2(app);
                    case 8:
                        Handler handler10 = App.M0;
                        return new qq0(app);
                    case 9:
                        Handler handler11 = App.M0;
                        return new m07(app, "SftpServers");
                    case 10:
                        Handler handler12 = App.M0;
                        return new b22(app);
                    case 11:
                        Handler handler13 = App.M0;
                        return new eo8(app, "WifiServers");
                    case 12:
                        Handler handler14 = App.M0;
                        return new qj2(app);
                    case 13:
                        Handler handler15 = App.M0;
                        return new du5(app);
                    default:
                        Handler handler16 = App.M0;
                        PackageManager packageManager = app.getPackageManager();
                        packageManager.getClass();
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                        try {
                            resolveInfoResolveActivity = Build.VERSION.SDK_INT >= 33 ? packageManager.resolveActivity(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.resolveActivity(intent, 0);
                            break;
                        } catch (Exception unused2) {
                            resolveInfoResolveActivity = null;
                        }
                        if (resolveInfoResolveActivity != null && !hm3.b(resolveInfoResolveActivity.activityInfo.name, "com.android.tv.frameworkpackagestubs.Stubs$DocumentsStub")) {
                            resolveInfo = resolveInfoResolveActivity;
                        }
                        return Boolean.valueOf(resolveInfo != null);
                }
            }
        });
        this.d0 = new pp7(new tx2(this) { // from class: jn
            public final /* synthetic */ App b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [b81] */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v12 */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.io.File] */
            /* JADX WARN: Type inference failed for: r2v6, types: [java.io.File] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00f7 -> B:60:0x00f8). Please report as a decompilation issue!!! */
            @Override // defpackage.tx2
            public final Object d() {
                String lowerCase;
                TelephonyManager telephonyManager;
                String simCountryIso;
                ResolveInfo resolveInfoResolveActivity;
                int i4 = i2;
                boolean z = false;
                ?? cacheDir = 0;
                cacheDir = 0;
                resolveInfo = null;
                ResolveInfo resolveInfo = null;
                App app = this.b;
                switch (i4) {
                    case 0:
                        Handler handler = App.M0;
                        return new xk6(app);
                    case 1:
                        Handler handler2 = App.M0;
                        return new w37(app);
                    case 2:
                        Handler handler3 = App.M0;
                        return (String) rtb.c(v82.a, new on(app, cacheDir, z ? 1 : 0));
                    case 3:
                        Handler handler4 = App.M0;
                        try {
                            Object systemService = app.getSystemService("phone");
                            systemService.getClass();
                            telephonyManager = (TelephonyManager) systemService;
                            simCountryIso = telephonyManager.getSimCountryIso();
                        } catch (Exception unused) {
                        }
                        if (simCountryIso == null || simCountryIso.length() != 2) {
                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                            if (networkCountryIso == null || networkCountryIso.length() != 2) {
                                lowerCase = null;
                            } else {
                                lowerCase = networkCountryIso.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            }
                        } else {
                            lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        }
                        if (lowerCase == null) {
                            return null;
                        }
                        String lowerCase2 = lowerCase.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        return lowerCase2;
                    case 4:
                        Handler handler5 = App.M0;
                        if (hm3.b(Environment.getExternalStorageState(), "mounted")) {
                            try {
                                cacheDir = app.getExternalCacheDir();
                            } catch (NullPointerException e) {
                                Handler handler6 = App.M0;
                                qp9.d(e);
                            }
                            break;
                        }
                        if (cacheDir == 0) {
                            cacheDir = app.getCacheDir();
                        }
                        return tv0.x(cacheDir.getAbsolutePath(), "/");
                    case 5:
                        Handler handler7 = App.M0;
                        return new h24(app);
                    case 6:
                        Handler handler8 = App.M0;
                        return new pq(app);
                    case 7:
                        Handler handler9 = App.M0;
                        return new yw2(app);
                    case 8:
                        Handler handler10 = App.M0;
                        return new qq0(app);
                    case 9:
                        Handler handler11 = App.M0;
                        return new m07(app, "SftpServers");
                    case 10:
                        Handler handler12 = App.M0;
                        return new b22(app);
                    case 11:
                        Handler handler13 = App.M0;
                        return new eo8(app, "WifiServers");
                    case 12:
                        Handler handler14 = App.M0;
                        return new qj2(app);
                    case 13:
                        Handler handler15 = App.M0;
                        return new du5(app);
                    default:
                        Handler handler16 = App.M0;
                        PackageManager packageManager = app.getPackageManager();
                        packageManager.getClass();
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                        try {
                            resolveInfoResolveActivity = Build.VERSION.SDK_INT >= 33 ? packageManager.resolveActivity(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.resolveActivity(intent, 0);
                            break;
                        } catch (Exception unused2) {
                            resolveInfoResolveActivity = null;
                        }
                        if (resolveInfoResolveActivity != null && !hm3.b(resolveInfoResolveActivity.activityInfo.name, "com.android.tv.frameworkpackagestubs.Stubs$DocumentsStub")) {
                            resolveInfo = resolveInfoResolveActivity;
                        }
                        return Boolean.valueOf(resolveInfo != null);
                }
            }
        });
        final int i4 = 4;
        this.n0 = new pp7(new tx2(this) { // from class: jn
            public final /* synthetic */ App b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [b81] */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v12 */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.io.File] */
            /* JADX WARN: Type inference failed for: r2v6, types: [java.io.File] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00f7 -> B:60:0x00f8). Please report as a decompilation issue!!! */
            @Override // defpackage.tx2
            public final Object d() {
                String lowerCase;
                TelephonyManager telephonyManager;
                String simCountryIso;
                ResolveInfo resolveInfoResolveActivity;
                int i42 = i4;
                boolean z = false;
                ?? cacheDir = 0;
                cacheDir = 0;
                resolveInfo = null;
                ResolveInfo resolveInfo = null;
                App app = this.b;
                switch (i42) {
                    case 0:
                        Handler handler = App.M0;
                        return new xk6(app);
                    case 1:
                        Handler handler2 = App.M0;
                        return new w37(app);
                    case 2:
                        Handler handler3 = App.M0;
                        return (String) rtb.c(v82.a, new on(app, cacheDir, z ? 1 : 0));
                    case 3:
                        Handler handler4 = App.M0;
                        try {
                            Object systemService = app.getSystemService("phone");
                            systemService.getClass();
                            telephonyManager = (TelephonyManager) systemService;
                            simCountryIso = telephonyManager.getSimCountryIso();
                        } catch (Exception unused) {
                        }
                        if (simCountryIso == null || simCountryIso.length() != 2) {
                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                            if (networkCountryIso == null || networkCountryIso.length() != 2) {
                                lowerCase = null;
                            } else {
                                lowerCase = networkCountryIso.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            }
                        } else {
                            lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        }
                        if (lowerCase == null) {
                            return null;
                        }
                        String lowerCase2 = lowerCase.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        return lowerCase2;
                    case 4:
                        Handler handler5 = App.M0;
                        if (hm3.b(Environment.getExternalStorageState(), "mounted")) {
                            try {
                                cacheDir = app.getExternalCacheDir();
                            } catch (NullPointerException e) {
                                Handler handler6 = App.M0;
                                qp9.d(e);
                            }
                            break;
                        }
                        if (cacheDir == 0) {
                            cacheDir = app.getCacheDir();
                        }
                        return tv0.x(cacheDir.getAbsolutePath(), "/");
                    case 5:
                        Handler handler7 = App.M0;
                        return new h24(app);
                    case 6:
                        Handler handler8 = App.M0;
                        return new pq(app);
                    case 7:
                        Handler handler9 = App.M0;
                        return new yw2(app);
                    case 8:
                        Handler handler10 = App.M0;
                        return new qq0(app);
                    case 9:
                        Handler handler11 = App.M0;
                        return new m07(app, "SftpServers");
                    case 10:
                        Handler handler12 = App.M0;
                        return new b22(app);
                    case 11:
                        Handler handler13 = App.M0;
                        return new eo8(app, "WifiServers");
                    case 12:
                        Handler handler14 = App.M0;
                        return new qj2(app);
                    case 13:
                        Handler handler15 = App.M0;
                        return new du5(app);
                    default:
                        Handler handler16 = App.M0;
                        PackageManager packageManager = app.getPackageManager();
                        packageManager.getClass();
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                        try {
                            resolveInfoResolveActivity = Build.VERSION.SDK_INT >= 33 ? packageManager.resolveActivity(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.resolveActivity(intent, 0);
                            break;
                        } catch (Exception unused2) {
                            resolveInfoResolveActivity = null;
                        }
                        if (resolveInfoResolveActivity != null && !hm3.b(resolveInfoResolveActivity.activityInfo.name, "com.android.tv.frameworkpackagestubs.Stubs$DocumentsStub")) {
                            resolveInfo = resolveInfoResolveActivity;
                        }
                        return Boolean.valueOf(resolveInfo != null);
                }
            }
        });
        final int i5 = 5;
        tx2 tx2Var = new tx2(this) { // from class: jn
            public final /* synthetic */ App b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [b81] */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v12 */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.io.File] */
            /* JADX WARN: Type inference failed for: r2v6, types: [java.io.File] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00f7 -> B:60:0x00f8). Please report as a decompilation issue!!! */
            @Override // defpackage.tx2
            public final Object d() {
                String lowerCase;
                TelephonyManager telephonyManager;
                String simCountryIso;
                ResolveInfo resolveInfoResolveActivity;
                int i42 = i5;
                boolean z = false;
                ?? cacheDir = 0;
                cacheDir = 0;
                resolveInfo = null;
                ResolveInfo resolveInfo = null;
                App app = this.b;
                switch (i42) {
                    case 0:
                        Handler handler = App.M0;
                        return new xk6(app);
                    case 1:
                        Handler handler2 = App.M0;
                        return new w37(app);
                    case 2:
                        Handler handler3 = App.M0;
                        return (String) rtb.c(v82.a, new on(app, cacheDir, z ? 1 : 0));
                    case 3:
                        Handler handler4 = App.M0;
                        try {
                            Object systemService = app.getSystemService("phone");
                            systemService.getClass();
                            telephonyManager = (TelephonyManager) systemService;
                            simCountryIso = telephonyManager.getSimCountryIso();
                        } catch (Exception unused) {
                        }
                        if (simCountryIso == null || simCountryIso.length() != 2) {
                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                            if (networkCountryIso == null || networkCountryIso.length() != 2) {
                                lowerCase = null;
                            } else {
                                lowerCase = networkCountryIso.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            }
                        } else {
                            lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        }
                        if (lowerCase == null) {
                            return null;
                        }
                        String lowerCase2 = lowerCase.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        return lowerCase2;
                    case 4:
                        Handler handler5 = App.M0;
                        if (hm3.b(Environment.getExternalStorageState(), "mounted")) {
                            try {
                                cacheDir = app.getExternalCacheDir();
                            } catch (NullPointerException e) {
                                Handler handler6 = App.M0;
                                qp9.d(e);
                            }
                            break;
                        }
                        if (cacheDir == 0) {
                            cacheDir = app.getCacheDir();
                        }
                        return tv0.x(cacheDir.getAbsolutePath(), "/");
                    case 5:
                        Handler handler7 = App.M0;
                        return new h24(app);
                    case 6:
                        Handler handler8 = App.M0;
                        return new pq(app);
                    case 7:
                        Handler handler9 = App.M0;
                        return new yw2(app);
                    case 8:
                        Handler handler10 = App.M0;
                        return new qq0(app);
                    case 9:
                        Handler handler11 = App.M0;
                        return new m07(app, "SftpServers");
                    case 10:
                        Handler handler12 = App.M0;
                        return new b22(app);
                    case 11:
                        Handler handler13 = App.M0;
                        return new eo8(app, "WifiServers");
                    case 12:
                        Handler handler14 = App.M0;
                        return new qj2(app);
                    case 13:
                        Handler handler15 = App.M0;
                        return new du5(app);
                    default:
                        Handler handler16 = App.M0;
                        PackageManager packageManager = app.getPackageManager();
                        packageManager.getClass();
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                        try {
                            resolveInfoResolveActivity = Build.VERSION.SDK_INT >= 33 ? packageManager.resolveActivity(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.resolveActivity(intent, 0);
                            break;
                        } catch (Exception unused2) {
                            resolveInfoResolveActivity = null;
                        }
                        if (resolveInfoResolveActivity != null && !hm3.b(resolveInfoResolveActivity.activityInfo.name, "com.android.tv.frameworkpackagestubs.Stubs$DocumentsStub")) {
                            resolveInfo = resolveInfoResolveActivity;
                        }
                        return Boolean.valueOf(resolveInfo != null);
                }
            }
        };
        String[] strArr = se8.a;
        n84 n84Var = n84.b;
        this.p0 = jyc.b(n84Var, tx2Var);
        final int i6 = 6;
        this.q0 = jyc.b(n84Var, new tx2(this) { // from class: jn
            public final /* synthetic */ App b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [b81] */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v12 */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.io.File] */
            /* JADX WARN: Type inference failed for: r2v6, types: [java.io.File] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00f7 -> B:60:0x00f8). Please report as a decompilation issue!!! */
            @Override // defpackage.tx2
            public final Object d() {
                String lowerCase;
                TelephonyManager telephonyManager;
                String simCountryIso;
                ResolveInfo resolveInfoResolveActivity;
                int i42 = i6;
                boolean z = false;
                ?? cacheDir = 0;
                cacheDir = 0;
                resolveInfo = null;
                ResolveInfo resolveInfo = null;
                App app = this.b;
                switch (i42) {
                    case 0:
                        Handler handler = App.M0;
                        return new xk6(app);
                    case 1:
                        Handler handler2 = App.M0;
                        return new w37(app);
                    case 2:
                        Handler handler3 = App.M0;
                        return (String) rtb.c(v82.a, new on(app, cacheDir, z ? 1 : 0));
                    case 3:
                        Handler handler4 = App.M0;
                        try {
                            Object systemService = app.getSystemService("phone");
                            systemService.getClass();
                            telephonyManager = (TelephonyManager) systemService;
                            simCountryIso = telephonyManager.getSimCountryIso();
                        } catch (Exception unused) {
                        }
                        if (simCountryIso == null || simCountryIso.length() != 2) {
                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                            if (networkCountryIso == null || networkCountryIso.length() != 2) {
                                lowerCase = null;
                            } else {
                                lowerCase = networkCountryIso.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            }
                        } else {
                            lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        }
                        if (lowerCase == null) {
                            return null;
                        }
                        String lowerCase2 = lowerCase.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        return lowerCase2;
                    case 4:
                        Handler handler5 = App.M0;
                        if (hm3.b(Environment.getExternalStorageState(), "mounted")) {
                            try {
                                cacheDir = app.getExternalCacheDir();
                            } catch (NullPointerException e) {
                                Handler handler6 = App.M0;
                                qp9.d(e);
                            }
                            break;
                        }
                        if (cacheDir == 0) {
                            cacheDir = app.getCacheDir();
                        }
                        return tv0.x(cacheDir.getAbsolutePath(), "/");
                    case 5:
                        Handler handler7 = App.M0;
                        return new h24(app);
                    case 6:
                        Handler handler8 = App.M0;
                        return new pq(app);
                    case 7:
                        Handler handler9 = App.M0;
                        return new yw2(app);
                    case 8:
                        Handler handler10 = App.M0;
                        return new qq0(app);
                    case 9:
                        Handler handler11 = App.M0;
                        return new m07(app, "SftpServers");
                    case 10:
                        Handler handler12 = App.M0;
                        return new b22(app);
                    case 11:
                        Handler handler13 = App.M0;
                        return new eo8(app, "WifiServers");
                    case 12:
                        Handler handler14 = App.M0;
                        return new qj2(app);
                    case 13:
                        Handler handler15 = App.M0;
                        return new du5(app);
                    default:
                        Handler handler16 = App.M0;
                        PackageManager packageManager = app.getPackageManager();
                        packageManager.getClass();
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                        try {
                            resolveInfoResolveActivity = Build.VERSION.SDK_INT >= 33 ? packageManager.resolveActivity(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.resolveActivity(intent, 0);
                            break;
                        } catch (Exception unused2) {
                            resolveInfoResolveActivity = null;
                        }
                        if (resolveInfoResolveActivity != null && !hm3.b(resolveInfoResolveActivity.activityInfo.name, "com.android.tv.frameworkpackagestubs.Stubs$DocumentsStub")) {
                            resolveInfo = resolveInfoResolveActivity;
                        }
                        return Boolean.valueOf(resolveInfo != null);
                }
            }
        });
        final int i7 = 7;
        this.r0 = jyc.b(n84Var, new tx2(this) { // from class: jn
            public final /* synthetic */ App b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [b81] */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v12 */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.io.File] */
            /* JADX WARN: Type inference failed for: r2v6, types: [java.io.File] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00f7 -> B:60:0x00f8). Please report as a decompilation issue!!! */
            @Override // defpackage.tx2
            public final Object d() {
                String lowerCase;
                TelephonyManager telephonyManager;
                String simCountryIso;
                ResolveInfo resolveInfoResolveActivity;
                int i42 = i7;
                boolean z = false;
                ?? cacheDir = 0;
                cacheDir = 0;
                resolveInfo = null;
                ResolveInfo resolveInfo = null;
                App app = this.b;
                switch (i42) {
                    case 0:
                        Handler handler = App.M0;
                        return new xk6(app);
                    case 1:
                        Handler handler2 = App.M0;
                        return new w37(app);
                    case 2:
                        Handler handler3 = App.M0;
                        return (String) rtb.c(v82.a, new on(app, cacheDir, z ? 1 : 0));
                    case 3:
                        Handler handler4 = App.M0;
                        try {
                            Object systemService = app.getSystemService("phone");
                            systemService.getClass();
                            telephonyManager = (TelephonyManager) systemService;
                            simCountryIso = telephonyManager.getSimCountryIso();
                        } catch (Exception unused) {
                        }
                        if (simCountryIso == null || simCountryIso.length() != 2) {
                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                            if (networkCountryIso == null || networkCountryIso.length() != 2) {
                                lowerCase = null;
                            } else {
                                lowerCase = networkCountryIso.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            }
                        } else {
                            lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        }
                        if (lowerCase == null) {
                            return null;
                        }
                        String lowerCase2 = lowerCase.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        return lowerCase2;
                    case 4:
                        Handler handler5 = App.M0;
                        if (hm3.b(Environment.getExternalStorageState(), "mounted")) {
                            try {
                                cacheDir = app.getExternalCacheDir();
                            } catch (NullPointerException e) {
                                Handler handler6 = App.M0;
                                qp9.d(e);
                            }
                            break;
                        }
                        if (cacheDir == 0) {
                            cacheDir = app.getCacheDir();
                        }
                        return tv0.x(cacheDir.getAbsolutePath(), "/");
                    case 5:
                        Handler handler7 = App.M0;
                        return new h24(app);
                    case 6:
                        Handler handler8 = App.M0;
                        return new pq(app);
                    case 7:
                        Handler handler9 = App.M0;
                        return new yw2(app);
                    case 8:
                        Handler handler10 = App.M0;
                        return new qq0(app);
                    case 9:
                        Handler handler11 = App.M0;
                        return new m07(app, "SftpServers");
                    case 10:
                        Handler handler12 = App.M0;
                        return new b22(app);
                    case 11:
                        Handler handler13 = App.M0;
                        return new eo8(app, "WifiServers");
                    case 12:
                        Handler handler14 = App.M0;
                        return new qj2(app);
                    case 13:
                        Handler handler15 = App.M0;
                        return new du5(app);
                    default:
                        Handler handler16 = App.M0;
                        PackageManager packageManager = app.getPackageManager();
                        packageManager.getClass();
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                        try {
                            resolveInfoResolveActivity = Build.VERSION.SDK_INT >= 33 ? packageManager.resolveActivity(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.resolveActivity(intent, 0);
                            break;
                        } catch (Exception unused2) {
                            resolveInfoResolveActivity = null;
                        }
                        if (resolveInfoResolveActivity != null && !hm3.b(resolveInfoResolveActivity.activityInfo.name, "com.android.tv.frameworkpackagestubs.Stubs$DocumentsStub")) {
                            resolveInfo = resolveInfoResolveActivity;
                        }
                        return Boolean.valueOf(resolveInfo != null);
                }
            }
        });
        final int i8 = 8;
        this.s0 = jyc.b(n84Var, new tx2(this) { // from class: jn
            public final /* synthetic */ App b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [b81] */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v12 */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.io.File] */
            /* JADX WARN: Type inference failed for: r2v6, types: [java.io.File] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00f7 -> B:60:0x00f8). Please report as a decompilation issue!!! */
            @Override // defpackage.tx2
            public final Object d() {
                String lowerCase;
                TelephonyManager telephonyManager;
                String simCountryIso;
                ResolveInfo resolveInfoResolveActivity;
                int i42 = i8;
                boolean z = false;
                ?? cacheDir = 0;
                cacheDir = 0;
                resolveInfo = null;
                ResolveInfo resolveInfo = null;
                App app = this.b;
                switch (i42) {
                    case 0:
                        Handler handler = App.M0;
                        return new xk6(app);
                    case 1:
                        Handler handler2 = App.M0;
                        return new w37(app);
                    case 2:
                        Handler handler3 = App.M0;
                        return (String) rtb.c(v82.a, new on(app, cacheDir, z ? 1 : 0));
                    case 3:
                        Handler handler4 = App.M0;
                        try {
                            Object systemService = app.getSystemService("phone");
                            systemService.getClass();
                            telephonyManager = (TelephonyManager) systemService;
                            simCountryIso = telephonyManager.getSimCountryIso();
                        } catch (Exception unused) {
                        }
                        if (simCountryIso == null || simCountryIso.length() != 2) {
                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                            if (networkCountryIso == null || networkCountryIso.length() != 2) {
                                lowerCase = null;
                            } else {
                                lowerCase = networkCountryIso.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            }
                        } else {
                            lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        }
                        if (lowerCase == null) {
                            return null;
                        }
                        String lowerCase2 = lowerCase.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        return lowerCase2;
                    case 4:
                        Handler handler5 = App.M0;
                        if (hm3.b(Environment.getExternalStorageState(), "mounted")) {
                            try {
                                cacheDir = app.getExternalCacheDir();
                            } catch (NullPointerException e) {
                                Handler handler6 = App.M0;
                                qp9.d(e);
                            }
                            break;
                        }
                        if (cacheDir == 0) {
                            cacheDir = app.getCacheDir();
                        }
                        return tv0.x(cacheDir.getAbsolutePath(), "/");
                    case 5:
                        Handler handler7 = App.M0;
                        return new h24(app);
                    case 6:
                        Handler handler8 = App.M0;
                        return new pq(app);
                    case 7:
                        Handler handler9 = App.M0;
                        return new yw2(app);
                    case 8:
                        Handler handler10 = App.M0;
                        return new qq0(app);
                    case 9:
                        Handler handler11 = App.M0;
                        return new m07(app, "SftpServers");
                    case 10:
                        Handler handler12 = App.M0;
                        return new b22(app);
                    case 11:
                        Handler handler13 = App.M0;
                        return new eo8(app, "WifiServers");
                    case 12:
                        Handler handler14 = App.M0;
                        return new qj2(app);
                    case 13:
                        Handler handler15 = App.M0;
                        return new du5(app);
                    default:
                        Handler handler16 = App.M0;
                        PackageManager packageManager = app.getPackageManager();
                        packageManager.getClass();
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                        try {
                            resolveInfoResolveActivity = Build.VERSION.SDK_INT >= 33 ? packageManager.resolveActivity(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.resolveActivity(intent, 0);
                            break;
                        } catch (Exception unused2) {
                            resolveInfoResolveActivity = null;
                        }
                        if (resolveInfoResolveActivity != null && !hm3.b(resolveInfoResolveActivity.activityInfo.name, "com.android.tv.frameworkpackagestubs.Stubs$DocumentsStub")) {
                            resolveInfo = resolveInfoResolveActivity;
                        }
                        return Boolean.valueOf(resolveInfo != null);
                }
            }
        });
        final int i9 = 9;
        this.t0 = jyc.b(n84Var, new tx2(this) { // from class: jn
            public final /* synthetic */ App b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [b81] */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v12 */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.io.File] */
            /* JADX WARN: Type inference failed for: r2v6, types: [java.io.File] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00f7 -> B:60:0x00f8). Please report as a decompilation issue!!! */
            @Override // defpackage.tx2
            public final Object d() {
                String lowerCase;
                TelephonyManager telephonyManager;
                String simCountryIso;
                ResolveInfo resolveInfoResolveActivity;
                int i42 = i9;
                boolean z = false;
                ?? cacheDir = 0;
                cacheDir = 0;
                resolveInfo = null;
                ResolveInfo resolveInfo = null;
                App app = this.b;
                switch (i42) {
                    case 0:
                        Handler handler = App.M0;
                        return new xk6(app);
                    case 1:
                        Handler handler2 = App.M0;
                        return new w37(app);
                    case 2:
                        Handler handler3 = App.M0;
                        return (String) rtb.c(v82.a, new on(app, cacheDir, z ? 1 : 0));
                    case 3:
                        Handler handler4 = App.M0;
                        try {
                            Object systemService = app.getSystemService("phone");
                            systemService.getClass();
                            telephonyManager = (TelephonyManager) systemService;
                            simCountryIso = telephonyManager.getSimCountryIso();
                        } catch (Exception unused) {
                        }
                        if (simCountryIso == null || simCountryIso.length() != 2) {
                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                            if (networkCountryIso == null || networkCountryIso.length() != 2) {
                                lowerCase = null;
                            } else {
                                lowerCase = networkCountryIso.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            }
                        } else {
                            lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        }
                        if (lowerCase == null) {
                            return null;
                        }
                        String lowerCase2 = lowerCase.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        return lowerCase2;
                    case 4:
                        Handler handler5 = App.M0;
                        if (hm3.b(Environment.getExternalStorageState(), "mounted")) {
                            try {
                                cacheDir = app.getExternalCacheDir();
                            } catch (NullPointerException e) {
                                Handler handler6 = App.M0;
                                qp9.d(e);
                            }
                            break;
                        }
                        if (cacheDir == 0) {
                            cacheDir = app.getCacheDir();
                        }
                        return tv0.x(cacheDir.getAbsolutePath(), "/");
                    case 5:
                        Handler handler7 = App.M0;
                        return new h24(app);
                    case 6:
                        Handler handler8 = App.M0;
                        return new pq(app);
                    case 7:
                        Handler handler9 = App.M0;
                        return new yw2(app);
                    case 8:
                        Handler handler10 = App.M0;
                        return new qq0(app);
                    case 9:
                        Handler handler11 = App.M0;
                        return new m07(app, "SftpServers");
                    case 10:
                        Handler handler12 = App.M0;
                        return new b22(app);
                    case 11:
                        Handler handler13 = App.M0;
                        return new eo8(app, "WifiServers");
                    case 12:
                        Handler handler14 = App.M0;
                        return new qj2(app);
                    case 13:
                        Handler handler15 = App.M0;
                        return new du5(app);
                    default:
                        Handler handler16 = App.M0;
                        PackageManager packageManager = app.getPackageManager();
                        packageManager.getClass();
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                        try {
                            resolveInfoResolveActivity = Build.VERSION.SDK_INT >= 33 ? packageManager.resolveActivity(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.resolveActivity(intent, 0);
                            break;
                        } catch (Exception unused2) {
                            resolveInfoResolveActivity = null;
                        }
                        if (resolveInfoResolveActivity != null && !hm3.b(resolveInfoResolveActivity.activityInfo.name, "com.android.tv.frameworkpackagestubs.Stubs$DocumentsStub")) {
                            resolveInfo = resolveInfoResolveActivity;
                        }
                        return Boolean.valueOf(resolveInfo != null);
                }
            }
        });
        final int i10 = 10;
        this.u0 = jyc.b(n84Var, new tx2(this) { // from class: jn
            public final /* synthetic */ App b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [b81] */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v12 */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.io.File] */
            /* JADX WARN: Type inference failed for: r2v6, types: [java.io.File] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00f7 -> B:60:0x00f8). Please report as a decompilation issue!!! */
            @Override // defpackage.tx2
            public final Object d() {
                String lowerCase;
                TelephonyManager telephonyManager;
                String simCountryIso;
                ResolveInfo resolveInfoResolveActivity;
                int i42 = i10;
                boolean z = false;
                ?? cacheDir = 0;
                cacheDir = 0;
                resolveInfo = null;
                ResolveInfo resolveInfo = null;
                App app = this.b;
                switch (i42) {
                    case 0:
                        Handler handler = App.M0;
                        return new xk6(app);
                    case 1:
                        Handler handler2 = App.M0;
                        return new w37(app);
                    case 2:
                        Handler handler3 = App.M0;
                        return (String) rtb.c(v82.a, new on(app, cacheDir, z ? 1 : 0));
                    case 3:
                        Handler handler4 = App.M0;
                        try {
                            Object systemService = app.getSystemService("phone");
                            systemService.getClass();
                            telephonyManager = (TelephonyManager) systemService;
                            simCountryIso = telephonyManager.getSimCountryIso();
                        } catch (Exception unused) {
                        }
                        if (simCountryIso == null || simCountryIso.length() != 2) {
                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                            if (networkCountryIso == null || networkCountryIso.length() != 2) {
                                lowerCase = null;
                            } else {
                                lowerCase = networkCountryIso.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            }
                        } else {
                            lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        }
                        if (lowerCase == null) {
                            return null;
                        }
                        String lowerCase2 = lowerCase.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        return lowerCase2;
                    case 4:
                        Handler handler5 = App.M0;
                        if (hm3.b(Environment.getExternalStorageState(), "mounted")) {
                            try {
                                cacheDir = app.getExternalCacheDir();
                            } catch (NullPointerException e) {
                                Handler handler6 = App.M0;
                                qp9.d(e);
                            }
                            break;
                        }
                        if (cacheDir == 0) {
                            cacheDir = app.getCacheDir();
                        }
                        return tv0.x(cacheDir.getAbsolutePath(), "/");
                    case 5:
                        Handler handler7 = App.M0;
                        return new h24(app);
                    case 6:
                        Handler handler8 = App.M0;
                        return new pq(app);
                    case 7:
                        Handler handler9 = App.M0;
                        return new yw2(app);
                    case 8:
                        Handler handler10 = App.M0;
                        return new qq0(app);
                    case 9:
                        Handler handler11 = App.M0;
                        return new m07(app, "SftpServers");
                    case 10:
                        Handler handler12 = App.M0;
                        return new b22(app);
                    case 11:
                        Handler handler13 = App.M0;
                        return new eo8(app, "WifiServers");
                    case 12:
                        Handler handler14 = App.M0;
                        return new qj2(app);
                    case 13:
                        Handler handler15 = App.M0;
                        return new du5(app);
                    default:
                        Handler handler16 = App.M0;
                        PackageManager packageManager = app.getPackageManager();
                        packageManager.getClass();
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                        try {
                            resolveInfoResolveActivity = Build.VERSION.SDK_INT >= 33 ? packageManager.resolveActivity(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.resolveActivity(intent, 0);
                            break;
                        } catch (Exception unused2) {
                            resolveInfoResolveActivity = null;
                        }
                        if (resolveInfoResolveActivity != null && !hm3.b(resolveInfoResolveActivity.activityInfo.name, "com.android.tv.frameworkpackagestubs.Stubs$DocumentsStub")) {
                            resolveInfo = resolveInfoResolveActivity;
                        }
                        return Boolean.valueOf(resolveInfo != null);
                }
            }
        });
        final int i11 = 11;
        this.v0 = jyc.b(n84Var, new tx2(this) { // from class: jn
            public final /* synthetic */ App b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [b81] */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v12 */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.io.File] */
            /* JADX WARN: Type inference failed for: r2v6, types: [java.io.File] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00f7 -> B:60:0x00f8). Please report as a decompilation issue!!! */
            @Override // defpackage.tx2
            public final Object d() {
                String lowerCase;
                TelephonyManager telephonyManager;
                String simCountryIso;
                ResolveInfo resolveInfoResolveActivity;
                int i42 = i11;
                boolean z = false;
                ?? cacheDir = 0;
                cacheDir = 0;
                resolveInfo = null;
                ResolveInfo resolveInfo = null;
                App app = this.b;
                switch (i42) {
                    case 0:
                        Handler handler = App.M0;
                        return new xk6(app);
                    case 1:
                        Handler handler2 = App.M0;
                        return new w37(app);
                    case 2:
                        Handler handler3 = App.M0;
                        return (String) rtb.c(v82.a, new on(app, cacheDir, z ? 1 : 0));
                    case 3:
                        Handler handler4 = App.M0;
                        try {
                            Object systemService = app.getSystemService("phone");
                            systemService.getClass();
                            telephonyManager = (TelephonyManager) systemService;
                            simCountryIso = telephonyManager.getSimCountryIso();
                        } catch (Exception unused) {
                        }
                        if (simCountryIso == null || simCountryIso.length() != 2) {
                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                            if (networkCountryIso == null || networkCountryIso.length() != 2) {
                                lowerCase = null;
                            } else {
                                lowerCase = networkCountryIso.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            }
                        } else {
                            lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        }
                        if (lowerCase == null) {
                            return null;
                        }
                        String lowerCase2 = lowerCase.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        return lowerCase2;
                    case 4:
                        Handler handler5 = App.M0;
                        if (hm3.b(Environment.getExternalStorageState(), "mounted")) {
                            try {
                                cacheDir = app.getExternalCacheDir();
                            } catch (NullPointerException e) {
                                Handler handler6 = App.M0;
                                qp9.d(e);
                            }
                            break;
                        }
                        if (cacheDir == 0) {
                            cacheDir = app.getCacheDir();
                        }
                        return tv0.x(cacheDir.getAbsolutePath(), "/");
                    case 5:
                        Handler handler7 = App.M0;
                        return new h24(app);
                    case 6:
                        Handler handler8 = App.M0;
                        return new pq(app);
                    case 7:
                        Handler handler9 = App.M0;
                        return new yw2(app);
                    case 8:
                        Handler handler10 = App.M0;
                        return new qq0(app);
                    case 9:
                        Handler handler11 = App.M0;
                        return new m07(app, "SftpServers");
                    case 10:
                        Handler handler12 = App.M0;
                        return new b22(app);
                    case 11:
                        Handler handler13 = App.M0;
                        return new eo8(app, "WifiServers");
                    case 12:
                        Handler handler14 = App.M0;
                        return new qj2(app);
                    case 13:
                        Handler handler15 = App.M0;
                        return new du5(app);
                    default:
                        Handler handler16 = App.M0;
                        PackageManager packageManager = app.getPackageManager();
                        packageManager.getClass();
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                        try {
                            resolveInfoResolveActivity = Build.VERSION.SDK_INT >= 33 ? packageManager.resolveActivity(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.resolveActivity(intent, 0);
                            break;
                        } catch (Exception unused2) {
                            resolveInfoResolveActivity = null;
                        }
                        if (resolveInfoResolveActivity != null && !hm3.b(resolveInfoResolveActivity.activityInfo.name, "com.android.tv.frameworkpackagestubs.Stubs$DocumentsStub")) {
                            resolveInfo = resolveInfoResolveActivity;
                        }
                        return Boolean.valueOf(resolveInfo != null);
                }
            }
        });
        final int i12 = 12;
        this.x0 = jyc.b(n84Var, new tx2(this) { // from class: jn
            public final /* synthetic */ App b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [b81] */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v12 */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.io.File] */
            /* JADX WARN: Type inference failed for: r2v6, types: [java.io.File] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00f7 -> B:60:0x00f8). Please report as a decompilation issue!!! */
            @Override // defpackage.tx2
            public final Object d() {
                String lowerCase;
                TelephonyManager telephonyManager;
                String simCountryIso;
                ResolveInfo resolveInfoResolveActivity;
                int i42 = i12;
                boolean z = false;
                ?? cacheDir = 0;
                cacheDir = 0;
                resolveInfo = null;
                ResolveInfo resolveInfo = null;
                App app = this.b;
                switch (i42) {
                    case 0:
                        Handler handler = App.M0;
                        return new xk6(app);
                    case 1:
                        Handler handler2 = App.M0;
                        return new w37(app);
                    case 2:
                        Handler handler3 = App.M0;
                        return (String) rtb.c(v82.a, new on(app, cacheDir, z ? 1 : 0));
                    case 3:
                        Handler handler4 = App.M0;
                        try {
                            Object systemService = app.getSystemService("phone");
                            systemService.getClass();
                            telephonyManager = (TelephonyManager) systemService;
                            simCountryIso = telephonyManager.getSimCountryIso();
                        } catch (Exception unused) {
                        }
                        if (simCountryIso == null || simCountryIso.length() != 2) {
                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                            if (networkCountryIso == null || networkCountryIso.length() != 2) {
                                lowerCase = null;
                            } else {
                                lowerCase = networkCountryIso.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            }
                        } else {
                            lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        }
                        if (lowerCase == null) {
                            return null;
                        }
                        String lowerCase2 = lowerCase.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        return lowerCase2;
                    case 4:
                        Handler handler5 = App.M0;
                        if (hm3.b(Environment.getExternalStorageState(), "mounted")) {
                            try {
                                cacheDir = app.getExternalCacheDir();
                            } catch (NullPointerException e) {
                                Handler handler6 = App.M0;
                                qp9.d(e);
                            }
                            break;
                        }
                        if (cacheDir == 0) {
                            cacheDir = app.getCacheDir();
                        }
                        return tv0.x(cacheDir.getAbsolutePath(), "/");
                    case 5:
                        Handler handler7 = App.M0;
                        return new h24(app);
                    case 6:
                        Handler handler8 = App.M0;
                        return new pq(app);
                    case 7:
                        Handler handler9 = App.M0;
                        return new yw2(app);
                    case 8:
                        Handler handler10 = App.M0;
                        return new qq0(app);
                    case 9:
                        Handler handler11 = App.M0;
                        return new m07(app, "SftpServers");
                    case 10:
                        Handler handler12 = App.M0;
                        return new b22(app);
                    case 11:
                        Handler handler13 = App.M0;
                        return new eo8(app, "WifiServers");
                    case 12:
                        Handler handler14 = App.M0;
                        return new qj2(app);
                    case 13:
                        Handler handler15 = App.M0;
                        return new du5(app);
                    default:
                        Handler handler16 = App.M0;
                        PackageManager packageManager = app.getPackageManager();
                        packageManager.getClass();
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                        try {
                            resolveInfoResolveActivity = Build.VERSION.SDK_INT >= 33 ? packageManager.resolveActivity(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.resolveActivity(intent, 0);
                            break;
                        } catch (Exception unused2) {
                            resolveInfoResolveActivity = null;
                        }
                        if (resolveInfoResolveActivity != null && !hm3.b(resolveInfoResolveActivity.activityInfo.name, "com.android.tv.frameworkpackagestubs.Stubs$DocumentsStub")) {
                            resolveInfo = resolveInfoResolveActivity;
                        }
                        return Boolean.valueOf(resolveInfo != null);
                }
            }
        });
        final int i13 = 13;
        this.y0 = jyc.b(n84Var, new tx2(this) { // from class: jn
            public final /* synthetic */ App b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [b81] */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v12 */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.io.File] */
            /* JADX WARN: Type inference failed for: r2v6, types: [java.io.File] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00f7 -> B:60:0x00f8). Please report as a decompilation issue!!! */
            @Override // defpackage.tx2
            public final Object d() {
                String lowerCase;
                TelephonyManager telephonyManager;
                String simCountryIso;
                ResolveInfo resolveInfoResolveActivity;
                int i42 = i13;
                boolean z = false;
                ?? cacheDir = 0;
                cacheDir = 0;
                resolveInfo = null;
                ResolveInfo resolveInfo = null;
                App app = this.b;
                switch (i42) {
                    case 0:
                        Handler handler = App.M0;
                        return new xk6(app);
                    case 1:
                        Handler handler2 = App.M0;
                        return new w37(app);
                    case 2:
                        Handler handler3 = App.M0;
                        return (String) rtb.c(v82.a, new on(app, cacheDir, z ? 1 : 0));
                    case 3:
                        Handler handler4 = App.M0;
                        try {
                            Object systemService = app.getSystemService("phone");
                            systemService.getClass();
                            telephonyManager = (TelephonyManager) systemService;
                            simCountryIso = telephonyManager.getSimCountryIso();
                        } catch (Exception unused) {
                        }
                        if (simCountryIso == null || simCountryIso.length() != 2) {
                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                            if (networkCountryIso == null || networkCountryIso.length() != 2) {
                                lowerCase = null;
                            } else {
                                lowerCase = networkCountryIso.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            }
                        } else {
                            lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        }
                        if (lowerCase == null) {
                            return null;
                        }
                        String lowerCase2 = lowerCase.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        return lowerCase2;
                    case 4:
                        Handler handler5 = App.M0;
                        if (hm3.b(Environment.getExternalStorageState(), "mounted")) {
                            try {
                                cacheDir = app.getExternalCacheDir();
                            } catch (NullPointerException e) {
                                Handler handler6 = App.M0;
                                qp9.d(e);
                            }
                            break;
                        }
                        if (cacheDir == 0) {
                            cacheDir = app.getCacheDir();
                        }
                        return tv0.x(cacheDir.getAbsolutePath(), "/");
                    case 5:
                        Handler handler7 = App.M0;
                        return new h24(app);
                    case 6:
                        Handler handler8 = App.M0;
                        return new pq(app);
                    case 7:
                        Handler handler9 = App.M0;
                        return new yw2(app);
                    case 8:
                        Handler handler10 = App.M0;
                        return new qq0(app);
                    case 9:
                        Handler handler11 = App.M0;
                        return new m07(app, "SftpServers");
                    case 10:
                        Handler handler12 = App.M0;
                        return new b22(app);
                    case 11:
                        Handler handler13 = App.M0;
                        return new eo8(app, "WifiServers");
                    case 12:
                        Handler handler14 = App.M0;
                        return new qj2(app);
                    case 13:
                        Handler handler15 = App.M0;
                        return new du5(app);
                    default:
                        Handler handler16 = App.M0;
                        PackageManager packageManager = app.getPackageManager();
                        packageManager.getClass();
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                        try {
                            resolveInfoResolveActivity = Build.VERSION.SDK_INT >= 33 ? packageManager.resolveActivity(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.resolveActivity(intent, 0);
                            break;
                        } catch (Exception unused2) {
                            resolveInfoResolveActivity = null;
                        }
                        if (resolveInfoResolveActivity != null && !hm3.b(resolveInfoResolveActivity.activityInfo.name, "com.android.tv.frameworkpackagestubs.Stubs$DocumentsStub")) {
                            resolveInfo = resolveInfoResolveActivity;
                        }
                        return Boolean.valueOf(resolveInfo != null);
                }
            }
        });
        this.B0 = new LinkedHashSet();
        final int i14 = 14;
        this.E0 = new pp7(new tx2(this) { // from class: jn
            public final /* synthetic */ App b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [b81] */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v12 */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.io.File] */
            /* JADX WARN: Type inference failed for: r2v6, types: [java.io.File] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00f7 -> B:60:0x00f8). Please report as a decompilation issue!!! */
            @Override // defpackage.tx2
            public final Object d() {
                String lowerCase;
                TelephonyManager telephonyManager;
                String simCountryIso;
                ResolveInfo resolveInfoResolveActivity;
                int i42 = i14;
                boolean z = false;
                ?? cacheDir = 0;
                cacheDir = 0;
                resolveInfo = null;
                ResolveInfo resolveInfo = null;
                App app = this.b;
                switch (i42) {
                    case 0:
                        Handler handler = App.M0;
                        return new xk6(app);
                    case 1:
                        Handler handler2 = App.M0;
                        return new w37(app);
                    case 2:
                        Handler handler3 = App.M0;
                        return (String) rtb.c(v82.a, new on(app, cacheDir, z ? 1 : 0));
                    case 3:
                        Handler handler4 = App.M0;
                        try {
                            Object systemService = app.getSystemService("phone");
                            systemService.getClass();
                            telephonyManager = (TelephonyManager) systemService;
                            simCountryIso = telephonyManager.getSimCountryIso();
                        } catch (Exception unused) {
                        }
                        if (simCountryIso == null || simCountryIso.length() != 2) {
                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                            if (networkCountryIso == null || networkCountryIso.length() != 2) {
                                lowerCase = null;
                            } else {
                                lowerCase = networkCountryIso.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            }
                        } else {
                            lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        }
                        if (lowerCase == null) {
                            return null;
                        }
                        String lowerCase2 = lowerCase.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        return lowerCase2;
                    case 4:
                        Handler handler5 = App.M0;
                        if (hm3.b(Environment.getExternalStorageState(), "mounted")) {
                            try {
                                cacheDir = app.getExternalCacheDir();
                            } catch (NullPointerException e) {
                                Handler handler6 = App.M0;
                                qp9.d(e);
                            }
                            break;
                        }
                        if (cacheDir == 0) {
                            cacheDir = app.getCacheDir();
                        }
                        return tv0.x(cacheDir.getAbsolutePath(), "/");
                    case 5:
                        Handler handler7 = App.M0;
                        return new h24(app);
                    case 6:
                        Handler handler8 = App.M0;
                        return new pq(app);
                    case 7:
                        Handler handler9 = App.M0;
                        return new yw2(app);
                    case 8:
                        Handler handler10 = App.M0;
                        return new qq0(app);
                    case 9:
                        Handler handler11 = App.M0;
                        return new m07(app, "SftpServers");
                    case 10:
                        Handler handler12 = App.M0;
                        return new b22(app);
                    case 11:
                        Handler handler13 = App.M0;
                        return new eo8(app, "WifiServers");
                    case 12:
                        Handler handler14 = App.M0;
                        return new qj2(app);
                    case 13:
                        Handler handler15 = App.M0;
                        return new du5(app);
                    default:
                        Handler handler16 = App.M0;
                        PackageManager packageManager = app.getPackageManager();
                        packageManager.getClass();
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                        try {
                            resolveInfoResolveActivity = Build.VERSION.SDK_INT >= 33 ? packageManager.resolveActivity(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.resolveActivity(intent, 0);
                            break;
                        } catch (Exception unused2) {
                            resolveInfoResolveActivity = null;
                        }
                        if (resolveInfoResolveActivity != null && !hm3.b(resolveInfoResolveActivity.activityInfo.name, "com.android.tv.frameworkpackagestubs.Stubs$DocumentsStub")) {
                            resolveInfo = resolveInfoResolveActivity;
                        }
                        return Boolean.valueOf(resolveInfo != null);
                }
            }
        });
        this.G0 = new pp7(new tx2(this) { // from class: jn
            public final /* synthetic */ App b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [b81] */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v12 */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.io.File] */
            /* JADX WARN: Type inference failed for: r2v6, types: [java.io.File] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00f7 -> B:60:0x00f8). Please report as a decompilation issue!!! */
            @Override // defpackage.tx2
            public final Object d() {
                String lowerCase;
                TelephonyManager telephonyManager;
                String simCountryIso;
                ResolveInfo resolveInfoResolveActivity;
                int i42 = i;
                boolean z = false;
                ?? cacheDir = 0;
                cacheDir = 0;
                resolveInfo = null;
                ResolveInfo resolveInfo = null;
                App app = this.b;
                switch (i42) {
                    case 0:
                        Handler handler = App.M0;
                        return new xk6(app);
                    case 1:
                        Handler handler2 = App.M0;
                        return new w37(app);
                    case 2:
                        Handler handler3 = App.M0;
                        return (String) rtb.c(v82.a, new on(app, cacheDir, z ? 1 : 0));
                    case 3:
                        Handler handler4 = App.M0;
                        try {
                            Object systemService = app.getSystemService("phone");
                            systemService.getClass();
                            telephonyManager = (TelephonyManager) systemService;
                            simCountryIso = telephonyManager.getSimCountryIso();
                        } catch (Exception unused) {
                        }
                        if (simCountryIso == null || simCountryIso.length() != 2) {
                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                            if (networkCountryIso == null || networkCountryIso.length() != 2) {
                                lowerCase = null;
                            } else {
                                lowerCase = networkCountryIso.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            }
                        } else {
                            lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        }
                        if (lowerCase == null) {
                            return null;
                        }
                        String lowerCase2 = lowerCase.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        return lowerCase2;
                    case 4:
                        Handler handler5 = App.M0;
                        if (hm3.b(Environment.getExternalStorageState(), "mounted")) {
                            try {
                                cacheDir = app.getExternalCacheDir();
                            } catch (NullPointerException e) {
                                Handler handler6 = App.M0;
                                qp9.d(e);
                            }
                            break;
                        }
                        if (cacheDir == 0) {
                            cacheDir = app.getCacheDir();
                        }
                        return tv0.x(cacheDir.getAbsolutePath(), "/");
                    case 5:
                        Handler handler7 = App.M0;
                        return new h24(app);
                    case 6:
                        Handler handler8 = App.M0;
                        return new pq(app);
                    case 7:
                        Handler handler9 = App.M0;
                        return new yw2(app);
                    case 8:
                        Handler handler10 = App.M0;
                        return new qq0(app);
                    case 9:
                        Handler handler11 = App.M0;
                        return new m07(app, "SftpServers");
                    case 10:
                        Handler handler12 = App.M0;
                        return new b22(app);
                    case 11:
                        Handler handler13 = App.M0;
                        return new eo8(app, "WifiServers");
                    case 12:
                        Handler handler14 = App.M0;
                        return new qj2(app);
                    case 13:
                        Handler handler15 = App.M0;
                        return new du5(app);
                    default:
                        Handler handler16 = App.M0;
                        PackageManager packageManager = app.getPackageManager();
                        packageManager.getClass();
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                        try {
                            resolveInfoResolveActivity = Build.VERSION.SDK_INT >= 33 ? packageManager.resolveActivity(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.resolveActivity(intent, 0);
                            break;
                        } catch (Exception unused2) {
                            resolveInfoResolveActivity = null;
                        }
                        if (resolveInfoResolveActivity != null && !hm3.b(resolveInfoResolveActivity.activityInfo.name, "com.android.tv.frameworkpackagestubs.Stubs$DocumentsStub")) {
                            resolveInfo = resolveInfoResolveActivity;
                        }
                        return Boolean.valueOf(resolveInfo != null);
                }
            }
        });
        this.H0 = fwc.h("sa", "ae", "eg", "iq", "ir", "jo", "kw", EQvrnCmT.CDsRKledxxiDAtf, "ly", "om", "qa", "sy", "ye", "tr", "ng", "sd", OGxGQu.BVXXtKfEpxFT, "bd", "id", "my", "dz", "ma", "tn", "af", "az", "bh", "km", "dj", "er", "et", "gm", "gn", "ci", "jo", "kz", "kg", "ml", "mr", "ne", "ng");
        this.I0 = fwc.h("id", "ur", "bn", "ar", "fa", OGXZhi.bqKTQnvgeH, "ms", "uz", "az", "kk");
        final int i15 = 1;
        this.K0 = new pp7(new tx2(this) { // from class: jn
            public final /* synthetic */ App b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [b81] */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v12 */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.io.File] */
            /* JADX WARN: Type inference failed for: r2v6, types: [java.io.File] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00f7 -> B:60:0x00f8). Please report as a decompilation issue!!! */
            @Override // defpackage.tx2
            public final Object d() {
                String lowerCase;
                TelephonyManager telephonyManager;
                String simCountryIso;
                ResolveInfo resolveInfoResolveActivity;
                int i42 = i15;
                boolean z = false;
                ?? cacheDir = 0;
                cacheDir = 0;
                resolveInfo = null;
                ResolveInfo resolveInfo = null;
                App app = this.b;
                switch (i42) {
                    case 0:
                        Handler handler = App.M0;
                        return new xk6(app);
                    case 1:
                        Handler handler2 = App.M0;
                        return new w37(app);
                    case 2:
                        Handler handler3 = App.M0;
                        return (String) rtb.c(v82.a, new on(app, cacheDir, z ? 1 : 0));
                    case 3:
                        Handler handler4 = App.M0;
                        try {
                            Object systemService = app.getSystemService("phone");
                            systemService.getClass();
                            telephonyManager = (TelephonyManager) systemService;
                            simCountryIso = telephonyManager.getSimCountryIso();
                        } catch (Exception unused) {
                        }
                        if (simCountryIso == null || simCountryIso.length() != 2) {
                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                            if (networkCountryIso == null || networkCountryIso.length() != 2) {
                                lowerCase = null;
                            } else {
                                lowerCase = networkCountryIso.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            }
                        } else {
                            lowerCase = simCountryIso.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        }
                        if (lowerCase == null) {
                            return null;
                        }
                        String lowerCase2 = lowerCase.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        return lowerCase2;
                    case 4:
                        Handler handler5 = App.M0;
                        if (hm3.b(Environment.getExternalStorageState(), "mounted")) {
                            try {
                                cacheDir = app.getExternalCacheDir();
                            } catch (NullPointerException e) {
                                Handler handler6 = App.M0;
                                qp9.d(e);
                            }
                            break;
                        }
                        if (cacheDir == 0) {
                            cacheDir = app.getCacheDir();
                        }
                        return tv0.x(cacheDir.getAbsolutePath(), "/");
                    case 5:
                        Handler handler7 = App.M0;
                        return new h24(app);
                    case 6:
                        Handler handler8 = App.M0;
                        return new pq(app);
                    case 7:
                        Handler handler9 = App.M0;
                        return new yw2(app);
                    case 8:
                        Handler handler10 = App.M0;
                        return new qq0(app);
                    case 9:
                        Handler handler11 = App.M0;
                        return new m07(app, "SftpServers");
                    case 10:
                        Handler handler12 = App.M0;
                        return new b22(app);
                    case 11:
                        Handler handler13 = App.M0;
                        return new eo8(app, "WifiServers");
                    case 12:
                        Handler handler14 = App.M0;
                        return new qj2(app);
                    case 13:
                        Handler handler15 = App.M0;
                        return new du5(app);
                    default:
                        Handler handler16 = App.M0;
                        PackageManager packageManager = app.getPackageManager();
                        packageManager.getClass();
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                        try {
                            resolveInfoResolveActivity = Build.VERSION.SDK_INT >= 33 ? packageManager.resolveActivity(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.resolveActivity(intent, 0);
                            break;
                        } catch (Exception unused2) {
                            resolveInfoResolveActivity = null;
                        }
                        if (resolveInfoResolveActivity != null && !hm3.b(resolveInfoResolveActivity.activityInfo.name, "com.android.tv.frameworkpackagestubs.Stubs$DocumentsStub")) {
                            resolveInfo = resolveInfoResolveActivity;
                        }
                        return Boolean.valueOf(resolveInfo != null);
                }
            }
        });
        this.L0 = x2d.e(e56.L);
    }

    public final ak2 n() {
        ak2 ak2Var = this.V;
        if (ak2Var != null) {
            return ak2Var;
        }
        hm3.l(nfosBL.rkTlEeom);
        throw null;
    }

    public final void o(boolean z) {
        FirebaseMessaging firebaseMessaging;
        lod lodVarE;
        if (z) {
            this.J0 = null;
            l().o("preferences", "name", "firebase_token");
        }
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(kn2.c());
        }
        if (firebaseMessaging.d.K()) {
            lodVarE = uo4.e(new IllegalStateException(osBQGmRW.QKIcwtzLF));
        } else {
            ms7 ms7Var = new ms7();
            firebaseMessaging.g.execute(new xd(firebaseMessaging, 12, ms7Var));
            lodVarE = ms7Var.a;
        }
        lodVarE.b(new ba(1, this));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0681  */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    @Override // android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate() throws JSONException {
        char c;
        Object objG;
        int i;
        boolean z;
        Map mapA;
        es5 es5Var;
        Object next;
        t50 t50Var;
        File file;
        Object next2;
        Integer numX;
        Object next3;
        int i2;
        super.onCreate();
        Log.i("X-plore", "App start");
        ln2 ln2Var = (ln2) kn2.c().b(ln2.class);
        if (ln2Var == null) {
            e.f("FirebaseCrashlytics component is not present.");
            return;
        }
        ln2Var.a();
        Object value = this.c0.getValue();
        value.getClass();
        fc1 fc1Var = ln2Var.a;
        ((pd1) fc1Var.o.b).a(new xd(fc1Var, 8, (String) value));
        this.U = ln2Var;
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: ln
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                boolean z2 = th instanceof OutOfMemoryError;
                App app = this.a;
                if (z2) {
                    Handler handler = App.M0;
                    app.j0(app, "Out of memory", true);
                    return;
                }
                Handler handler2 = App.M0;
                if (th instanceof DeadSystemException) {
                    app.j0(app, th.getClass().getSimpleName(), true);
                    return;
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        });
        ArrayList arrayList = new ArrayList(50);
        if (this.b) {
            arrayList.add(vo4.f);
        }
        arrayList.add(l11.g);
        arrayList.add(gm2.f);
        arrayList.add(o83.f);
        arrayList.add(f90.f);
        arrayList.add(hc8.f);
        arrayList.add(ro7.f);
        arrayList.add(c02.f);
        arrayList.add(a67.f);
        arrayList.add(wg6.g);
        arrayList.add(m91.h);
        arrayList.add(wp0.f);
        arrayList.add(m91.j);
        arrayList.add(z91.g);
        arrayList.add(zs1.f);
        arrayList.add(jc5.g);
        arrayList.add(nz5.f);
        arrayList.add(tm8.f);
        arrayList.add(sx2.f);
        arrayList.add(c27.f);
        arrayList.add(qc5.g);
        arrayList.add(x73.f);
        arrayList.add(md7.f);
        arrayList.add(ym2.f);
        arrayList.add(py0.f);
        arrayList.add(iw3.f);
        arrayList.add(ye0.f);
        arrayList.add(di7.f);
        arrayList.add(j83.f);
        arrayList.add(dd2.f);
        arrayList.add(bf6.f);
        arrayList.add(e62.g);
        arrayList.add(e73.f);
        arrayList.add(ar5.g);
        arrayList.add(wq5.g);
        this.f0 = arrayList.size();
        arrayList.add(y1.f);
        arrayList.add(wo4.f);
        arrayList.add(ij5.g);
        arrayList.add(t24.g);
        arrayList.add(y57.g);
        arrayList.add(z57.g);
        arrayList.add(j73.g);
        arrayList.add(in.g);
        arrayList.add(bn.g);
        arrayList.add(x87.f);
        arrayList.add(gu7.g);
        arrayList.add(k37.g);
        arrayList.add(jg2.g);
        arrayList.add(y73.g);
        arrayList.add(cx5.g);
        arrayList.add(n23.f);
        arrayList.add(m23.f);
        arrayList.add(ia8.f);
        arrayList.add(d27.f);
        arrayList.trimToSize();
        this.e0 = arrayList;
        String str = CKwXgHrxgKQXKh.NGUlFuqDtGeBmd;
        ml mlVar = new ml();
        mlVar.b = this;
        mlVar.c = new ArrayList();
        mlVar.n();
        il1 il1VarL = l();
        String[] strArr = il1.d;
        String strG = il1VarL.g("buttonBindings", null);
        char c2 = '=';
        char c3 = ',';
        int i3 = 0;
        if (strG != null) {
            List<String> listX = jj7.X(strG, new char[]{','}, 0, 6);
            ArrayList arrayList2 = new ArrayList(((ArrayList) mlVar.c).size());
            boolean[] zArr = new boolean[this.f0];
            boolean z2 = false;
            for (String str2 : listX) {
                int iK = jj7.K(str2, c2, 0, 6);
                char c4 = c3;
                if (iK != -1) {
                    String strI0 = jj7.i0(iK, str2);
                    boolean zEquals = str2.substring(iK + 1).equals("1");
                    Iterator it = ((ArrayList) mlVar.c).iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        } else {
                            if (((rk5) it.next()).c.equals(strI0)) {
                                i2 = i4;
                                break;
                            }
                            i4++;
                        }
                    }
                    if (i2 == -1) {
                        Log.i(str, "Button op not found: ".concat(strI0));
                        z2 = true;
                    } else if (zArr[i2]) {
                        Log.i(str, "Button op already used: ".concat(strI0));
                    } else {
                        rk5 rk5Var = (rk5) ((ArrayList) mlVar.c).get(i2);
                        rk5Var.d = zEquals;
                        zArr[i2] = true;
                        arrayList2.add(rk5Var);
                    }
                }
                c3 = c4;
                c2 = '=';
                z2 = z2;
            }
            c = c3;
            int i5 = 0;
            for (Object obj : (ArrayList) mlVar.c) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    fwc.m();
                    throw null;
                }
                rk5 rk5Var2 = (rk5) obj;
                if (!zArr[i5]) {
                    if (hm3.b(rk5Var2, c02.f) || hm3.b(rk5Var2, vo4.f)) {
                        arrayList2.add(0, rk5Var2);
                    } else {
                        arrayList2.add(rk5Var2);
                    }
                }
                i5 = i6;
            }
            mlVar.c = arrayList2;
            mlVar.a = false;
            if (z2) {
                mlVar.l();
            }
        } else {
            c = ',';
        }
        String strG2 = ((App) mlVar.b).l().g("toolbarButtons", null);
        if (strG2 != null) {
            List<String> listX2 = jj7.X(strG2, new char[]{c}, 0, 6);
            objG = new ArrayList();
            for (String str3 : listX2) {
                Iterator it2 = ((App) mlVar.b).D().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next3 = it2.next();
                        if (((rk5) next3).c.equals(str3)) {
                            break;
                        }
                    } else {
                        next3 = null;
                        break;
                    }
                }
                rk5 rk5Var3 = (rk5) next3;
                if (rk5Var3 != null) {
                    objG.add(rk5Var3);
                }
            }
        } else {
            objG = fwc.g(ro7.f);
        }
        mlVar.d = objG;
        this.g0 = mlVar;
        try {
            this.h0 = FirebaseAnalytics.getInstance(this);
        } catch (Exception e) {
            qp9.d(e);
        }
        b81 b81Var = null;
        boolean z3 = false;
        this.J0 = l().g("firebase_token", null);
        o(false);
        co2 co2VarA = ((gg6) kn2.c().b(gg6.class)).a();
        co2VarA.getClass();
        W(co2VarA, this);
        ey0 ey0Var = co2VarA.e;
        long j = ((ky0) ey0Var.J).a.getLong("minimum_fetch_interval_in_seconds", 43200L);
        HashMap map = new HashMap((Map) ey0Var.K);
        map.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        int i7 = 2;
        ((yx0) ey0Var.e).b().h((Executor) ey0Var.c, new by0(ey0Var, j, map)).m(nn2.a, new un2(i7)).m(co2VarA.b, new bo2(co2VarA)).b(new mn(co2VarA, i3, this));
        rn rnVar = new rn(co2VarA, this);
        mjb mjbVar = co2VarA.g;
        synchronized (mjbVar) {
            ((LinkedHashSet) mjbVar.b).add(rnVar);
            mjbVar.c();
        }
        bf5 bf5Var = new bf5(this);
        es5 es5Var2 = new es5("copy", Integer.valueOf(R.string.copy));
        es5 es5Var3 = new es5("delete", Integer.valueOf(R.string.delete));
        es5 es5Var4 = new es5("WiFi", Integer.valueOf(R.string.wifi_sharing));
        String str4 = SFLvitRFwnxtcs.bxwWNCNNTX;
        es5[] es5VarArr = {es5Var2, es5Var3, es5Var4, new es5(str4, Integer.valueOf(R.string.ftp_server)), new es5("music", Integer.valueOf(R.string.music)), new es5("sync", Integer.valueOf(R.string.file_sync)), new es5("server_message", Integer.valueOf(R.string.app_system))};
        int i8 = 0;
        while (true) {
            i = 1;
            if (i8 >= 7) {
                break;
            }
            es5 es5Var5 = es5VarArr[i8];
            String str5 = (String) es5Var5.a;
            NotificationChannel notificationChannel = new NotificationChannel(str5, getString(((Number) es5Var5.b).intValue()), 2);
            if (hm3.b(str5, "WiFi") || hm3.b(str5, str4)) {
                notificationChannel.enableLights(true);
            }
            bf5Var.b.createNotificationChannel(notificationChannel);
            i8++;
        }
        this.e = new b10(this);
        q15.e = this;
        AccountManager accountManager = AccountManager.get(this);
        accountManager.getClass();
        q15.I = accountManager;
        Uri uri = Uri.parse("https://xplore.lonelycatgames.com");
        uri.getClass();
        Uri uriBuild = uri.buildUpon().path("api").build();
        uriBuild.getClass();
        q15.c = uriBuild;
        Uri uri2 = Uri.parse("https://xplore.lonelycatgames.com");
        uri2.getClass();
        if (hm3.b(uri2.toString(), "https://xplore.lonelycatgames.com")) {
            uri2 = Uri.parse("https://xplore.lonelycatgames.com:8081");
            uri2.getClass();
        }
        Uri uriBuild2 = uri2.buildUpon().path("api").build();
        uriBuild2.getClass();
        q15.d = uriBuild2;
        int i9 = z5.c;
        AccountManager accountManager2 = q15.I;
        if (accountManager2 == null) {
            hm3.l("am");
            throw null;
        }
        Account accountE = z90.e(accountManager2);
        if (accountE != null) {
            AccountManager accountManager3 = q15.I;
            if (accountManager3 == null) {
                hm3.l("am");
                throw null;
            }
            String strPeekAuthToken = accountManager3.peekAuthToken(accountE, "");
            if (strPeekAuthToken != null) {
                String userData = accountManager3.getUserData(accountE, "regType");
                q15.J = new ym(strPeekAuthToken, (userData == null || (numX = qj7.x(userData)) == null) ? 0 : numX.intValue());
            }
        }
        d60 d60Var = d60.a;
        d60.b = this;
        d60.c = new File(getFilesDir(), se8.v(4, "hmgajwa[`epe"));
        try {
            t50Var = t50.a;
            file = d60.c;
        } catch (FileNotFoundException unused) {
        } catch (Exception unused2) {
            z = false;
        }
        if (file == null) {
            hm3.l("licenseFile");
            throw null;
        }
        byte[] bArrJ = yl2.j(file);
        App app = d60.b;
        if (app == null) {
            hm3.l("app");
            throw null;
        }
        Object value2 = app.c0.getValue();
        value2.getClass();
        String strB = t50Var.b("Billing-".concat((String) value2), bArrJ);
        if (strB != null) {
            jq3 jq3Var = se8.b;
            k85 k85Var = jq3Var.b;
            a60 a60Var = (a60) jq3Var.b(a60.Companion.serializer(), strB);
            Map map2 = a60Var.a;
            if (map2 != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    String str6 = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    Iterator it3 = p57.b.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (((v47) next2).a.equals(str6)) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    v47 v47Var = (v47) next2;
                    if (v47Var == null) {
                        throw new IllegalStateException(("Unknown shop: " + str6).toString());
                    }
                    list.getClass();
                    v47Var.e = list;
                }
            }
            Map map3 = a60Var.b;
            if (map3 != null) {
                z = false;
                for (Map.Entry entry2 : map3.entrySet()) {
                    try {
                        zr5 zr5Var = (zr5) entry2.getKey();
                        long jLongValue = ((Number) entry2.getValue()).longValue();
                        if (zr5Var.c(jLongValue)) {
                            d60.j.put(zr5Var, Long.valueOf(jLongValue));
                        } else {
                            z = true;
                        }
                    } catch (FileNotFoundException unused3) {
                    } catch (Exception unused4) {
                        File file2 = d60.c;
                        if (file2 == null) {
                            hm3.l("licenseFile");
                            throw null;
                        }
                        file2.delete();
                    }
                }
            } else {
                z = false;
            }
        }
        d60.j(d60.d());
        Iterator it4 = p57.b.iterator();
        while (it4.hasNext()) {
            ((v47) it4.next()).e(this);
        }
        if (z) {
            d60.i();
        }
        Locale locale = getResources().getConfiguration().locale;
        locale.getClass();
        this.X = locale;
        Resources resources = getResources();
        resources.getClass();
        a(resources, false);
        ew3 ew3Var = new ew3(i3);
        il1 il1VarL2 = l();
        String[] strArr2 = il1.d;
        String strG3 = il1VarL2.g("keyBindings", null);
        ew3Var.b = true;
        if (strG3 != null) {
            ew3Var.b = false;
            int i10 = 6;
            List<String> listX3 = jj7.X(strG3, new char[]{c}, 0, 6);
            ArrayList<es5> arrayList3 = new ArrayList();
            for (String str7 : listX3) {
                int iK2 = jj7.K(str7, '=', 0, i10);
                if (iK2 != -1) {
                    int i11 = Integer.parseInt(jj7.i0(iK2, str7));
                    String strSubstring = str7.substring(iK2 + 1);
                    Iterator it5 = D().iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            next = it5.next();
                            if (((rk5) next).c.equals(strSubstring)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    rk5 rk5Var4 = (rk5) next;
                    es5Var = rk5Var4 != null ? new es5(Integer.valueOf(i11), rk5Var4) : null;
                }
                if (es5Var != null) {
                    arrayList3.add(es5Var);
                }
                i10 = 6;
            }
            int iH = uo4.h(yr0.o(arrayList3, 10));
            if (iH < 16) {
                iH = 16;
            }
            mapA = new LinkedHashMap(iH);
            for (es5 es5Var6 : arrayList3) {
                mapA.put(es5Var6.a, es5Var6.b);
            }
        } else {
            mapA = yv3.a(this);
        }
        ew3Var.c = mapA;
        this.S = ew3Var;
        la laVar = la.a;
        la.a(this);
        bd8 bd8Var = bd8.a;
        if (Build.VERSION.SDK_INT >= 30) {
            kp7 kp7Var = new kp7(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
            gh1.j(this, kp7Var, intentFilter, null, 4);
        }
        zcd.c(this);
        w73 w73Var = w73.a;
        if (l().g("HiddenFiles", null) != null) {
            w73.c(this, "HiddenFiles", w73.b, new m0(1, w73Var, w73.class, "saveHiddenFiles", "saveHiddenFiles(Lcom/lonelycatgames/Xplore/App;)V", 0, 13));
        }
        w73.c(this, "HiddenVolumes", w73.c, new m0(1, w73Var, w73.class, "saveHiddenVolumes", "saveHiddenVolumes(Lcom/lonelycatgames/Xplore/App;)V", 0, 14));
        dd5.f.getClass();
        File databasePath = getDatabasePath("news.db");
        databasePath.getClass();
        dd5.j = databasePath;
        try {
            dd5.A();
            File file3 = dd5.j;
            if (file3 == null) {
                hm3.l("dbFullName");
                throw null;
            }
            if (file3.exists()) {
                SQLiteDatabase writableDatabase = new xc5(this, "news.db", z3 ? 1 : 0, i, 0).getWritableDatabase();
                try {
                    Cursor cursorQuery = writableDatabase.query("hiddenNews", null, null, null, null, null, null);
                    try {
                        if (cursorQuery.moveToFirst()) {
                            ArrayList arrayList4 = new ArrayList();
                            do {
                                String string = cursorQuery.getString(0);
                                if (dd5.h.remove(string)) {
                                    dd5.f.getClass();
                                    dd5.i.setValue(Boolean.TRUE);
                                } else {
                                    arrayList4.add(string);
                                }
                            } while (cursorQuery.moveToNext());
                            Iterator it6 = arrayList4.iterator();
                            it6.getClass();
                            while (it6.hasNext()) {
                                Object next4 = it6.next();
                                next4.getClass();
                                String str8 = (String) next4;
                                writableDatabase.delete("hiddenNews", "news_id=?", new String[]{str8});
                                Log.i("X-plore", "Deleting obsolete news id " + str8);
                            }
                        }
                        cursorQuery.close();
                        writableDatabase.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            psc.d(cursorQuery, th);
                            throw th2;
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e2) {
            qp9.d(e2);
            File file4 = dd5.j;
            if (file4 == null) {
                hm3.l("dbFullName");
                throw null;
            }
            file4.delete();
        }
        if (!B().contains("scc")) {
            a0(false);
        }
        registerActivityLifecycleCallbacks(new qn(i3, this));
        kab.d(this.L0, null, null, new on(this, b81Var, i7), 3);
        ShortcutManager shortcutManager = (ShortcutManager) getSystemService(ShortcutManager.class);
        this.T = shortcutManager;
        kn knVar = new kn(this, i7);
        if (shortcutManager != null) {
            try {
                knVar.a(shortcutManager);
            } catch (Exception e3) {
                qp9.d(e3);
            }
        }
        kn knVar2 = new kn(this, i3);
        ShortcutManager shortcutManager2 = this.T;
        if (shortcutManager2 != null) {
            try {
                knVar2.a(shortcutManager2);
            } catch (Exception e4) {
                qp9.d(e4);
            }
        }
        kn knVar3 = new kn(this, 1);
        ShortcutManager shortcutManager3 = this.T;
        if (shortcutManager3 != null) {
            try {
                knVar3.a(shortcutManager3);
            } catch (Exception e5) {
                qp9.d(e5);
            }
        }
        c0();
        this.V = new ak2(this);
        R();
        r0("Start", "item_name", this.N ? "online" : ZBitir.lBgMexqExDgYXiS);
    }

    public final bj3 y() {
        bj3 bj3Var = this.W;
        if (bj3Var != null) {
            return bj3Var;
        }
        hm3.l(RJRxBMfzzSpiPT.RowH);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(hx6 hx6Var, lx1 lx1Var) {
        String str;
        hx6Var.getClass();
        Log.i("X-plore", bEPuzF.RQQTpnpzAWBlN + hx6Var + ", notification: " + lx1Var);
        int iOrdinal = hx6Var.a.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                j30 j30Var = this.Y;
                if (j30Var != null) {
                    if (lx1Var != null) {
                        j30Var.w().f0(hx6Var, lx1Var);
                        return;
                    } else {
                        hx6Var.toString();
                        return;
                    }
                }
                if (lx1Var != null) {
                    f0(hx6Var, lx1Var);
                    return;
                }
                return;
            }
            qq3 qq3Var = hx6Var.b;
            if (qq3Var != null) {
                jq3 jq3Var = se8.b;
                k85 k85Var = jq3Var.b;
                gx6 gx6Var = (gx6) jq3Var.a(gx6.Companion.serializer(), qq3Var);
                if (gx6Var != null) {
                    str = gx6Var.a;
                } else {
                    str = null;
                }
            }
            Log.i("X-plore", "Order created: " + str);
            d60.g.h((2 & 1) == 0, null);
            return;
        }
        Log.i("X-plore", "Syncing purchases");
        Iterator it = p57.b.iterator();
        while (it.hasNext()) {
            ((v47) it.next()).h((2 & 1) == 0, null);
        }
    }
}
