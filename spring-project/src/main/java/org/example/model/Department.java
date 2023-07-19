package org.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Department {
   
	private int departementId;
	
	// @Value("${department.name}")
	private String departmentName;
	private Location location;
	
	//@Autowired
	public Department(Location location) {

		this.location = location;
	}
	public int getDepartementId() {
		return departementId;
	}
	public void setDepartementId(int departementId) {
		this.departementId = departementId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "departement Id :" + departementId + " department name: " + departmentName + " location: "
				+ location;
	}
	
	
}
