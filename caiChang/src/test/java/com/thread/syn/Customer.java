package com.thread.syn;

public class Customer implements Runnable {

	private Bank bank;
	
	private int count;
	
	Customer() {};
	
	Customer(Bank bank,int count) {
		this.bank = bank;
		this.count = count;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < count; i++) {
			CountBean countBean = new CountBean(i);
			bank.push(countBean);
		}
	}
}