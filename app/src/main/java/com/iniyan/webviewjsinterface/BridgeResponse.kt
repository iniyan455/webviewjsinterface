package com.iniyan.webviewjsinterface


class BridgeResponse<T>(val result: String, val code: String? = null, val  data: T?) {
    companion object {
        const val SUCCESS = "success"
        const val FAILED = "failed"
    }
}