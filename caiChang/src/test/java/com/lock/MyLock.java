package com.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 读写锁
  * @ClassName: MyLock
  * @Description: TODO
  * @author Comsys-Administrator
  * @date 2016年4月16日 下午7:36:48
  *
 */
public class MyLock {
	
	private Lock lock = new ReentrantLock();

	public void output(String name) {
//		int length = name.length();
		// 上锁
		lock.lock();
		try {
//			for (int i = 0; i < length; i++) {
//				System.out.println(Thread.currentThread().getName() + "  :  " + name.charAt(i));
//			}
			System.out.println(Thread.currentThread().getName() + "  :  " + name);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 释放锁
			lock.unlock();
		}
	}
}
