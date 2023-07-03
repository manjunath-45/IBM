package Examplenew.com;

import java.io.Serializable;

public class MyClass implements Serializable {
	private String name;
	
	public MyClass(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "MyClass{name='" + name + " '}";
	}

}
