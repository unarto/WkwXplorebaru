package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ca6;
import defpackage.du0;
import defpackage.en2;
import defpackage.eu0;
import defpackage.gg6;
import defpackage.go2;
import defpackage.ho1;
import defpackage.kn2;
import defpackage.n80;
import defpackage.ou0;
import defpackage.pb;
import defpackage.sn2;
import defpackage.v2d;
import defpackage.v5;
import defpackage.vt1;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static gg6 lambda$getComponents$0(ca6 ca6Var, ou0 ou0Var) {
        en2 en2Var;
        Context context = (Context) ou0Var.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ou0Var.t(ca6Var);
        kn2 kn2Var = (kn2) ou0Var.a(kn2.class);
        sn2 sn2Var = (sn2) ou0Var.a(sn2.class);
        v5 v5Var = (v5) ou0Var.a(v5.class);
        synchronized (v5Var) {
            try {
                if (!v5Var.a.containsKey("frc")) {
                    v5Var.a.put("frc", new en2(v5Var.b));
                }
                en2Var = (en2) v5Var.a.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new gg6(context, scheduledExecutorService, kn2Var, sn2Var, en2Var, ou0Var.f(pb.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<eu0> getComponents() {
        ca6 ca6Var = new ca6(n80.class, ScheduledExecutorService.class);
        du0 du0Var = new du0(gg6.class, go2.class);
        du0Var.a = LIBRARY_NAME;
        du0Var.a(vt1.b(Context.class));
        du0Var.a(new vt1(ca6Var, 1, 0));
        du0Var.a(vt1.b(kn2.class));
        du0Var.a(vt1.b(sn2.class));
        du0Var.a(vt1.b(v5.class));
        du0Var.a(new vt1(0, 1, pb.class));
        du0Var.J = new ho1(ca6Var, 2);
        du0Var.c(2);
        return Arrays.asList(du0Var.b(), v2d.a(LIBRARY_NAME, "23.1.0"));
    }
}
