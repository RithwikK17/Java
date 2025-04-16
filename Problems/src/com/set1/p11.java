package com.set1;

import java.util.Scanner;

//11.	Find the Reverse of a number
public class p11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = in.nextInt();
		int reversed = 0;

		while (number != 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number = number / 10;
		}

		System.out.println("Reversed number: " + reversed);
	}
}
