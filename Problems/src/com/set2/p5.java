package com.set2;

import java.util.Scanner;

//5.	Octal to Decimal conversion
public class p5 {
	public static int octalToDecimal(String octal) {
		return Integer.parseInt(octal, 8);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n;
		System.out.println("enter number in octal to convert to decimal");
		n = in.next();
		int decimal = octalToDecimal(n);
		System.out.println("Decimal Equivalent " + decimal);
	}
}
