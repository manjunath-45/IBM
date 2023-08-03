package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setUserId(String string) {
		// TODO Auto-generated method stub
		
	}
	
}