package com.stringbuffer;

// reverse a string and find if it is a palindrome or not
public class Test4 {
	public static String reverse(String str) {
		if (str == null) {
			return null;
		}
		String reversedString = "";
		int length = str.length();

		for (int i = length - 1; i >= 0; i--) {
			char character = str.charAt(i);
			reversedString = reversedString + character;
		}
		return reversedString;
	}

	public static void main(String[] args) {
		String s = "121";
		String temp = s;
		String rev = reverse(s);
		System.out.println("Reversed: " + rev);

		if (rev.equals(temp))
			System.out.println("Palindrome");
		else
			System.out.println("not palindrome");
	}
}