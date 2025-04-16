package com.set1;

import java.util.Scanner;

//22.	Perfect Square (A perfect square is a positive integer that is obtained by multiplying an integer by itself) 
public class p22 {
	public static boolean isPerfectSquare(int number) {
		int sqrt = (int) Math.sqrt(number);
		return sqrt * sqrt == number;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Enter a number to check for perfect square");
		n = in.nextInt();
		System.out.println(isPerfectSquare(n));
	}
}
