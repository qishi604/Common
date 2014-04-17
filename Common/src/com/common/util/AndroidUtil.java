package com.common.util;

import java.util.List;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;

public final class AndroidUtil {
	
	private static final String PREFS_NAME = "prefs";
	
	/**
	 * @param src
	 * @return true if the string is empty
	 */
	public static boolean isEmpty(String src) {
		if (null == src || 0 == src.length()) {
			return true;
		}
		return false;
	}

	/**
	 * @param list
	 * @return true if the list is empty
	 */
	public static boolean isEmpty(List<?> list) {
		if (null == list || 0 == list.size()) {
			return true;
		}
		return false;
	}
	
	private static void toast(Context context, String msg, int lenth) {
		Toast.makeText(context, msg, lenth).show();
	}

	public static void toastS(Context context, String msg) {
		toast(context, msg, Toast.LENGTH_SHORT);
	}

	public static void toastL(Context context, String msg) {
		toast(context, msg, Toast.LENGTH_LONG);
	}

	private static void toast(Context context, int msgRes, int lenth) {
		Toast.makeText(context, msgRes, lenth).show();
	}

	public static void toastS(Context context, int msgRes) {
		toast(context, msgRes, Toast.LENGTH_SHORT);
	}

	public static void toastL(Context context, int msgRes) {
		toast(context, msgRes, Toast.LENGTH_LONG);
	}
	
	/**
	 * Show progress dialog
	 * 
	 * @param context
	 * @param title
	 * @param msg
	 * @return
	 */
	public static ProgressDialog showProgress(Context context, String title,
			String msg) {
		return ProgressDialog.show(context, null, msg);
	}
	
	public static void savePref(Context context, String key, String value) {
		if (!isEmpty(key)) {
			SharedPreferences shareConfig = context.getSharedPreferences(
					PREFS_NAME, Context.MODE_PRIVATE);
			if (null != shareConfig) {
				Editor edit = shareConfig.edit();
				edit.putString(key, value);
				edit.commit();
			}
		}
	}
	
	public static String getStringPref(Context context, String key) {
		String value = null;
		if (!isEmpty(key)) {
			SharedPreferences shareConfig = context.getSharedPreferences(
					PREFS_NAME, Context.MODE_PRIVATE);
			if (null != shareConfig) {
				value = shareConfig.getString(key, null);
			}
		}
		return value;
	}
}
