package com.set1;

import java.util.Scanner;

//21.	Perfect number (a positive integer that is equal to the sum of its proper divisors)
public class p21 {
	public static boolean isPerfectNumber(int number) {
		int sum = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		return sum == number;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Enter a number to check for perfect number");
		n = in.nextInt();
		System.out.println(isPerfectNumber(n));
	}
}
