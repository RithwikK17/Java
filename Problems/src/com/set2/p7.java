package com.set2;

//7.	Decimal to Binary conversion
import java.util.Scanner;

public class p7 {
	public static String convert(int decimal) {
		return Integer.toBinaryString(decimal);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("enter number in decimal to convert to binary");
		n = in.nextInt();
		String binary = convert(n);
		System.out.println("Binary Equivalent " + binary);
	}
}
