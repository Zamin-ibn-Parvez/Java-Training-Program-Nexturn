package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction;

public class InsertDate {
	public static void main(String[] args) throws SQLException, ParseException {
		com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:mysql://localhost:3306/nexturn_database_practice";
		Connection conn = DriverManager.getConnection(url, "root", "Database@25");
		System.out.println("Connected");
		
		String query = "insert into dates values (?) ";
		String dateString = "27-03-2025";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date utilDate = sdf.parse(dateString);
		java.sql.Date sqldate = new java.sql.Date(utilDate.getTime());
		PreparedStatement pst = conn.prepareStatement(query);
		pst.setDate(1, sqldate);
		
		int rows = pst.executeUpdate();
		
		if(rows>0) {
			System.out.println("Date inserted successfully");
		}
		else {
			System.out.println("Date not inserted");
		}
	}

}
