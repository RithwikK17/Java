package com.set1;

//15.	Fibonacci Series upto nth term
import java.util.Scanner;

public class p15 {
	public static void printFibonacci(int n) {
		int a = 0, b = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number to print fibonacci series");
		n = in.nextInt();
		printFibonacci(n);
	}
}
