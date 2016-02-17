package com.caichang.model.user;

import java.io.Serializable;

/**
 * 用户MODEL
 * @author wangB
 */
public class UserModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userId;
	
	private int dictId;
	
	private String userName;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getDictId() {
		return dictId;
	}

	public void setDictId(int dictId) {
		this.dictId = dictId;
	}

	@Override
	public String toString() {
		return "UserModel [userId=" + userId + ", dictId=" + dictId + ", userName=" + userName + "]";
	}
}