package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.du0;
import defpackage.eu0;
import defpackage.id5;
import defpackage.idb;
import defpackage.iz1;
import defpackage.kn2;
import defpackage.nd5;
import defpackage.ou0;
import defpackage.pb;
import defpackage.pk7;
import defpackage.q7a;
import defpackage.qb;
import defpackage.v2d;
import defpackage.vb2;
import defpackage.vt1;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static pb lambda$getComponents$0(ou0 ou0Var) {
        kn2 kn2Var = (kn2) ou0Var.a(kn2.class);
        Context context = (Context) ou0Var.a(Context.class);
        pk7 pk7Var = (pk7) ou0Var.a(pk7.class);
        q7a.i(kn2Var);
        q7a.i(context);
        q7a.i(pk7Var);
        q7a.i(context.getApplicationContext());
        if (qb.c == null) {
            synchronized (qb.class) {
                try {
                    if (qb.c == null) {
                        Bundle bundle = new Bundle(1);
                        kn2Var.a();
                        if ("[DEFAULT]".equals(kn2Var.b)) {
                            ((vb2) pk7Var).a(iz1.e, id5.b);
                            bundle.putBoolean("dataCollectionDefaultEnabled", kn2Var.h());
                        }
                        qb.c = new qb(idb.e(context, bundle).b);
                    }
                } finally {
                }
            }
        }
        return qb.c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<eu0> getComponents() {
        du0 du0VarB = eu0.b(pb.class);
        du0VarB.a(vt1.b(kn2.class));
        du0VarB.a(vt1.b(Context.class));
        du0VarB.a(vt1.b(pk7.class));
        du0VarB.J = nd5.c;
        du0VarB.c(2);
        return Arrays.asList(du0VarB.b(), v2d.a("fire-analytics", "23.2.0"));
    }
}
