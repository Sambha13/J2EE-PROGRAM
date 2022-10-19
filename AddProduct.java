package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Schema.CreateCollectionOptions;

public class AddProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the product Name");
		String name=sc.next();
		System.out.println("Entre the product Price");
		double price=sc.nextDouble();
		System.out.println("Enter the product categary");
		String category=sc.next();
		
		//Declare resources
		
		Connection conn = null;
		Statement stmt=null;
		
		//build sql query
		
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","sql@123");
			stmt=conn.createStatement();
			String query="insert into product_data(product_name,product_price,product_category) values('"+name+"',"+price+",'"+category+"')";
			
			int count=stmt.executeUpdate(query);
			
			System.out.println("Insert into product values successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	
		

	}

}
