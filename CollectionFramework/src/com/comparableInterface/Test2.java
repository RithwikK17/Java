package com.comparableInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	private int empId;
	private String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

}

class SortById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpId() - o2.getEmpId();
	}

}

class SortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpName().compareTo(o2.getEmpName());
	}

}

public class Test2 {
	public static void main(String[] args) {
		Employee e1 = new Employee(2, "Harsh");
		Employee e2 = new Employee(3, "Yogesh");
		Employee e3 = new Employee(1, "Varun");

		List<Employee> list = Arrays.asList(e1, e2, e3);

		System.out.println("Comparing employees using empId:");
		Collections.sort(list, new SortById());
		System.out.println(list);

		System.out.println("Comparing employess using empName");
		Collections.sort(list, new SortByName());
		System.out.println(list);
	}
}
