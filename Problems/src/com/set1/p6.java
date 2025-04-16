package com.set1;

import java.util.Scanner;

//6.	Find the Greatest of the Three Numbers in Java
public class p6 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		if (a >= b && a >= c)
			System.out.println(a + " is greater");
		else if (b >= a && b >= c)
			System.out.println(b + " is greater");
		else
			System.out.println(c + " is greater");
	}
}
