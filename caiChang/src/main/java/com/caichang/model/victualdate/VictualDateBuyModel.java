package com.caichang.model.victualdate;

import java.io.Serializable;

/**
 * 蔬菜时间购买模型
 * @author wangB
 */
public class VictualDateBuyModel extends VictualDateModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String victualName;
	
	private String dictValue;
	
	private int numCount;

	public String getVictualName() {
		return victualName;
	}

	public void setVictualName(String victualName) {
		this.victualName = victualName;
	}

	public String getDictValue() {
		return dictValue;
	}

	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}

	public int getNumCount() {
		return numCount;
	}

	public void setNumCount(int numCount) {
		this.numCount = numCount;
	}
}