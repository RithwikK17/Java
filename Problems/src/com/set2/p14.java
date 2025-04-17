package com.set2;

import java.util.Scanner;

//14.	Maximum number of handshakes in java
public class p14 {
	public static int maxHandshakes(int n) {
		return n * (n - 1) / 2;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of people: ");
		int n = in.nextInt();

		if (n < 0) {
			System.out.println("Number of people cannot be negative.");
		} else {
			int handshakes = maxHandshakes(n);
			System.out.println("Maximum number of handshakes: " + handshakes);
		}
	}
}
