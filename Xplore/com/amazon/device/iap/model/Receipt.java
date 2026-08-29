package com.amazon.device.iap.model;

import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.internal.util.d;
import com.lonelycatgames.Xplore.ops.copy.Ww.EQvrnCmT;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public final class Receipt {
    private static final String CANCEL_DATE = "endDate";
    private static final Date DATE_CANCELED = new Date(1);
    private static final String PRODUCT_TYPE = "itemType";
    private static final String PURCHASE_DATE = "purchaseDate";
    private static final String RECEIPT_ID = "receiptId";
    private static final String SKU = "sku";
    private final Date cancelDate;
    private final ProductType productType;
    private final Date purchaseDate;
    private final String receiptId;
    private final String sku;

    public Receipt(ReceiptBuilder receiptBuilder) {
        d.a((Object) receiptBuilder.getSku(), SKU);
        d.a(receiptBuilder.getProductType(), "productType");
        if (ProductType.SUBSCRIPTION == receiptBuilder.getProductType()) {
            d.a(receiptBuilder.getPurchaseDate(), PURCHASE_DATE);
        }
        this.receiptId = receiptBuilder.getReceiptId();
        this.sku = receiptBuilder.getSku();
        this.productType = receiptBuilder.getProductType();
        this.purchaseDate = receiptBuilder.getPurchaseDate();
        this.cancelDate = receiptBuilder.getCancelDate();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Receipt.class != obj.getClass()) {
            return false;
        }
        Receipt receipt = (Receipt) obj;
        Date date = this.cancelDate;
        Date date2 = receipt.cancelDate;
        if (date == null) {
            if (date2 != null) {
                return false;
            }
        } else if (!date.equals(date2)) {
            return false;
        }
        if (this.productType != receipt.productType) {
            return false;
        }
        Date date3 = this.purchaseDate;
        Date date4 = receipt.purchaseDate;
        if (date3 == null) {
            if (date4 != null) {
                return false;
            }
        } else if (!date3.equals(date4)) {
            return false;
        }
        String str = this.receiptId;
        String str2 = receipt.receiptId;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        String str3 = this.sku;
        String str4 = receipt.sku;
        if (str3 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str3.equals(str4)) {
            return false;
        }
        return true;
    }

    public Date getCancelDate() {
        return this.cancelDate;
    }

    public ProductType getProductType() {
        return this.productType;
    }

    public Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public String getReceiptId() {
        return this.receiptId;
    }

    public String getSku() {
        return this.sku;
    }

    public int hashCode() {
        Date date = this.cancelDate;
        int iHashCode = ((date == null ? 0 : date.hashCode()) + 31) * 31;
        ProductType productType = this.productType;
        int iHashCode2 = (iHashCode + (productType == null ? 0 : productType.hashCode())) * 31;
        Date date2 = this.purchaseDate;
        int iHashCode3 = (iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str = this.receiptId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sku;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean isCanceled() {
        return this.cancelDate != null;
    }

    public String toString() {
        try {
            return toJSON().toString(4);
        } catch (JSONException unused) {
            return null;
        }
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(RECEIPT_ID, this.receiptId);
            jSONObject.put(SKU, this.sku);
            jSONObject.put(EQvrnCmT.EPNSbWM, this.productType);
            jSONObject.put(PURCHASE_DATE, this.purchaseDate);
            jSONObject.put(CANCEL_DATE, this.cancelDate);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
