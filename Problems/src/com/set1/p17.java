package com.set1;

import java.util.Scanner;

//17.	Factorial of a number 
public class p17 {
	public static long factorial(int n) {
		long fact = 1;
		for (int i = 2; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Enter a numbe to find factorial");
		n = in.nextInt();
		System.out.println("factorial is " + factorial(n));
	}
}
