package com.inheritance;

class Base {
	Base() {
		System.out.println("From parent");
	}
}

class Derived extends Base {
	Derived() {
//		super();
		this(10); // constructor does not allow recursive calls
		System.out.println("from child");
	}

	Derived(int a) {
		System.out.println("one arg constructor");
	}
}

public class Test5 {
	public static void main(String[] args) {
		Derived d = new Derived();
	}
}
