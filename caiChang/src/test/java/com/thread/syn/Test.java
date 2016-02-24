package com.thread.syn;

public class Test {

	public static void main(String[] args) {
		CountBean [] countBeans = new CountBean[6];
		Bank bank = new Bank(countBeans);
		Customer customer = new Customer(bank,60);
		GetMoney getMoney = new GetMoney(bank,60);
		Thread t1 = new Thread(customer);
		Thread t2 = new Thread(getMoney);
		Thread t3 = new Thread(customer);
		Thread t4 = new Thread(getMoney);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
