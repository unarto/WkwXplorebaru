package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.bva;
import defpackage.q7a;
import defpackage.skc;
import defpackage.wx8;
import defpackage.y4;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class CameraPosition extends y4 implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new wx8(8);
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        q7a.j(latLng, "camera target must not be null.");
        boolean z = false;
        if (f2 >= 0.0f && f2 <= 90.0f) {
            z = true;
        }
        q7a.c(z, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.a = latLng;
        this.b = f;
        this.c = f2 + 0.0f;
        this.d = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.a.equals(cameraPosition.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(cameraPosition.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(cameraPosition.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(cameraPosition.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d)});
    }

    public final String toString() {
        bva bvaVar = new bva(this);
        bvaVar.e(this.a, "target");
        bvaVar.e(Float.valueOf(this.b), "zoom");
        bvaVar.e(Float.valueOf(this.c), "tilt");
        bvaVar.e(Float.valueOf(this.d), "bearing");
        return bvaVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iQ = skc.q(parcel, 20293);
        skc.i(parcel, 2, this.a, i);
        skc.p(parcel, 3, 4);
        parcel.writeFloat(this.b);
        skc.p(parcel, 4, 4);
        parcel.writeFloat(this.c);
        skc.p(parcel, 5, 4);
        parcel.writeFloat(this.d);
        skc.r(parcel, iQ);
    }
}
