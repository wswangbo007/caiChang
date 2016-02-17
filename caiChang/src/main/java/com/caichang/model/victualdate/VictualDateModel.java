package com.caichang.model.victualdate;

import java.io.Serializable;

/**
 * 蔬菜时间购买
 * @author wangB
 *
 */
public class VictualDateModel implements Serializable{

	private static final long serialVersionUID = 1L;

	private String buyVictualDateId;
	
	private String buyVictualDate;
	
	private String victualId;
	
	private int dictId;
	
	private long buyVictualDateKey;
	
	private int buyVictualWeight;
	
	private boolean isBuy;
	
	private String createDate;
	
	private String updateDate;
	
	private boolean state;

	public String getBuyVictualDateId() {
		return buyVictualDateId;
	}

	public void setBuyVictualDateId(String buyVictualDateId) {
		this.buyVictualDateId = buyVictualDateId;
	}

	public String getBuyVictualDate() {
		return buyVictualDate;
	}

	public void setBuyVictualDate(String buyVictualDate) {
		this.buyVictualDate = buyVictualDate;
	}

	public String getVictualId() {
		return victualId;
	}

	public void setVictualId(String victualId) {
		this.victualId = victualId;
	}

	public long getBuyVictualDateKey() {
		return buyVictualDateKey;
	}

	public void setBuyVictualDateKey(long buyVictualDateKey) {
		this.buyVictualDateKey = buyVictualDateKey;
	}

	public int getBuyVictualWeight() {
		return buyVictualWeight;
	}

	public void setBuyVictualWeight(int buyVictualWeight) {
		this.buyVictualWeight = buyVictualWeight;
	}

	public boolean isBuy() {
		return isBuy;
	}

	public void setBuy(boolean isBuy) {
		this.isBuy = isBuy;
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

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public int getDictId() {
		return dictId;
	}

	public void setDictId(int dictId) {
		this.dictId = dictId;
	}
}