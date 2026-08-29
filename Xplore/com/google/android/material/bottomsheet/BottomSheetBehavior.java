package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.lonelycatgames.Xplore.R;
import defpackage.b17;
import defpackage.e;
import defpackage.fr9;
import defpackage.n7d;
import defpackage.oa6;
import defpackage.p72;
import defpackage.v90;
import defpackage.xp4;
import defpackage.yzc;
import defpackage.zp4;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends yzc {
    public final boolean h;
    public int i;
    public boolean j;
    public final zp4 k;
    public final ColorStateList l;
    public final boolean m;
    public final b17 n;
    public boolean o;
    public final ValueAnimator p;
    public final int q;
    public final boolean r;
    public int s;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        this.h = true;
        new fr9(this);
        this.s = 4;
        new ArrayList();
        new ArrayList();
        new SparseIntArray();
        new SparseIntArray();
        new SparseIntArray();
        new Rect();
        context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oa6.a);
        int i3 = 3;
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.l = n7d.a(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            this.n = b17.e(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        b17 b17Var = this.n;
        if (b17Var != null) {
            zp4 zp4Var = new zp4(b17Var);
            this.k = zp4Var;
            zp4Var.b.b = new p72(context);
            zp4Var.o();
            ColorStateList colorStateList = this.l;
            if (colorStateList != null) {
                zp4 zp4Var2 = this.k;
                xp4 xp4Var = zp4Var2.b;
                if (xp4Var.c != colorStateList) {
                    xp4Var.c = colorStateList;
                    zp4Var2.onStateChange(zp4Var2.getState());
                }
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.k.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.p.addUpdateListener(new v90(this));
        typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(12);
        if (typedValuePeekValue == null || (i2 = typedValuePeekValue.data) != -1) {
            h(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            h(i2);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(10, false);
        if (this.r != z) {
            this.r = z;
            if (!z && this.s == 5 && this.s != 4) {
                this.s = 4;
            }
        }
        typedArrayObtainStyledAttributes.getBoolean(16, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (this.h != z2) {
            this.h = z2;
            if (!z2 || (i = this.s) != 6) {
                i3 = this.s;
                i = i3;
            }
            if (i == i3) {
                i3 = i;
            } else {
                this.s = i3;
            }
            i(i3);
        }
        typedArrayObtainStyledAttributes.getBoolean(15, false);
        typedArrayObtainStyledAttributes.getBoolean(5, true);
        typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getInt(13, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(9, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            e.k("ratio must be a float value between 0 and 1");
            throw null;
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(7);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
            if (dimensionPixelOffset < 0) {
                e.k("offset must be greater than or equal to 0");
                throw null;
            }
            this.q = dimensionPixelOffset;
            i(this.s);
        } else {
            int i4 = typedValuePeekValue2.data;
            if (i4 < 0) {
                e.k("offset must be greater than or equal to 0");
                throw null;
            }
            this.q = i4;
            i(this.s);
        }
        typedArrayObtainStyledAttributes.getInt(14, 500);
        typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.getBoolean(20, false);
        typedArrayObtainStyledAttributes.getBoolean(21, false);
        typedArrayObtainStyledAttributes.getBoolean(22, false);
        typedArrayObtainStyledAttributes.getBoolean(23, true);
        typedArrayObtainStyledAttributes.getBoolean(17, false);
        typedArrayObtainStyledAttributes.getBoolean(18, false);
        typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.m = typedArrayObtainStyledAttributes.getBoolean(26, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void h(int i) {
        boolean z = this.j;
        if (i == -1) {
            if (z) {
                return;
            }
            this.j = true;
        } else if (z || this.i != i) {
            this.j = false;
            this.i = Math.max(0, i);
        }
    }

    public final void i(int i) {
        zp4 zp4Var;
        if (i == 2) {
            return;
        }
        boolean z = this.s == 3 && this.m;
        if (this.o == z || (zp4Var = this.k) == null) {
            return;
        }
        this.o = z;
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(zp4Var.b.i, z ? 0.0f : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float f = this.o ? 0.0f : 1.0f;
        xp4 xp4Var = zp4Var.b;
        if (xp4Var.i != f) {
            xp4Var.i = f;
            zp4Var.I = true;
            zp4Var.J = true;
            zp4Var.invalidateSelf();
        }
    }

    public BottomSheetBehavior() {
        this.h = true;
        new fr9(this);
        this.s = 4;
        new ArrayList();
        new ArrayList();
        new SparseIntArray();
        new SparseIntArray();
        new SparseIntArray();
        new Rect();
    }
}
