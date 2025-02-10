//
//  Greetings.swift
//  iosApp
//
//  Created by Muthu on 08/02/25.
//

import ObjectiveC
import Foundation


@objc public class Greetings: NSObject {
    @objc public func greet(name: String) -> String {
         return "Hello, \(name)"
     }
}
