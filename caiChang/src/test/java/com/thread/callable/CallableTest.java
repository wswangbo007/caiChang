package com.thread.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * CallableTest 启动线程
  * @ClassName: CallableTest
  * @Description: TODO
  * @author wangB
  * @date 2016年4月17日 下午6:00:50
 */
public class CallableTest {
	
	List<Integer> resultList = new ArrayList<Integer>();
	
	static {
		
	}

	public static void main(String[] args) {
		new CallableTest().init();
	}
	
	public void init() {
		ExecutorService executorService = Executors.newCachedThreadPool();
		Task task = new Task();
		Future<Integer> future = executorService.submit(task);
		int result = 0;
		try {
			result = future.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println(result);
	}
	
	class Task implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			System.out.println("正在计算!");
			int i = 0;
			while (i <= 100) {
				i += ++i;
			}
			System.out.println("计算结果: " + i);
			return i;
		}
		
	}
}
