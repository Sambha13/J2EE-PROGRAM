package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class StudentAbovefifty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/student_info","root","sql@123");
			Statement stmt=conn.createStatement();
			
			String query="select * from student_info where stdPer>=50";
			ResultSet rs=stmt.executeQuery(query);
			System.out.println("Name\t");
			System.out.println("ID\t");
			while(rs.next())
			{
				
				System.out.println(rs.getString("stdName" +"\t\t"+ rs.getInt("stdId"));
				//System.out.println(rs.getInt("stdId"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
