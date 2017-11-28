package com.example.aono.statusbardemo;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.example.aono.statusbardemo.utils.StatusBarUtils;

/**
 * Created by Aono on 2017/11/28.
 */

class MyLifeCycleCallback implements Application.ActivityLifecycleCallbacks {
	@Override
	public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
		StatusBarUtils.StatusBarLightMode(activity);
	}

	@Override
	public void onActivityStarted(Activity activity) {

	}

	@Override
	public void onActivityResumed(Activity activity) {

	}

	@Override
	public void onActivityPaused(Activity activity) {

	}

	@Override
	public void onActivityStopped(Activity activity) {

	}

	@Override
	public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

	}

	@Override
	public void onActivityDestroyed(Activity activity) {

	}
}
