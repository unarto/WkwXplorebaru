package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import defpackage.b17;
import defpackage.d2;
import defpackage.i7d;
import defpackage.j72;
import defpackage.ns2;
import defpackage.oa6;
import defpackage.ol6;
import defpackage.os2;
import defpackage.q7;
import defpackage.vf6;
import defpackage.z07;
import defpackage.zp4;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {
    public static final ColorDrawable S = new ColorDrawable(0);
    public static final int[] T = {R.attr.state_focused, R.attr.state_window_focused};
    public static final OvershootInterpolator U = new OvershootInterpolator(4.0f);
    public static final ns2 V = new ns2("interpolation");
    public final Matrix I;
    public final vf6 J;
    public WeakReference K;
    public float L;
    public ObjectAnimator M;
    public float N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public os2 R;
    public final Paint a;
    public final RectF b;
    public final Rect c;
    public final Path d;
    public final Path e;

    public FocusRingDrawable(os2 os2Var, Resources resources) {
        super(null);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new RectF();
        this.c = new Rect();
        this.d = new Path();
        this.e = new Path();
        this.I = new Matrix();
        this.J = vf6.h();
        this.L = -1.0f;
        this.N = 1.0f;
        this.P = false;
        this.Q = false;
        os2 os2Var2 = new os2(os2Var);
        this.R = os2Var2;
        Drawable.ConstantState constantState = os2Var2.a;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.R.j)) {
            return;
        }
        paint.setStrokeWidth(this.R.j);
    }

    public static int c(TypedArray typedArray, int i) {
        if (typedArray.getType(i) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    public static float e(float f, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
        if (!Float.isNaN(f)) {
            return f;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    public final void a(RectF rectF) {
        Rect rect = this.R.w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference weakReference = this.K;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((zp4) this.K.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.c;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        d(theme);
    }

    public final void b(Canvas canvas, Path path, float f, float f2, int i) {
        RectF rectF = this.b;
        a(rectF);
        float f3 = f * 2.0f;
        float fWidth = 1.0f - (f3 / rectF.width());
        float fHeight = 1.0f - (f3 / rectF.height());
        Matrix matrix = this.I;
        matrix.reset();
        matrix.postScale(fWidth, fHeight, rectF.centerX(), rectF.centerY());
        Path path2 = this.d;
        path.transform(matrix, path2);
        float f4 = f2 * this.N;
        Paint paint = this.a;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Resources.Theme theme) {
        TypedValue typedValueB;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(oa6.e);
        int i = this.R.d;
        if (i != Integer.MIN_VALUE && (typedValueB = i7d.b(theme, i)) != null) {
            os2 os2Var = this.R;
            os2Var.c = typedValueB.data != 0;
            os2Var.e = true;
        }
        os2 os2Var2 = this.R;
        if (!os2Var2.e) {
            os2Var2.c = i7d.c(theme, com.lonelycatgames.Xplore.R.attr.focusRingsEnabled, os2Var2.c);
        }
        os2 os2Var3 = this.R;
        if (os2Var3.c) {
            int color = os2Var3.f;
            int i2 = os2Var3.g;
            if (color == Integer.MIN_VALUE) {
                if (i2 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    color = theme.resolveAttribute(i2, typedValue, true) ? typedValue.data : typedArrayObtainStyledAttributes.getColor(5, -16777216);
                }
            }
            os2Var3.f = color;
            os2 os2Var4 = this.R;
            int color2 = os2Var4.h;
            int i3 = os2Var4.i;
            if (color2 == Integer.MIN_VALUE) {
                if (i3 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    color2 = theme.resolveAttribute(i3, typedValue2, true) ? typedValue2.data : typedArrayObtainStyledAttributes.getColor(1, -1);
                }
            }
            os2Var4.h = color2;
            os2 os2Var5 = this.R;
            os2Var5.j = e(os2Var5.j, theme, os2Var5.k, typedArrayObtainStyledAttributes, 6, com.lonelycatgames.Xplore.R.dimen.mtrl_focus_ring_outer_stroke_width);
            os2 os2Var6 = this.R;
            os2Var6.l = e(os2Var6.l, theme, os2Var6.m, typedArrayObtainStyledAttributes, 3, com.lonelycatgames.Xplore.R.dimen.mtrl_focus_ring_inner_stroke_width);
            os2 os2Var7 = this.R;
            os2Var7.n = e(os2Var7.n, theme, os2Var7.o, typedArrayObtainStyledAttributes, 7, 0);
            os2 os2Var8 = this.R;
            os2Var8.p = e(os2Var8.p, theme, os2Var8.q, typedArrayObtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.R.p)) {
                this.R.p = 0.0f;
            }
            os2 os2Var9 = this.R;
            os2Var9.r = e(os2Var9.r, theme, os2Var9.s, typedArrayObtainStyledAttributes, 2, com.lonelycatgames.Xplore.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            os2 os2Var10 = this.R;
            int i4 = os2Var10.u;
            int[] iArr = oa6.o;
            if (i4 != Integer.MIN_VALUE) {
                os2Var10.t = b17.f(theme.obtainStyledAttributes(i4, iArr), new d2(0.0f)).a();
            } else {
                int i5 = os2Var10.v;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = com.lonelycatgames.Xplore.R.attr.focusRingsShapeAppearance;
                }
                TypedValue typedValueB2 = i7d.b(theme, i5);
                if (typedValueB2 != null) {
                    this.R.t = b17.f(theme.obtainStyledAttributes(typedValueB2.resourceId, iArr), new d2(0.0f)).a();
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.a;
        paint.setStyle(style);
        if (Float.isNaN(this.R.j)) {
            return;
        }
        paint.setStrokeWidth(this.R.j);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float fMax;
        int radius;
        super.draw(canvas);
        os2 os2Var = this.R;
        if (os2Var.c && this.P) {
            float f = os2Var.p;
            float f2 = os2Var.j / 2.0f;
            float f3 = this.N;
            float f4 = (f2 * f3) + f;
            float f5 = ((os2Var.l / 2.0f) * f3) + f + os2Var.r;
            Path path = this.e;
            if (path.isEmpty()) {
                WeakReference weakReference = this.K;
                if (weakReference == null || weakReference.get() == null) {
                    path = null;
                } else {
                    path = ((zp4) this.K.get()).L;
                    if (path.isEmpty()) {
                    }
                }
            }
            Path path2 = path;
            os2 os2Var2 = this.R;
            if (path2 != null) {
                b(canvas, path2, f5, os2Var2.l, os2Var2.h);
                os2 os2Var3 = this.R;
                b(canvas, path2, f4, os2Var3.j, os2Var3.f);
                return;
            }
            if (Float.isNaN(os2Var2.n)) {
                fMax = this.L;
                if (fMax < 0.0f) {
                    WeakReference weakReference2 = this.K;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        Drawable drawable = getDrawable();
                        fMax = (!(drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) ? 0.0f : radius;
                    } else {
                        zp4 zp4Var = (zp4) this.K.get();
                        float fB = zp4Var.b(zp4Var.e(), zp4Var.b.a.c(), zp4Var.e0);
                        if (fB >= 0.0f) {
                            fB *= zp4Var.b.i;
                        }
                        if (fB >= 0.0f) {
                            fMax = Math.max(0.0f, fB - (this.R.j / 2.0f));
                        }
                    }
                }
            } else {
                fMax = this.R.n;
            }
            float fMax2 = Math.max(0.0f, fMax - (this.R.j / 2.0f));
            os2 os2Var4 = this.R;
            float f6 = os2Var4.l;
            int i = os2Var4.h;
            RectF rectF = this.b;
            a(rectF);
            rectF.inset(f5, f5);
            float f7 = f6 * this.N;
            Paint paint = this.a;
            paint.setStrokeWidth(f7);
            paint.setColor(i);
            canvas.drawRoundRect(rectF, fMax2, fMax2, paint);
            os2 os2Var5 = this.R;
            float f8 = os2Var5.j;
            int i2 = os2Var5.f;
            a(rectF);
            rectF.inset(f4, f4);
            paint.setStrokeWidth(f8 * this.N);
            paint.setColor(i2);
            canvas.drawRoundRect(rectF, fMax, fMax, paint);
        }
    }

    public final void f(z07 z07Var) {
        RectF rectF = this.b;
        a(rectF);
        b17 b17VarB = z07Var.b(T);
        boolean zH = b17VarB.h(rectF);
        Path path = this.e;
        if (!zH) {
            this.J.a(b17VarB, null, 1.0f, rectF, null, path);
            this.L = -1.0f;
            return;
        }
        os2 os2Var = this.R;
        float f = ((os2Var.j / 2.0f) * this.N) + os2Var.p;
        rectF.inset(f, f);
        this.L = b17VarB.e.a(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        os2 os2Var = this.R;
        if (os2Var.a == null) {
            return null;
        }
        os2Var.b = getChangingConfigurations();
        return this.R;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (super.hasFocusStateSpecified()) {
                return true;
            }
            return this.R.c;
        } catch (NoSuchMethodError unused) {
            return this.R.c;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = oa6.e;
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.R.d = c(typedArrayObtainStyledAttributes, 0);
        if (this.R.d == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(0)) {
            os2 os2Var = this.R;
            os2Var.c = typedArrayObtainStyledAttributes.getBoolean(0, os2Var.c);
            this.R.e = true;
        }
        this.R.g = c(typedArrayObtainStyledAttributes, 5);
        os2 os2Var2 = this.R;
        if (os2Var2.g == Integer.MIN_VALUE) {
            os2Var2.f = typedArrayObtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.R.i = c(typedArrayObtainStyledAttributes, 1);
        os2 os2Var3 = this.R;
        if (os2Var3.i == Integer.MIN_VALUE) {
            os2Var3.h = typedArrayObtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.R.k = c(typedArrayObtainStyledAttributes, 6);
        os2 os2Var4 = this.R;
        if (os2Var4.k == Integer.MIN_VALUE) {
            os2Var4.j = typedArrayObtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.R.m = c(typedArrayObtainStyledAttributes, 3);
        os2 os2Var5 = this.R;
        if (os2Var5.m == Integer.MIN_VALUE) {
            os2Var5.l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.R.m = c(typedArrayObtainStyledAttributes, 3);
        os2 os2Var6 = this.R;
        if (os2Var6.m == Integer.MIN_VALUE) {
            os2Var6.l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.R.o = c(typedArrayObtainStyledAttributes, 7);
        os2 os2Var7 = this.R;
        if (os2Var7.o == Integer.MIN_VALUE) {
            os2Var7.n = typedArrayObtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.R.q = c(typedArrayObtainStyledAttributes, 4);
        os2 os2Var8 = this.R;
        if (os2Var8.q == Integer.MIN_VALUE) {
            os2Var8.p = typedArrayObtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.R.s = c(typedArrayObtainStyledAttributes, 2);
        os2 os2Var9 = this.R;
        if (os2Var9.s == Integer.MIN_VALUE) {
            os2Var9.r = typedArrayObtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.R.v = c(typedArrayObtainStyledAttributes, 8);
        this.R.u = typedArrayObtainStyledAttributes.getType(8) == 1 ? typedArrayObtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE) : Integer.MIN_VALUE;
        typedArrayObtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawableCreateFromXmlInner = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawableCreateFromXmlInner != null) {
            setDrawable(drawableCreateFromXmlInner);
            this.R.a = drawableCreateFromXmlInner.getConstantState();
        } else {
            ColorDrawable colorDrawable = S;
            setDrawable(colorDrawable);
            this.R.a = colorDrawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.R.c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.M;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.M = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.Q && super.mutate() == this) {
            this.R = new os2(this.R);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.R.a = drawable.getConstantState();
            }
            this.Q = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float[] cornerRadii;
        float cornerRadius;
        b17 b17Var;
        super.onBoundsChange(rect);
        os2 os2Var = this.R;
        if (os2Var.c) {
            z07 z07Var = os2Var.t;
            if (z07Var != null) {
                f(z07Var);
                return;
            }
            Drawable drawable = getDrawable();
            int i = 0;
            z07 z07Var2 = null;
            if (drawable instanceof ShapeDrawable) {
                Outline outline = new Outline();
                ((ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > 0.0f) {
                    ol6 ol6Var = new ol6();
                    ol6 ol6Var2 = new ol6();
                    ol6 ol6Var3 = new ol6();
                    ol6 ol6Var4 = new ol6();
                    j72 j72Var = new j72(i);
                    j72 j72Var2 = new j72(i);
                    j72 j72Var3 = new j72(i);
                    j72 j72Var4 = new j72(i);
                    float radius = outline.getRadius();
                    d2 d2Var = new d2(radius);
                    d2 d2Var2 = new d2(radius);
                    d2 d2Var3 = new d2(radius);
                    d2 d2Var4 = new d2(radius);
                    b17Var = new b17();
                    b17Var.a = ol6Var;
                    b17Var.b = ol6Var2;
                    b17Var.c = ol6Var3;
                    b17Var.d = ol6Var4;
                    b17Var.e = d2Var;
                    b17Var.f = d2Var2;
                    b17Var.g = d2Var3;
                    b17Var.h = d2Var4;
                    b17Var.i = j72Var;
                    b17Var.j = j72Var2;
                    b17Var.k = j72Var3;
                    b17Var.l = j72Var4;
                    z07Var2 = b17Var;
                }
            } else if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                try {
                    cornerRadii = gradientDrawable.getCornerRadii();
                } catch (NullPointerException unused) {
                    cornerRadii = null;
                }
                if (cornerRadii != null) {
                    ol6 ol6Var5 = new ol6();
                    ol6 ol6Var6 = new ol6();
                    ol6 ol6Var7 = new ol6();
                    ol6 ol6Var8 = new ol6();
                    j72 j72Var5 = new j72(i);
                    j72 j72Var6 = new j72(i);
                    j72 j72Var7 = new j72(i);
                    j72 j72Var8 = new j72(i);
                    d2 d2Var5 = new d2(Math.min(cornerRadii[0], cornerRadii[1]));
                    d2 d2Var6 = new d2(Math.min(cornerRadii[2], cornerRadii[3]));
                    d2 d2Var7 = new d2(Math.min(cornerRadii[4], cornerRadii[5]));
                    d2 d2Var8 = new d2(Math.min(cornerRadii[6], cornerRadii[7]));
                    b17Var = new b17();
                    b17Var.a = ol6Var5;
                    b17Var.b = ol6Var6;
                    b17Var.c = ol6Var7;
                    b17Var.d = ol6Var8;
                    b17Var.e = d2Var5;
                    b17Var.f = d2Var6;
                    b17Var.g = d2Var7;
                    b17Var.h = d2Var8;
                    b17Var.i = j72Var5;
                    b17Var.j = j72Var6;
                    b17Var.k = j72Var7;
                    b17Var.l = j72Var8;
                    z07Var2 = b17Var;
                } else {
                    try {
                        cornerRadius = gradientDrawable.getCornerRadius();
                    } catch (NullPointerException unused2) {
                        cornerRadius = -1.0f;
                    }
                    if (cornerRadius > 0.0f) {
                        ol6 ol6Var9 = new ol6();
                        ol6 ol6Var10 = new ol6();
                        ol6 ol6Var11 = new ol6();
                        ol6 ol6Var12 = new ol6();
                        j72 j72Var9 = new j72(i);
                        j72 j72Var10 = new j72(i);
                        j72 j72Var11 = new j72(i);
                        j72 j72Var12 = new j72(i);
                        d2 d2Var9 = new d2(cornerRadius);
                        d2 d2Var10 = new d2(cornerRadius);
                        d2 d2Var11 = new d2(cornerRadius);
                        d2 d2Var12 = new d2(cornerRadius);
                        b17 b17Var2 = new b17();
                        b17Var2.a = ol6Var9;
                        b17Var2.b = ol6Var10;
                        b17Var2.c = ol6Var11;
                        b17Var2.d = ol6Var12;
                        b17Var2.e = d2Var9;
                        b17Var2.f = d2Var10;
                        b17Var2.g = d2Var11;
                        b17Var2.h = d2Var12;
                        b17Var2.i = j72Var9;
                        b17Var2.j = j72Var10;
                        b17Var2.k = j72Var11;
                        b17Var2.l = j72Var12;
                        z07Var2 = b17Var2;
                    }
                }
            }
            if (z07Var2 != null) {
                f(z07Var2);
            } else {
                this.L = -1.0f;
                this.e.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        os2 os2Var = this.R;
        if (!os2Var.c) {
            this.P = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = StateSet.stateSetMatches(os2Var.x, iArr);
        boolean z = this.P != zStateSetMatches;
        this.P = zStateSetMatches;
        if (z && iArr.length > 0 && !this.O) {
            ObjectAnimator objectAnimator = this.M;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.M = null;
            }
            if (zStateSetMatches) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, V, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(U);
                objectAnimatorOfFloat.addListener(new q7(2, this));
                this.M = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
            } else {
                this.N = 1.0f;
            }
        }
        this.O = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.a = new Paint(1);
        this.b = new RectF();
        this.c = new Rect();
        this.d = new Path();
        this.e = new Path();
        this.I = new Matrix();
        this.J = vf6.h();
        this.L = -1.0f;
        this.N = 1.0f;
        this.P = false;
        this.Q = false;
        os2 os2Var = new os2(null);
        this.R = os2Var;
        if (drawable != null) {
            os2Var.a = drawable.getConstantState();
        }
        d(context.getTheme());
    }

    public FocusRingDrawable() {
        super(null);
        this.a = new Paint(1);
        this.b = new RectF();
        this.c = new Rect();
        this.d = new Path();
        this.e = new Path();
        this.I = new Matrix();
        this.J = vf6.h();
        this.L = -1.0f;
        this.N = 1.0f;
        this.P = false;
        this.Q = false;
        this.R = new os2(null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
