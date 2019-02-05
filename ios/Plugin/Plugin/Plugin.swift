import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitor.ionicframework.com/docs/plugins/ios
 */
@objc(LaunchIntentPlugin)
public class LaunchIntentPlugin: CAPPlugin {
    
    @objc func getLaunchIntentExtras(_ call: CAPPluginCall) {
        call.success([])
    }
}
