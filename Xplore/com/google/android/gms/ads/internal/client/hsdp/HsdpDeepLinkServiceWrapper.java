package com.google.android.gms.ads.internal.client.hsdp;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.material.sidesheet.CaOA.XMpxi;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory;
import defpackage.d1b;
import defpackage.fjd;
import defpackage.jcd;
import defpackage.jt4;
import defpackage.k4d;
import defpackage.kq9;
import defpackage.ly9;
import defpackage.maa;
import defpackage.naa;
import defpackage.nc3;
import defpackage.nqb;
import defpackage.q93;
import defpackage.q99;
import defpackage.rg5;
import defpackage.tb3;
import defpackage.toa;
import defpackage.uj9;
import defpackage.vx8;
import defpackage.wb3;
import defpackage.yb3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public class HsdpDeepLinkServiceWrapper extends tb3 {
    public naa a;
    public naa b;
    public q93 c;

    public HsdpDeepLinkServiceWrapper() {
        super("com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper");
    }

    public final void L5(Context context, Throwable th, String str) {
        if (context == null) {
            d1b.g("Context is null, unable to report exception for method: ".concat(str), th);
            return;
        }
        if (((Boolean) kq9.e.c.a(ly9.te)).booleanValue()) {
            naa naaVarK = this.b;
            if (naaVarK == null) {
                naaVarK = maa.k(context);
                this.b = naaVarK;
            }
            naaVarK.b("HsdpDeepLinkServiceWrapperUnsampled.".concat(str), th);
            return;
        }
        naa naaVarI = this.a;
        if (naaVarI == null) {
            naaVarI = maa.i(context);
            this.a = naaVarI;
        }
        naaVarI.b("HsdpDeepLinkServiceWrapper.".concat(str), th);
    }

    @Override // defpackage.ub3
    public void endSession(nc3 nc3Var, String str) {
        Throwable th;
        Context context;
        try {
            context = (Context) rg5.Y1(nc3Var);
            if (context != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    q93 q93VarCreate = this.c;
                    if (q93VarCreate == null) {
                        q93VarCreate = HsdpDeepLinkServiceFactory.create(context);
                        this.c = q93VarCreate;
                    }
                    ((jt4) q93VarCreate).a(str);
                } catch (Throwable th2) {
                    th = th2;
                    L5(context, th, "endSession");
                }
            }
        } catch (Throwable th3) {
            th = th3;
            context = null;
        }
    }

    @Override // defpackage.ub3
    public void prewarm(nc3 nc3Var, List<Bundle> list, wb3 wb3Var) {
        Throwable th;
        Context context = null;
        try {
            Context context2 = (Context) rg5.Y1(nc3Var);
            if (context2 == null) {
                return;
            }
            try {
                q93 q93VarCreate = this.c;
                if (q93VarCreate == null) {
                    q93VarCreate = HsdpDeepLinkServiceFactory.create(context2);
                    this.c = q93VarCreate;
                }
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    for (Bundle bundle : list) {
                        String string = bundle.getString("targetPackage");
                        if (!TextUtils.isEmpty(string)) {
                            IBinder binder = bundle.getBinder("window_token");
                            String string2 = bundle.getString("referrer");
                            HashMap mapH = jcd.h(bundle.getBundle("extra_query_params"));
                            if (Collections.EMPTY_MAP == null) {
                                throw new NullPointerException("Null extraQueryParams");
                            }
                            if (string == null) {
                                throw new NullPointerException("Null targetAppPackageName");
                            }
                            if (string2 == null) {
                                string2 = null;
                            }
                            if (binder == null) {
                                binder = null;
                            }
                            if (string2 == null) {
                                StringBuilder sb = new StringBuilder();
                                if (string2 == null) {
                                    sb.append(" referrer");
                                }
                                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                            }
                            arrayList.add(new toa(string, string2, mapH, binder));
                        }
                    }
                }
                vx8 vx8Var = new vx8(this, wb3Var);
                q99 q99Var = (q99) ((fjd) ((nqb) ((jt4) q93VarCreate).f).zza());
                q99Var.getClass();
                q99Var.b.l(new k4d(12, q99Var, arrayList, vx8Var));
            } catch (Throwable th2) {
                th = th2;
                context = context2;
                L5(context, th, "prewarm");
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.ub3
    public void open(nc3 nc3Var, String str, String str2, Bundle bundle, boolean z, yb3 yb3Var) {
        Throwable th;
        Context context;
        try {
            context = (Context) rg5.Y1(nc3Var);
            if (context != null) {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        q93 q93VarCreate = this.c;
                        if (q93VarCreate == null) {
                            q93VarCreate = HsdpDeepLinkServiceFactory.create(context);
                            this.c = q93VarCreate;
                        }
                        HashMap mapH = jcd.h(bundle);
                        if (str2 == null) {
                            str2 = "";
                        }
                        ((jt4) q93VarCreate).b(str, str2, new uj9(this, 1, yb3Var), mapH, z);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    L5(context, th, XMpxi.cEeZVDpmMb);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            context = null;
        }
    }
}
