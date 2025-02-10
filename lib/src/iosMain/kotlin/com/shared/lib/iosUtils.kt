package com.shared.lib

lateinit var callbackSwiftFunction: () -> Unit

internal fun functionToInvokeSwift() {
    callbackSwiftFunction()
}