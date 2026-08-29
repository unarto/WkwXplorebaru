package com.amazon.device.iap.internal.b;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class h {
    static final /* synthetic */ boolean b = true;
    public final Map<String, Object> a = new HashMap();

    public void a(Object obj) {
        if (!b && obj == null) {
            throw new AssertionError();
        }
        this.a.put("RESPONSE", obj);
    }

    public void b() {
        this.a.remove("RESPONSE");
    }

    public void a(String str, Object obj) {
        this.a.put(str, obj);
    }

    public Object a(String str) {
        return this.a.get(str);
    }

    public Object a() {
        return this.a.get("RESPONSE");
    }
}
