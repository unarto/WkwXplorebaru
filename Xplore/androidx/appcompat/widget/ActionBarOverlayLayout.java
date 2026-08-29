package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import com.lonelycatgames.Xplore.R;
import defpackage.b8;
import defpackage.cj8;
import defpackage.ek8;
import defpackage.fa6;
import defpackage.fp8;
import defpackage.gp8;
import defpackage.hp8;
import defpackage.hz4;
import defpackage.ip8;
import defpackage.j28;
import defpackage.jj8;
import defpackage.jp8;
import defpackage.kj3;
import defpackage.kp8;
import defpackage.lp8;
import defpackage.mp8;
import defpackage.q7;
import defpackage.r28;
import defpackage.r7;
import defpackage.rb5;
import defpackage.ry4;
import defpackage.s7;
import defpackage.sb5;
import defpackage.t7;
import defpackage.tn1;
import defpackage.to8;
import defpackage.u7;
import defpackage.un2;
import defpackage.vp8;
import defpackage.y03;
import defpackage.zp8;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements rb5, sb5 {
    public static final int[] i0 = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final zp8 j0;
    public static final Rect k0;
    public Drawable I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public final Rect P;
    public final Rect Q;
    public final Rect R;
    public final Rect S;
    public zp8 T;
    public zp8 U;
    public zp8 V;
    public zp8 W;
    public int a;
    public s7 a0;
    public int b;
    public OverScroller b0;
    public ContentFrameLayout c;
    public ViewPropertyAnimator c0;
    public ActionBarContainer d;
    public final q7 d0;
    public tn1 e;
    public final r7 e0;
    public final r7 f0;
    public final fa6 g0;
    public final u7 h0;

    static {
        int i = Build.VERSION.SDK_INT;
        mp8 lp8Var = i >= 36 ? new lp8() : i >= 35 ? new kp8() : i >= 34 ? new jp8() : i >= 31 ? new ip8() : i >= 30 ? new hp8() : i >= 29 ? new gp8() : new fp8();
        lp8Var.h(kj3.b(0, 1, 0, 1));
        j0 = lp8Var.b();
        k0 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.P = new Rect();
        this.Q = new Rect();
        this.R = new Rect();
        this.S = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        zp8 zp8Var = zp8.b;
        this.T = zp8Var;
        this.U = zp8Var;
        this.V = zp8Var;
        this.W = zp8Var;
        this.d0 = new q7(0, this);
        this.e0 = new r7(this, 0);
        this.f0 = new r7(this, 1);
        i(context);
        this.g0 = new fa6(3, (byte) 0);
        u7 u7Var = new u7(context);
        u7Var.setWillNotDraw(true);
        this.h0 = u7Var;
        addView(u7Var);
    }

    public static boolean a(View view, Rect rect, boolean z) {
        boolean z2;
        t7 t7Var = (t7) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) t7Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) t7Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) t7Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) t7Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) t7Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) t7Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) t7Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) t7Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.rb5
    public final void b(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(nestedScrollView, i, i2, i3, i4);
        }
    }

    public final void c() {
        removeCallbacks(this.e0);
        removeCallbacks(this.f0);
        ViewPropertyAnimator viewPropertyAnimator = this.c0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof t7;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.I != null) {
            if (this.d.getVisibility() == 0) {
                translationY = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.I.setBounds(0, translationY, getWidth(), this.I.getIntrinsicHeight() + translationY);
            this.I.draw(canvas);
        }
    }

    @Override // defpackage.rb5
    public final boolean e(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.rb5
    public final void f(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // defpackage.rb5
    public final void g(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new t7(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new t7(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        fa6 fa6Var = this.g0;
        return fa6Var.c | fa6Var.b;
    }

    public CharSequence getTitle() {
        k();
        return ((r28) this.e).a.getTitle();
    }

    @Override // defpackage.sb5
    public final void h(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        b(nestedScrollView, i, i2, i3, i4, i5);
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(i0);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.I = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.b0 = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((r28) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((r28) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        tn1 wrapper;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof tn1) {
                wrapper = (tn1) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    un2.j("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.e = wrapper;
        }
    }

    public final void l(ry4 ry4Var, hz4 hz4Var) {
        k();
        r28 r28Var = (r28) this.e;
        Toolbar toolbar = r28Var.a;
        b8 b8Var = r28Var.m;
        if (b8Var == null) {
            b8Var = new b8(toolbar.getContext());
            r28Var.m = b8Var;
        }
        b8Var.e = hz4Var;
        if (ry4Var == null && toolbar.a == null) {
            return;
        }
        toolbar.f();
        ry4 ry4Var2 = toolbar.a.S;
        if (ry4Var2 == ry4Var) {
            return;
        }
        if (ry4Var2 != null) {
            ry4Var2.r(toolbar.q0);
            ry4Var2.r(toolbar.r0);
        }
        if (toolbar.r0 == null) {
            toolbar.r0 = new j28(toolbar);
        }
        b8Var.T = true;
        Context context = toolbar.M;
        if (ry4Var != null) {
            ry4Var.b(b8Var, context);
            ry4Var.b(toolbar.r0, toolbar.M);
        } else {
            b8Var.k(context, null);
            toolbar.r0.k(toolbar.M, null);
            b8Var.i();
            toolbar.r0.i();
        }
        toolbar.a.setPopupTheme(toolbar.N);
        toolbar.a.setPresenter(b8Var);
        toolbar.q0 = b8Var;
        toolbar.t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        zp8 zp8VarC = zp8.c(windowInsets, this);
        vp8 vp8Var = zp8VarC.a;
        boolean zA = a(this.d, new Rect(vp8Var.n().a, vp8Var.n().b, vp8Var.n().c, vp8Var.n().d), false);
        WeakHashMap weakHashMap = jj8.a;
        Rect rect = this.P;
        cj8.b(this, zp8VarC, rect);
        zp8 zp8VarR = vp8Var.r(rect.left, rect.top, rect.right, rect.bottom);
        this.T = zp8VarR;
        boolean z = true;
        if (!this.U.equals(zp8VarR)) {
            this.U = this.T;
            zA = true;
        }
        Rect rect2 = this.Q;
        if (rect2.equals(rect)) {
            z = zA;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return vp8Var.a().a.c().a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = jj8.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                t7 t7Var = (t7) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) t7Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) t7Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.d, i, 0, i2, 0);
        t7 t7Var = (t7) this.d.getLayoutParams();
        int iMax = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) t7Var).leftMargin + ((ViewGroup.MarginLayoutParams) t7Var).rightMargin);
        int iMax2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) t7Var).topMargin + ((ViewGroup.MarginLayoutParams) t7Var).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = jj8.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.a;
            if (this.K && this.d.getTabContainer() != null) {
                measuredHeight += this.a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.P;
        Rect rect2 = this.R;
        rect2.set(rect);
        this.V = this.T;
        if (this.J || z) {
            kj3 kj3VarB = kj3.b(this.V.a.n().a, this.V.a.n().b + measuredHeight, this.V.a.n().c, this.V.a.n().d);
            zp8 zp8Var = this.V;
            int i3 = Build.VERSION.SDK_INT;
            mp8 lp8Var = i3 >= 36 ? new lp8(zp8Var) : i3 >= 35 ? new kp8(zp8Var) : i3 >= 34 ? new jp8(zp8Var) : i3 >= 31 ? new ip8(zp8Var) : i3 >= 30 ? new hp8(zp8Var) : i3 >= 29 ? new gp8(zp8Var) : new fp8(zp8Var);
            lp8Var.h(kj3VarB);
            this.V = lp8Var.b();
        } else {
            u7 u7Var = this.h0;
            zp8 zp8Var2 = j0;
            Rect rect3 = this.S;
            cj8.b(u7Var, zp8Var2, rect3);
            if (!rect3.equals(k0)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.V = this.V.a.r(0, measuredHeight, 0, 0);
            }
        }
        a(this.c, rect2, true);
        if (!this.W.equals(this.V)) {
            zp8 zp8Var3 = this.V;
            this.W = zp8Var3;
            jj8.b(this.c, zp8Var3);
        }
        measureChildWithMargins(this.c, i, 0, i2, 0);
        t7 t7Var2 = (t7) this.c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) t7Var2).leftMargin + ((ViewGroup.MarginLayoutParams) t7Var2).rightMargin);
        int iMax4 = Math.max(iMax2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) t7Var2).topMargin + ((ViewGroup.MarginLayoutParams) t7Var2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.L || !z) {
            return false;
        }
        this.b0.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.b0.getFinalY() > this.d.getHeight()) {
            c();
            this.f0.run();
        } else {
            c();
            this.e0.run();
        }
        this.M = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.N + i2;
        this.N = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        to8 to8Var;
        ek8 ek8Var;
        this.g0.b = i;
        this.N = getActionBarHideOffset();
        c();
        s7 s7Var = this.a0;
        if (s7Var == null || (ek8Var = (to8Var = (to8) s7Var).s) == null) {
            return;
        }
        ek8Var.a();
        to8Var.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.L;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.L || this.M) {
            return;
        }
        if (this.N <= this.d.getHeight()) {
            c();
            postDelayed(this.e0, 600L);
        } else {
            c();
            postDelayed(this.f0, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.O ^ i;
        this.O = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        s7 s7Var = this.a0;
        if (s7Var != null) {
            to8 to8Var = (to8) s7Var;
            to8Var.o = !z2;
            if (z || !z2) {
                if (to8Var.p) {
                    to8Var.p = false;
                    to8Var.d(true);
                }
            } else if (!to8Var.p) {
                to8Var.p = true;
                to8Var.d(true);
            }
        }
        if ((i2 & 256) == 0 || this.a0 == null) {
            return;
        }
        WeakHashMap weakHashMap = jj8.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        s7 s7Var = this.a0;
        if (s7Var != null) {
            ((to8) s7Var).n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        c();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(s7 s7Var) {
        this.a0 = s7Var;
        if (getWindowToken() != null) {
            ((to8) this.a0).n = this.b;
            int i = this.O;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = jj8.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.K = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.L) {
            this.L = z;
            if (z) {
                return;
            }
            c();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        r28 r28Var = (r28) this.e;
        r28Var.d = i != 0 ? y03.c(r28Var.a.getContext(), i) : null;
        r28Var.c();
    }

    public void setLogo(int i) {
        k();
        r28 r28Var = (r28) this.e;
        r28Var.e = i != 0 ? y03.c(r28Var.a.getContext(), i) : null;
        r28Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.J = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((r28) this.e).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        r28 r28Var = (r28) this.e;
        if (r28Var.g) {
            return;
        }
        Toolbar toolbar = r28Var.a;
        r28Var.h = charSequence;
        if ((r28Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (r28Var.g) {
                jj8.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new t7(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        r28 r28Var = (r28) this.e;
        r28Var.d = drawable;
        r28Var.c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // defpackage.rb5
    public final void d(int i, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }
}
