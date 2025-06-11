package com.stream;

import java.util.stream.IntStream;

//print even and odd numbers 
public class Test6 {

	public static void main(String[] args) {

		System.out.println("Even Numbers:");
		IntStream.rangeClosed(0, 20).filter(x -> x % 2 == 0).forEach(System.out::println);

		System.out.println("\nOdd Numbers:");
		IntStream.rangeClosed(0, 20).filter(x -> x % 2 != 0).forEach(System.out::println);

	}

}
