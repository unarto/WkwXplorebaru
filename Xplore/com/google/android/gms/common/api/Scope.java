package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.q7a;
import defpackage.skc;
import defpackage.w3a;
import defpackage.y4;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends y4 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new w3a(17);
    public final int a;
    public final String b;

    public Scope(int i, String str) {
        q7a.g(str, "scopeUri must not be null or empty");
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.b.equals(((Scope) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iQ = skc.q(parcel, 20293);
        skc.p(parcel, 1, 4);
        parcel.writeInt(this.a);
        skc.j(parcel, 2, this.b);
        skc.r(parcel, iQ);
    }
}
