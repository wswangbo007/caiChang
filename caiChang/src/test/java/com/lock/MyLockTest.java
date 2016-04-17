package com.lock;

public class MyLockTest {
	
	public static void main(String[] args) {
		new MyLockTest().init();
	}

	public void init() {

		final MyLock myLock = new MyLock();

		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					try {
						Thread.sleep(1000L);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					myLock.output("上锁!");
				}
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					try {
						Thread.sleep(1000L);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					myLock.output("解锁!");
				}
			}
		}).start();
	}
}
