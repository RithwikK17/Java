package com.set2;

import java.util.Scanner;

//  10. Decimal to HexaDecimal
public class p9 {
	public static String convert(int decimal) {
		return Integer.toHexString(decimal);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a decimal number to convert to hexadecimal: ");
		int decimal = in.nextInt();

		String hex = convert(decimal).toUpperCase(); // optional: to make it uppercase
		System.out.println("Hexadecimal Equivalent: " + hex);
	}
}
