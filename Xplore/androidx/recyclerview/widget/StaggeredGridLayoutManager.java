package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import defpackage.bj5;
import defpackage.e;
import defpackage.il5;
import defpackage.svb;
import defpackage.zc6;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends svb {
    public final il5 I;
    public final int J;
    public final int c;
    public final bj5[] d;
    public final il5 e;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.c = -1;
        new Rect();
        zc6 zc6VarC = svb.c(context, attributeSet, i, i2);
        int i3 = zc6VarC.a;
        if (i3 != 0 && i3 != 1) {
            e.k("invalid orientation.");
            throw null;
        }
        if (i3 != this.J) {
            this.J = i3;
            il5 il5Var = this.e;
            this.e = this.I;
            this.I = il5Var;
        }
        int i4 = zc6VarC.b;
        if (i4 != this.c) {
            this.c = i4;
            new BitSet(this.c);
            this.d = new bj5[this.c];
            for (int i5 = 0; i5 < this.c; i5++) {
                bj5[] bj5VarArr = this.d;
                bj5 bj5Var = new bj5(4);
                new ArrayList();
                bj5VarArr[i5] = bj5Var;
            }
        }
        this.e = il5.f(this, this.J);
        this.I = il5.f(this, 1 - this.J);
    }
}
