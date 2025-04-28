package com.exception_handling;

public class Test4 {

	public static void m1() {
		try {
			System.out.println("statement 1");
			System.out.println(12 / 0);
		} catch (Exception e) {
			System.out.println("Exception Handled in catch block");
		}
		System.out.println("statement 3");
	}

	public static void main(String[] args) {
		m1();
	}
}
