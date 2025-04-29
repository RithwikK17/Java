package com.exception_handling;

public class Test15 {
	public static void m1(int a, int b) {
		try {
			System.out.println(a / b);
			System.out.println("out of try");
			System.exit(0);
		} catch (Exception e) {
			System.out.println("Exception handled");
		} finally {
			System.out.println("Finally block executed");
		}
	}

	public static void main(String[] args) {
		m1(12, 6);
	}
}
