package com.iniyan.webviewjsinterface

import android.content.Context
import android.os.Build
import android.webkit.JavascriptInterface
import android.widget.Toast


class WebAppInterface internal constructor(context_: Context) : BridgeContract {
    var mContext: Context = context_

    // Show a toast from the web page
    @JavascriptInterface
    override fun showToast(toast: String?) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show()
    }



    @get:JavascriptInterface
    override val androidVersion: Int
        get() = Build.VERSION.SDK_INT



    @JavascriptInterface
    override fun showAndroidVersion(versionName: String?) {
        (mContext as WebViewActivity).showToast("showAndroidVersion $versionName")

    }

    @JavascriptInterface
    override fun sendCustomMessage(toast: String?) {
        (mContext as WebViewActivity).showToast(toast!!)
    }


}