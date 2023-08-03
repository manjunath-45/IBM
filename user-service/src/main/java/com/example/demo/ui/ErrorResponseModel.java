package com.example.demo.ui;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ErrorResponseModel {
	
	public ErrorResponseModel(String message, long currentTimeMillis, int ordinal) {
		// TODO Auto-generated constructor stub
	}
	private String errorMessage;
	private long errorReportingTime;
	private int status;

}