package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.Xrg.wxHQoDKQlsBDg;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.q7a;
import defpackage.rz5;
import defpackage.skc;
import defpackage.y4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class GoogleSignInAccount extends y4 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new rz5(12);
    public String I;
    public final long J;
    public final String K;
    public final List L;
    public final String M;
    public final String N;
    public final HashSet O = new HashSet();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.I = str5;
        this.J = j;
        this.K = str6;
        this.L = arrayList;
        this.M = str7;
        this.N = str8;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.K.equals(this.K)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.L);
        hashSet.addAll(googleSignInAccount.O);
        HashSet hashSet2 = new HashSet(this.L);
        hashSet2.addAll(this.O);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.K.hashCode() + 527;
        HashSet hashSet = new HashSet(this.L);
        hashSet.addAll(this.O);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iQ = skc.q(parcel, 20293);
        skc.j(parcel, 2, this.a);
        skc.j(parcel, 3, this.b);
        skc.j(parcel, 4, this.c);
        skc.j(parcel, 5, this.d);
        skc.i(parcel, 6, this.e, i);
        skc.j(parcel, 7, this.I);
        skc.p(parcel, 8, 8);
        parcel.writeLong(this.J);
        skc.j(parcel, 9, this.K);
        skc.n(parcel, 10, this.L);
        skc.j(parcel, 11, this.M);
        skc.j(parcel, 12, this.N);
        skc.r(parcel, iQ);
    }

    public static GoogleSignInAccount b(String str) throws JSONException {
        Uri uri;
        String strOptString;
        String strOptString2;
        String strOptString3;
        String strOptString4;
        String strOptString5;
        String strOptString6 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString7 = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(strOptString7)) {
            uri = Uri.parse(strOptString7);
        } else {
            uri = null;
        }
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString8 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            strOptString = jSONObject.optString("tokenId");
        } else {
            strOptString = null;
        }
        if (jSONObject.has("email")) {
            strOptString2 = jSONObject.optString("email");
        } else {
            strOptString2 = null;
        }
        if (jSONObject.has("displayName")) {
            strOptString3 = jSONObject.optString("displayName");
        } else {
            strOptString3 = null;
        }
        if (jSONObject.has("givenName")) {
            strOptString4 = jSONObject.optString("givenName");
        } else {
            strOptString4 = null;
        }
        if (jSONObject.has("familyName")) {
            strOptString5 = jSONObject.optString("familyName");
        } else {
            strOptString5 = null;
        }
        String string = jSONObject.getString("obfuscatedIdentifier");
        q7a.f(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString8, strOptString, strOptString2, strOptString3, uri, null, j, string, new ArrayList(hashSet), strOptString4, strOptString5);
        String str2 = wxHQoDKQlsBDg.LMhq;
        if (jSONObject.has(str2)) {
            strOptString6 = jSONObject.optString(str2);
        }
        googleSignInAccount.I = strOptString6;
        return googleSignInAccount;
    }
}
