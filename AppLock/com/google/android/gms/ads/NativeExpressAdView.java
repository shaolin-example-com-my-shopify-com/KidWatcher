package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import android.util.AttributeSet;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.wh;

@wh
public final class NativeExpressAdView extends C2317a {
    public NativeExpressAdView(Context context) {
        super(context, 1);
    }

    public NativeExpressAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 1);
    }

    public NativeExpressAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 1);
    }

    public /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    public /* bridge */ /* synthetic */ AdListener getAdListener() {
        return super.getAdListener();
    }

    public /* bridge */ /* synthetic */ AdSize getAdSize() {
        return super.getAdSize();
    }

    public /* bridge */ /* synthetic */ String getAdUnitId() {
        return super.getAdUnitId();
    }

    public /* bridge */ /* synthetic */ InAppPurchaseListener getInAppPurchaseListener() {
        return super.getInAppPurchaseListener();
    }

    public /* bridge */ /* synthetic */ String getMediationAdapterClassName() {
        return super.getMediationAdapterClassName();
    }

    public VideoController getVideoController() {
        return this.a.m13122n();
    }

    public VideoOptions getVideoOptions() {
        return this.a.m13124p();
    }

    public /* bridge */ /* synthetic */ boolean isLoading() {
        return super.isLoading();
    }

    @RequiresPermission("android.permission.INTERNET")
    public /* bridge */ /* synthetic */ void loadAd(AdRequest adRequest) {
        super.loadAd(adRequest);
    }

    public /* bridge */ /* synthetic */ void pause() {
        super.pause();
    }

    public /* bridge */ /* synthetic */ void resume() {
        super.resume();
    }

    public /* bridge */ /* synthetic */ void setAdListener(AdListener adListener) {
        super.setAdListener(adListener);
    }

    public /* bridge */ /* synthetic */ void setAdSize(AdSize adSize) {
        super.setAdSize(adSize);
    }

    public /* bridge */ /* synthetic */ void setAdUnitId(String str) {
        super.setAdUnitId(str);
    }

    public /* bridge */ /* synthetic */ void setInAppPurchaseListener(InAppPurchaseListener inAppPurchaseListener) {
        super.setInAppPurchaseListener(inAppPurchaseListener);
    }

    public /* bridge */ /* synthetic */ void setPlayStorePurchaseParams(PlayStorePurchaseListener playStorePurchaseListener, String str) {
        super.setPlayStorePurchaseParams(playStorePurchaseListener, str);
    }

    public void setVideoOptions(VideoOptions videoOptions) {
        this.a.m13098a(videoOptions);
    }
}
