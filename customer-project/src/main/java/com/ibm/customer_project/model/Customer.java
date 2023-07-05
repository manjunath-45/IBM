package com.ibm.customer_project.model;

public class Customer {

	private int customerId;
	private String firstname;
	private String last_name;
	private String email;
	
	public Customer() {
		super();
	}

	public Customer(int customerId, String firstname, String last_name, String email) {
		super();
		this.customerId = customerId;
		this.firstname = firstname;
		this.last_name = last_name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstname=" + firstname + ", last_name=" + last_name
				+ ", email=" + email + "]";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
