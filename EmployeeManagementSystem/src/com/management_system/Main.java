package com.management_system;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char resp;
		System.out.println("Welcoem to Employee Management System");
		do {
			System.out.println("Select the option:");
			System.out.println(
					"1.addEmployee \n 2. findEmployeeById \n 3. getEmployee \n 4. updateEmployee \n 5. deleteEmployee \n 6. searchByName");
			int option = in.nextInt();
			switch (option) {
			case 1:
				System.out.println(EmployeeUtil.addEmployee(in));
				break;
			case 2:
				System.out.println(EmployeeUtil.findById(in));
				break;
			case 3:
				EmployeeUtil.getEmployee();
				break;
			case 4:
				System.out.println(EmployeeUtil.updateEmployee(in));
				break;
			case 5:
				System.out.println(EmployeeUtil.deleteEmployee(in));
				break;
			case 6:
				EmployeeUtil.searchByName(in);
				break;
			default:
				System.out.println("Invalid Option");
			}
			System.out.println("Do you want to continue Y/N?");
			resp = in.next().charAt(0);
		} while (resp == 'Y');
		System.out.println("Thank you!!");
	}
}
