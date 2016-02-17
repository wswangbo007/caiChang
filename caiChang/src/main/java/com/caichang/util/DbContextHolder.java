package com.caichang.util;

/**
 * 线程安全
 * @author wangB
 */
public class DbContextHolder {

	private static final ThreadLocal<String> contextHolder  = new ThreadLocal<String>();		// 线程本地环境
	
	public static void setDbType(String dbType) {
		contextHolder.set(dbType);
	}
	
	public static String getDbType() {
		return contextHolder.get();
	}
	
	public static void removeDbType() {
		contextHolder.remove();
	}
}
