package com.assignment;

import java.util.Scanner;

public class reversenumber {
public static void main(String[] args) {
	int n,r;
	System.out.println("Enter Number");
	Scanner sc= new Scanner(System.in);
	n=sc.nextInt();
	r=n%10;
	System.out.println("Reverse Number"+r);
	n=n%10;
	
}}
