package com.set2;

//20.	Calculate the number of digits in an integer
public class p20 {
	public static int countDigits(int num) {
		return String.valueOf(Math.abs(num)).length();
	}

	public static void main(String[] args) {
		int num1 = 12345;
		int num2 = -6789;
		int num4 = 987654321;

		System.out.println("Number of digits in " + num1 + " is: " + countDigits(num1));
		System.out.println("Number of digits in " + num2 + " is: " + countDigits(num2));
		System.out.println("Number of digits in " + num4 + " is: " + countDigits(num4));
	}
}
