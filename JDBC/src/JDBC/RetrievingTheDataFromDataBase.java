package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.mysql.cj.jdbc.interceptors.ResultSetScannerInterceptor;

public class RetrievingTheDataFromDataBase {
	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:mysql://localhost:3306/nexturn_database_practice";
		Connection conn = DriverManager.getConnection(url, "root", "Database@25");
		System.out.println("Connected");
		
		String query = "select * from students";
		PreparedStatement pst = conn.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		ResultSetMetaData metaData = rs.getMetaData();
		for(int i=1; i<metaData.getColumnCount();i++) 
			System.out.print(metaData.getColumnName(i) + " ");
		System.out.println("\n--------------------------");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " "+ rs.getString(2)+ " "+ rs.getString(3));
		}
		
	}
}
