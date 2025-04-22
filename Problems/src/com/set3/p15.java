package com.set3;

//15.Count Even and Odd elements in an array
public class p15 {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 1, 7, 6 };
		int even = 0, odd = 0;
		for (int num : arr) {
			if (num % 2 == 0)
				even++;
			else
				odd++;
		}
		System.out.println("Even: " + even + ", Odd: " + odd);

	}
}
