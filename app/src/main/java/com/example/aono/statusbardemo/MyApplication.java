package com.example.aono.statusbardemo;

import android.app.Application;

/**
 * Created by Aono on 2017/11/28.
 */

public class MyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		registerActivityLifecycleCallbacks(new MyLifeCycleCallback());
	}
}
