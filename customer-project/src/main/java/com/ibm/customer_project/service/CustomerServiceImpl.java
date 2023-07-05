package com.ibm.customer_project.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.ibm.customer_project.model.Customer;
import com.ibm.customer_project_factory.MyConnectionFactory;


public class CustomerServiceImpl implements CustomerService {
	
	private MyConnectionFactory myConnectionFactory=null;
	
	private List<Customer> customers;
	
	private Connection connection =null;
	
	{
		try {
			customers=new ArrayList<Customer>();
			myConnectionFactory=MyConnectionFactory.getMyFactory();
			connection=myConnectionFactory.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Customer> getAllCustomers() throws SQLException{
		
		Statement statement=connection.createStatement();
		ResultSet resultSet= statement.executeQuery("select * from customers");
		while(resultSet.next())
		{
			customers.add(new Customer(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)));
		}
    	return customers;
	 
	}
	
	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		
		PreparedStatement pstatement = connection.prepareStatement("insert into customers(customer_id,first_name,last_name,email) values(?,?,?,?)");
		pstatement.setInt(1,customer.getCustomerId());
		pstatement.setString(2,customer.getFirstname());
		pstatement.setString(3,customer.getLast_name());
		pstatement.setString(4,customer.getEmail());
		int result = pstatement.executeUpdate();
	    System.out.println(result+"rows inserted/updated");
	    
		
		
		return null;
		
	}

}
