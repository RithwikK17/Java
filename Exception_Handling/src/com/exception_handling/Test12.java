package com.exception_handling;

public class Test12 {
	public static void m1() {
		try {
			System.out.println("Inside outer try block");
			try {
				System.out.println("inside inner try block");
				System.out.println(12 / 0);
			} catch (NullPointerException e) {
				System.out.println("Exception handled by inner catch");
			}
		} catch (Exception e) {
			System.out.println("Exception handled in outer catch");
		}
	}

	public static void main(String[] args) {
		m1();
	}

}
