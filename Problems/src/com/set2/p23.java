package com.set2;

//23.	Finding Number of times x digit occurs in a given input
public class p23 {
	public static int count(int number, int digit) {
		return (int) String.valueOf(number).chars().filter(ch -> ch == ('0' + digit)).count();
	}

	public static void main(String[] args) {
		int num1 = 123456789;
		int num2 = 101010101;
		int num3 = 987654321;
		int num4 = 222333;

		int digit1 = 1;
		int digit2 = 2;
		int digit3 = 5;

		System.out.println("Digit " + digit1 + " appears in " + num1 + ": " + count(num1, digit1) + " times.");
		System.out.println("Digit " + digit2 + " appears in " + num2 + ": " + count(num2, digit2) + " times.");
		System.out.println("Digit " + digit3 + " appears in " + num3 + ": " + count(num3, digit3) + " times.");
		System.out.println("Digit " + digit2 + " appears in " + num4 + ": " + count(num4, digit2) + " times.");
	}
}
