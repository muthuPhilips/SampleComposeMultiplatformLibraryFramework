import androidx.compose.ui.window.ComposeUIViewController
import com.shared.lib.LibModule

import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { LibModule() }
