package com.set3;

import java.util.Arrays;

//7. Sort First half ascending, Second half descending 
public class p7 {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 1, 7, 3 };
		int mid = arr.length / 2;
		Arrays.sort(arr, 0, mid);
		Arrays.sort(arr, mid, arr.length);
		for (int i = mid, j = arr.length - 1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));

	}
}
