package com.assignment;

import java.util.Scanner;

public class primenumber {
	public static void main(String[] args) {
	
	int n = 2;
	int m=n/2;
	if(n==0 || n==1) {
		System.out.println("not prime number");
	}else {
		for(int i=2;i<=10;i++) {
			if(n%i==0) {
				System.out.println("not prime");
			}
		}
	}
	
}
}
