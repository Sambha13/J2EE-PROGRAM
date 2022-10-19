package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdatePer {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the Student  update percentage");
		int per=sc.nextInt();
		
		
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info","root","sql@123");
			Statement stmt=conn.createStatement();
			
			String query ="update student_info set stdPer="+per+"";
			int status=stmt.executeUpdate(query);
			System.out.println(status);
			if(status>1)
			{
				System.out.println("percentage update succfully");
			}
			else
			{
				System.out.println("not update");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
