package com.ibm.customer_project.service;


import java.sql.SQLException;
import java.util.List;

import  com.ibm.customer_project.model.Customer;

public interface CustomerService {

	 public List<Customer> getAllCustomers() throws SQLException;
	 
	 public Customer createCustomer(Customer customer) throws SQLException;
	 
	 public Customer findCustomerById(int customerId) throws SQLException;

	 public List<Customer> findCustomerByFirstName(String first_name) throws SQLException;
	 
	 public Customer updateCustomer( int customerId,Customer customer) throws SQLException;
	 
	 public void deleteCustomerById(int customerId) throws SQLException;
	 
	 public void deleteAllCustomers( ) throws SQLException;
	 
	 
	 
	 
}
