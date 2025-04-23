package com.polymorphism;

class Parent {
	public void m1() {
		System.out.println("called from parent");
	}
}

class Child extends Parent {
	@Override
	public void m1() {
		System.out.println("called from child");
	}
}

public class Test3 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
	}
}
