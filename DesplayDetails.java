package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DesplayDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info user=root password=sql@123");
			
			Statement stmt=conn.createStatement();
			
			String query="select * from student_info";
			ResultSet rs=stmt.executeQuery(query);
			
			System.out.println("ID \t NAME \t\t PERCENTAGE");
			
			while(rs.next())
			{
				System.out.println(rs.getInt("stdId")+"\t" +rs.getString("stdName")+"\t\t" +rs.getInt("stdPer"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
