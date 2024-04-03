package com.java.Day3;

public class Topic11_incriment_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int i = 1;
System.out.println(i); //1

int j = i++; //post increment 
System.out.println(j); //1
System.out.println(i); //2

int k = ++i;
System.out.println(k); //3
System.out.println(i); //3
	}
	

public static void example1() {
	
	int i = 10;
	//latest value = 10
	int j = --i; 
	//j = (-1)+10 = 9
	//i = 9
	System.out.println(i);
	System.out.println(j); 
	
	int k = i++ - --j;
	int l = --i - --i + ++j - --k;
	
	
	/*
	System.out.println(i); 
	System.out.println(j);
	System.out.println(k);
	System.out.println(l);
	*/
	
}
		
public static void example2() {
	
	int i = 1;
	int j = i-- + --i;
	int k = i++ + --i;
	int l = i++ + j++ + k++ - --i - --k;
	//i = 
	//j = 1 + (-1)+1 = 0
	//i = 0
	//k = 1 + (-1) + (-1)
	//l = 	
		
		
		
		
		
		
		
	}

}
