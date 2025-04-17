package com.set2;

import java.util.Scanner;

// 11. Octal to Binary
public class p11 {
	public static String convert(String octal) {
		int decimal = Integer.parseInt(octal, 8);
		return Integer.toBinaryString(decimal);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an octal number to convert to binary: ");
		String octal = in.next();

		String binary = convert(octal);
		System.out.println("Binary Equivalent: " + binary);
	}
}
