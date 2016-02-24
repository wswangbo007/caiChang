package com.thread;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class ThreadTest {
	
	public static void main(String [] args) {
		long beginTime = System.currentTimeMillis();
		Writer writer = getWriter();
		WriteFileUtils writerFileUtils = new WriteFileUtils(writer);
		Thread thread = new Thread(writerFileUtils);
		thread.setName("单线程!");
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - beginTime);
		
		long beginTime1 = System.currentTimeMillis();
		try {
			for (int i = 0; i < 6; i++) {
				Writer writer1 = getWriter();
				writerFileUtils = new WriteFileUtils(writer1);
				Thread t = new Thread(writerFileUtils);
				t.setName("单线程" + i);
				t.start();
				t.join();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println(endTime1 - beginTime1);
	}
	
	private static Writer getWriter() {
		String pathName = "D:\\oneThread.txt";
		Writer writer = null;
		try {
			writer = new FileWriter(pathName,false);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return writer;
	}
}
