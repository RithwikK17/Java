package com.set1;

import java.util.Scanner;

//19.	Factor of a number
public class p19 {
	public static void printFactors(int number) {
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Enter number to find the factors");
		n = in.nextInt();
		printFactors(n);
	}
}
