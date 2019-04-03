package com.diabin.latte.app;

import android.content.Context;

import java.util.HashMap;


public final class Latte {

    public static Configurator init(Context context) {
        getConfigurations().put(ConfigKeys.APPLICATION_CONTEXT,context.getApplicationContext());
        return Configurator.getInstance();
    }

    private static HashMap<Object, Object> getConfigurations() {
        return Configurator.getInstance().getLatteConfigs();

    }

    public static Context getApplication() {
        return (Context) getConfigurations().get(ConfigKeys.APPLICATION_CONTEXT);
    }
}
