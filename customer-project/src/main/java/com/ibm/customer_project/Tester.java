package com.ibm.customer_project;


import java.sql.DriverManager;
import java.sql.ResultSet;

import com.ibm.customer_project.model.Customer;
import com.ibm.customer_project.service.CustomerService;
import com.ibm.customer_project.service.CustomerServiceImpl;
import com.mysql.cj.jdbc.Driver;

import java.sql.Statement;
import java.util.List;
import java.sql.Connection;



public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		   
			/*
			 DriverManager.registerDriver(new Driver());
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","pass@word1");
			
			Statement statement = connection.createStatement();
			 ResultSet rs = statement.executeQuery("select * from customers ");
			 
			 while(rs.next())
			 {
				 System.out.println(rs.getInt("customer_id")+", "+ rs.getString("first_name")+","+rs.getString("last_name")+","+rs.getString("email"));
				 
			 }
			*/
			
			
		    
		    CustomerService service = new CustomerServiceImpl();
		   
		   
		   
		  /*  Customer c1=service.createCustomer( new Customer(4,"Sachin","T","sachin1@gmail.com"));
		    System.out.println(c1);
		    List<Customer> l=service.getAllCustomers(); 
		    for(Customer c:l) 
		    {
		    	System.out.println(c);
		    }
		    
			Customer customer=service.findCustomerById(1);
			if(customer==null)
			{
				System.out.println("no such customer exists");
			}
			else
			{
				System.out.println("Customer Found: \n"+customer);
			}
			*/
		    
		   /*
		     List<Customer> list = service.findCustomerByFirstName("Sachin");
		    
		    if(list==null)
		    {
		    	System.out.println("No customer found with the given first name ");
		    
		    }
		    else
		    {
		    	for(Customer c: list)
		    	{
		    		System.out.println(c);
		    	}
		    }
		    */
		    
		    /*Customer customer = service.updateCustomer(1,new Customer("John","Doe","john.doe@gamil.com"));
		    
		    if(customer==null)
		    {
		    	System.out.println("update successful");
		    }
		    else
		    {
		    	System.out.println("Customer updated "+customer);
		    }
		    */
		   /* service.deleteCustomerById(2);*/
		    
		    service.deleteAllCustomers();
		}
        catch (Exception e)
		{
        	e.printStackTrace();
        }
	}

}
