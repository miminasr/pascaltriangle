package com.day24;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		determineLeapYear();
	}

	public static void determineLeapYear() {
		int[] years = { 1900, 1996, 2022, 2000 };

		for (int year : years) {
			if (isLeapYear(year)) {
				System.out.println(year + " is a leap year.");
			} else {
				System.out.println(year + " is not a leap year.");
			}
		}
	}

	public static boolean isLeapYear(int year) {
		// Leap year if divisible by 4
		if (year % 4 == 0) {
			// Exception for century years
			if (year % 100 == 0) {
				// If divisible by 400, it's a leap year
				return year % 400 == 0;
			}
			return true;
		}
		return false;

	}
}




