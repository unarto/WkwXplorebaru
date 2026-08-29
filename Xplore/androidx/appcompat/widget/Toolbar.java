package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.lonelycatgames.Xplore.R;
import defpackage.ada;
import defpackage.b8;
import defpackage.cd;
import defpackage.fl6;
import defpackage.h28;
import defpackage.i28;
import defpackage.j28;
import defpackage.jj8;
import defpackage.k28;
import defpackage.l28;
import defpackage.lk8;
import defpackage.m28;
import defpackage.mjb;
import defpackage.ml7;
import defpackage.ov2;
import defpackage.p28;
import defpackage.p7;
import defpackage.pa6;
import defpackage.r28;
import defpackage.ry4;
import defpackage.s28;
import defpackage.so;
import defpackage.tn1;
import defpackage.to;
import defpackage.usb;
import defpackage.vp;
import defpackage.vy4;
import defpackage.xl6;
import defpackage.y03;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public final Drawable I;
    public final CharSequence J;
    public so K;
    public View L;
    public Context M;
    public int N;
    public int O;
    public int P;
    public final int Q;
    public final int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public xl6 W;
    public ActionMenuView a;
    public int a0;
    public vp b;
    public int b0;
    public vp c;
    public final int c0;
    public so d;
    public CharSequence d0;
    public to e;
    public CharSequence e0;
    public ColorStateList f0;
    public ColorStateList g0;
    public boolean h0;
    public boolean i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public final int[] l0;
    public final ada m0;
    public ArrayList n0;
    public final usb o0;
    public r28 p0;
    public b8 q0;
    public j28 r0;
    public boolean s0;
    public OnBackInvokedCallback t0;
    public OnBackInvokedDispatcher u0;
    public boolean v0;
    public final cd w0;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.c0 = 8388627;
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        this.l0 = new int[2];
        this.m0 = new ada(new h28(this, 1));
        this.n0 = new ArrayList();
        this.o0 = new usb(22, this);
        this.w0 = new cd(15, this);
        Context context2 = getContext();
        int[] iArr = pa6.w;
        mjb mjbVarS = mjb.s(context2, attributeSet, iArr, R.attr.toolbarStyle);
        jj8.i(this, context, iArr, attributeSet, (TypedArray) mjbVarS.c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) mjbVarS.c;
        this.O = typedArray.getResourceId(28, 0);
        this.P = typedArray.getResourceId(19, 0);
        this.c0 = typedArray.getInteger(0, 8388627);
        this.Q = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.V = dimensionPixelOffset;
        this.U = dimensionPixelOffset;
        this.T = dimensionPixelOffset;
        this.S = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.S = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.T = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.U = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.V = dimensionPixelOffset5;
        }
        this.R = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        xl6 xl6Var = this.W;
        xl6Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            xl6Var.e = dimensionPixelSize;
            xl6Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            xl6Var.f = dimensionPixelSize2;
            xl6Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            xl6Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.a0 = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.b0 = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.I = mjbVarS.o(4);
        this.J = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.M = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableO = mjbVarS.o(16);
        if (drawableO != null) {
            setNavigationIcon(drawableO);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableO2 = mjbVarS.o(11);
        if (drawableO2 != null) {
            setLogo(drawableO2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(mjbVarS.m(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(mjbVarS.m(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        mjbVarS.t();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new ml7(getContext());
    }

    public static k28 h() {
        k28 k28Var = new k28(-2, -2);
        k28Var.b = 0;
        k28Var.a = 8388627;
        return k28Var;
    }

    public static k28 i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof k28;
        if (z) {
            k28 k28Var = (k28) layoutParams;
            k28 k28Var2 = new k28(k28Var);
            k28Var2.b = 0;
            k28Var2.b = k28Var.b;
            return k28Var2;
        }
        if (z) {
            k28 k28Var3 = new k28((k28) layoutParams);
            k28Var3.b = 0;
            return k28Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            k28 k28Var4 = new k28(layoutParams);
            k28Var4.b = 0;
            return k28Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        k28 k28Var5 = new k28(marginLayoutParams);
        k28Var5.b = 0;
        ((ViewGroup.MarginLayoutParams) k28Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) k28Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) k28Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) k28Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return k28Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                k28 k28Var = (k28) childAt.getLayoutParams();
                if (k28Var.b == 0 && s(childAt)) {
                    int i3 = k28Var.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            k28 k28Var2 = (k28) childAt2.getLayoutParams();
            if (k28Var2.b == 0 && s(childAt2)) {
                int i5 = k28Var2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        k28 k28VarH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (k28) layoutParams;
        k28VarH.b = 1;
        if (!z || this.L == null) {
            addView(view, k28VarH);
        } else {
            view.setLayoutParams(k28VarH);
            this.k0.add(view);
        }
    }

    public final void c() {
        if (this.K == null) {
            so soVar = new so(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.K = soVar;
            soVar.setImageDrawable(this.I);
            this.K.setContentDescription(this.J);
            k28 k28VarH = h();
            k28VarH.a = (this.Q & 112) | 8388611;
            k28VarH.b = 2;
            this.K.setLayoutParams(k28VarH);
            this.K.setOnClickListener(new p7(2, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof k28);
    }

    public final void d() {
        if (this.W == null) {
            xl6 xl6Var = new xl6();
            xl6Var.a = 0;
            xl6Var.b = 0;
            xl6Var.c = Integer.MIN_VALUE;
            xl6Var.d = Integer.MIN_VALUE;
            xl6Var.e = 0;
            xl6Var.f = 0;
            xl6Var.g = false;
            xl6Var.h = false;
            this.W = xl6Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.S == null) {
            ry4 ry4Var = (ry4) actionMenuView.getMenu();
            if (this.r0 == null) {
                this.r0 = new j28(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            ry4Var.b(this.r0, this.M);
            t();
        }
    }

    public final void f() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.N);
            this.a.setOnMenuItemClickListener(this.o0);
            ActionMenuView actionMenuView2 = this.a;
            fl6 fl6Var = new fl6(20, this);
            actionMenuView2.getClass();
            actionMenuView2.a0 = fl6Var;
            k28 k28VarH = h();
            k28VarH.a = (this.Q & 112) | 8388613;
            this.a.setLayoutParams(k28VarH);
            b(this.a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new so(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            k28 k28VarH = h();
            k28VarH.a = (this.Q & 112) | 8388611;
            this.d.setLayoutParams(k28VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        k28 k28Var = new k28(context, attributeSet);
        k28Var.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pa6.b);
        k28Var.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        k28Var.b = 0;
        return k28Var;
    }

    public CharSequence getCollapseContentDescription() {
        so soVar = this.K;
        if (soVar != null) {
            return soVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        so soVar = this.K;
        if (soVar != null) {
            return soVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        xl6 xl6Var = this.W;
        if (xl6Var != null) {
            return xl6Var.g ? xl6Var.a : xl6Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.b0;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        xl6 xl6Var = this.W;
        if (xl6Var != null) {
            return xl6Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        xl6 xl6Var = this.W;
        if (xl6Var != null) {
            return xl6Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        xl6 xl6Var = this.W;
        if (xl6Var != null) {
            return xl6Var.g ? xl6Var.b : xl6Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.a0;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        ry4 ry4Var;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (ry4Var = actionMenuView.S) == null || !ry4Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.b0, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.a0, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        to toVar = this.e;
        if (toVar != null) {
            return toVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        to toVar = this.e;
        if (toVar != null) {
            return toVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        so soVar = this.d;
        if (soVar != null) {
            return soVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        so soVar = this.d;
        if (soVar != null) {
            return soVar.getDrawable();
        }
        return null;
    }

    public b8 getOuterActionMenuPresenter() {
        return this.q0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.M;
    }

    public int getPopupTheme() {
        return this.N;
    }

    public CharSequence getSubtitle() {
        return this.e0;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.d0;
    }

    public int getTitleMarginBottom() {
        return this.V;
    }

    public int getTitleMarginEnd() {
        return this.T;
    }

    public int getTitleMarginStart() {
        return this.S;
    }

    public int getTitleMarginTop() {
        return this.U;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public tn1 getWrapper() {
        Drawable drawable;
        r28 r28Var = this.p0;
        if (r28Var == null) {
            r28Var = new r28();
            r28Var.n = 0;
            r28Var.a = this;
            r28Var.h = getTitle();
            r28Var.i = getSubtitle();
            r28Var.g = r28Var.h != null;
            r28Var.f = getNavigationIcon();
            mjb mjbVarS = mjb.s(getContext(), null, pa6.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) mjbVarS.c;
            r28Var.o = mjbVarS.o(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                r28Var.g = true;
                r28Var.h = text;
                if ((r28Var.b & 8) != 0) {
                    setTitle(text);
                    if (r28Var.g) {
                        jj8.k(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                r28Var.i = text2;
                if ((r28Var.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableO = mjbVarS.o(20);
            if (drawableO != null) {
                r28Var.e = drawableO;
                r28Var.c();
            }
            Drawable drawableO2 = mjbVarS.o(17);
            if (drawableO2 != null) {
                r28Var.d = drawableO2;
                r28Var.c();
            }
            if (r28Var.f == null && (drawable = r28Var.o) != null) {
                r28Var.f = drawable;
                if ((r28Var.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            r28Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = r28Var.c;
                if (view != null && (r28Var.b & 16) != 0) {
                    removeView(view);
                }
                r28Var.c = viewInflate;
                if (viewInflate != null && (r28Var.b & 16) != 0) {
                    addView(viewInflate);
                }
                r28Var.a(r28Var.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.W.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.O = resourceId2;
                vp vpVar = this.b;
                if (vpVar != null) {
                    vpVar.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.P = resourceId3;
                vp vpVar2 = this.c;
                if (vpVar2 != null) {
                    vpVar2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            mjbVarS.t();
            if (R.string.abc_action_bar_up_description != r28Var.n) {
                r28Var.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = r28Var.n;
                    r28Var.j = i != 0 ? getContext().getString(i) : null;
                    r28Var.b();
                }
            }
            r28Var.j = getNavigationContentDescription();
            setNavigationOnClickListener(new p28(r28Var));
            this.p0 = r28Var;
        }
        return r28Var;
    }

    public final int j(View view, int i) {
        k28 k28Var = (k28) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = k28Var.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.c0 & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) k28Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) k28Var).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) k28Var).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        Iterator it = this.n0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.m0.c).iterator();
        while (it2.hasNext()) {
            ((ov2) it2.next()).a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.n0 = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.k0.contains(view);
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        k28 k28Var = (k28) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) k28Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) k28Var).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.w0);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.i0 = false;
        }
        if (!this.i0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.i0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.i0 = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iO;
        int iP;
        int iMax;
        boolean zS;
        boolean zS2;
        boolean z2;
        int measuredHeight;
        int i5;
        int paddingTop;
        int i6;
        int i7;
        int i8;
        int i9;
        int size;
        int iO2;
        int i10;
        int size2;
        int i11;
        int size3;
        int i12;
        int i13;
        int i14;
        int size4;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i15 = width - paddingRight;
        int[] iArr = this.l0;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = jj8.a;
        int minimumHeight = getMinimumHeight();
        int iMin = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (s(this.d)) {
            so soVar = this.d;
            if (z3) {
                iP = p(soVar, i15, iMin, iArr);
                iO = paddingLeft;
                if (s(this.K)) {
                    so soVar2 = this.K;
                    if (z3) {
                        iP = p(soVar2, iP, iMin, iArr);
                    } else {
                        iO = o(soVar2, iO, iMin, iArr);
                    }
                }
                if (s(this.a)) {
                    ActionMenuView actionMenuView = this.a;
                    if (z3) {
                        iO = o(actionMenuView, iO, iMin, iArr);
                    } else {
                        iP = p(actionMenuView, iP, iMin, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - iO);
                iArr[1] = Math.max(0, currentContentInsetRight - (i15 - iP));
                iMax = Math.max(iO, currentContentInsetLeft);
                int iMin2 = Math.min(iP, i15 - currentContentInsetRight);
                if (s(this.L)) {
                    View view = this.L;
                    if (z3) {
                        iMin2 = p(view, iMin2, iMin, iArr);
                    } else {
                        iMax = o(view, iMax, iMin, iArr);
                    }
                }
                if (s(this.e)) {
                    to toVar = this.e;
                    if (z3) {
                        iMin2 = p(toVar, iMin2, iMin, iArr);
                    } else {
                        iMax = o(toVar, iMax, iMin, iArr);
                    }
                }
                zS = s(this.b);
                zS2 = s(this.c);
                if (zS) {
                    z2 = z3;
                    measuredHeight = 0;
                } else {
                    k28 k28Var = (k28) this.b.getLayoutParams();
                    z2 = z3;
                    measuredHeight = this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) k28Var).topMargin + ((ViewGroup.MarginLayoutParams) k28Var).bottomMargin;
                }
                if (!zS2) {
                    k28 k28Var2 = (k28) this.c.getLayoutParams();
                    measuredHeight = this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) k28Var2).topMargin + ((ViewGroup.MarginLayoutParams) k28Var2).bottomMargin + measuredHeight;
                }
                if (!zS || zS2) {
                    vp vpVar = !zS ? this.b : this.c;
                    vp vpVar2 = !zS2 ? this.c : this.b;
                    k28 k28Var3 = (k28) vpVar.getLayoutParams();
                    k28 k28Var4 = (k28) vpVar2.getLayoutParams();
                    int i16 = measuredHeight;
                    boolean z4 = (zS && this.b.getMeasuredWidth() > 0) || (zS2 && this.c.getMeasuredWidth() > 0);
                    i5 = this.c0 & 112;
                    int i17 = iMax;
                    if (i5 == 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) k28Var3).topMargin + this.U;
                    } else if (i5 != 80) {
                        int iMax2 = (((height - paddingTop2) - paddingBottom) - i16) / 2;
                        int i18 = ((ViewGroup.MarginLayoutParams) k28Var3).topMargin + this.U;
                        if (iMax2 < i18) {
                            iMax2 = i18;
                        } else {
                            int i19 = (((height - paddingBottom) - i16) - iMax2) - paddingTop2;
                            int i20 = ((ViewGroup.MarginLayoutParams) k28Var3).bottomMargin;
                            int i21 = this.V;
                            if (i19 < i20 + i21) {
                                iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) k28Var4).bottomMargin + i21) - i19));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) k28Var4).bottomMargin) - this.V) - i16;
                    }
                    if (z2) {
                        int i22 = (z4 ? this.S : 0) - iArr[1];
                        iMin2 -= Math.max(0, i22);
                        iArr[1] = Math.max(0, -i22);
                        if (zS) {
                            k28 k28Var5 = (k28) this.b.getLayoutParams();
                            int measuredWidth = iMin2 - this.b.getMeasuredWidth();
                            int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                            this.b.layout(measuredWidth, paddingTop, iMin2, measuredHeight2);
                            i8 = measuredWidth - this.T;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) k28Var5).bottomMargin;
                        } else {
                            i8 = iMin2;
                        }
                        if (zS2) {
                            int i23 = paddingTop + ((ViewGroup.MarginLayoutParams) ((k28) this.c.getLayoutParams())).topMargin;
                            this.c.layout(iMin2 - this.c.getMeasuredWidth(), i23, iMin2, this.c.getMeasuredHeight() + i23);
                            i9 = iMin2 - this.T;
                        } else {
                            i9 = iMin2;
                        }
                        if (z4) {
                            iMin2 = Math.min(i8, i9);
                        }
                        iMax = i17;
                    } else {
                        int i24 = (z4 ? this.S : 0) - iArr[0];
                        iMax = Math.max(0, i24) + i17;
                        iArr[0] = Math.max(0, -i24);
                        if (zS) {
                            k28 k28Var6 = (k28) this.b.getLayoutParams();
                            int measuredWidth2 = this.b.getMeasuredWidth() + iMax;
                            int measuredHeight3 = this.b.getMeasuredHeight() + paddingTop;
                            this.b.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                            i6 = measuredWidth2 + this.T;
                            paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) k28Var6).bottomMargin;
                        } else {
                            i6 = iMax;
                        }
                        if (zS2) {
                            int i25 = paddingTop + ((ViewGroup.MarginLayoutParams) ((k28) this.c.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.c.getMeasuredWidth() + iMax;
                            this.c.layout(iMax, i25, measuredWidth3, this.c.getMeasuredHeight() + i25);
                            i7 = measuredWidth3 + this.T;
                        } else {
                            i7 = iMax;
                        }
                        if (z4) {
                            iMax = Math.max(i6, i7);
                        }
                    }
                }
                ArrayList arrayList = this.j0;
                a(3, arrayList);
                size = arrayList.size();
                iO2 = iMax;
                for (i10 = 0; i10 < size; i10++) {
                    iO2 = o((View) arrayList.get(i10), iO2, iMin, iArr);
                }
                a(5, arrayList);
                size2 = arrayList.size();
                for (i11 = 0; i11 < size2; i11++) {
                    iMin2 = p((View) arrayList.get(i11), iMin2, iMin, iArr);
                }
                a(1, arrayList);
                int i26 = iArr[0];
                int i27 = iArr[1];
                size3 = arrayList.size();
                int i28 = i26;
                i12 = 0;
                int measuredWidth4 = 0;
                while (i12 < size3) {
                    View view2 = (View) arrayList.get(i12);
                    k28 k28Var7 = (k28) view2.getLayoutParams();
                    int i29 = i27;
                    int i30 = ((ViewGroup.MarginLayoutParams) k28Var7).leftMargin - i28;
                    int i31 = ((ViewGroup.MarginLayoutParams) k28Var7).rightMargin - i29;
                    int iMax3 = Math.max(0, i30);
                    int iMax4 = Math.max(0, i31);
                    int iMax5 = Math.max(0, -i30);
                    int iMax6 = Math.max(0, -i31);
                    measuredWidth4 += view2.getMeasuredWidth() + iMax3 + iMax4;
                    i12++;
                    i28 = iMax5;
                    i27 = iMax6;
                }
                i14 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth4 / 2);
                int i32 = measuredWidth4 + i14;
                if (i14 >= iO2) {
                    iO2 = i32 > iMin2 ? i14 - (i32 - iMin2) : i14;
                }
                size4 = arrayList.size();
                for (i13 = 0; i13 < size4; i13++) {
                    iO2 = o((View) arrayList.get(i13), iO2, iMin, iArr);
                }
                arrayList.clear();
            }
            iO = o(soVar, paddingLeft, iMin, iArr);
        } else {
            iO = paddingLeft;
        }
        iP = i15;
        if (s(this.K)) {
        }
        if (s(this.a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iO);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i15 - iP));
        iMax = Math.max(iO, currentContentInsetLeft2);
        int iMin22 = Math.min(iP, i15 - currentContentInsetRight2);
        if (s(this.L)) {
        }
        if (s(this.e)) {
        }
        zS = s(this.b);
        zS2 = s(this.c);
        if (zS) {
        }
        if (!zS2) {
        }
        if (!zS) {
            if (!zS) {
            }
            if (!zS2) {
            }
            k28 k28Var32 = (k28) vpVar.getLayoutParams();
            k28 k28Var42 = (k28) vpVar2.getLayoutParams();
            int i162 = measuredHeight;
            if (zS) {
                i5 = this.c0 & 112;
                int i172 = iMax;
                if (i5 == 48) {
                }
                if (z2) {
                }
            } else {
                i5 = this.c0 & 112;
                int i1722 = iMax;
                if (i5 == 48) {
                }
                if (z2) {
                }
            }
        }
        ArrayList arrayList2 = this.j0;
        a(3, arrayList2);
        size = arrayList2.size();
        iO2 = iMax;
        while (i10 < size) {
        }
        a(5, arrayList2);
        size2 = arrayList2.size();
        while (i11 < size2) {
        }
        a(1, arrayList2);
        int i262 = iArr[0];
        int i272 = iArr[1];
        size3 = arrayList2.size();
        int i282 = i262;
        i12 = 0;
        int measuredWidth42 = 0;
        while (i12 < size3) {
        }
        i14 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth42 / 2);
        int i322 = measuredWidth42 + i14;
        if (i14 >= iO2) {
        }
        size4 = arrayList2.size();
        while (i13 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = lk8.a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (s(this.d)) {
            r(this.d, i, 0, i2, this.R);
            iK = k(this.d) + this.d.getMeasuredWidth();
            iMax = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (s(this.K)) {
            r(this.K, i, 0, i2, this.R);
            iK = k(this.K) + this.K.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.K) + this.K.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.K.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        Object[] objArr2 = objArr;
        int[] iArr = this.l0;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (s(this.a)) {
            r(this.a, i, iMax3, i2, this.R);
            iK2 = k(this.a) + this.a.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.a) + this.a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iK2);
        if (s(this.L)) {
            iMax5 += q(this.L, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.L) + this.L.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.L.getMeasuredState());
        }
        if (s(this.e)) {
            iMax5 += q(this.e, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.e) + this.e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((k28) childAt.getLayoutParams()).b == 0 && s(childAt)) {
                iMax5 += q(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.U + this.V;
        int i7 = this.S + this.T;
        if (s(this.b)) {
            q(this.b, i, i5 + i7, i2, i6, iArr);
            int iK3 = k(this.b) + this.b.getMeasuredWidth();
            iL = l(this.b) + this.b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (s(this.c)) {
            iMax2 = Math.max(iMax2, q(this.c, i, i5 + i7, i2, i6 + iL, iArr));
            iL += l(this.c) + this.c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.s0) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof m28)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m28 m28Var = (m28) parcelable;
        super.onRestoreInstanceState(m28Var.a);
        ActionMenuView actionMenuView = this.a;
        ry4 ry4Var = actionMenuView != null ? actionMenuView.S : null;
        int i = m28Var.c;
        if (i != 0 && this.r0 != null && ry4Var != null && (menuItemFindItem = ry4Var.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (m28Var.d) {
            cd cdVar = this.w0;
            removeCallbacks(cdVar);
            post(cdVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        xl6 xl6Var = this.W;
        boolean z = i == 1;
        if (z == xl6Var.g) {
            return;
        }
        xl6Var.g = z;
        if (!xl6Var.h) {
            xl6Var.a = xl6Var.e;
            xl6Var.b = xl6Var.f;
            return;
        }
        if (z) {
            int i2 = xl6Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = xl6Var.e;
            }
            xl6Var.a = i2;
            int i3 = xl6Var.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = xl6Var.f;
            }
            xl6Var.b = i3;
            return;
        }
        int i4 = xl6Var.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = xl6Var.e;
        }
        xl6Var.a = i4;
        int i5 = xl6Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = xl6Var.f;
        }
        xl6Var.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        b8 b8Var;
        vy4 vy4Var;
        m28 m28Var = new m28(super.onSaveInstanceState());
        j28 j28Var = this.r0;
        if (j28Var != null && (vy4Var = j28Var.b) != null) {
            m28Var.c = vy4Var.a;
        }
        ActionMenuView actionMenuView = this.a;
        m28Var.d = (actionMenuView == null || (b8Var = actionMenuView.W) == null || !b8Var.j()) ? false : true;
        return m28Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h0 = false;
        }
        if (!this.h0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.h0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.h0 = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        k28 k28Var = (k28) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) k28Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) k28Var).leftMargin);
    }

    public final int q(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void r(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.v0 != z) {
            this.v0 = z;
            t();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        so soVar = this.K;
        if (soVar != null) {
            soVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.K.setImageDrawable(drawable);
        } else {
            so soVar = this.K;
            if (soVar != null) {
                soVar.setImageDrawable(this.I);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.s0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.b0) {
            this.b0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.a0) {
            this.a0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        to toVar = this.e;
        if (drawable != null) {
            if (toVar == null) {
                toVar = new to(getContext(), null, 0);
                this.e = toVar;
            }
            if (!n(toVar)) {
                b(this.e, true);
            }
        } else if (toVar != null && n(toVar)) {
            removeView(this.e);
            this.k0.remove(this.e);
        }
        to toVar2 = this.e;
        if (toVar2 != null) {
            toVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new to(getContext(), null, 0);
        }
        to toVar = this.e;
        if (toVar != null) {
            toVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        so soVar = this.d;
        if (soVar != null) {
            soVar.setContentDescription(charSequence);
            s28.a(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.d)) {
                b(this.d, true);
            }
        } else {
            so soVar = this.d;
            if (soVar != null && n(soVar)) {
                removeView(this.d);
                this.k0.remove(this.d);
            }
        }
        so soVar2 = this.d;
        if (soVar2 != null) {
            soVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.N != i) {
            this.N = i;
            if (i == 0) {
                this.M = getContext();
            } else {
                this.M = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        vp vpVar = this.c;
        if (!zIsEmpty) {
            if (vpVar == null) {
                Context context = getContext();
                vp vpVar2 = new vp(context, null);
                this.c = vpVar2;
                vpVar2.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.P;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.g0;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!n(this.c)) {
                b(this.c, true);
            }
        } else if (vpVar != null && n(vpVar)) {
            removeView(this.c);
            this.k0.remove(this.c);
        }
        vp vpVar3 = this.c;
        if (vpVar3 != null) {
            vpVar3.setText(charSequence);
        }
        this.e0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.g0 = colorStateList;
        vp vpVar = this.c;
        if (vpVar != null) {
            vpVar.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        vp vpVar = this.b;
        if (!zIsEmpty) {
            if (vpVar == null) {
                Context context = getContext();
                vp vpVar2 = new vp(context, null);
                this.b = vpVar2;
                vpVar2.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.O;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f0;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!n(this.b)) {
                b(this.b, true);
            }
        } else if (vpVar != null && n(vpVar)) {
            removeView(this.b);
            this.k0.remove(this.b);
        }
        vp vpVar3 = this.b;
        if (vpVar3 != null) {
            vpVar3.setText(charSequence);
        }
        this.d0 = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.V = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.T = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.S = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.U = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f0 = colorStateList;
        vp vpVar = this.b;
        if (vpVar != null) {
            vpVar.setTextColor(colorStateList);
        }
    }

    public final void t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = i28.a(this);
            j28 j28Var = this.r0;
            int i = 0;
            boolean z = (j28Var == null || j28Var.b == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.v0) ? false : true;
            if (!z || this.u0 != null) {
                if (z || (onBackInvokedDispatcher = this.u0) == null) {
                    return;
                }
                i28.d(onBackInvokedDispatcher, this.t0);
                this.u0 = null;
                return;
            }
            OnBackInvokedCallback onBackInvokedCallbackB = this.t0;
            if (onBackInvokedCallbackB == null) {
                onBackInvokedCallbackB = i28.b(new h28(this, i));
                this.t0 = onBackInvokedCallbackB;
            }
            i28.c(onBackInvokedDispatcherA, onBackInvokedCallbackB);
            this.u0 = onBackInvokedDispatcherA;
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(y03.c(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setOnMenuItemClickListener(l28 l28Var) {
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(y03.c(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(y03.c(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
