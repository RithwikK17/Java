package com.set5;

import java.util.HashMap;
import java.util.Map;

//16. Find non-repeating characters in a string
public class p16 {
	public static void main(String[] args) {
		String str = "aabbcde";
		Map<Character, Integer> freq = new HashMap<>();
		for (char c : str.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}
		for (char c : str.toCharArray()) {
			if (freq.get(c) == 1)
				System.out.print(c + " ");
		}
	}
}
