package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.kz4;
import defpackage.mjb;
import defpackage.qy4;
import defpackage.ry4;
import defpackage.vy4;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements qy4, kz4, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};
    public ry4 a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        mjb mjbVarS = mjb.s(context, attributeSet, b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) mjbVarS.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(mjbVarS.o(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(mjbVarS.o(1));
        }
        mjbVarS.t();
    }

    @Override // defpackage.qy4
    public final boolean a(vy4 vy4Var) {
        return this.a.q(vy4Var, null, 0);
    }

    @Override // defpackage.kz4
    public final void b(ry4 ry4Var) {
        this.a = ry4Var;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((vy4) getAdapter().getItem(i));
    }
}
