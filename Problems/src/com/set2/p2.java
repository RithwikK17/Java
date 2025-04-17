package com.set2;

import java.util.Scanner;

//2.	LCM of two numbers using Java
public class p2 {
	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

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
		System.out.println("Enter two numbers to find LCM");
		a = in.nextInt();
		b = in.nextInt();
		System.out.println("LCM of the numbers is " + lcm(a, b));
	}
}
