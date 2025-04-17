package com.set2;

import java.util.Scanner;

//8.	Decimal to Octal Conversion
public class p8 {
	public static String convert(int decimal) {
		return Integer.toOctalString(decimal);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a decimal number to convert to octal: ");
		int decimal = in.nextInt();

		String octal = convert(decimal);
		System.out.println("Octal Equivalent: " + octal);
	}
}
