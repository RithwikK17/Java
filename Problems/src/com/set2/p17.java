package com.set2;
//17.	Can a number be expressed as a sum of two prime numbers using Java?
public class p17 {
	public static boolean canBeSumOfTwoPrimes(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (isPrime(i) && isPrime(n - i))
				return true;
		}
		return false;
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
		int num1 = 10;
		int num2 = 15;
		int num3 = 28;
		int num4 = 9;

		System.out.println(num1 + " can be expressed as the sum of two primes: " + canBeSumOfTwoPrimes(num1));
		System.out.println(num2 + " can be expressed as the sum of two primes: " + canBeSumOfTwoPrimes(num2));
		System.out.println(num3 + " can be expressed as the sum of two primes: " + canBeSumOfTwoPrimes(num3));
		System.out.println(num4 + " can be expressed as the sum of two primes: " + canBeSumOfTwoPrimes(num4));
	}
}
