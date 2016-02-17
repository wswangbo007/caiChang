package com.caichang.service.user;

import com.caichang.model.user.UserModel;

/**
 * 用户服务
 * @author wangB
 */
public interface UserService {

	/**
	 * 根据用户对象获取对应的对象
	 * @param userModel
	 * @return UserModel
	 */
	UserModel getUserModelByModel(UserModel userModel);
}