package com.example.wumeng.testjava.db.ioc.module;

import android.content.Context;

import com.example.wumeng.testjava.db.ioc.Level;
import com.example.wumeng.testjava.db.ioc.bean.BaseIocByModule;
import com.example.wumeng.testjava.db.ioc.bean.BaseIocByModuleWithoutSing;
import com.example.wumeng.testjava.db.ioc.bean.BaseQualifier;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private final Context mContext;

    public AppModule(Context context) {
        mContext = context;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return mContext;
    }

    @Provides
    @Singleton
    public BaseIocByModule provideBaseIocByModule(Context context) {
        return new BaseIocByModule(context);
    }
    @Provides
    public BaseIocByModuleWithoutSing provideBaseIocByModuleWithoutSing(Context context) {
        return new BaseIocByModuleWithoutSing(context);
    }
    @Provides
    @Level("Low")
    public BaseQualifier provideBaseQualiferLow(){
        return new BaseQualifier("Low");
    }
    @Provides
    @Level("High")
    public BaseQualifier provideBaseQualiferHigh(){
        return new BaseQualifier("High");
    }
}
