package com.abstraction;

interface M {
	void m1();

	public default void m2() {
		System.out.println("m2() called");
	}

	public static void m3() {
		System.out.println("m3() called");
	}
}

class MImpl implements M {

	@Override
	public void m1() {
		System.out.println("m1() implemented");
	}

	@Override
	public void m2() {
		System.out.println("m2() modified");
	}

//	@Override
//	public static void m3() {
//		System.out.println("m3()modified");
//	}

}

public class Test4 {
	public static void main(String[] args) {
		M ob = new MImpl();
		ob.m1();
		ob.m2();
		M.m3();
	}
}
