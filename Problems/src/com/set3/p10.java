package com.set3;

import java.util.HashSet;
import java.util.Set;

//10. Count distinct elements in an array 
public class p10 {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 2, 9, 5 };
		Set<Integer> set = new HashSet<>();
		for (int num : arr)
			set.add(num);
		System.out.println("Distinct count: " + set.size());

	}
}
