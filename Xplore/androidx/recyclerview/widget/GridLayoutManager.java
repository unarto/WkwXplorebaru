package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import defpackage.e;
import defpackage.ew4;
import defpackage.svb;
import defpackage.ve5;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public final int J;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.J = -1;
        new SparseIntArray();
        new SparseIntArray();
        SparseIntArray sparseIntArray = new SparseIntArray();
        new SparseIntArray();
        new Rect();
        int i3 = svb.c(context, attributeSet, i, i2).b;
        if (i3 == this.J) {
            return;
        }
        if (i3 < 1) {
            e.k(ve5.j(i3, "Span count should be at least 1. Provided "));
            throw null;
        }
        this.J = i3;
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void e(boolean z) {
        if (z) {
            ew4.g("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.e(false);
        }
    }
}
