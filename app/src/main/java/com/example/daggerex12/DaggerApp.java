package com.example.daggerex12;

import android.app.Application;

public class DaggerApp extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.factory().create(new DriverModule("Pawan"));
    }

    AppComponent getComponent(){
        return component;
    }
}
