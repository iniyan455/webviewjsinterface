package com.iniyan.webviewjsinterface

interface BridgeContract {

    fun  showToast(toast: String?)
    val androidVersion :Int
    fun showAndroidVersion(versionName: String?)

    fun sendCustomMessage(toast: String?)
}
