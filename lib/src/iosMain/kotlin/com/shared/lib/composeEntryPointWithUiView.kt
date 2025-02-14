package com.shared.lib

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.UIKitView
import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIView
import platform.UIKit.UIViewController

fun ComposeEntryPointWithView(swiftUiView: () -> UIView) : UIViewController =
    ComposeUIViewController {
        Column (
            modifier = Modifier.fillMaxSize()
        ){
            Text("SwiftUI In compose")

            //this will render swift ui code
            UIKitView(
                factory = swiftUiView,
                modifier = Modifier.align(Alignment.CenterHorizontally).fillMaxWidth().fillMaxHeight()
            )
        }
    }