package com.abstraction;

class T {
	public void m1() {
		System.out.println("m1() called from T");
	}
}

interface T2 {
	void m1();
}

class TImpl extends T implements T2 {

}

public class Test7 {
	public static void main(String[] args) {
		new TImpl().m1();
	}
}
