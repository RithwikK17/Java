package com.set1;

//12.	Find the Palindrome number
import java.util.Scanner;

public class p12 {
	public static boolean isPalindrome(int number) {
		int original = number, reversed = 0;
		while (number != 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number /= 10;
		}
		return original == reversed;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n = in.nextInt();
		System.out.println(isPalindrome(n));
	}
}
