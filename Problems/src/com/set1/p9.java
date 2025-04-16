package com.set1;

//9.	Find all the Prime Numbers in a Given Interval in Java
public class p9 {
	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		if (num == 2) {
			return true;
		}
		if (num % 2 == 0) {
			return false;
		}

		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		int start = 1;
		int end = 50;

		System.out.println("Prime numbers between " + start + " and " + end + ":");

		for (int currentNumber = start; currentNumber <= end; currentNumber++) {
			if (isPrime(currentNumber)) {
				System.out.print(currentNumber + " ");
			}
		}
	}
}
