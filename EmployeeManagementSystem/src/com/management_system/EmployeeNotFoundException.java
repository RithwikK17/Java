package com.management_system;

public class EmployeeNotFoundException extends RuntimeException {
	private String msg;

	public EmployeeNotFoundException(String msg) {
		this.msg = msg;
	}

	public String getErrorMsg() {
		return msg;
	}
}
