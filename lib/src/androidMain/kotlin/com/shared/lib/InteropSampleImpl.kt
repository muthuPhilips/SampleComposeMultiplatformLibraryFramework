package com.shared.lib

import android.os.Build

class InteropSampleImpl : InteropSample {
    override fun sampleNativeMethod(): String {
        return Build.DEVICE
    }
}