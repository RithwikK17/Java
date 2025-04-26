package com.set5;

//10. Remove all characters from string except alphabets
public class p10 {
	public static void main(String[] args) {
		String str = "h3ll0!";
		System.out.println(str.replaceAll("[^a-zA-Z]", ""));
	}
}
