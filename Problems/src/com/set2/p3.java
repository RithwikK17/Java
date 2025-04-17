package com.set2;

import java.util.Scanner;

//3.	Binary to decimal conversion using Java
public class p3 {
	public static int binaryToDecimal(String binary) {
		return Integer.parseInt(binary, 2);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n;
		System.out.println("enter number in binary to convert to decimal");
		n = in.next();
		int decimal = binaryToDecimal(n);
		System.out.println("Decimal Equivalent " + decimal);
	}
}