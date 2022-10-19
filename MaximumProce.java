package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MaximumProce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement stmt=null;
		Connection conn=null;
		
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","sql@123");
			stmt=conn.createStatement();
			
			String query="select * from product_data where product_price in(select max(product_price) from product_data)";
			
		ResultSet rs=stmt.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println("MAximum price details : "+rs.getInt(1));
			System.out.println("name : "+rs.getString(2));
		}
			
					
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

