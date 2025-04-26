package com.set5;

//8. Check if the given string is Palindrome or not
public class p8 {
	public static void main(String[] args) {
		String str = "racecar";
		String rev = new StringBuilder(str).reverse().toString();
		System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");
	}
}
