package com.shared.lib.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.shared.lib.functionToInvokeSwift
import platform.UIKit.UIApplication
import platform.UIKit.UIStatusBarStyleDarkContent
import platform.UIKit.UIStatusBarStyleLightContent
import platform.UIKit.setStatusBarStyle

@Composable
internal actual fun SystemAppearance(isDark: Boolean) {
    functionToInvokeSwift()
    LaunchedEffect(isDark) {
        UIApplication.sharedApplication.setStatusBarStyle(
            if (isDark) UIStatusBarStyleDarkContent else UIStatusBarStyleLightContent
        )
    }
}