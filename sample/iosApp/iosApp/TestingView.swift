//
//  TestingView.swift
//  iosApp
//
//  Created by Muthu on 08/02/25.
//

import SwiftUI

struct TestingView: View {
    @State private var labelText = "Hello, SwiftUI!"

        var body: some View {
            VStack {
                Text(labelText)
                    .font(.headline)
                    .padding()

                Button("Swift Button") {
                    labelText = "Button Pressed!"
                }
                .padding()
                .background(Color.blue)
                .foregroundColor(.white)
                .cornerRadius(10)
            }
        }
}
