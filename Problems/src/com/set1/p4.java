package com.set1;

import java.util.Scanner;

//4.	Find the Greatest of the Two Numbers in Java
public class p4 {
	public static void main(String[] args) {
		int a, b;
		Scanner in = new Scanner(System.in);
		System.out.println("enter 2 numbers a&b");
		a = in.nextInt();
		b = in.nextInt();
		if (a >= b)
			System.out.println(a + " is greater");
		else
			System.out.println(b + " is greater");
	}
}
