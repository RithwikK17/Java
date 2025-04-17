package com.set2;

import java.util.Scanner;

//13.	Permutations in which n people can occupy r seats in a classroom in java
public class p13 {
	public static long nPr(int n, int r) {
		return factorial(n) / factorial(n - r);
	}

	private static long factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter total number of people (n): ");
		int n = in.nextInt();

		System.out.print("Enter number of seats to occupy (r): ");
		int r = in.nextInt();

		if (n < r || n < 0 || r < 0) {
			System.out.println("Invalid input! Ensure that n ≥ r and both are non-negative.");
		} else {
			long result = nPr(n, r);
			System.out.println("Number of permutations (nPr): " + result);
		}
	}
}
