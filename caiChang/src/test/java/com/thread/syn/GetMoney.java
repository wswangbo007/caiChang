package com.thread.syn;

public class GetMoney implements Runnable {
	
	private Bank bank;
	
	private int count;
	
	public GetMoney() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GetMoney(Bank bank,int count) {
		this.bank = bank;
		this.count = count;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < count; i++) {
			bank.pop();
		}
	}
	
}
