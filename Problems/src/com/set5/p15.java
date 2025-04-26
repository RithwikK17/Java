package com.set5;

import java.util.HashMap;
import java.util.Map;

//15. Calculate frequency of characters in a string
public class p15 {
	public static void main(String[] args) {
		String str = "quick brown fox jumps over the lazy dog";
		Map<Character, Integer> freq = new HashMap<>();
		for (char c : str.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
