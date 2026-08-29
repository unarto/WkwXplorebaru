package com.amazon.device.iap.internal.b.b;

import android.app.Activity;
import android.content.Intent;
import com.amazon.android.framework.context.ContextManager;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.task.Task;
import com.amazon.android.framework.task.TaskManager;
import com.amazon.android.framework.task.pipeline.TaskPipelineId;
import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.i;
import com.amazon.device.iap.internal.util.MetricsHelper;
import com.amazon.venezia.command.SuccessResult;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
abstract class a extends i {
    private static final String d = "a";

    @Resource
    protected TaskManager a;

    @Resource
    protected ContextManager b;
    protected final String c;

    public a(e eVar, String str, String str2) {
        super(eVar, "purchase_item", str);
        this.c = str2;
        a("sku", str2);
    }

    @Override // com.amazon.device.iap.internal.b.i
    public boolean a(SuccessResult successResult) {
        Map data = successResult.getData();
        String str = d;
        com.amazon.device.iap.internal.util.e.a(str, "data: " + data);
        if (!data.containsKey("purchaseItemIntent")) {
            com.amazon.device.iap.internal.util.e.b(str, "did not find intent");
            return false;
        }
        com.amazon.device.iap.internal.util.e.a(str, "found intent");
        final Intent intent = (Intent) data.remove("purchaseItemIntent");
        this.a.enqueueAtFront(TaskPipelineId.FOREGROUND, new Task() { // from class: com.amazon.device.iap.internal.b.b.a.1
            public void execute() {
                try {
                    Activity visible = a.this.b.getVisible();
                    if (visible == null) {
                        visible = a.this.b.getRoot();
                    }
                    com.amazon.device.iap.internal.util.e.a(a.d, "About to fire intent with activity " + visible);
                    visible.startActivity(intent);
                } catch (Exception e) {
                    MetricsHelper.submitExceptionMetrics(a.this.c(), a.d + ".onResult().execute()", e);
                    com.amazon.device.iap.internal.util.e.b(a.d, "Exception when attempting to fire intent: " + e);
                }
            }
        });
        return true;
    }
}
