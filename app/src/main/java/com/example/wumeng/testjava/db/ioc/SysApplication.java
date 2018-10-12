package com.example.wumeng.testjava.db.ioc;

import android.app.Application;

import com.example.wumeng.testjava.db.ioc.component.AppComponent;
import com.example.wumeng.testjava.db.ioc.component.DaggerAppComponent;
import com.example.wumeng.testjava.db.ioc.module.AppModule;

public class SysApplication extends Application {
    private AppComponent mAppComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        SysUntils.initAppComponent(mAppComponent);
    }
}
