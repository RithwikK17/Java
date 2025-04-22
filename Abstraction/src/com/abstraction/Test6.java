package com.abstraction;

interface D {
	void m1();
}

interface E {
	void m1();
}

interface F extends D, E {
}

class Impl implements D, E {

	@Override
	public void m1() {
		System.out.println("Calling from Implementing class");
	}

}

public class Test6 {
	public static void main(String[] args) {
		D obj = new Impl();
		obj.m1();
	}
}