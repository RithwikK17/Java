package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test10 {

	public static void main(String[] args) {
		int[] ar = { 4, 5, 1, 7, 9, 8, 3, 6, 2 };

		List<Integer> list = new ArrayList<>();
		for (int ele : ar) {
			list.add(ele);
		}

		List<Integer> ascending = list.stream().sorted().collect(Collectors.toList());

		List<Integer> descending = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println("Ascending Order: " + ascending);
		System.out.println("Descending Order: " + descending);
	}
}