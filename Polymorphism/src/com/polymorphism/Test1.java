package com.polymorphism;

class Dimension {
	public static void area(int radius) {
		System.out.println("Area of circle: " + (Math.PI * radius * radius));
	}

	public static void area(int l, int b) {
		System.out.println("Area of rectangle: " + (l * b));
	}

	public static void area(float side) {
		System.out.println("Area of square: " + (side * side));
	}
}

public class Test1 {
	public static void main(String[] args) {
		Dimension.area(12, 13);
		Dimension.area(12);
		Dimension.area(12.54f);

		Integer[] arr = { 1, 2, 3, 4 };
		main(arr);
	}

	public static void main(Integer[] args) {
		System.out.println("custom main() method called");
	}
}
