package com.set2;

import java.util.Scanner;

//1.	Java Program to find GCD or HCF of two numbers
public class p1 {
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b;
		System.out.println("Enter two numbers to find GCD or HCF");
		a = in.nextInt();
		b = in.nextInt();
		System.out.println("GCD or HCF of the numbers is " + gcd(a, b));
	}
}
