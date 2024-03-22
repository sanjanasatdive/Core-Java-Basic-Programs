package com.assignment;

public class sortarray {
public static void sort(int a[]) {
	int temp=0;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
					}
			}
		System.out.println(a[a.length-1]);
	}
}
public static void main(String args[]) {
	int a[]= {67,90,1,4,5};
	sortarray.sort(a);
}
}
