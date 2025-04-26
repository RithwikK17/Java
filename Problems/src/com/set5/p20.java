package com.set5;

import java.util.HashSet;
import java.util.Set;

//20. Count common sub-sequence in two strings
public class p20 {
	public static void main(String[] args) {
		String a = "abc", b = "ace";
		Set<Character> setA = new HashSet<>();
		for (char c : a.toCharArray())
			setA.add(c);
		int count = 0;
		for (char c : b.toCharArray()) {
			if (setA.contains(c))
				count++;
		}
		System.out.println("Common characters: " + count);
	}
}
