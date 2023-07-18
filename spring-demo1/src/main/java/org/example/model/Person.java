package org.example.model;

public class Person {

	private String firstName;

	private String lastName;
	
	private Address address;

	public Person(String firstName, String lastName,Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
	
	
	
	
}
