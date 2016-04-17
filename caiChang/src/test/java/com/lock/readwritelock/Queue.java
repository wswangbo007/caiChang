package com.lock.readwritelock;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Queue {

	private List<Integer> data = Collections.synchronizedList(new LinkedList<Integer>());	// 共享数据，只能有一个线程同时写它，但是可以多个线程同时读它  
	
	ReadWriteLock readWriteLock = new ReentrantReadWriteLock();	// 读写锁：上面有一个读锁和一个写锁  
	
	/**
	 * 获取数据
	  * get(这里用一句话描述这个方法的作用)
	  * TODO(这里描述这个方法适用条件 – 可选)
	  * TODO(这里描述这个方法的执行流程 – 可选)
	  * TODO(这里描述这个方法的使用方法 – 可选)
	  * TODO(这里描述这个方法的注意事项 – 可选)
	  *
	  * @Title: get
	  * @Description: TODO
	  * @param     设定文件
	  * @return void    返回类型
	  * @throws
	 */
	public void get() {
		readWriteLock.readLock().lock();
		try {
            System.out.println(Thread.currentThread().getName()  
                    + " 读取:     个数: " + data.size() + "数据 : " + data.toString());
            data.clear();
            Thread.sleep(1L);
//            System.out.println(Thread.currentThread().getName()  
//                    + " hava read data: " + data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
        	readWriteLock.readLock().unlock();
        }  
	}
	
	/**
	 * 读取数据
	  * put(这里用一句话描述这个方法的作用)
	  * TODO(这里描述这个方法适用条件 – 可选)
	  * TODO(这里描述这个方法的执行流程 – 可选)
	  * TODO(这里描述这个方法的使用方法 – 可选)
	  * TODO(这里描述这个方法的注意事项 – 可选)
	  *
	  * @Title: put
	  * @Description: TODO
	  * @param @param data    设定文件
	  * @return void    返回类型
	  * @throws
	 */
	public void put(int data) {
		readWriteLock.writeLock().lock();
		try {
			if (data > 0) {
				this.data.add(data);
	            System.out.println(Thread.currentThread().getName()  
	                    + " 写入: " + data);
	            Thread.sleep(1L);
			}
//            System.out.println(Thread.currentThread().getName()  
//                    + " hava read data: " + data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
        	readWriteLock.writeLock().unlock();
        }
	}
	
}
