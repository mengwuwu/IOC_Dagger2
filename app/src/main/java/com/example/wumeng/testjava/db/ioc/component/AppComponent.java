package com.example.wumeng.testjava.db.ioc.component;

import android.content.Context;

import com.example.wumeng.testjava.db.ioc.Level;
import com.example.wumeng.testjava.db.ioc.bean.BaseIocByInject;
import com.example.wumeng.testjava.db.ioc.bean.BaseIocByInjectWithoutSing;
import com.example.wumeng.testjava.db.ioc.bean.BaseIocByModule;
import com.example.wumeng.testjava.db.ioc.bean.BaseIocByModuleWithoutSing;
import com.example.wumeng.testjava.db.ioc.bean.BaseQualifier;
import com.example.wumeng.testjava.db.ioc.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    BaseIocByModule baseIocByModule();
    BaseIocByModuleWithoutSing baseIocByModuleWithoutSing();
    BaseIocByInject baseIocByInjectb();
    BaseIocByInjectWithoutSing baseIocByInjectWithoutSing();
    @Level("Low")
    BaseQualifier baseQualifierLow();
    @Level("High")
    BaseQualifier baseQualifierHigh();
}
