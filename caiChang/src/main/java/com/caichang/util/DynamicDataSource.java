package com.caichang.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源
 * @author wangB
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

	/**
	 * 动态返回动态数据源
	 */
	@Override
	protected Object determineCurrentLookupKey() {
		return DbContextHolder.getDbType();
	}

}
