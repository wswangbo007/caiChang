package com.caichang.dao.user;

import org.springframework.stereotype.Repository;

import com.caichang.model.user.UserModel;

/**
 * 用户DAO
 * @author wangB
 */
@Repository
public interface UserDao {
	
	/**
	 * 用户
	 * @param userModel
	 * @return UserModel
	 */
	UserModel getUserModelByModel(UserModel userModel);
}
