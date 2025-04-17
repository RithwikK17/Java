package com.set2;

//19.	Find the prime numbers between 1 to 100 
public class p19 {
	public static void printPrimes() {
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	private static boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Prime numbers from 2 to 100 are:");
		printPrimes();
	}
}
