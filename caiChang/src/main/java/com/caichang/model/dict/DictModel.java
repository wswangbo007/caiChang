package com.caichang.model.dict;

import java.io.Serializable;

/**
 * 字典model
 * @author wangB
 */
public class DictModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int dictId;
	
	private int dictName;
	
	private String dictValue;

	public int getDictId() {
		return dictId;
	}

	public void setDictId(int dictId) {
		this.dictId = dictId;
	}

	public int getDictName() {
		return dictName;
	}

	public void setDictName(int dictName) {
		this.dictName = dictName;
	}

	public String getDictValue() {
		return dictValue;
	}

	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}
}