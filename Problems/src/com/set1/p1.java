package com.set1;

import java.util.Scanner;

//1.	Check if a Number is Positive or Negative in Java

public class p1 {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		n = in.nextInt();
		if (n >= 0)
			System.out.println("Positive Integer");
		else
			System.out.println("Negative Integer");
	}
}
