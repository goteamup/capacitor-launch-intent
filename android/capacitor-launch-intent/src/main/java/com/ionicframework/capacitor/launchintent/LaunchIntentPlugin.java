package com.ionicframework.capacitor.launchintent;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

@NativePlugin()
public class LaunchIntentPlugin extends Plugin {

    @PluginMethod()
    public void getLaunchIntentExtras() {
        Bundle extras = self.bridge.context.getIntent().getExtras();

        JSObject ret = new JSObject();

        if (extras != null) {
            for (String key : bundle.keySet()) {
                ret.put(key, bindle.get(key).toString());
            }
        }

        call.success(ret);
    }
}
