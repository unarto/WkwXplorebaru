package com.google.android.gms.maps;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.bva;
import defpackage.osa;
import defpackage.skc;
import defpackage.wx8;
import defpackage.y4;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class GoogleMapOptions extends y4 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new wx8(9);
    public Boolean I;
    public Boolean J;
    public Boolean K;
    public Boolean L;
    public Boolean M;
    public Boolean N;
    public Boolean O;
    public Boolean P;
    public Float Q;
    public Float R;
    public LatLngBounds S;
    public Boolean T;
    public Integer U;
    public String V;
    public int W;
    public Boolean a;
    public Boolean b;
    public int c;
    public CameraPosition d;
    public Boolean e;

    static {
        Color.argb(255, 236, 233, 225);
    }

    public final String toString() {
        bva bvaVar = new bva(this);
        bvaVar.e(Integer.valueOf(this.c), "MapType");
        bvaVar.e(this.N, "LiteMode");
        bvaVar.e(this.d, "Camera");
        bvaVar.e(this.I, "CompassEnabled");
        bvaVar.e(this.e, "ZoomControlsEnabled");
        bvaVar.e(this.J, "ScrollGesturesEnabled");
        bvaVar.e(this.K, "ZoomGesturesEnabled");
        bvaVar.e(this.L, "TiltGesturesEnabled");
        bvaVar.e(this.M, "RotateGesturesEnabled");
        bvaVar.e(this.T, "ScrollGesturesEnabledDuringRotateOrZoom");
        bvaVar.e(this.O, "MapToolbarEnabled");
        bvaVar.e(this.P, "AmbientEnabled");
        bvaVar.e(this.Q, "MinZoomPreference");
        bvaVar.e(this.R, "MaxZoomPreference");
        bvaVar.e(this.U, "BackgroundColor");
        bvaVar.e(this.S, "LatLngBoundsForCameraTarget");
        bvaVar.e(this.a, "ZOrderOnTop");
        bvaVar.e(this.b, "UseViewLifecycleInFragment");
        bvaVar.e(Integer.valueOf(this.W), "mapColorScheme");
        return bvaVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iQ = skc.q(parcel, 20293);
        byte bH = osa.h(this.a);
        skc.p(parcel, 2, 4);
        parcel.writeInt(bH);
        byte bH2 = osa.h(this.b);
        skc.p(parcel, 3, 4);
        parcel.writeInt(bH2);
        int i2 = this.c;
        skc.p(parcel, 4, 4);
        parcel.writeInt(i2);
        skc.i(parcel, 5, this.d, i);
        byte bH3 = osa.h(this.e);
        skc.p(parcel, 6, 4);
        parcel.writeInt(bH3);
        byte bH4 = osa.h(this.I);
        skc.p(parcel, 7, 4);
        parcel.writeInt(bH4);
        byte bH5 = osa.h(this.J);
        skc.p(parcel, 8, 4);
        parcel.writeInt(bH5);
        byte bH6 = osa.h(this.K);
        skc.p(parcel, 9, 4);
        parcel.writeInt(bH6);
        byte bH7 = osa.h(this.L);
        skc.p(parcel, 10, 4);
        parcel.writeInt(bH7);
        byte bH8 = osa.h(this.M);
        skc.p(parcel, 11, 4);
        parcel.writeInt(bH8);
        byte bH9 = osa.h(this.N);
        skc.p(parcel, 12, 4);
        parcel.writeInt(bH9);
        byte bH10 = osa.h(this.O);
        skc.p(parcel, 14, 4);
        parcel.writeInt(bH10);
        byte bH11 = osa.h(this.P);
        skc.p(parcel, 15, 4);
        parcel.writeInt(bH11);
        Float f = this.Q;
        if (f != null) {
            skc.p(parcel, 16, 4);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.R;
        if (f2 != null) {
            skc.p(parcel, 17, 4);
            parcel.writeFloat(f2.floatValue());
        }
        skc.i(parcel, 18, this.S, i);
        byte bH12 = osa.h(this.T);
        skc.p(parcel, 19, 4);
        parcel.writeInt(bH12);
        Integer num = this.U;
        if (num != null) {
            skc.p(parcel, 20, 4);
            parcel.writeInt(num.intValue());
        }
        skc.j(parcel, 21, this.V);
        int i3 = this.W;
        skc.p(parcel, 23, 4);
        parcel.writeInt(i3);
        skc.r(parcel, iQ);
    }
}
