package com.set5;

import java.util.Arrays;

//17. Check if two strings are Anagram or not
public class p17 {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		char[] a = str1.replaceAll("\\s+", "").toLowerCase().toCharArray();
		char[] b = str2.replaceAll("\\s+", "").toLowerCase().toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.equals(a, b) ? "Anagrams" : "Not Anagrams");
	}
}
