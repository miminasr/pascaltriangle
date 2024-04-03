package com.day24;

public class Conditional_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

public static void ifstatement() {
	//you type if(condition)
	//if the condition is true then control will go inside the body of the block
	//if """ false "" will not go inside """"
	// then else block will come to help
	
//	if(2<3) {
		System.out.println("2 is smaller than 3");
	    //this has code in the body
	//}else {
	//	System.out.println();{
			
		}
	public static void firstIfStatementAssigment() {

		int i = 10;
		int j = 20;
		int k = 30;

		// find out the largest number using if and else

		if (i < j && i > k) {
			System.out.println("i is greatest number : " + k);
		} else if (j > i && j > k) { // here it is proved j is not the greatest
			System.out.println("k is the greatest : " + k);
		}
	}
	

	public static void secondIfStatementAssigment() {
	 int i=10;
	 int j=20;
	 int k=30;
	 int l=40;
	 
	 //find the smallest number 
	 if(i<j && i<k) {
		 System.out.println("i is the smallest number :  + i");
//	 }else if(j,i && j,k && j,l) {
		 System.out.println("j is the smallest : " + j);
		 
	 }

//public static void determineLeapYear() {
	// go to google and determine the logic of leap year
	// how is leap year == largest year
	// int year1 = 1900;
	// int year2 = 1996;
	// int year3 = 2022;
	// int year4 = 2000;

	// boolean isLeapYear;
	// isLeapYear=(year % 4 == 0);

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

	
	
	
	
	