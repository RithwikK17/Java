package com.exception_handling;

public class Test9 {
	public static void m1() {
		String str = null;
		System.out.println(str.length());
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