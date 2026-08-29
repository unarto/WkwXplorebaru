package com.amazon.device.iap.internal.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.amazon.device.iap.model.Receipt;
import defpackage.sp1;
import defpackage.tv0;
import defpackage.yu4;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class a {
    private static final String a = "a";
    private static final String b = a.class.getName().concat("_PREFS");
    private static final String c = a.class.getName().concat("_CLEANER_PREFS");
    private static int d = 604800000;
    private static final a e = new a();

    private void e() {
        com.amazon.device.iap.internal.util.e.a(a, "enter old receipts cleanup! ");
        final Context contextB = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(contextB, "context");
        a(System.currentTimeMillis());
        new Handler().post(new Runnable() { // from class: com.amazon.device.iap.internal.c.a.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.amazon.device.iap.internal.util.e.a(a.a, "perform house keeping! ");
                    SharedPreferences sharedPreferences = contextB.getSharedPreferences(a.b, 0);
                    for (String str : sharedPreferences.getAll().keySet()) {
                        try {
                            if (System.currentTimeMillis() - d.a(sharedPreferences.getString(str, null)).c() > a.d) {
                                com.amazon.device.iap.internal.util.e.a(a.a, "house keeping - try remove Receipt:" + str + " since it's too old");
                                a.this.a(str);
                            }
                        } catch (e unused) {
                            com.amazon.device.iap.internal.util.e.a(a.a, "house keeping - try remove Receipt:" + str + " since it's invalid ");
                            a.this.a(str);
                        }
                    }
                } catch (Throwable th) {
                    com.amazon.device.iap.internal.util.e.a(a.a, "Error in running cleaning job:" + th);
                }
            }
        });
    }

    private long f() {
        Context contextB = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(contextB, "context");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = contextB.getSharedPreferences(c, 0).getLong("LAST_CLEANING_TIME", 0L);
        if (j != 0) {
            return j;
        }
        a(jCurrentTimeMillis);
        return jCurrentTimeMillis;
    }

    public void a(String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        String str7 = a;
        com.amazon.device.iap.internal.util.e.a(str7, "enter saveReceipt for receipt [" + str4 + "]");
        try {
            com.amazon.device.iap.internal.util.d.a(str2, "userId");
            com.amazon.device.iap.internal.util.d.a(str3, "receiptId");
            com.amazon.device.iap.internal.util.d.a(str4, "receiptString");
            Context contextB = com.amazon.device.iap.internal.d.d().b();
            com.amazon.device.iap.internal.util.d.a(contextB, "context");
            str5 = str;
            str6 = str4;
            try {
                d dVar = new d(str2, str6, str5, System.currentTimeMillis());
                SharedPreferences.Editor editorEdit = contextB.getSharedPreferences(b, 0).edit();
                editorEdit.putString(str3, dVar.d());
                editorEdit.commit();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                String str8 = a;
                StringBuilder sbQ = tv0.q("error in saving pending receipt:", str5, "/", str6, ":");
                sbQ.append(th2.getMessage());
                com.amazon.device.iap.internal.util.e.a(str8, sbQ.toString());
                str7 = str8;
            }
        } catch (Throwable th3) {
            th = th3;
            str5 = str;
            str6 = str4;
        }
        com.amazon.device.iap.internal.util.e.a(str7, "leaving saveReceipt for receipt id [" + str3 + "]");
    }

    public Set<Receipt> b(String str) {
        Context contextB = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(contextB, "context");
        String str2 = a;
        com.amazon.device.iap.internal.util.e.a(str2, "enter getLocalReceipts for user[" + str + "]");
        HashSet hashSet = new HashSet();
        if (com.amazon.device.iap.internal.util.d.a(str)) {
            com.amazon.device.iap.internal.util.e.b(str2, "empty UserId: " + str);
            sp1.n(tv0.k("Invalid UserId:", str));
            return null;
        }
        Map<String, ?> all = contextB.getSharedPreferences(b, 0).getAll();
        for (String str3 : all.keySet()) {
            String str4 = (String) all.get(str3);
            try {
                d dVarA = d.a(str4);
                hashSet.add(com.amazon.device.iap.internal.util.a.a(new JSONObject(dVarA.b()), str, dVarA.a()));
            } catch (com.amazon.device.iap.internal.b.d unused) {
                a(str3);
                com.amazon.device.iap.internal.util.e.b(a, "failed to verify signature:[" + str4 + "]");
            } catch (JSONException unused2) {
                a(str3);
                com.amazon.device.iap.internal.util.e.b(a, "failed to convert string to JSON object:[" + str4 + "]");
            } catch (Throwable unused3) {
                com.amazon.device.iap.internal.util.e.b(a, "failed to load the receipt from SharedPreference:[" + str4 + "]");
            }
        }
        String str5 = a;
        StringBuilder sbR = yu4.r("leaving getLocalReceipts for user[", str, "], ");
        sbR.append(hashSet.size());
        sbR.append(" local receipts found.");
        com.amazon.device.iap.internal.util.e.a(str5, sbR.toString());
        if (System.currentTimeMillis() - f() > d) {
            e();
        }
        return hashSet;
    }

    public String c(String str) {
        Context contextB = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(contextB, "context");
        if (!com.amazon.device.iap.internal.util.d.a(str)) {
            String string = contextB.getSharedPreferences(b, 0).getString(str, null);
            if (string != null) {
                try {
                    return d.a(string).a();
                } catch (e unused) {
                }
            }
            return null;
        }
        com.amazon.device.iap.internal.util.e.b(a, "empty receiptId: " + str);
        sp1.n(tv0.k("Invalid ReceiptId:", str));
        return null;
    }

    public void a(String str) {
        String str2 = a;
        com.amazon.device.iap.internal.util.e.a(str2, "enter removeReceipt for receipt[" + str + "]");
        Context contextB = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(contextB, "context");
        SharedPreferences.Editor editorEdit = contextB.getSharedPreferences(b, 0).edit();
        editorEdit.remove(str);
        editorEdit.commit();
        com.amazon.device.iap.internal.util.e.a(str2, "leave removeReceipt for receipt[" + str + "]");
    }

    private void a(long j) {
        Context contextB = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(contextB, "context");
        SharedPreferences.Editor editorEdit = contextB.getSharedPreferences(c, 0).edit();
        editorEdit.putLong("LAST_CLEANING_TIME", j);
        editorEdit.commit();
    }

    public static a a() {
        return e;
    }
}
