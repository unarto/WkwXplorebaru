package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import defpackage.cl0;
import defpackage.dl0;
import defpackage.e;
import defpackage.oa6;
import defpackage.svb;
import defpackage.ve5;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends svb {
    public dl0 c;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        Paint paint = new Paint();
        Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oa6.b);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            e(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void e(int i) {
        cl0 cl0Var;
        if (i != 0 && i != 1) {
            e.k(ve5.j(i, "invalid orientation:"));
            return;
        }
        dl0 dl0Var = this.c;
        if (dl0Var == null || i != dl0Var.b) {
            if (i == 0) {
                cl0Var = new cl0(0, 0);
            } else {
                if (i != 1) {
                    e.k("invalid orientation");
                    return;
                }
                cl0Var = new cl0(1, 0);
            }
            this.c = cl0Var;
        }
    }

    public CarouselLayoutManager() {
        Paint paint = new Paint();
        Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
        e(0);
    }
}
