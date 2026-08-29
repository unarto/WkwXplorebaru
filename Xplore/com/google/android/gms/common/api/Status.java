package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.bva;
import defpackage.cfd;
import defpackage.jz0;
import defpackage.skc;
import defpackage.ti6;
import defpackage.w3a;
import defpackage.y4;
import defpackage.yu4;
import defpackage.zx9;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class Status extends y4 implements ti6, ReflectedParcelable {
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final jz0 d;
    public static final Status e = new Status(0, null, null, null);
    public static final Status I = new Status(14, null, null, null);
    public static final Status J = new Status(8, null, null, null);
    public static final Status K = new Status(15, null, null, null);
    public static final Status L = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new w3a(22);

    public Status(int i, String str, PendingIntent pendingIntent, jz0 jz0Var) {
        this.a = i;
        this.b = str;
        this.c = pendingIntent;
        this.d = jz0Var;
    }

    public final boolean b() {
        return this.a <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && cfd.a(this.b, status.b) && cfd.a(this.c, status.c) && cfd.a(this.d, status.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        bva bvaVar = new bva(this);
        String strI = this.b;
        if (strI == null) {
            int i = this.a;
            switch (i) {
                case -1:
                    strI = "SUCCESS_CACHE";
                    break;
                case 0:
                    strI = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    strI = yu4.i(i, "unknown status code: ", new StringBuilder(String.valueOf(i).length() + 21));
                    break;
                case 2:
                    strI = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strI = "SERVICE_DISABLED";
                    break;
                case 4:
                    strI = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strI = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strI = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strI = "NETWORK_ERROR";
                    break;
                case 8:
                    strI = "INTERNAL_ERROR";
                    break;
                case 10:
                    strI = "DEVELOPER_ERROR";
                    break;
                case 13:
                    strI = "ERROR";
                    break;
                case 14:
                    strI = "INTERRUPTED";
                    break;
                case 15:
                    strI = "TIMEOUT";
                    break;
                case 16:
                    strI = "CANCELED";
                    break;
                case 17:
                    strI = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strI = "DEAD_CLIENT";
                    break;
                case 19:
                    strI = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strI = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case zx9.zzm /* 21 */:
                    strI = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strI = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        bvaVar.e(strI, "statusCode");
        bvaVar.e(this.c, "resolution");
        return bvaVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iQ = skc.q(parcel, 20293);
        skc.p(parcel, 1, 4);
        parcel.writeInt(this.a);
        skc.j(parcel, 2, this.b);
        skc.i(parcel, 3, this.c, i);
        skc.i(parcel, 4, this.d, i);
        skc.r(parcel, iQ);
    }

    @Override // defpackage.ti6
    public final Status a() {
        return this;
    }
}
