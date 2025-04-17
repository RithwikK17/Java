package com.set2;

//18.	Calculate the area of a circle 
public class p18 {
	public static double calculate(double radius) {
		return Math.PI * radius * radius;
	}

	public static void main(String[] args) {
		double radius1 = 5.0;
		double radius2 = 7.3;

		System.out.println("Area of circle with radius " + radius1 + " is: " + calculate(radius1));
		System.out.println("Area of circle with radius " + radius2 + " is: " + calculate(radius2));

	}
}