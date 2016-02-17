package com.caichang.model.victual;

import java.io.Serializable;

/**
 * 蔬菜
 * @author wangB
 */
public class VictualModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String victualId;
	
	private String victualKey;
	
	private String victualName;
	
	private String createDate;
	
	private String updateDate;
	
	private String state;

	public String getVictualId() {
		return victualId;
	}

	public void setVictualId(String victualId) {
		this.victualId = victualId;
	}

	public String getVictualKey() {
		return victualKey;
	}

	public void setVictualKey(String victualKey) {
		this.victualKey = victualKey;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getVictualName() {
		return victualName;
	}

	public void setVictualName(String victualName) {
		this.victualName = victualName;
	}
	
}