package com.caichang.util;

import java.util.UUID;

public class UUIDUtil {

	public static String getUUID() {
		String result = UUID.randomUUID().toString().replace("-", "");
		return result;
	}
}
