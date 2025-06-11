package com.stream;

import java.util.ArrayList;
import java.util.List;

//Print the sum of all elements in given array
public class Test3 {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5 };
		List<Integer> list = new ArrayList<>();
		for (int ele : ar) {
			list.add(ele);
		}
		Integer sum = list.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);
	}
}
