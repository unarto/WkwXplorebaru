package com.amazon.device.iap.internal.util;

import com.amazon.android.Kiwi;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Receipt;
import com.google.android.gms.ads.internal.client.hsdp.cxoJ.pJBIycHMDgrWi;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    private static final String a = "a";

    /* JADX INFO: renamed from: com.amazon.device.iap.internal.util.a$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.V2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static Receipt a(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString("token");
        String string = jSONObject.getString("sku");
        ProductType productTypeValueOf = ProductType.valueOf(jSONObject.getString("itemType").toUpperCase());
        String strOptString2 = jSONObject.optString("startDate");
        Date dateB = a(strOptString2) ? null : b(strOptString2);
        String strOptString3 = jSONObject.optString("endDate");
        return new ReceiptBuilder().setReceiptId(strOptString).setSku(string).setProductType(productTypeValueOf).setPurchaseDate(dateB).setCancelDate(a(strOptString3) ? null : b(strOptString3)).build();
    }

    private static Receipt b(JSONObject jSONObject, String str, String str2) {
        String strOptString = jSONObject.optString("signature");
        if (d.a(strOptString)) {
            e.b(a, "a signature was not found in the receipt for request ID " + str2);
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", strOptString);
            throw new com.amazon.device.iap.internal.b.d(str2, null, strOptString);
        }
        try {
            Receipt receiptA = a(jSONObject);
            String str3 = str + "-" + receiptA.getReceiptId();
            boolean zIsSignedByKiwi = Kiwi.isSignedByKiwi(str3, strOptString);
            e.a(a, "stringToVerify/legacy:\n" + str3 + "\nsignature:\n" + strOptString);
            if (zIsSignedByKiwi) {
                return receiptA;
            }
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, str3, strOptString);
            throw new com.amazon.device.iap.internal.b.d(str2, str3, strOptString);
        } catch (JSONException e) {
            throw new com.amazon.device.iap.internal.b.a(str2, jSONObject.toString(), e);
        }
    }

    private static Receipt c(JSONObject jSONObject, String str, String str2) {
        String strOptString = jSONObject.optString("DeviceId");
        String strOptString2 = jSONObject.optString("signature");
        if (d.a(strOptString2)) {
            e.b(a, "a signature was not found in the receipt for request ID " + str2);
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", strOptString2);
            throw new com.amazon.device.iap.internal.b.d(str2, null, strOptString2);
        }
        try {
            Receipt receiptA = a(jSONObject);
            ProductType productType = receiptA.getProductType();
            String sku = receiptA.getSku();
            String receiptId = receiptA.getReceiptId();
            ProductType productType2 = ProductType.SUBSCRIPTION;
            String str3 = String.format("%s|%s|%s|%s|%s|%s|%s|%tQ|%tQ", PurchasingService.SDK_VERSION, str, strOptString, productType, sku, receiptId, str2, productType2 == receiptA.getProductType() ? receiptA.getPurchaseDate() : null, productType2 == receiptA.getProductType() ? receiptA.getCancelDate() : null);
            e.a(a, "stringToVerify/v1:\n" + str3 + "\nsignature:\n" + strOptString2);
            if (Kiwi.isSignedByKiwi(str3, strOptString2)) {
                return receiptA;
            }
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, str3, strOptString2);
            throw new com.amazon.device.iap.internal.b.d(str2, str3, strOptString2);
        } catch (JSONException e) {
            throw new com.amazon.device.iap.internal.b.a(str2, jSONObject.toString(), e);
        }
    }

    private static Receipt d(JSONObject jSONObject, String str, String str2) {
        String strOptString = jSONObject.optString("DeviceId");
        String strOptString2 = jSONObject.optString("signature");
        Date dateB = null;
        if (d.a(strOptString2)) {
            e.b(a, "a signature was not found in the receipt for request ID " + str2);
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", strOptString2);
            throw new com.amazon.device.iap.internal.b.d(str2, null, strOptString2);
        }
        try {
            String string = jSONObject.getString("receiptId");
            String string2 = jSONObject.getString("sku");
            ProductType productTypeValueOf = ProductType.valueOf(jSONObject.getString("itemType").toUpperCase());
            String strOptString3 = jSONObject.optString("purchaseDate");
            Date dateB2 = a(strOptString3) ? null : b(strOptString3);
            String strOptString4 = jSONObject.optString("cancelDate");
            if (!a(strOptString4)) {
                dateB = b(strOptString4);
            }
            Receipt receiptBuild = new ReceiptBuilder().setReceiptId(string).setSku(string2).setProductType(productTypeValueOf).setPurchaseDate(dateB2).setCancelDate(dateB).build();
            String str3 = String.format("%s|%s|%s|%s|%s|%tQ|%tQ", str, strOptString, receiptBuild.getProductType(), receiptBuild.getSku(), receiptBuild.getReceiptId(), receiptBuild.getPurchaseDate(), receiptBuild.getCancelDate());
            e.a(a, "stringToVerify/v2:\n" + str3 + "\nsignature:\n" + strOptString2);
            if (Kiwi.isSignedByKiwi(str3, strOptString2)) {
                return receiptBuild;
            }
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, str3, strOptString2);
            throw new com.amazon.device.iap.internal.b.d(str2, str3, strOptString2);
        } catch (JSONException e) {
            throw new com.amazon.device.iap.internal.b.a(str2, jSONObject.toString(), e);
        }
    }

    public static Receipt a(JSONObject jSONObject, String str, String str2) {
        int i = AnonymousClass1.a[b(jSONObject).ordinal()];
        if (i == 1) {
            return c(jSONObject, str, str2);
        }
        if (i != 2) {
            return d(jSONObject, str, str2);
        }
        return b(jSONObject, str, str2);
    }

    public static boolean a(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static Date b(String str) throws JSONException {
        try {
            Date date = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse(str);
            if (0 == date.getTime()) {
                return null;
            }
            return date;
        } catch (ParseException e) {
            throw new JSONException(e.getMessage());
        }
    }

    private static c b(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("DeviceId");
        if (!d.a(jSONObject.optString(pJBIycHMDgrWi.XBoBKQ))) {
            return c.V2;
        }
        if (d.a(strOptString)) {
            return c.LEGACY;
        }
        return c.V1;
    }
}
