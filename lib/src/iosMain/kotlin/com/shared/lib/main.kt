import androidx.compose.ui.window.ComposeUIViewController
import com.shared.lib.InteropSample
import com.shared.lib.LibModule

import platform.UIKit.UIViewController

fun MainViewController(interopSample:InteropSample): UIViewController = ComposeUIViewController { LibModule(
    interopSample = interopSample
) }


