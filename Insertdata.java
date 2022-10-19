package demo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Insertdata {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the student id");
		int id=sc.nextInt();
		
		System.out.println("Enter the student name");
		String name=sc.next();
		
		System.out.println("Enter the Student percentage");
		int per=sc.nextInt();
		
		
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info","root","sql@123");
			
			
			Statement stmt=conn.createStatement();
			
			String query="insert into student_info values("+id+",'"+name+"',"+per+")";
			
		int status=stmt.executeUpdate(query);
		
		if(status==1)
		{
			System.out.println("Inserte succssfully");
		}
		else
		{
			System.out.println("Inserted not done");
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
