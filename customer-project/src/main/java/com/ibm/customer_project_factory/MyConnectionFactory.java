package com.ibm.customer_project_factory;

import java.sql.Connection;
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionFactory {
 
	private static  Connection CONNECTION;
	
	private static MyConnectionFactory myConnectionFactory;
	
	
	private MyConnectionFactory() throws SQLException
	{
		
		
		
	}
	
	public Connection getConnection() throws SQLException
	{
		DriverManager.registerDriver(new Driver());
		CONNECTION=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","pass@word1");
		return CONNECTION;
	}
	
	public static MyConnectionFactory getMyFactory() throws SQLException
	{
		try{
			
		    if(myConnectionFactory==null)
		   {
			myConnectionFactory=new MyConnectionFactory();
			
		   }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	   return myConnectionFactory;	
		
	}
	
	
}




