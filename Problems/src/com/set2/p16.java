package com.set2;

//16.	Replace all 0’s with 1 in a given integer
public class p16 {
	public static int replace(int num) {
		return Integer.parseInt(Integer.toString(num).replace('0', '1'));
	}

	public static void main(String[] args) {
		int n1 = 102030;
		int n2 = 506070;
		int n3 = 1001001;

		System.out.println("Original: " + n1 + " -> Replaced: " + replace(n1));
		System.out.println("Original: " + n2 + " -> Replaced: " + replace(n2));
		System.out.println("Original: " + n3 + " -> Replaced: " + replace(n3));
	}
}
