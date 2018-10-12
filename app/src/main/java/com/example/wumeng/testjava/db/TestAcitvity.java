package com.example.wumeng.testjava.db;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.wumeng.testjava.R;
import com.example.wumeng.testjava.db.ioc.Level;
import com.example.wumeng.testjava.db.ioc.SysUntils;
import com.example.wumeng.testjava.db.ioc.bean.ActivityIoc;
import com.example.wumeng.testjava.db.ioc.bean.BaseIocByInject;
import com.example.wumeng.testjava.db.ioc.bean.BaseIocByInjectWithoutSing;
import com.example.wumeng.testjava.db.ioc.bean.BaseIocByModule;
import com.example.wumeng.testjava.db.ioc.bean.BaseIocByModuleWithoutSing;
import com.example.wumeng.testjava.db.ioc.bean.BaseQualifier;
import com.example.wumeng.testjava.db.ioc.component.DaggerActivityComponent;
import com.example.wumeng.testjava.db.ioc.module.ActivityModule;
import com.example.wumeng.testjava.db.ioc.module.AppModule;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.inject.Inject;

/**
 * Created by WuMeng on 2018/8/13.
 */

public class TestAcitvity extends Activity{
    private String TAG = TestAcitvity.class.getCanonicalName();
    private TextView tv;
    @Inject
    public BaseIocByModule baseIocByModule;
    @Inject
    public BaseIocByModuleWithoutSing baseIocByModuleWithoutSing;
    @Inject
    public BaseIocByInject baseIocByInject;
    @Inject
    public BaseIocByInjectWithoutSing baseIocByInjectWithoutSing;
    @Inject
    public ActivityIoc activityIoc;
    @Inject
    @Level("Low")
    public BaseQualifier baseQualifierLow;
    @Inject
    @Level("High")
    public BaseQualifier baseQualifierHigh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag_pay);
        tv = (TextView)findViewById(R.id.text);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent it = new Intent(TestAcitvity.this,SecondActivity.class);
                startActivity(it);
            }
        });
        DaggerActivityComponent.builder().appComponent(SysUntils.getAppComponent()).activityModule(new ActivityModule(this)).build().inject(this);
        Log.i(TAG,baseIocByModule.toString());
        Log.i(TAG,baseIocByModuleWithoutSing.toString());
        Log.i(TAG,baseIocByInject.toString());
        Log.i(TAG,baseIocByInjectWithoutSing.toString());
        tv.setText("baseIocByModule: "+baseIocByModule.toString()+"\n"
        +"baseIocByModuleWithoutSing: "+baseIocByModuleWithoutSing.toString()+"\n"
        +"baseIocByInject: "+baseIocByInject.toString()+"\n"
        +"baseIocByInjectWithoutSing: "+baseIocByInjectWithoutSing.toString()+"\n"
                +"ActivityIoc: "+activityIoc.toString());

    }

}

