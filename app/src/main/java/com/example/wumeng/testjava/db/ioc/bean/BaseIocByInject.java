package com.example.wumeng.testjava.db.ioc.bean;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class BaseIocByInject {
    private static int count = 0;
    @Inject
    public BaseIocByInject(Context context){
        Log.i("class BaseIocByInject","创建count="+count++ +" " + this.toString());
    }
}
