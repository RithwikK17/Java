package com.set2;

import java.util.Scanner;

public class p6 {
	public static int convert(String hex) {
		return Integer.parseInt(hex, 16);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n;
		System.out.println("enter number in hexadecimal to convert to decimal");
		n = in.next();
		int decimal = convert(n);
		System.out.println("Decimal Equivalent " + decimal);
	}
}
