import UIKit
import lib
import SwiftUI

@main
class AppDelegate: UIResponder, UIApplicationDelegate {
    var window: UIWindow?

    func application(
        _ application: UIApplication,
        didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?
    ) -> Bool {
        window = UIWindow(frame: UIScreen.main.bounds)
        if let window = window {
//            window.rootViewController = MainKt.MainViewController(interopSample:InteropSampleImpl())
//            window.makeKeyAndVisible()
            window.rootViewController = ComposeEntryPointWithUiViewKt.ComposeEntryPointWithView(swiftUiView: { () -> UIView in SwiftUIInUIView(content: VStack {
                Text("Hello from SwiftUI")
                Image(systemName: "moon.stars")
                    .resizable()
                    .frame(width: 200, height: 200)
            }) })
            window.makeKeyAndVisible()
        }
        IosUtilsKt.callbackSwiftFunction = {
            print("sample swift callback")
        }
        return true
    }
    
}

class InteropSampleImpl : InteropSample {
    func sampleNativeMethod() -> String {
        return UIDevice.current.model;
    }
}

private class SwiftUIInUIView<Content: View>: UIView {
    init(content: Content) {
        super.init(frame: CGRect())
        let hostingController = UIHostingController(rootView: content)
        hostingController.view.translatesAutoresizingMaskIntoConstraints = false
        addSubview(hostingController.view)
        NSLayoutConstraint.activate([
            hostingController.view.topAnchor.constraint(equalTo: topAnchor),
            hostingController.view.leadingAnchor.constraint(equalTo: leadingAnchor),
            hostingController.view.trailingAnchor.constraint(equalTo: trailingAnchor),
            hostingController.view.bottomAnchor.constraint(equalTo: bottomAnchor)
        ])
    }
    
    required init?(coder: NSCoder) {
        fatalError("init(coder:) has not been implemented")
    }
}

