package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.lonelycatgames.Xplore.R;
import defpackage.b17;
import defpackage.fr9;
import defpackage.n7d;
import defpackage.oa6;
import defpackage.p72;
import defpackage.xp4;
import defpackage.yzc;
import defpackage.zp4;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends yzc {
    public final zp4 h;
    public final ColorStateList i;
    public final b17 j;
    public int k;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        new fr9(this);
        this.k = 5;
        new LinkedHashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oa6.p);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.i = n7d.a(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.j = b17.e(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            typedArrayObtainStyledAttributes.getResourceId(5, -1);
        }
        b17 b17Var = this.j;
        if (b17Var != null) {
            zp4 zp4Var = new zp4(b17Var);
            this.h = zp4Var;
            zp4Var.b.b = new p72(context);
            zp4Var.o();
            ColorStateList colorStateList = this.i;
            if (colorStateList != null) {
                zp4 zp4Var2 = this.h;
                xp4 xp4Var = zp4Var2.b;
                if (xp4Var.c != colorStateList) {
                    xp4Var.c = colorStateList;
                    zp4Var2.onStateChange(zp4Var2.getState());
                }
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.h.setTint(typedValue.data);
            }
        }
        typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public SideSheetBehavior() {
        new fr9(this);
        this.k = 5;
        new LinkedHashSet();
    }
}
