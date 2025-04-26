package com.set5;

//1. Check whether a character is a vowel or consonant
public class p1 {
	public static void main(String[] args) {
		char c = 'a';
		if (!Character.isLetter(c)) {
			System.out.println("Not an alphabet.");
		} else {
			if ("aeiouAEIOU".indexOf(c) != -1)
				System.out.println("Vowel");
			else
				System.out.println("Consonant");
		}
	}
}
