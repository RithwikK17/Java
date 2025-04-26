package com.set5;

//6. Count the number of vowels
public class p6 {
	public static void main(String[] args) {
		String str = "hello java";
		int count = 0;
		for (char c : str.toLowerCase().toCharArray()) {
			if ("aeiou".indexOf(c) != -1)
				count++;
		}
		System.out.println("Vowel Count: " + count);
	}
}
