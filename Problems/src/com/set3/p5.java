package com.set3;

//5. Calculate the sum of elements 
public class p5 {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 1, 7 };
		int sum = 0;
		for (int num : arr)
			sum += num;
		System.out.println("Sum: " + sum);

	}
}
