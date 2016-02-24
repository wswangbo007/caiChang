package com.thread.syn;

public class CountBean {

	private int count;
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	CountBean(){};

	public CountBean(int count) {
		super();
		this.count = count;
	}

	@Override
	public String toString() {
		return "CountBean [count=" + count + "]";
	}
}
