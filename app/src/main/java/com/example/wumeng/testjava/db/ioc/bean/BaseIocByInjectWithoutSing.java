package com.example.wumeng.testjava.db.ioc.bean;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

public class BaseIocByInjectWithoutSing {
    private static int count = 0;
    @Inject
    public BaseIocByInjectWithoutSing(Context context){
        Log.i("BaseIocByInjectWithout","创建count="+count+++" " + this.toString()+" context"+context.toString());
    }
}
