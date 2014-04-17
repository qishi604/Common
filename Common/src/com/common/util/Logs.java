package com.common.util;

import com.seven.common.BuildConfig;


public class Logs {
	public final static String TAG = "common";

	public static final boolean DEBUG = BuildConfig.DEBUG;

	public static void v(String tag, String msg) {
		if (DEBUG) {
			android.util.Log.v(tag, msg);
		}
	}
	
	public static void e(String tag, String msg) {
		if (DEBUG) {
			android.util.Log.e(tag, msg);
		}
	}
	
	public static void i(String tag, String msg) {
		if (DEBUG) {
			android.util.Log.i(tag, msg);
		}
	}
	
	public static void d(String tag, String msg) {
		if (DEBUG) {
			android.util.Log.d(tag, msg);
		}
	}
	
	public static void w(String tag, String msg) {
		if (DEBUG) {
			android.util.Log.w(tag, msg);
		}
	}
	
	public static void v(String msg) {
		v(TAG, msg);
	}

	public static void e(String msg) {
		e(TAG, msg);
	}
	
	public static void i(String msg) {
		i(TAG, msg);
	}
	
	public static void d(String msg) {
		d(TAG, msg);
	}
	
	public static void w(String msg) {
		w(TAG, msg);
	}
}
