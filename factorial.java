package com.assignment;

import java.util.Scanner;

public class factorial {
public static void main(String[] args) {
	int i,fact=1;
System.out.println("Enter a number to find a factorial");
Scanner sc = new Scanner(System.in);
int number= sc.nextInt();
	for(i=1;i<=number;i++) {
		fact=fact*i;
	}
	System.out.println("Factorial of "+number+" is:-"+fact);
}
}
