package com.set2;

//25.	Finding Roots of a quadratic equation
public class p25 {
	public static String findRoots(double a, double b, double c) {
		double d = b * b - 4 * a * c;
		if (d > 0) {
			double r1 = (-b + Math.sqrt(d)) / (2 * a);
			double r2 = (-b - Math.sqrt(d)) / (2 * a);
			return "Roots are real and different: " + r1 + ", " + r2;
		} else if (d == 0) {
			double r = -b / (2 * a);
			return "Roots are real and same: " + r;
		} else {
			double real = -b / (2 * a);
			double imag = Math.sqrt(-d) / (2 * a);
			return "Roots are complex: " + real + " ± " + imag + "i";
		}
	}

	public static void main(String[] args) {
		double a1 = 1, b1 = -3, c1 = 2; // Roots are real and different
		double a2 = 1, b2 = 2, c2 = 1; // Roots are real and same
		double a3 = 1, b3 = 2, c3 = 5; // Roots are complex

		System.out.println("For equation " + a1 + "x² + " + b1 + "x + " + c1 + ": " + findRoots(a1, b1, c1));
		System.out.println("For equation " + a2 + "x² + " + b2 + "x + " + c2 + ": " + findRoots(a2, b2, c2));
		System.out.println("For equation " + a3 + "x² + " + b3 + "x + " + c3 + ": " + findRoots(a3, b3, c3));
	}
}
