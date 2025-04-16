package com.set1;

import java.util.Scanner;

//20.	Strong number (sum of factorial of digits is equals to number itself)
public class p20 {
	public static boolean isStrongNumber(int number) {
		int original = number, sum = 0;
		while (number != 0) {
			int digit = number % 10;
			sum += factorial(digit);
			number /= 10;
		}
		return sum == original;
	}

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
		System.out.println("Enter a numbe to check whether it is a strong number or not");
		n = in.nextInt();
		System.out.println(isStrongNumber(n));
	}
}
