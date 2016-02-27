package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC {
	
	private static final String drive = "com.mysql.jdbc.Driver";
	
	private static final String URL = "jdbc:mysql://192.168.1.133:3306/test1";
	
	private static final String USERNAME = "root";
	
	private static final String PASSWORD = "root";
	
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName(drive);		// 加载驱动
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT S1,C1,SCORE FROM SC");
			while (resultSet.next()) {
				System.out.println(resultSet.getString("S1") + "  " + resultSet.getInt("C1") + resultSet.getString("SCORE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
