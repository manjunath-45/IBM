package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserNotFoundException extends Exception {

	public UserNotFoundException(String string) {
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;
	
	private String message;
	
	

}