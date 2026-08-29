package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.aq4;
import defpackage.dq;
import defpackage.dvb;
import defpackage.i7d;
import defpackage.mp4;
import defpackage.oa6;
import defpackage.rp4;
import defpackage.un;
import defpackage.vp;
import defpackage.vp4;
import defpackage.wn;
import defpackage.wo;
import defpackage.wp4;
import defpackage.xn;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends dq {
    @Override // defpackage.dq
    public final un a(Context context, AttributeSet attributeSet) {
        return new mp4(context, attributeSet);
    }

    @Override // defpackage.dq
    public final wn b(Context context, AttributeSet attributeSet) {
        return new rp4(context, attributeSet);
    }

    @Override // defpackage.dq
    public final xn c(Context context, AttributeSet attributeSet) {
        return new vp4(context, attributeSet);
    }

    @Override // defpackage.dq
    public final wo d(Context context, AttributeSet attributeSet) {
        return new wp4(context, attributeSet);
    }

    @Override // defpackage.dq
    public final vp e(Context context, AttributeSet attributeSet) {
        aq4 aq4Var = new aq4(dvb.d(context, attributeSet, R.attr.textViewStyle, 0, new int[0]), attributeSet, R.attr.textViewStyle);
        Context context2 = aq4Var.getContext();
        if (i7d.c(context2.getTheme(), com.lonelycatgames.Xplore.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = oa6.m;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int iM = aq4.m(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iM == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, oa6.l);
                    int iM2 = aq4.m(aq4Var.getContext(), typedArrayObtainStyledAttributes3, 2, 4);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iM2 >= 0) {
                        aq4Var.setLineHeight(iM2);
                    }
                }
            }
        }
        return aq4Var;
    }
}
