package com.set3;

import java.util.HashMap;
import java.util.Map;

//13. Find non-repeating elements
public class p13 {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 2, 9, 5 };
		Map<Integer, Integer> freq = new HashMap<>();
		for (int num : arr)
			freq.put(num, freq.getOrDefault(num, 0) + 1);
		for (int num : freq.keySet()) {
			if (freq.get(num) == 1)
				System.out.print(num + " ");
		}

	}
}
