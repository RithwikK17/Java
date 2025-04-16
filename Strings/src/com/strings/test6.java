package com.strings;

public class test6 {

	public static String toLowerCase(String s1) {

		char[] chars = s1.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char currChar = chars[i];
			if (currChar >= 'A' && currChar <= 'Z') {
				chars[i] = (char) (currChar + 32);
			}
		}
		return new String(chars);
	}

	public static void main(String[] args) {
		String str = "JAVA";
		String cvt = toLowerCase(str);

		System.out.println("Converted: " + cvt);
	}
}