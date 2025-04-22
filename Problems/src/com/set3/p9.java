package com.set3;

//9.Sort Elements by frequency
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p9 {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 2, 9, 5, 2 };
		Map<Integer, Integer> freq = new HashMap<>();
		for (int num : arr)
			freq.put(num, freq.getOrDefault(num, 0) + 1);
		List<Integer> list = new ArrayList<>();
		for (int num : arr)
			list.add(num);
		list.sort((a, b) -> {
			int f = freq.get(b) - freq.get(a);
			return f == 0 ? a - b : f;
		});
		System.out.println(list);

	}
}
