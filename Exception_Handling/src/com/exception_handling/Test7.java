package com.exception_handling;

public class Test7 {
	public static void m1() {
		try {
			int result = 12 / 0;
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
	}

	public static void main(String[] args) {
		m1();
	}
}
