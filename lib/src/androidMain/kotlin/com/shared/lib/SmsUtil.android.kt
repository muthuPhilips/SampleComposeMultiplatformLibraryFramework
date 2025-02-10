package com.shared.lib

import android.content.Intent
import android.net.Uri

actual fun smsUtil(number: String, message: String) {
    val uri = Uri.parse("smsto:$number")
    val intent = Intent(Intent.ACTION_SENDTO, uri)
    intent.putExtra("sms_body", message)  // Use "sms_body" to pre-fill the message
    try {
//        startActivity(context, intent, null)
    } catch (e: Exception) {
//        Toast.makeText(context, "Error sending SMS: ${e.message}", Toast.LENGTH_SHORT).show()
        e.printStackTrace() // Print the error for debugging
    }
}