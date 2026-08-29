package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import defpackage.c8;
import defpackage.jz4;
import defpackage.pa6;
import defpackage.qy4;
import defpackage.ry4;
import defpackage.s28;
import defpackage.vp;
import defpackage.vy4;
import defpackage.w7;
import defpackage.x7;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends vp implements jz4, View.OnClickListener, c8 {
    public vy4 K;
    public CharSequence L;
    public Drawable M;
    public qy4 N;
    public w7 O;
    public x7 P;
    public boolean Q;
    public boolean R;
    public final int S;
    public int T;
    public final int U;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.Q = m();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pa6.c, 0, 0);
        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.U = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.T = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.jz4
    public final void a(vy4 vy4Var) {
        this.K = vy4Var;
        setIcon(vy4Var.getIcon());
        setTitle(vy4Var.getTitleCondensed());
        setId(vy4Var.a);
        setVisibility(vy4Var.isVisible() ? 0 : 8);
        setEnabled(vy4Var.isEnabled());
        if (vy4Var.hasSubMenu() && this.O == null) {
            this.O = new w7(this);
        }
    }

    @Override // defpackage.c8
    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.c8
    public final boolean e() {
        return !TextUtils.isEmpty(getText()) && this.K.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.jz4
    public vy4 getItemData() {
        return this.K;
    }

    public final boolean m() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void n() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.L);
        if (this.M != null && ((this.K.y & 4) != 4 || (!this.Q && !this.R))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.L : null);
        CharSequence charSequence = this.K.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.K.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.K.r;
        if (TextUtils.isEmpty(charSequence2)) {
            s28.a(this, z3 ? null : this.K.e);
        } else {
            s28.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        qy4 qy4Var = this.N;
        if (qy4Var != null) {
            qy4Var.a(this.K);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.Q = m();
        n();
    }

    @Override // defpackage.vp, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.T) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.S;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.M == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.M.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        w7 w7Var;
        if (this.K.hasSubMenu() && (w7Var = this.O) != null && w7Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.R != z) {
            this.R = z;
            vy4 vy4Var = this.K;
            if (vy4Var != null) {
                ry4 ry4Var = vy4Var.n;
                ry4Var.k = true;
                ry4Var.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.M = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.U;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        n();
    }

    public void setItemInvoker(qy4 qy4Var) {
        this.N = qy4Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.T = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(x7 x7Var) {
        this.P = x7Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.L = charSequence;
        n();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
