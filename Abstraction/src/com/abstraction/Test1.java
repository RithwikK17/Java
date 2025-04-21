package com.abstraction;

abstract class Parent {
	public abstract void m1();

//	public static abstract m2() {}
	public static void m2() {
		System.out.println("static m2() called");
	}

	public void m3() {
		System.out.println("m3() called");
	}

	Parent() {
		System.out.println("constructor called");
	}
}

//abstract Child extends Parent{}
class Child extends Parent {
	public void m1() {
		System.out.println("m1() implemented by child class");
	}
}

public class Test1 {

	public static void main(String[] args) {
//		Parent p = new Parent();

		Parent p = new Child();
		p.m1();
		Parent.m2();

		p.m3();
	}

}