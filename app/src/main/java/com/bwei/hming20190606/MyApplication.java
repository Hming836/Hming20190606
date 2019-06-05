package com.bwei.hming20190606;


import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * @Auther :Hming
 * @Date : 2019/6/5  20:27
 * @Description: ${DESCRIPTION}
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ZXingLibrary.initDisplayOpinion(this);
    }
}
