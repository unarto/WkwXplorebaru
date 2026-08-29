package com.amazon.device.iap.internal.b;

import android.content.Context;
import android.os.Handler;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class e {
    private static final String a = "e";
    private final RequestId b;
    private final h c = new h();
    private i d = null;

    public e(RequestId requestId) {
        this.b = requestId;
    }

    public void a(final Object obj, final i iVar) {
        com.amazon.device.iap.internal.util.d.a(obj, "response");
        Context contextB = com.amazon.device.iap.internal.d.d().b();
        final PurchasingListener purchasingListenerA = com.amazon.device.iap.internal.d.d().a();
        if (contextB != null && purchasingListenerA != null) {
            new Handler(contextB.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.iap.internal.b.e.1
                @Override // java.lang.Runnable
                public void run() {
                    e.this.d().a("notifyListenerResult", Boolean.FALSE);
                    try {
                        Object obj2 = obj;
                        if (obj2 instanceof ProductDataResponse) {
                            purchasingListenerA.onProductDataResponse((ProductDataResponse) obj2);
                        } else if (obj2 instanceof UserDataResponse) {
                            purchasingListenerA.onUserDataResponse((UserDataResponse) obj2);
                        } else if (obj2 instanceof PurchaseUpdatesResponse) {
                            PurchaseUpdatesResponse purchaseUpdatesResponse = (PurchaseUpdatesResponse) obj2;
                            purchasingListenerA.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
                            Object objA = e.this.d().a("newCursor");
                            if (objA != null && (objA instanceof String)) {
                                com.amazon.device.iap.internal.util.b.a(purchaseUpdatesResponse.getUserData().getUserId(), objA.toString());
                            }
                        } else if (obj2 instanceof PurchaseResponse) {
                            purchasingListenerA.onPurchaseResponse((PurchaseResponse) obj2);
                        } else {
                            com.amazon.device.iap.internal.util.e.b(e.a, "Unknown response type:".concat(obj.getClass().getName()));
                        }
                        e.this.d().a("notifyListenerResult", Boolean.TRUE);
                    } catch (Throwable th) {
                        com.amazon.device.iap.internal.util.e.b(e.a, "Error in sendResponse: " + th);
                    }
                    i iVar2 = iVar;
                    if (iVar2 != null) {
                        iVar2.a(true);
                        iVar.a_();
                    }
                }
            });
        } else {
            com.amazon.device.iap.internal.util.e.a(a, "PurchasingListener is not set. Dropping response: " + obj);
        }
    }

    public RequestId c() {
        return this.b;
    }

    public h d() {
        return this.c;
    }

    public void e() {
        i iVar = this.d;
        if (iVar != null) {
            iVar.a_();
        } else {
            a();
        }
    }

    public void b() {
    }

    public void a(i iVar) {
        this.d = iVar;
    }

    public void a(Object obj) {
        a(obj, null);
    }

    public void a() {
    }
}
