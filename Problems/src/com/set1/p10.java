package com.set1;

import java.util.Scanner;

//10.	Find the Sum of the Digits of a Number in Java Language
public class p10 {
	public static int sumOfDigits(int number) {
		int sum = 0;
		if (number == 0) {
			return 0;
		}

		while (number > 0) {
			int digit = number % 10;
			sum += digit;
			number /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		int Test;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter digits");
		Test = in.nextInt();
		int Result = sumOfDigits(Test);
		System.out.println("The sum of digits of " + Test + " is: " + Result);
	}
}
