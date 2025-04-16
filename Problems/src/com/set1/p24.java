package com.set1;

import java.util.Scanner;

//24.	Abundant number(If the sum of all its proper divisors, denoted by sum(n), is greater than the number's value)
public class p24 {
	public static boolean isAbundantNumber(int number) {
		int sum = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		return sum > number;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Enter a number to check for Abundant numbers");
		n = in.nextInt();
		System.out.println(isAbundantNumber(n));
	}
}
