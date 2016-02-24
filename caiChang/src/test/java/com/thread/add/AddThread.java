package com.thread.add;

public class AddThread {

	public static void main(String[] args) {
		Object obj1 = new Object();Object obj2 = new Object();
		AddThraedFor addThreadFor1 = new AddThread().new AddThraedFor(2,obj1,obj2);
		AddThraedFor2 addThreadFor2 = new AddThread().new AddThraedFor2(2,obj1,obj2);
		Thread t1 = new Thread(addThreadFor1);
		Thread t2 = new Thread(addThreadFor2);
		// Thread t4 = new Thread(addThreadFor1);
		// Thread t3 = new Thread(addThreadFor1);
		t1.start();
		t2.start();
		// t3.start();
		// t4.start();

	}

	class AddThraedFor implements Runnable {

		private int tempValue = 0;

		private Object obj1 = new Object();

		private Object obj2 = new Object();

		public AddThraedFor(int tempValue, Object obj1, Object obj2) {
			this.tempValue = tempValue;
			this.obj1 = obj1;
			this.obj2 = obj2;
		}

		@Override
		public void run() {
			// setValue(tempValue);
			synchronized (obj2) {
				System.out.println(Thread.currentThread().getName());
				synchronized (obj1) {
					System.out.println(Thread.currentThread().getName());
				}
			}
		}

	}

	class AddThraedFor2 implements Runnable {

		private int tempValue = 0;

		private Object obj1 = new Object();

		private Object obj2 = new Object();

		public AddThraedFor2(int tempValue, Object obj1, Object obj2) {
			this.tempValue = tempValue;
			this.obj1 = obj1;
			this.obj2 = obj2;
		}

		@Override
		public void run() {
			// setValue(tempValue);
			synchronized (obj1) {
				System.out.println(Thread.currentThread().getName());
				synchronized (obj2) {
					System.out.println(Thread.currentThread().getName());
				}
			}
		}

	}

//	protected void setValue() {
//		synchronized (obj1) {
//			System.out.println(Thread.currentThread().getName());
//			synchronized (obj2) {
//				System.out.println(Thread.currentThread().getName());
//			}
//		}
//	}

//	protected void setValue1() {
//		synchronized (obj2) {
//			System.out.println(Thread.currentThread().getName());
//			synchronized (obj1) {
//				System.out.println(Thread.currentThread().getName());
//			}
//		}
//	}

	protected int count = 0;

	protected synchronized void setValue(int value) {
		this.count += value;
		System.out.println(Thread.currentThread().getName() + "    "
				+ this.count);
	}

}