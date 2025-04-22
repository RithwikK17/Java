package com.set3;

import java.util.HashMap;
import java.util.Map;

//16. Find all symmetric pairs
public class p16 {
	public static void main(String[] args) {
		int[][] pairs = { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 5, 6 }, { 4, 3 } };
		Map<Integer, Integer> map = new HashMap<>();
		for (int[] pair : pairs) {
			int a = pair[0], b = pair[1];
			if (map.containsKey(b) && map.get(b) == a) {
				System.out.println("Symmetric Pair: (" + a + ", " + b + ")");
			} else {
				map.put(a, b);
			}
		}

	}
}
