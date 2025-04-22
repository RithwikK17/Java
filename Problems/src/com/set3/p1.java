package com.set3;

//1. Find the largest element in an array
public class p1 {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 1, 7 };
		int max = arr[0];
		for (int num : arr) {
			if (num > max)
				max = num;
		}
		System.out.println("Largest: " + max);

	}
}
