package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.kh8;
import defpackage.lh8;
import defpackage.mh8;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(kh8 kh8Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        mh8 mh8VarH = remoteActionCompat.a;
        boolean z = true;
        if (kh8Var.e(1)) {
            mh8VarH = kh8Var.h();
        }
        remoteActionCompat.a = (IconCompat) mh8VarH;
        CharSequence charSequence = remoteActionCompat.b;
        if (kh8Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((lh8) kh8Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (kh8Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((lh8) kh8Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) kh8Var.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (kh8Var.e(5)) {
            z2 = ((lh8) kh8Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!kh8Var.e(6)) {
            z = z3;
        } else if (((lh8) kh8Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, kh8 kh8Var) {
        kh8Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        kh8Var.i(1);
        kh8Var.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        kh8Var.i(2);
        Parcel parcel = ((lh8) kh8Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        kh8Var.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        kh8Var.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        kh8Var.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        kh8Var.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
