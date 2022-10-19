package demo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Connection conn;
		try {
		Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info","root","sql@123");
		
		//stmt=conn.createStatement();
		
		Statement stmt=conn.createStatement();
		
		String query="insert into student_info values (4,'ABC',80)";
		
		int status=stmt.executeUpdate(query);
		if(status==1)
		{
			System.out.println("Insert succefully");
		}
		else
		{
			System.out.println("Data is not inserted");
		}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
