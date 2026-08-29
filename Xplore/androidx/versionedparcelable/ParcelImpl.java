package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ey8;
import defpackage.lh8;
import defpackage.mh8;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new ey8(24);
    public final mh8 a;

    public ParcelImpl(Parcel parcel) {
        this.a = new lh8(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new lh8(parcel).l(this.a);
    }

    public ParcelImpl(mh8 mh8Var) {
        this.a = mh8Var;
    }
}
