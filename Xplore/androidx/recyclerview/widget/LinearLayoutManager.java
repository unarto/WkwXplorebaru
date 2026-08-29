package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.e;
import defpackage.il5;
import defpackage.svb;
import defpackage.ve5;
import defpackage.zc6;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends svb {
    public boolean I = false;
    public final int c;
    public final il5 d;
    public final boolean e;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.c = 1;
        this.e = false;
        zc6 zc6VarC = svb.c(context, attributeSet, i, i2);
        int i3 = zc6VarC.a;
        if (i3 != 0 && i3 != 1) {
            e.k(ve5.j(i3, "invalid orientation:"));
            throw null;
        }
        if (i3 != this.c || this.d == null) {
            this.d = il5.f(this, i3);
            this.c = i3;
        }
        boolean z = zc6VarC.c;
        if (z != this.e) {
            this.e = z;
        }
        e(zc6VarC.d);
    }

    public void e(boolean z) {
        if (this.I == z) {
            return;
        }
        this.I = z;
    }
}
