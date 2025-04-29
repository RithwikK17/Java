package com.exception_handling;

public class Test18 {
	public static void m1() throws InterruptedException { // exception object moves to caller function i.e main method
															// m1();
		throw new InterruptedException();
	}

	public static void main(String[] args) throws InterruptedException { // exception object moves to caller function
																			// i.e JVM & JVM does not handle any
																			// exceptions it only throws the Exceptions
																			// this process is called Exception
																			// Propagation
		m1();
	}
}
