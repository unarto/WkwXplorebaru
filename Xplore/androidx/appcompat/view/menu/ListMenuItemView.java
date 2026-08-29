package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.lonelycatgames.Xplore.R;
import defpackage.jz4;
import defpackage.mjb;
import defpackage.pa6;
import defpackage.ry4;
import defpackage.vy4;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements jz4, AbsListView.SelectionBoundsAdjuster {
    public TextView I;
    public ImageView J;
    public ImageView K;
    public LinearLayout L;
    public final Drawable M;
    public final int N;
    public final Context O;
    public boolean P;
    public final Drawable Q;
    public final boolean R;
    public LayoutInflater S;
    public boolean T;
    public vy4 a;
    public ImageView b;
    public RadioButton c;
    public TextView d;
    public CheckBox e;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mjb mjbVarS = mjb.s(getContext(), attributeSet, pa6.r, R.attr.listMenuViewStyle);
        this.M = mjbVarS.o(5);
        TypedArray typedArray = (TypedArray) mjbVarS.c;
        this.N = typedArray.getResourceId(1, -1);
        this.P = typedArray.getBoolean(7, false);
        this.O = context;
        this.Q = mjbVarS.o(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.R = typedArrayObtainStyledAttributes.hasValue(0);
        mjbVarS.t();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.S;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        this.S = layoutInflaterFrom;
        return layoutInflaterFrom;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.J;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    @Override // defpackage.jz4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(vy4 vy4Var) {
        boolean z;
        String string;
        this.a = vy4Var;
        boolean zIsVisible = vy4Var.isVisible();
        ry4 ry4Var = vy4Var.n;
        int i = 0;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(vy4Var.e);
        setCheckable(vy4Var.isCheckable());
        if (ry4Var.o()) {
            if ((ry4Var.n() ? vy4Var.j : vy4Var.h) != 0) {
                z = true;
            }
        } else {
            z = false;
        }
        ry4Var.n();
        if (z) {
            vy4 vy4Var2 = this.a;
            ry4 ry4Var2 = vy4Var2.n;
            if (ry4Var2.o()) {
                if ((ry4Var2.n() ? vy4Var2.j : vy4Var2.h) == 0) {
                }
            } else {
                i = 8;
            }
        }
        if (i == 0) {
            TextView textView = this.I;
            vy4 vy4Var3 = this.a;
            ry4 ry4Var3 = vy4Var3.n;
            Context context = ry4Var3.a;
            char c = ry4Var3.n() ? vy4Var3.j : vy4Var3.h;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = ry4Var3.n() ? vy4Var3.k : vy4Var3.i;
                vy4.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb);
                vy4.c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb);
                vy4.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb);
                vy4.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb);
                vy4.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb);
                vy4.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb);
                if (c == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.I.getVisibility() != i) {
            this.I.setVisibility(i);
        }
        setIcon(vy4Var.getIcon());
        setEnabled(vy4Var.isEnabled());
        setSubMenuArrowVisible(vy4Var.hasSubMenu());
        setContentDescription(vy4Var.q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.K;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.K.getLayoutParams();
        rect.top = this.K.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // defpackage.jz4
    public vy4 getItemData() {
        return this.a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.M);
        TextView textView = (TextView) findViewById(R.id.title);
        this.d = textView;
        int i = this.N;
        if (i != -1) {
            textView.setTextAppearance(this.O, i);
        }
        this.I = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.J = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.Q);
        }
        this.K = (ImageView) findViewById(R.id.group_divider);
        this.L = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.b != null && this.P) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        CompoundButton compoundButton3;
        if (!z && this.c == null && this.e == null) {
            return;
        }
        if ((this.a.x & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.L;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
            compoundButton2 = this.e;
            compoundButton3 = compoundButton2;
        } else {
            if (this.e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.e = checkBox;
                LinearLayout linearLayout2 = this.L;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
            compoundButton2 = this.c;
            compoundButton3 = compoundButton;
        }
        if (!z) {
            if (compoundButton3 != null) {
                compoundButton3.setVisibility(8);
            }
            RadioButton radioButton2 = this.c;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
                return;
            }
            return;
        }
        compoundButton.setChecked(this.a.isChecked());
        if (compoundButton.getVisibility() != 0) {
            compoundButton.setVisibility(0);
        }
        if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
            return;
        }
        compoundButton2.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.a.x & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.L;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
        } else {
            if (this.e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.e = checkBox;
                LinearLayout linearLayout2 = this.L;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.T = z;
        this.P = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.K;
        if (imageView != null) {
            imageView.setVisibility((this.R || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        ry4 ry4Var = this.a.n;
        boolean z = this.T;
        if (z || this.P) {
            ImageView imageView = this.b;
            if (imageView == null && drawable == null && !this.P) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.b = imageView2;
                LinearLayout linearLayout = this.L;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.P) {
                this.b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.b.getVisibility() != 0) {
                this.b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.d;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.d.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        }
    }
}
