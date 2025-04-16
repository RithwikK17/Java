package com.set1;

import java.util.Scanner;

//7.	Check Whether or Not the Year is a Leap Year in Java
public class p7 {
	public static void main(String[] args) {
		int yr;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter year");
		yr = in.nextInt();
		if (yr % 4 == 0)
			System.out.println("Leap Year");
		else
			System.out.println("not a leap year");
	}
}
