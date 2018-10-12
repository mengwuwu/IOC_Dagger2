package com.example.wumeng.testjava.db.ioc.bean;

import android.content.Context;
import android.util.Log;

import com.example.wumeng.testjava.db.ioc.SysUntils;

import javax.inject.Inject;

public class BaseIocByModule{
    private static int count = 0;
    public BaseIocByModule(Context context){
        Log.i("class BaseIocByModule：","创建count="+count+++" " +this.toString());
    }

}
