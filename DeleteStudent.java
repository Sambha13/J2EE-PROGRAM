package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the student id to delete student");
		int id=sc.nextInt();
		// TODO Auto-generated method stub
		
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info","root","sql@123");
			
			Statement stmt=conn.createStatement();
			
			String query="delete from student_info where stdId="+id;
			
			int status=stmt.executeUpdate(query);
			
			if(status==1)
			{
				System.out.println("Deleted successfully");
			}
			else
			{
				System.out.println("Deleted not succfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
