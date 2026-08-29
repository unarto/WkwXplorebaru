package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import defpackage.a8;
import defpackage.b8;
import defpackage.c8;
import defpackage.d8;
import defpackage.e8;
import defpackage.fl6;
import defpackage.icd;
import defpackage.kz4;
import defpackage.lk8;
import defpackage.mf4;
import defpackage.nf4;
import defpackage.qy4;
import defpackage.ry4;
import defpackage.vy4;
import defpackage.y7;
import defpackage.yu4;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends nf4 implements qy4, kz4 {
    public ry4 S;
    public Context T;
    public int U;
    public boolean V;
    public b8 W;
    public fl6 a0;
    public boolean b0;
    public int c0;
    public final int d0;
    public final int e0;
    public e8 f0;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.d0 = (int) (56.0f * f);
        this.e0 = (int) (f * 4.0f);
        this.T = context;
        this.U = 0;
    }

    public static d8 i() {
        d8 d8Var = new d8(-2, -2);
        d8Var.a = false;
        ((LinearLayout.LayoutParams) d8Var).gravity = 16;
        return d8Var;
    }

    public static d8 j(ViewGroup.LayoutParams layoutParams) {
        d8 d8Var;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof d8) {
            d8 d8Var2 = (d8) layoutParams;
            d8Var = new d8(d8Var2);
            d8Var.a = d8Var2.a;
        } else {
            d8Var = new d8(layoutParams);
        }
        if (((LinearLayout.LayoutParams) d8Var).gravity <= 0) {
            ((LinearLayout.LayoutParams) d8Var).gravity = 16;
        }
        return d8Var;
    }

    @Override // defpackage.qy4
    public final boolean a(vy4 vy4Var) {
        return this.S.q(vy4Var, null, 0);
    }

    @Override // defpackage.kz4
    public final void b(ry4 ry4Var) {
        this.S = ry4Var;
    }

    @Override // defpackage.nf4, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d8;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.nf4
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ mf4 generateDefaultLayoutParams() {
        return i();
    }

    @Override // defpackage.nf4
    /* JADX INFO: renamed from: f */
    public final mf4 generateLayoutParams(AttributeSet attributeSet) {
        return new d8(getContext(), attributeSet);
    }

    @Override // defpackage.nf4
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ mf4 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // defpackage.nf4, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // defpackage.nf4, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d8(getContext(), attributeSet);
    }

    public Menu getMenu() {
        ry4 ry4Var = this.S;
        if (ry4Var != null) {
            return ry4Var;
        }
        Context context = getContext();
        ry4 ry4Var2 = new ry4(context);
        this.S = ry4Var2;
        ry4Var2.e = new fl6(1, this);
        b8 b8Var = new b8(context);
        this.W = b8Var;
        b8Var.O = true;
        b8Var.P = true;
        b8Var.e = new icd(19);
        this.S.b(b8Var, this.T);
        b8 b8Var2 = this.W;
        b8Var2.K = this;
        ry4 ry4Var3 = b8Var2.c;
        this.S = ry4Var3;
        return ry4Var3;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        b8 b8Var = this.W;
        a8 a8Var = b8Var.L;
        if (a8Var != null) {
            return a8Var.getDrawable();
        }
        if (b8Var.N) {
            return b8Var.M;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.U;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i) {
        boolean zC = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof c8)) {
            zC = ((c8) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof c8)) ? zC : ((c8) childAt2).e() | zC;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b8 b8Var = this.W;
        if (b8Var != null) {
            b8Var.i();
            if (this.W.j()) {
                this.W.g();
                this.W.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b8 b8Var = this.W;
        if (b8Var != null) {
            b8Var.g();
            y7 y7Var = b8Var.W;
            if (y7Var == null || !y7Var.b()) {
                return;
            }
            y7Var.i.dismiss();
        }
    }

    @Override // defpackage.nf4, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.b0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = lk8.a;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                d8 d8Var = (d8) childAt.getLayoutParams();
                if (d8Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) d8Var).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) d8Var).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) d8Var).leftMargin) + ((LinearLayout.LayoutParams) d8Var).rightMargin;
                    k(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                d8 d8Var2 = (d8) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !d8Var2.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) d8Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) d8Var2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            d8 d8Var3 = (d8) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !d8Var3.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) d8Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = yu4.d(measuredWidth4, ((LinearLayout.LayoutParams) d8Var3).rightMargin, iMax, i18);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.nf4, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        ry4 ry4Var;
        boolean z = this.b0;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.b0 = z2;
        if (z != z2) {
            this.c0 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.b0 && (ry4Var = this.S) != null && size != this.c0) {
            this.c0 = size;
            ry4Var.p(true);
        }
        int childCount = getChildCount();
        if (!this.b0 || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                d8 d8Var = (d8) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) d8Var).rightMargin = 0;
                ((LinearLayout.LayoutParams) d8Var).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.d0;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.e0;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                d8 d8Var2 = (d8) childAt.getLayoutParams();
                d8Var2.f = false;
                d8Var2.c = 0;
                d8Var2.b = 0;
                d8Var2.d = false;
                ((LinearLayout.LayoutParams) d8Var2).leftMargin = 0;
                ((LinearLayout.LayoutParams) d8Var2).rightMargin = 0;
                d8Var2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = d8Var2.a ? 1 : i10;
                d8 d8Var3 = (d8) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                d8Var3.d = !d8Var3.a && z6;
                d8Var3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (d8Var2.d) {
                    i15++;
                }
                if (d8Var2.a) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (i15 > 0 && i23 > 0) {
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                d8 d8Var4 = (d8) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (d8Var4.d) {
                    int i28 = d8Var4.b;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                d8 d8Var5 = (d8) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && d8Var5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    d8Var5.b += r11;
                    d8Var5.f = r11;
                    i23--;
                } else if (d8Var5.b == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        i4 = iMax;
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((d8) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((d8) getChildAt(i31).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    d8 d8Var6 = (d8) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        d8Var6.c = i32;
                        d8Var6.f = true;
                        if (i33 == 0 && !d8Var6.e) {
                            ((LinearLayout.LayoutParams) d8Var6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (d8Var6.a) {
                        d8Var6.c = i32;
                        d8Var6.f = true;
                        ((LinearLayout.LayoutParams) d8Var6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) d8Var6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) d8Var6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                d8 d8Var7 = (d8) childAt4.getLayoutParams();
                if (d8Var7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((d8Var7.b * i22) + d8Var7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.W.T = z;
    }

    public void setOnMenuItemClickListener(e8 e8Var) {
        this.f0 = e8Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        b8 b8Var = this.W;
        a8 a8Var = b8Var.L;
        if (a8Var != null) {
            a8Var.setImageDrawable(drawable);
        } else {
            b8Var.N = true;
            b8Var.M = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.V = z;
    }

    public void setPopupTheme(int i) {
        if (this.U != i) {
            this.U = i;
            if (i == 0) {
                this.T = getContext();
            } else {
                this.T = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(b8 b8Var) {
        this.W = b8Var;
        b8Var.K = this;
        this.S = b8Var.c;
    }

    @Override // defpackage.nf4, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
