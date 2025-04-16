package com.set1;

import java.util.Scanner;

//18.	Power of a number 
public class p18 {
	public static double power(int base, int exponent) {
		return Math.pow(base, exponent);
	}

	public static void main(String[] args) {
		int base, exp;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter base and exponent numbers");
		base = in.nextInt();
		exp = in.nextInt();
		System.out.println("the power of the numbers is " + power(base, exp));
	}
}
