package com.caichang.service.email.impl;

import java.io.Serializable;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.caichang.service.email.EmailService;

/**
 * 邮件服务
 * @author wangB
 */
@Service
public class EmailServiceImpl implements EmailService, Serializable {

	private static final long serialVersionUID = 1L;
	
	// Spring的邮件工具类，实现了MailSender和JavaMailSender接口
	@Autowired
	private JavaMailSenderImpl javaMailSenderImpl;

	/**
	 * 发送邮件
	 */
	@Override
	public void sendEmail(Map<String, Object> paramsMap) {
		MimeMessage mailMessage = javaMailSenderImpl.createMimeMessage();
		 // 构建简单邮件对象，见名知意
	    try {
	    	String ip = String.valueOf(paramsMap.get("ip"));
			MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage,true,"utf-8");
			messageHelper.setFrom(new InternetAddress("wswangbo007@163.com"));
			messageHelper.setTo("527882238@qq.com");
			messageHelper.setCc("1239551390@qq.com");
			messageHelper.setSubject("Every day of the public IP");
			messageHelper.setText("6 o 'clock every morning to send dynamic public IP : " + ip);
			javaMailSenderImpl.send(mailMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
