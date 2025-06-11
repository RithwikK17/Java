package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test9 {

	public static void main(String[] args) {
		int[] ar = { 4, 5, 1, 7, 9, 8, 3, 6 };

		List<Integer> list = new ArrayList<>();
		for (int ele : ar) {
			list.add(ele);
		}

//		int max = list.stream().max(Comparator.naturalOrder()).orElseThrow();
		int max = list.stream().mapToInt(x -> x).max().getAsInt();

//		int min = list.stream().min(Comparator.naturalOrder()).orElseThrow();
		int min = list.stream().mapToInt(x -> x).min().getAsInt();

		System.out.println("Max element: " + max);
		System.out.println("Min element: " + min);
	}
}
