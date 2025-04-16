package com.set1;

import java.util.Scanner;

//3.	Find the Sum of First N Natural Numbers in Java
public class p3 {
	public static void main(String[] args) {
		int n, sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number you want to get the sum");
		n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("The sum of " + n + " natural numbers is " + sum);
	}
}
