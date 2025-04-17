package com.set2;

import java.util.Scanner;

// 12.	Quadrants in which a given coordinate lies
public class p12 {
	public static String findQuadrant(int x, int y) {
		if (x > 0 && y > 0)
			return "First Quadrant";
		else if (x < 0 && y > 0)
			return "Second Quadrant";
		else if (x < 0 && y < 0)
			return "Third Quadrant";
		else if (x > 0 && y < 0)
			return "Fourth Quadrant";
		else
			return "Lies on Axis";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        int x = in.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = in.nextInt();

        String result = findQuadrant(x, y);
        System.out.println("The point lies in: " + result);
	}

}
