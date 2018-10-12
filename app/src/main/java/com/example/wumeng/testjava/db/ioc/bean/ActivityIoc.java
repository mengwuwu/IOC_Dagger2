package com.example.wumeng.testjava.db.ioc.bean;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;
public class ActivityIoc {

    public ActivityIoc(Context context){
        Log.i("创建了ActivityIoc",this.toString()+" context"+context.toString());

    }
}
