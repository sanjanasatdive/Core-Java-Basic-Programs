package com.assignment;

public class fact {
	public static void main(String[] args) {
		int i,fact=1;
		int number=6;
		for(i=1;i<=6;i++) {
			fact=fact*i;
		}
		
		System.out.println("Factorial of "+number+" is:-"+fact);
	}
}
