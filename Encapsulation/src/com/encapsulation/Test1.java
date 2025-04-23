package com.encapsulation;

class Employee {
	private int empId;
	private String empName;

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return this.empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
}

public class Test1 {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(102);
		System.out.println(emp.getEmpId());
	}
}
