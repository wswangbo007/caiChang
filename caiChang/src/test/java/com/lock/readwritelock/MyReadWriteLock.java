package com.lock.readwritelock;

import java.util.Random;

/**
 * 读写锁
 * 
 * @ClassName: MyReadWriteLock
 * @Description: TODO
 * @author wangB
 * @date 2016年4月16日 下午7:43:01
 *
 */
public class MyReadWriteLock {

	public static void main(String[] args) {
		final Queue queue = new Queue();
		
//		for (int i = 0; i < 3; i++) {
			Thread tr = new Thread(new Runnable() {
	
				@Override
				public void run() {
					// TODO Auto-generated method stub
					while (true) {
						queue.get();
					}
					
				}
	
			});
//		}

		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					while (true) {
						queue.put(new Random().nextInt(10000));
					}
				}

			}).start();
		}
		
	}
	
	public void send(String name){};
	
	public void send(String name,String method){};
	
	

}
