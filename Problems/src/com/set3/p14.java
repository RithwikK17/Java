package com.set3;

import java.util.LinkedHashSet;
import java.util.Set;

//14. Remove Duplicate elements in an array
public class p14 {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 2, 9, 5 };
		Set<Integer> set = new LinkedHashSet<>();
		for (int num : arr)
			set.add(num);
		System.out.println(set);

	}
}
