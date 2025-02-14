// swift-tools-version:5.3
import PackageDescription

let package = Package(
    name: "TestLib",
    platforms: [
        .iOS(.v13)
    ],
    products: [
        .library(
            name: "TestLib",
            targets: ["TestLib"]
        ),
    ],
    targets: [
        .binaryTarget(
            name: "TestLib",
            path: "./TestLib.xcframework"
        ),
    ]
)
