package com.set5;

//14. Capitalize the first and last character of each word of a string
public class p14 {
	public static void main(String[] args) {
		String str = "java is an interesting programming language";
		String[] words = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			if (word.length() == 1)
				sb.append(Character.toUpperCase(word.charAt(0))).append(" ");
			else
				sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1, word.length() - 1))
						.append(Character.toUpperCase(word.charAt(word.length() - 1))).append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}
