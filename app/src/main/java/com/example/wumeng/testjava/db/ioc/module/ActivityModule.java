package com.example.wumeng.testjava.db.ioc.module;


import android.content.Context;

import com.example.wumeng.testjava.db.ioc.ActivityScope;
import com.example.wumeng.testjava.db.ioc.bean.ActivityIoc;
import com.example.wumeng.testjava.db.ioc.bean.BaseIocByModule;
import com.example.wumeng.testjava.db.ioc.bean.BaseIocByModuleWithoutSing;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    private final Context mContext;
    public ActivityModule(Context context) {
        mContext = context;
    }
    @Provides
    @ActivityScope
    public Context provideContext() {
        return mContext;
    }
    @Provides
    @ActivityScope
    public ActivityIoc provideActivityIoc(Context context) {
        return new ActivityIoc(context);
    }
}
