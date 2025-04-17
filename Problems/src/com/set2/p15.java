package com.set2;

import java.util.Scanner;

// 15. Add two fractions using Java
public class p15 {

	// Method to add two fractions
	public static String add(int num1, int den1, int num2, int den2) {
		int lcm = LCM(den1, den2);
		int sum = num1 * (lcm / den1) + num2 * (lcm / den2);
		int gcd = GCD(sum, lcm);
		return (sum / gcd) + "/" + (lcm / gcd);
	}

	public static int GCD(int a, int b) {
		if (b == 0)
			return a;
		return GCD(b, a % b);
	}

	public static int LCM(int a, int b) {
		return (a * b) / GCD(a, b);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter numerator of first fraction: ");
		int num1 = in.nextInt();
		System.out.print("Enter denominator of first fraction: ");
		int den1 = in.nextInt();

		System.out.print("Enter numerator of second fraction: ");
		int num2 = in.nextInt();
		System.out.print("Enter denominator of second fraction: ");
		int den2 = in.nextInt();

		if (den1 == 0 || den2 == 0) {
			System.out.println("Denominator cannot be zero.");
		} else {
			String result = add(num1, den1, num2, den2);
			System.out.println("Sum of fractions: " + result);
		}
	}
}
