package com.strings;

public class test4 {
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = "Java";
		s1 = s1.intern();
		System.out.println(s1 == s2);
	}
}