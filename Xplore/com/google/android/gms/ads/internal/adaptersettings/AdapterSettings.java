package com.google.android.gms.ads.internal.adaptersettings;

import defpackage.dy9;
import defpackage.kq9;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
class AdapterSettings {
    private static volatile AdapterSettings instance;
    private final dy9 adapterSettingsInternal = kq9.e.d;

    private boolean getBoolean(String str, boolean z) {
        dy9 dy9Var = this.adapterSettingsInternal;
        dy9Var.getClass();
        return !str.startsWith("adapter:") ? z : dy9Var.c.optBoolean(str, z);
    }

    private float getFloat(String str, float f) {
        dy9 dy9Var = this.adapterSettingsInternal;
        dy9Var.getClass();
        return !str.startsWith("adapter:") ? f : (float) dy9Var.c.optDouble(str, f);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                try {
                    if (instance == null) {
                        instance = new AdapterSettings();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private int getInt(String str, int i) {
        dy9 dy9Var = this.adapterSettingsInternal;
        dy9Var.getClass();
        return !str.startsWith("adapter:") ? i : dy9Var.c.optInt(str, i);
    }

    private long getLong(String str, long j) {
        dy9 dy9Var = this.adapterSettingsInternal;
        dy9Var.getClass();
        return !str.startsWith("adapter:") ? j : dy9Var.c.optLong(str, j);
    }

    private String getString(String str, String str2) {
        dy9 dy9Var = this.adapterSettingsInternal;
        dy9Var.getClass();
        return !str.startsWith("adapter:") ? str2 : dy9Var.c.optString(str, str2);
    }
}
