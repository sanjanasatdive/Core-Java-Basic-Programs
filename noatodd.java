package com.assignment;

public class noatodd {
public static void main(String[] args) {
	int a[]=new int [] {1,2,3,4,5,6,7,8};
	System.out.println("Array Elements at odd position");
	for(int i=0;i<a.length;i=i+2) {
		System.out.print(a[i]+" ");
	}
}
}
