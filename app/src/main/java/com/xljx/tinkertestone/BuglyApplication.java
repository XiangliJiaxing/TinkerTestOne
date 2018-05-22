package com.xljx.tinkertestone;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.crashreport.CrashReport;

/**
 *
 * http://mvnrepository.com/artifact/com.tencent.bugly
 */
public class BuglyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Beta.enableHotfix = true;
        Bugly.init(getApplicationContext(), "f5855c2228", true);
    }

    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
        // 安装tinker
        Beta.installTinker();
    }
}
