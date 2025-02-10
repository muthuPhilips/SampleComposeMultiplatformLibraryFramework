package com.shared.lib

import SampleAnimation
import androidx.compose.runtime.*
import com.shared.lib.theme.LibTheme

@Composable
fun LibModule(interopSample: InteropSample) = LibTheme {
   SampleAnimation(interopSample)
}
