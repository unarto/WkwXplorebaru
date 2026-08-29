package com.amazon.device.iap.internal.b;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.amazon.android.framework.context.ContextManager;
import com.amazon.android.framework.prompt.PromptContent;
import com.amazon.android.framework.prompt.SimplePrompt;
import com.amazon.android.framework.resource.Resource;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class b extends SimplePrompt {
    private static final String a = "b";

    @Resource
    private ContextManager b;
    private final PromptContent c;

    public b(PromptContent promptContent) {
        super(promptContent);
        this.c = promptContent;
    }

    public void doAction() {
        com.amazon.device.iap.internal.util.e.a(a, "doAction");
        if ("Amazon Appstore required".equalsIgnoreCase(this.c.getTitle()) || "Amazon Appstore Update Required".equalsIgnoreCase(this.c.getTitle())) {
            try {
                Activity visible = this.b.getVisible();
                if (visible == null) {
                    visible = this.b.getRoot();
                }
                visible.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl")));
            } catch (Exception e) {
                com.amazon.device.iap.internal.util.e.b(a, "Exception in PurchaseItemCommandTask.OnSuccess: " + e);
            }
        }
    }

    public long getExpirationDurationInSeconds() {
        return 31536000L;
    }

    public String toString() {
        return a;
    }
}
