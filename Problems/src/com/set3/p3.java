package com.set3;

//3. Find the smallest and the largest elements
public class p3 {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 1, 7 };
		int min = arr[0], max = arr[0];
		for (int num : arr) {
			if (num > max)
				max = num;
			if (num < min)
				min = num;
		}
		System.out.println("Min: " + min + ", Max: " + max);

	}
}
