package com.inheritance;

class A1 {
	public void m1() {
		System.out.println("from parent class");
	}
}

class B1 extends A1 {
	
}

public class Test3 {
	public static void main(String[] args) {
		B1 obj = new B1();
		obj.m1();
	}
}
