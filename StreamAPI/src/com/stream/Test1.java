package com.stream;

@FunctionalInterface
interface A {
//	void m1();
	String getUpperCase(String str);
}

public class Test1 {
	public static void main(String[] args) {
//		A obj = () -> {
//			System.out.println("Hello");
//		};
//		obj.m1();

		A obj = (str) -> {
			return str.toUpperCase();
		};
		System.out.println(obj.getUpperCase("java"));
	}
}
