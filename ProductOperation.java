package PRODUCT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductOperation {
	
	 static Connection conn;
	  static {
		 try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","sql@123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	
	
	
	
	
	
	boolean login (String user,String pass)
	{
		ResultSet rs=null;
		Statement stmt=null;
		String query="select * from login_info2 where username='"+user+"' and password='"+pass+"'";
		
		try {
			stmt=conn.createStatement();
			
			rs=stmt.executeQuery(query);
			
			if(rs.next())
			{
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
		
		
	}

}
