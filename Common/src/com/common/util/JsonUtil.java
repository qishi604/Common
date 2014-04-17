package com.common.util;

import com.google.gson.Gson;

public final class JsonUtil {
	
	private static final Gson GSON = new Gson();
	
	private JsonUtil() {}
	
	public static <T> T fromJson(String json, Class<T> t) {
		return GSON.fromJson(json, t);
	}
	
	public static String toJson(Object object) {
		return GSON.toJson(object);
	}

}
