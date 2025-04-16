package com.set1;

import java.util.Scanner;

//13.	Find the Armstrong number
public class p13 {
	public static boolean isArmstrong(int number) {
		int original = number, result = 0, digits = String.valueOf(number).length();
		while (number != 0) {
			int digit = number % 10;
			result += Math.pow(digit, digits);
			number /= 10;
		}
		return result == original;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n = in.nextInt();
		System.out.println(isArmstrong(n));
	}
}
