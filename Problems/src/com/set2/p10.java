package com.set2;

import java.util.Scanner;

// 10. Binary To Octal 
public class p10 {
	public static String convert(String binary) {
		int decimal = Integer.parseInt(binary, 2);
		return Integer.toOctalString(decimal);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a binary number to convert to octal: ");
		String binary = in.next();

		String octal = convert(binary);
		System.out.println("Octal Equivalent: " + octal);
	}
}
