package com.set3;

import java.util.HashSet;
import java.util.Set;

//12. Find repeating elements in an array
public class p12 {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 2, 9, 5 };
		Set<Integer> seen = new HashSet<>();
		Set<Integer> repeated = new HashSet<>();
		for (int num : arr) {
			if (!seen.add(num))
				repeated.add(num);
		}
		System.out.println("Repeating: " + repeated);

	}
}
