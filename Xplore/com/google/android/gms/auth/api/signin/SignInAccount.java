package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.q7a;
import defpackage.rz5;
import defpackage.skc;
import defpackage.y4;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public class SignInAccount extends y4 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new rz5(23);
    public final String a;
    public final GoogleSignInAccount b;
    public final String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        q7a.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        q7a.g(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iQ = skc.q(parcel, 20293);
        skc.j(parcel, 4, this.a);
        skc.i(parcel, 7, this.b, i);
        skc.j(parcel, 8, this.c);
        skc.r(parcel, iQ);
    }
}
