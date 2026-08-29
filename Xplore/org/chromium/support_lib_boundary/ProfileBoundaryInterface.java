package org.chromium.support_lib_boundary;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import java.lang.reflect.InvocationHandler;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
public interface ProfileBoundaryInterface {
    void cancelPrefetch(String str);

    void clearPrefetch(String str, ValueCallback<InvocationHandler> valueCallback);

    CookieManager getCookieManager();

    GeolocationPermissions getGeoLocationPermissions();

    String getName();

    ServiceWorkerController getServiceWorkerController();

    WebStorage getWebStorage();

    void prefetchUrl(String str, ValueCallback<InvocationHandler> valueCallback);

    void prefetchUrl(String str, InvocationHandler invocationHandler, ValueCallback<InvocationHandler> valueCallback);
}
