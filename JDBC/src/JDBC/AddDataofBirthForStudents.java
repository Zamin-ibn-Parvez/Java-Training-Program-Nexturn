package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AddDataofBirthForStudents {
	public static void main(String[] args) throws SQLException, ParseException {
		Scanner sc = new Scanner(System.in);
		com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:mysql://localhost:3306/nexturn_database_practice";
		Connection conn = DriverManager.getConnection(url, "root", "Database@25");
		System.out.println("Connected");
		
		String query = "ALTER TABLE STUDENTS ADD COLUMN DATE_OF_BIRTH DATE";
		PreparedStatement pst = conn.prepareStatement(query);
//		pst.executeUpdate();  We need to run it only once and after the column is created just comment it out

		
		String dateQuery = "update students set DATE_OF_BIRTH = ? where regNo = ? ";
		System.out.println("Enter the date of birth");
		String dateString = sc.nextLine();
		System.out.println("Enter the regNo. :");
		int regNo = sc.nextInt();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date utilDate = sdf.parse(dateString);
		java.sql.Date sqldate = new java.sql.Date(utilDate.getTime());
		pst = conn.prepareStatement(dateQuery);
		pst.setDate(1, sqldate);
		pst.setInt(2, regNo);
		
		
		int rows = pst.executeUpdate();
		
		if(rows>0) {
			System.out.println("Date inserted successfully");
		}
		else {
			System.out.println("Date not inserted");
		}
	}
	
}
