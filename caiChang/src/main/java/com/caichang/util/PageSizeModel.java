package com.caichang.util;

import java.io.Serializable;

/**
 * 分页
 * @author wangB
 */
public class PageSizeModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int page;
	
	private int size;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}