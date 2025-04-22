package com.set3;

import java.util.HashMap;
import java.util.Map;

//11. Frequency of elements
public class p11 {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 2, 9, 5, 2 };
		Map<Integer, Integer> freq = new HashMap<>();
		for (int num : arr) {
			freq.put(num, freq.getOrDefault(num, 0) + 1);
		}
		System.out.println(freq);

	}
}
