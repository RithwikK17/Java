package com.management_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeUtil {
	private static List<Employee> empList;
	static {
		empList = new ArrayList<>();
	}

	// addEmployee
	public static String addEmployee(Scanner in) {
		System.out.println("Generate new id for an employee");
		int empId = in.nextInt();
		System.out.println("Enter the name of employee");
		String empName = in.nextLine();
		in.nextLine();
		System.out.println("Enter the department name");
		String deptName = in.next();
		System.out.println("Enter the salary for the employee");
		double salary = in.nextDouble();

		Employee emp = new Employee();
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		emp.setDeptName(deptName);
		emp.setSalary(salary);

		boolean isSaved = empList.add(emp);
		if (isSaved)
			return "Employee added";
		return "Cannot add employee";
	}

	// findEmployeeById
	public static Employee findById(Scanner in) {
		System.out.println("Enter the id of an employee");
		int empId = in.nextInt();
		int tempId = -1;
		boolean isFound = false;
		for (Employee emp : empList) {
			if (emp.getEmpId() == empId) {
				isFound = true;
				tempId = empId;
				break;
			}
		}
		if (isFound) {
			for (Employee emp : empList) {
				if (tempId == emp.getEmpId())
					return emp;
			}
		}
		try {
			throw new EmployeeNotFoundException("Employee not found");
		} catch (EmployeeNotFoundException ex) {
			System.out.println(ex.getErrorMsg());
			return null;
		}
	}

	// getEmployee
	public static void getEmployee() {
		for (Employee emp : empList) {
			System.out.println(emp);
		}
	}

	// updateEmployee
	public static String updateEmployee(Scanner in) {
		System.out.println("Enter the ID of an employee to search");
		int searchId = in.nextInt();
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpId() == searchId) {
				System.out.println("Enter the name of employee");
				String empName = in.nextLine();
				in.nextLine();
				System.out.println("Enter the department name");
				String deptName = in.next();
				System.out.println("Enter the salary for the employee");
				double salary = in.nextDouble();
				Employee updatedEmp = new Employee();
				updatedEmp.setEmpId(searchId);
				updatedEmp.setEmpName(empName);
				updatedEmp.setDeptName(deptName);
				updatedEmp.setSalary(salary);

				empList.set(i, updatedEmp);

				return "Employee updated";
			}
		}
		try {
			throw new EmployeeNotFoundException("Employee not found");
		} catch (EmployeeNotFoundException ex) {
			return (ex.getErrorMsg());
		}
	}

	// deleteEmployee
	public static String deleteEmployee(Scanner in) {
		System.out.println("Enter the ID of an employee to Delete");
		int searchId = in.nextInt();
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpId() == searchId) {
				empList.remove(i);
				return "Employee Deleted";
			}
		}
		try {
			throw new EmployeeNotFoundException("Employee not found");
		} catch (EmployeeNotFoundException ex) {
			return (ex.getErrorMsg());
		}
	}

	// searchByName
	public static void searchByName(Scanner in) {
		System.out.println("Enter the Name of an employee");
		String searchName = in.nextLine();
		in.nextLine();
		boolean found = false;

		for (Employee emp : empList) {
			if (emp.getEmpName().equalsIgnoreCase(searchName)) {
				System.out.println(emp);
				found = true;
			}
		}
	}

}
