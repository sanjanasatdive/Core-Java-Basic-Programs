package com.assignment;

public class digitsinnumber {
public static void main(String[] args) {
	int n = 6989;
	int count=0;
	while(n!=0) {
	n=n%10;
	count++;
	}
	System.out.println("No of digits:- "+count);
}
}

