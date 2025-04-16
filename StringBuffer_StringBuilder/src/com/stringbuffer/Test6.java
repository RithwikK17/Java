package com.stringbuffer;

// find the longest word in the string input: "java is a programming language"
public class Test6 {
	public static String longestWord(String sentence) {
		if (sentence == null || sentence.trim().isEmpty())
			return "";

		String[] words = sentence.trim().split("\\s+");
		String longestWord = "";
		int maxLength = 0;

		for (String currentWord : words) {
			if (currentWord.length() > maxLength) {
				maxLength = currentWord.length();
				longestWord = currentWord;
			}
		}
		return longestWord;
	}

	public static void main(String[] args) {
		String str = "java is a programming language";

		String longest = longestWord(str);

		System.out.println("Input String: \"" + str + "\"");

		if (!longest.isEmpty()) {
			System.out.println("The longest word is: " + longest);
			System.out.println("Length: " + longest.length());
		} else
			System.out.println("No words found in the input string.");
	}
}