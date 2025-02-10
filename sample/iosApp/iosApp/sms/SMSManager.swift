//
//  SMSManager.swift
//  iosApp
//
//  Created by Muthu on 08/02/25.
//

import ObjectiveC
import Foundation
import UIKit

@objc public class SMSManager: NSObject {
 @objc public class func sendSMS(phoneNumber: String, message: String) {
        let sms = "sms:\(phoneNumber)&body=\(message)"
        if let strUrl = sms.addingPercentEncoding(withAllowedCharacters: .urlQueryAllowed),
           let url = URL(string: strUrl) {
            UIApplication.shared.open(url, options: [:],
                                      completionHandler: nil)
        } else {
            print("Invalid SMS")
        }
    }
}

