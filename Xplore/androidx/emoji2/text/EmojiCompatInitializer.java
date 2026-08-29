package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.di3;
import defpackage.mu;
import defpackage.ne4;
import defpackage.qe4;
import defpackage.qt2;
import defpackage.u72;
import defpackage.v72;
import defpackage.x72;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements di3 {
    @Override // defpackage.di3
    public final Object create(Context context) {
        Object objJ;
        qt2 qt2Var = new qt2(new x72(context));
        qt2Var.a = 1;
        if (u72.k == null) {
            synchronized (u72.j) {
                try {
                    if (u72.k == null) {
                        u72.k = new u72(qt2Var);
                    }
                } finally {
                }
            }
        }
        mu muVarU = mu.u(context);
        muVarU.getClass();
        synchronized (mu.I) {
            try {
                objJ = ((HashMap) muVarU.b).get(ProcessLifecycleInitializer.class);
                if (objJ == null) {
                    objJ = muVarU.j(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        qe4 qe4VarH = ((ne4) objJ).h();
        qe4VarH.a(new v72(this, qe4VarH));
        return Boolean.TRUE;
    }

    @Override // defpackage.di3
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
