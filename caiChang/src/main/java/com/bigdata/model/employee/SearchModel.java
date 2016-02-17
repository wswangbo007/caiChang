package com.bigdata.model.employee;

import java.io.Serializable;

import com.caichang.util.PageSizeModel;
/**
 * 搜索Model
 * @author wangB
 */
public class SearchModel extends PageSizeModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String searchIndex;
	
	private int selectIndex;
	
	public String getSearchIndex() {
		return searchIndex;
	}

	public void setSearchIndex(String searchIndex) {
		this.searchIndex = searchIndex;
	}

	public int getSelectIndex() {
		return selectIndex;
	}

	public void setSelectIndex(int selectIndex) {
		this.selectIndex = selectIndex;
	}
}