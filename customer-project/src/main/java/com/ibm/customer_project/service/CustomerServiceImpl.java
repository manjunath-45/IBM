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
	    System.out.println(result+" rows inserted/updated ");
		return customer;
		
	}
	
	@Override
	public Customer findCustomerById(int customerId) throws SQLException{
		
		PreparedStatement pStatement = null;
        pStatement = connection.prepareStatement("select * from customers where customer_id=?"  );
		pStatement.setInt(1, customerId);
	    ResultSet rs=pStatement.executeQuery();
		while(rs.next())
		{
			customers.add(new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
		}
		if(customers.isEmpty())
		{
			return null;
		}
		else
		{
			return customers.get(0);
		}
	
	
		}
	@Override
	public List<Customer> findCustomerByFirstName(String firstName) throws SQLException{
		PreparedStatement pStatement = null;
        pStatement = connection.prepareStatement("select * from customers where first_name=?"  );
		pStatement.setString(1, firstName);
	    ResultSet rs=pStatement.executeQuery();
	    while(rs.next())
	    {
	    	customers.add(new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
	    }
	    if(customers.isEmpty())
		{
			return null;
		}
	    else
	    {
	       return customers;	
	    }
		
	    }
	@Override 
	public Customer updateCustomer(int customerId, Customer customer) throws SQLException{
		PreparedStatement pStatement = null;
        pStatement = connection.prepareStatement("select * from customers where customer_id=?"  );
		pStatement.setInt(1, customerId);
	    ResultSet rs=pStatement.executeQuery();
		while(rs.next())
		{
			customers.add(new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
		}
		
		if(customers.isEmpty())	
		{
				return null;
		}
		else
		{
			 pStatement = connection.prepareStatement("update customers set first_name=? , last_name=? , email=? where customer_id=?"  );
		     pStatement.setString(1, customer.getFirstname());
		     pStatement.setString(2, customer.getLast_name());
		     pStatement.setString(3, customer.getEmail());
		     pStatement.setInt(4, customerId);
		     pStatement.executeUpdate();
		     return customer;
		}
		
		
	}

	@Override
	public void deleteCustomerById(int customerId) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pStatement = null;
        pStatement = connection.prepareStatement("select * from customers where customer_id=?"  );
		pStatement.setInt(1, customerId);
	    ResultSet rs=pStatement.executeQuery();
		while(rs.next())
		{
			customers.add(new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
		}
		if(customers.isEmpty())
		{
			System.out.printf("Customer with customer_id %d not found",customerId);
			
		}
		else 
		{
			pStatement = connection.prepareStatement("delete from customers where customer_id=?"  );
			pStatement.setInt(1, customerId);
			pStatement.executeUpdate();
			System.out.printf("customer with customer_id d% id removed",customerId);
			
		}
		
	}

	@Override
	public void deleteAllCustomers() throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pStatement = null;
        pStatement = connection.prepareStatement("delete from customers"  );
        pStatement.executeUpdate();
        System.out.println("all customer(s) removed...");
		
	}
}
