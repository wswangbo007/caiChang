package com.caichang.web.user;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.caichang.model.user.UserModel;
import com.caichang.service.email.EmailService;
import com.caichang.service.user.UserService;
import com.caichang.util.IpUtils;
import com.google.common.collect.Maps;

@Controller
@RequestMapping(value="user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 用户登录模块
	 * @param userModel
	 * @return jsp
	 */
	@RequestMapping(value="loginUser")
	public String loginUser(UserModel userModel,HttpServletRequest request) {
		String result = "index";
		UserModel tempUserModel = userService.getUserModelByModel(userModel);
		HttpSession session = request.getSession();
		if (null != tempUserModel) {
			session.setAttribute("user", tempUserModel);
			if (tempUserModel.getDictId() == 1) {			// 记录员
				result = "victualDate/showVictualDate";
			} else if (tempUserModel.getDictId() == 2) {	// 采购员
				result = "victualDate/showVictualDate";
			}
		} else {
			UserModel newUserModel = (UserModel) session.getAttribute("user");
			if (null != newUserModel) {
				result = "victualDate/showVictualDate";
			}
		}
		return result;
	}
}