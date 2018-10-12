package com.example.wumeng.testjava.db.ioc.bean;

import android.content.Context;
import android.util.Log;

public class BaseIocByModuleWithoutSing {

    private static int count = 0;
    public BaseIocByModuleWithoutSing(Context context){
        Log.i("BaseIocByModuleWithout","创建count="+count++ +" " +this.toString()+" context"+context.toString());
    }
}
