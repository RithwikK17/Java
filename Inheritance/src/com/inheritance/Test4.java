package com.inheritance;

class X {
	X(int a) {
		System.out.println("Calling from X");
	}
}

class Y extends X {
	Y() {
		super(10);
		System.out.println("Calling from Y");
	}
}

public class Test4 {
	public static void main(String[] args) {
		Y obj = new Y();
	}
}
