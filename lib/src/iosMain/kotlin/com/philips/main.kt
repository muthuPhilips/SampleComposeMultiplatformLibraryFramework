import androidx.compose.ui.window.ComposeUIViewController
import com.philips.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
