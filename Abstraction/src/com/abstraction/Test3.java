package com.abstraction;

final class X {
//	final int a;
	
	int data = 20;
	public void m1() {
		System.out.println("m1() called");
	}
}

//class Y extends X {}

public class Test3 {
	public static void main(String[] args) {
		X obj = new X();
		obj.data = 100; // final variables cannot be reassigned
	}
}
