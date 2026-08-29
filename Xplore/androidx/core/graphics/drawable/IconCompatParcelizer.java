package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.e;
import defpackage.kh8;
import defpackage.lh8;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(kh8 kh8Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = -1;
        iconCompat.c = null;
        iconCompat.d = null;
        iconCompat.e = 0;
        iconCompat.f = 0;
        iconCompat.g = null;
        iconCompat.h = IconCompat.k;
        iconCompat.i = null;
        iconCompat.a = kh8Var.f(-1, 1);
        byte[] bArr = iconCompat.c;
        if (kh8Var.e(2)) {
            Parcel parcel = ((lh8) kh8Var).e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = kh8Var.g(iconCompat.d, 3);
        iconCompat.e = kh8Var.f(iconCompat.e, 4);
        iconCompat.f = kh8Var.f(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) kh8Var.g(iconCompat.g, 6);
        String string = iconCompat.i;
        if (kh8Var.e(7)) {
            string = ((lh8) kh8Var).e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.j;
        if (kh8Var.e(8)) {
            string2 = ((lh8) kh8Var).e.readString();
        }
        iconCompat.j = string2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                e.k("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.b = bArr3;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, kh8 kh8Var) {
        kh8Var.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            kh8Var.j(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            kh8Var.i(2);
            Parcel parcel = ((lh8) kh8Var).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            kh8Var.k(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            kh8Var.j(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            kh8Var.j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            kh8Var.k(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            kh8Var.i(7);
            ((lh8) kh8Var).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            kh8Var.i(8);
            ((lh8) kh8Var).e.writeString(str2);
        }
    }
}
