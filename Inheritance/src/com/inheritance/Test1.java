package com.inheritance;

class Parent {
	int data = 100;
	public int data2 = 200;
	protected int data3 = 300;
	private int data4 = 400;
}

class Child extends Parent {
	public void getData() {
		System.out.println(data);
		System.out.println(data2);
		System.out.println(data3);
//		System.out.println(data4);
	}
}

public class Test1 {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.getData();
	}
}
