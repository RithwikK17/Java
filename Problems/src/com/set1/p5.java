package com.set1;

import java.util.Scanner;

//5.	Find the Sum of the Numbers in a Given Interval in Java
public class p5 {
	public static void main(String[] args) {
		int s, e, sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the starting interval");
		s = in.nextInt();
		e = in.nextInt();
		for (int i = s; i <= e; i++) {
			sum += i;
		}
		System.out.println("the sum of the number between the intervals " + s + " and " + e + " is " + sum);
	}
}
