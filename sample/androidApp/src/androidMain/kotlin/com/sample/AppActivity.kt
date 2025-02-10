package com.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.shared.lib.InteropSample
import com.shared.lib.InteropSampleImpl
import com.shared.lib.LibModule

class AppActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val interopSample: InteropSample = InteropSampleImpl()
        setContent { LibModule(interopSample) }
    }
}

@Preview
@Composable
fun AppPreview() { //LibModule(interopExample)
}
