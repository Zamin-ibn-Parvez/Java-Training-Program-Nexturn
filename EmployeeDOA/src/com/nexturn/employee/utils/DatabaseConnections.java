package com.nexturn.employee.utils;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class DatabaseConnections {
	
	private static Connection conn;
	public static Connection getDbConnection() {
		try {
				DriverManager.registerDriver(new Driver());
				String url="jdbc:mysql://localhost:3306/nexturn_database_practice";
				conn = DriverManager.getConnection(url,"root","Databse@25");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void closeDBConnection() {
		try {
			conn.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
