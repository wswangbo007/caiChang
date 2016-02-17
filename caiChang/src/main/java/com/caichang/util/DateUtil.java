package com.caichang.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间转换器
 * @author wangB
 */
public class DateUtil {

	/**
	 * 返回String格式
	 * @param date : 日期格式
	 * @return str
	 */
	public static String getDateFormat(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String result = "";
		if (null != date) {
			result = dateFormat.format(date);
		}
		return result;
	}
	
	/**
	 * 获取时间戳
	 * @return
	 */
	public static long getTimeStamp() {
		return new Date().getTime();
	}
}
