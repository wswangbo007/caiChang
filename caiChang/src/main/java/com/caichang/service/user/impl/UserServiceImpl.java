package com.caichang.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caichang.dao.user.UserDao;
import com.caichang.model.user.UserModel;
import com.caichang.service.user.UserService;
/**
 * 用户service
 * @author wangB
 */
@Service
public class UserServiceImpl implements UserService {
	
	/**用户DAO*/
	@Autowired
	private UserDao userDao;

	/**
	 * 根据用户对象获取对应的对象
	 */
	public UserModel getUserModelByModel(UserModel userModel) {
		UserModel newUserModel = null;
		if (null != userModel) {
			newUserModel = userDao.getUserModelByModel(userModel);
		}
		return newUserModel;
	}
}