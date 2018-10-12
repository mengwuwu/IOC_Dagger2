package com.example.wumeng.testjava.db.ioc.component;

import com.example.wumeng.testjava.db.SecondActivity;
import com.example.wumeng.testjava.db.TestAcitvity;
import com.example.wumeng.testjava.db.ioc.ActivityScope;
import com.example.wumeng.testjava.db.ioc.module.ActivityModule;

import dagger.Component;

@ActivityScope
@Component(modules = {ActivityModule.class},dependencies = AppComponent.class)
public interface ActivityComponent {
    void inject (TestAcitvity activity);
    void inject (SecondActivity activity);
}
