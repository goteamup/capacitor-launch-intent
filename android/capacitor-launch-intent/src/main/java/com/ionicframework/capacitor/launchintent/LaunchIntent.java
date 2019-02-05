package com.ionicframework.capacitor.launchintent;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import android.os.Bundle;

@NativePlugin()
public class LaunchIntent extends Plugin {

    @PluginMethod()
    public void getLaunchIntentExtras(PluginCall call) {
        Bundle extras = this.bridge.getActivity().getIntent().getExtras();

        JSObject ret = new JSObject();

        if (extras != null) {
            for (String key : extras.keySet()) {
                ret.put(key, extras.get(key).toString());
            }
        }

        call.success(ret);
    }
}
