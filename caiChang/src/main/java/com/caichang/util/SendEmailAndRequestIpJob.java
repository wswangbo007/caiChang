package com.caichang.util;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.caichang.service.email.EmailService;
import com.google.common.collect.Maps;

/**
 * 发送邮件和获取IP
 * @author wangB
 */
public class SendEmailAndRequestIpJob {
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private IpUtils ipUtils;
	
	/**
	 * 获取公网IP地址
	 * @return
	 */
	private String getWebIp() {
		return ipUtils.getWebIp();
	}
	
	/**
	 * 发送邮件job method
	 */
	public void sendEmailJob() {
		String ip = this.getWebIp();
		Map<String,Object> paramsMap = Maps.newHashMap();
		paramsMap.put("ip", ip);
		emailService.sendEmail(paramsMap);
	}
}
