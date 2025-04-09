package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.xml.stream.events.Comment;

public class AddStudent {
	public static void main (String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in); 
		com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:mysql://localhost:3306/nexturn_database_practice";
		Connection conn = DriverManager.getConnection(url, "root", "Database@25");
		System.out.println("Connected");
		String query = "insert into students values (?,?,?)";  //Dynamic query
		PreparedStatement pst = conn.prepareStatement(query);
		
		for(int i=0;i<3;i++) {   //Take the input from the user and add it into the database
			System.out.println("Enter the student regNo. : ");
			pst.setInt(1, sc.nextInt());
			System.out.println("Enter the student name : ");
			sc.nextLine();
			pst.setString(2, sc.nextLine());
			System.out.println("Enter the stream name: ");
			pst.setString(3, sc.nextLine());
			
			
			int rows = pst.executeUpdate();	
			if(rows>0) {
				System.out.println("inserted");
			}
			else {
				System.out.println("Not inserted");
			}
		}

		conn.close();
	}
}
