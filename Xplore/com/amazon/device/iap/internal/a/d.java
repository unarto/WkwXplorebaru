package com.amazon.device.iap.internal.a;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.amazon.device.iap.internal.b {
    private static final Map<Class, Class> a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put(com.amazon.device.iap.internal.c.class, c.class);
        map.put(com.amazon.device.iap.internal.a.class, a.class);
    }

    @Override // com.amazon.device.iap.internal.b
    public <T> Class<T> a(Class<T> cls) {
        return a.get(cls);
    }
}
