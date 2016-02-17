package com.bigdata.model.employee;

import java.io.Serializable;

/**
 * 员工demo
 * 
 * @author wangB
 */
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private int shardingId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getShardingId() {
		return shardingId;
	}

	public void setShardingId(int shardingId) {
		this.shardingId = shardingId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", shardingId=" + shardingId + "]";
	}
}