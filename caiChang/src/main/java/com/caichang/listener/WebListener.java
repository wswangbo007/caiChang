package com.caichang.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.caichang.netty.NettyServer;

/**
 * 监听
 * @author wangB
 *
 */
public class WebListener implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.err.println("---------------------------");
		System.out.println("初始化 监听器");
		new Thread() {
			public void run() {
				System.out.println("启动线程!!    " + Thread.currentThread().getName());
				new NettyServer().run();
			};
		}.start();
		System.err.println("---------------------------");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.err.println("---------------------------");
		// TODO Auto-generated method stub
		System.out.println("关闭 监听器");
		System.err.println("---------------------------");
	}

}
