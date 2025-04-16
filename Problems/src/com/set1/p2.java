package com.set1;

import java.util.Scanner;

//2.	Check Whether a Number is Even or Odd in Java
public class p2 {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		n = in.nextInt();
		if (n % 2 == 0)
			System.out.println("even number");
		else
			System.out.println("odd number");
	}
}
