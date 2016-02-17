package com.caichang.service.email;

import java.util.Map;

/**
 * 邮件工具类
 * @author wangB
 */
public interface EmailService {
	
	/**
	 * 发送邮件
	 * @param paramsMap : 参数map
	 */
	void sendEmail(Map<String,Object> paramsMap);
}