package com.amazon.device.iap.internal.c;

import defpackage.tv0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
class d {
    private final String a;
    private final String b;
    private final long c;
    private final String d;

    public d(String str, String str2, String str3, long j) {
        this.a = str;
        this.b = str2;
        this.d = str3;
        this.c = j;
    }

    public static d a(String str) throws e {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new d(jSONObject.getString("KEY_USER_ID"), jSONObject.getString("KEY_RECEIPT_STRING"), jSONObject.getString("KEY_REQUEST_ID"), jSONObject.getLong("KEY_TIMESTAMP"));
        } catch (Throwable th) {
            throw new e(tv0.k("Input invalid for PendingReceipt Object:", str), th);
        }
    }

    public String b() {
        return this.b;
    }

    public long c() {
        return this.c;
    }

    public String d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("KEY_USER_ID", this.a);
        jSONObject.put("KEY_RECEIPT_STRING", this.b);
        jSONObject.put("KEY_REQUEST_ID", this.d);
        jSONObject.put("KEY_TIMESTAMP", this.c);
        return jSONObject.toString();
    }

    public String a() {
        return this.d;
    }
}
