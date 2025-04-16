package com.set1;

//14.	Find all Armstrong number in a given range 
import java.util.Scanner;

public class p14 {
	public static void ArmstrongInRange(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (isArmstrong(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static boolean isArmstrong(int number) {
		int original = number, result = 0, digits = String.valueOf(number).length();
		while (number != 0) {
			int digit = number % 10;
			result += Math.pow(digit, digits);
			number /= 10;
		}
		return result == original;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start, end;
		System.out.println("Enter the starting number");
		start = in.nextInt();
		System.out.println("Enter the ending number");
		end = in.nextInt();
		ArmstrongInRange(start, end);
	}
}
