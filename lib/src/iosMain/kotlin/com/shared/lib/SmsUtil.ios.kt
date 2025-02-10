package com.shared.lib



import com.shared.iosApp.SMSManager
import kotlinx.cinterop.ExperimentalForeignApi

@OptIn(ExperimentalForeignApi::class)
actual fun smsUtil(number: String, message: String) {
    SMSManager.sendSMSWithPhoneNumber(number, message)
}

