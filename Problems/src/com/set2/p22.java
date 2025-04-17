package com.set2;

//22.	Counting number of days in a given month of a year
public class p22 {
	public static int getDays(int month, int year) {
		return java.time.Month.of(month).length(java.time.Year.isLeap(year));
	}

	public static void main(String[] args) {
		int month1 = 2; // February
		int month2 = 4; // April
		int month3 = 12; // December
		int month4 = 2; // February in a leap year

		int year1 = 2021; // Non-leap year
		int year2 = 2020; // Leap year

		System.out.println("Days in " + month1 + "/" + year1 + ": " + getDays(month1, year1)); // February 2021
		System.out.println("Days in " + month2 + "/" + year1 + ": " + getDays(month2, year1)); // April 2021
		System.out.println("Days in " + month3 + "/" + year1 + ": " + getDays(month3, year1)); // December 2021
		System.out.println("Days in " + month1 + "/" + year2 + ": " + getDays(month1, year2)); // February 2020 (Leap
																								// year)
	}
}
