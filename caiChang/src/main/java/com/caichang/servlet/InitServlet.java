package com.caichang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.caichang.netty.NettyServer;

public class InitServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		new Thread() {
			public void run() {
				System.out.println("启动线程!!    " + Thread.currentThread().getName());
				new NettyServer().run();
			};
		}.start();
	}

}