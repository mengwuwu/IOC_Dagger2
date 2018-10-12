package com.example.wumeng.testjava.db.ioc;

import android.annotation.SuppressLint;
import android.content.Context;

import com.example.wumeng.testjava.db.ioc.component.AppComponent;

public class SysUntils {
    @SuppressLint("StaticFieldLeak")
    private static Context context;
    /**
     * 为了配合tinker的使用，将其抽取为静态变量
     */
    private static AppComponent appComponent;

    private SysUntils () {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 初始化工具类
     *
     * @param context 上下文
     */
    public static void init(Context context) {
        SysUntils.context = context.getApplicationContext();
    }

    /**
     * 获取ApplicationContext
     *
     * @return ApplicationContext
     */
    public static Context getContext() {
        if (context != null) {
            return context;
        }
        throw new NullPointerException("u should init first");
    }

    public static void initAppComponent(AppComponent appComponent) {
        SysUntils.appComponent = appComponent;
    }

    public static AppComponent getAppComponent() {
        if (appComponent != null) {
            return appComponent;
        }
        throw new NullPointerException("appComponent need to be initialized");
    }
}
