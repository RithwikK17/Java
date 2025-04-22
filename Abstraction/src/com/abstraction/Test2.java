package com.abstraction;

abstract class A {
	int data = 20; // non-final non-static variable
	static int data2 = 30;
	final int data3 = 40; // value cannot be modified at any point of the program
	static final int data4 = 50;
}

class AImpl extends A {

}

public class Test2 {

	public static void main(String[] args) {
		A obj = new AImpl();
		System.out.println(obj.data);
		System.out.println(A.data2);
		System.out.println(obj.data3);
		System.out.println(A.data4);
	}

}