package com.thread.syn;

public class Bank {
	
	private int index = 0;
	
	private String nameAndValue = "";
	
	CountBean [] countBeans = null;
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(CountBean [] countBeans) {
		this.countBeans = countBeans;
	}

	public synchronized void push(CountBean countBean) {
		if (countBeans.length == index && index > 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();
		countBeans[index] = countBean;
		System.out.println("生产了  :  " + countBeans[index]);
		nameAndValue = Thread.currentThread().getName() + "    index : "+ index;
		System.out.println(nameAndValue);
		index++;
	}
	
	public synchronized CountBean pop() {
		if (index <= 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();
		index--;
		System.out.println("消费了  :  " + countBeans[index]);
		nameAndValue = Thread.currentThread().getName() + "    index : "+ index;
		System.out.println(nameAndValue);
		return countBeans[index];
	}
	
}