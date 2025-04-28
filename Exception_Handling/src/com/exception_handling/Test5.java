package com.exception_handling;

public class Test5 {
	public static void m2() {
		try {
			int res = 12 / 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("after try-catch");
	}

	public static void main(String[] args) {
		m2();
	}
}
