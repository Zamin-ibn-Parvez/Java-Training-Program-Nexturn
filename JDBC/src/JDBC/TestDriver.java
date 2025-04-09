package JDBC;

import java.sql.*;



public class TestDriver {
	public static void main (String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:mysql://localhost:3306/nexturn_database_practice";
		Connection conn = DriverManager.getConnection(url, "root", "Database@25");
		System.out.println("Connected");
		String query = "insert into students values (444,'Zamin','Chemical')";
		Statement st = conn.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println(rows);
		conn.close();
		
		
		
	}
}