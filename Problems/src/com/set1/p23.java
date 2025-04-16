package com.set1;

import java.util.Scanner;

//23.	Harshad number(number which is divisible by the sum of its digits)
public class p23 {
	public static boolean isHarshadNumber(int number) {
		int sum = 0, temp = number;
		while (temp != 0) {
			sum += temp % 10;
			temp /= 10;
		}
		return number % sum == 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Enter a number to check for Harshad number");
		n = in.nextInt();
		System.out.println(isHarshadNumber(n));
	}
}
