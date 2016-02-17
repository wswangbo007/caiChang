package com.caichang.util;

import org.springframework.beans.factory.annotation.Autowired;

import com.caichang.service.victual.impl.VictualServiceImpl;

/**
 * 防止mysql连接失效
 * @author wangB
 */
public class QueryMySqlTimeOut {

	@Autowired
	private VictualServiceImpl victualServiceImpl;
	
	/**
	 * 连接数据库,防止Connection失效
	 */
	public void timeOut() {
		victualServiceImpl.queryVictualList();
	}
}
