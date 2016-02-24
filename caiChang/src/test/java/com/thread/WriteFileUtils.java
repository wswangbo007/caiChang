package com.thread;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class WriteFileUtils implements Runnable {
	
	private FileWriter fileWriter;
	
	public WriteFileUtils(Writer fileWriter) {
		this.fileWriter = (FileWriter) fileWriter;
	}

	@Override
	public void run() {
		Writer writer = null;
		BufferedWriter bfw = null;
		try {
			bfw = new BufferedWriter(fileWriter);
			for (int i = 0; i < 50000000; i++) {
				bfw.append(i+"@");
			}
			bfw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bfw.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
