package com.ionicframework.capacitor.launchintent;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import android.os.Bundle;
import android.os.Intent;

@NativePlugin()
public class LaunchIntent extends Plugin {

    private Intent latestIntent = null;

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

    @PluginMethod()
    public void getLatestIntentExtras(PluginCall call) {
        JSObject ret = new JSObject();

        if (this.latestIntent != null) {
            Bundle extras = this.latestIntent.getExtras();

            if (extras != null) {
                for (String key : extras.keySet()) {
                    ret.put(key, extras.get(key).toString());
                }
            }
        }

        call.success(ret);
    }

    @Override
    protected void handleOnNewIntent(Intent intent) {
        super.handleOnNewIntent(intent);

        this.latestIntent = intent;
    }
}
