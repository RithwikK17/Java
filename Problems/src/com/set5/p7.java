package com.set5;

//7. Remove vowels from a String
public class p7 {
	public static void main(String[] args) {
		String str = "quick brown fox jumps over the lazy dog";
		String result = str.replaceAll("(?i)[aeiou]", "");
		System.out.println(result);
	}
}
