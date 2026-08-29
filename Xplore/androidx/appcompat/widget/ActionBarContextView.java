package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lonelycatgames.Xplore.R;
import defpackage.b8;
import defpackage.dk8;
import defpackage.f8;
import defpackage.jj8;
import defpackage.kz4;
import defpackage.lk8;
import defpackage.p7;
import defpackage.pa6;
import defpackage.ry4;
import defpackage.un2;
import defpackage.y03;
import defpackage.y7;
import defpackage.z1;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public dk8 I;
    public boolean J;
    public boolean K;
    public CharSequence L;
    public CharSequence M;
    public View N;
    public View O;
    public View P;
    public LinearLayout Q;
    public TextView R;
    public TextView S;
    public final int T;
    public final int U;
    public boolean V;
    public final int W;
    public final z1 a;
    public final Context b;
    public ActionMenuView c;
    public b8 d;
    public int e;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.a = new z1(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pa6.d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : y03.c(context, resourceId));
        this.T = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.U = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.W = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void c(f8 f8Var) {
        View view = this.N;
        int i = 0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.W, (ViewGroup) this, false);
            this.N = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.N);
        }
        View viewFindViewById = this.N.findViewById(R.id.action_mode_close_button);
        this.O = viewFindViewById;
        viewFindViewById.setOnClickListener(new p7(i, f8Var));
        ry4 ry4VarG = f8Var.g();
        b8 b8Var = this.d;
        if (b8Var != null) {
            b8Var.g();
            y7 y7Var = b8Var.W;
            if (y7Var != null && y7Var.b()) {
                y7Var.i.dismiss();
            }
        }
        b8 b8Var2 = new b8(getContext());
        this.d = b8Var2;
        b8Var2.O = true;
        b8Var2.P = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        ry4VarG.b(this.d, this.b);
        b8 b8Var3 = this.d;
        kz4 kz4Var = b8Var3.K;
        if (kz4Var == null) {
            kz4 kz4Var2 = (kz4) b8Var3.d.inflate(b8Var3.I, (ViewGroup) this, false);
            b8Var3.K = kz4Var2;
            kz4Var2.b(b8Var3.c);
            b8Var3.i();
        }
        kz4 kz4Var3 = b8Var3.K;
        if (kz4Var != kz4Var3) {
            ((ActionMenuView) kz4Var3).setPresenter(b8Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) kz4Var3;
        this.c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.c, layoutParams);
    }

    public final void d() {
        if (this.Q == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.Q = linearLayout;
            this.R = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.S = (TextView) this.Q.findViewById(R.id.action_bar_subtitle);
            int i = this.T;
            if (i != 0) {
                this.R.setTextAppearance(getContext(), i);
            }
            int i2 = this.U;
            if (i2 != 0) {
                this.S.setTextAppearance(getContext(), i2);
            }
        }
        this.R.setText(this.L);
        this.S.setText(this.M);
        boolean zIsEmpty = TextUtils.isEmpty(this.L);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.M);
        this.S.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.Q.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.Q.getParent() == null) {
            addView(this.Q);
        }
    }

    public final void e() {
        removeAllViews();
        this.P = null;
        this.c = null;
        this.d = null;
        View view = this.O;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.I != null ? this.a.a : getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    public CharSequence getSubtitle() {
        return this.M;
    }

    public CharSequence getTitle() {
        return this.L;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            dk8 dk8Var = this.I;
            if (dk8Var != null) {
                dk8Var.b();
            }
            super.setVisibility(i);
        }
    }

    public final dk8 i(int i, long j) {
        dk8 dk8Var = this.I;
        if (dk8Var != null) {
            dk8Var.b();
        }
        z1 z1Var = this.a;
        if (i != 0) {
            dk8 dk8VarA = jj8.a(this);
            dk8VarA.a(0.0f);
            dk8VarA.c(j);
            ((ActionBarContextView) z1Var.c).I = dk8VarA;
            z1Var.a = i;
            dk8VarA.d(z1Var);
            return dk8VarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        dk8 dk8VarA2 = jj8.a(this);
        dk8VarA2.a(1.0f);
        dk8VarA2.c(j);
        ((ActionBarContextView) z1Var.c).I = dk8VarA2;
        z1Var.a = i;
        dk8VarA2.d(z1Var);
        return dk8VarA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, pa6.a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        b8 b8Var = this.d;
        if (b8Var != null) {
            Configuration configuration2 = b8Var.b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            b8Var.S = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            ry4 ry4Var = b8Var.c;
            if (ry4Var != null) {
                ry4Var.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b8 b8Var = this.d;
        if (b8Var != null) {
            b8Var.g();
            y7 y7Var = this.d.W;
            if (y7Var == null || !y7Var.b()) {
                return;
            }
            y7Var.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.K = false;
        }
        if (!this.K) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.K = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.K = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = lk8.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.N;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.N.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iG = g(this.N, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? iG - i6 : iG + i6;
        }
        LinearLayout linearLayout = this.Q;
        if (linearLayout != null && this.P == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.Q, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.P;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            un2.j(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            un2.j(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.N;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.N.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.Q;
        if (linearLayout != null && this.P == null) {
            if (this.V) {
                this.Q.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.Q.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.Q.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.P;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.P.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.J = false;
        }
        if (!this.J) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.J = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.J = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.P;
        if (view2 != null) {
            removeView(view2);
        }
        this.P = view;
        if (view != null && (linearLayout = this.Q) != null) {
            removeView(linearLayout);
            this.Q = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.M = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.L = charSequence;
        d();
        jj8.k(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.V) {
            requestLayout();
        }
        this.V = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
