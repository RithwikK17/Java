package com.set1;

import java.util.Scanner;

//16.	Find the Nth Term of the Fibonacci Series
public class p16 {
	public static int getNthFibonacci(int n) {
		if (n <= 1)
			return n;
		int a = 0, b = 1;
		for (int i = 2; i <= n; i++) {
			int next = a + b;
			a = b;
			b = next;
		}
		return b;
	}

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the nth term to find fibonacci series");
		n = in.nextInt();
		System.out.println(getNthFibonacci(n));
	}
}
