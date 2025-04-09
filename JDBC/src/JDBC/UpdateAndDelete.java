package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.xml.stream.events.Comment;

public class UpdateAndDelete {	
	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:mysql://localhost:3306/nexturn_database_practice";
		Connection conn = DriverManager.getConnection(url, "root", "Database@25");
		System.out.println("Connected");
		String query = "update students set studentname=? , department =?  where regNo = ? ";
		PreparedStatement pst = conn.prepareStatement(query);
		pst.setString(1, "Muneez");
		pst.setString(2, "Chemical");
		pst.setInt(3, 345);
		int rows  = pst.executeUpdate();
		if(rows>0) {
			System.out.println("updated");
		}
		else {
			System.out.println("Not updated");
		}
		
		String deleteString = "delete from students where regNo= ?";
		pst = conn.prepareStatement(deleteString);
		pst.setInt(1, 321);
		rows = pst.executeUpdate();
		if(rows>0) {
			System.out.println("Deleted");
		}
		else {
			System.out.println("Not Deleted");
		}
		
	
		conn.close();
		
	}
}
