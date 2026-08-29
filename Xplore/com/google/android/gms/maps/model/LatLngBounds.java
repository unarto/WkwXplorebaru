package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.bva;
import defpackage.q7a;
import defpackage.skc;
import defpackage.wkb;
import defpackage.y4;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class LatLngBounds extends y4 implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new wkb(26);
    public final LatLng a;
    public final LatLng b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        q7a.j(latLng, "southwest must not be null.");
        q7a.j(latLng2, "northeast must not be null.");
        double d = latLng2.a;
        double d2 = latLng.a;
        q7a.c(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(d));
        this.a = latLng;
        this.b = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.a.equals(latLngBounds.a) && this.b.equals(latLngBounds.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        bva bvaVar = new bva(this);
        bvaVar.e(this.a, "southwest");
        bvaVar.e(this.b, "northeast");
        return bvaVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iQ = skc.q(parcel, 20293);
        skc.i(parcel, 2, this.a, i);
        skc.i(parcel, 3, this.b, i);
        skc.r(parcel, iQ);
    }
}
