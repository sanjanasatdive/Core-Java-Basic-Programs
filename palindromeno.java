package com.assignment;

public class palindromeno {
public static void main(String[] args) {
	int n=152;
	int r;
	r=n%10;
	System.out.println(r);
	n=n%10;
if(n==r) {
	System.out.println("The given number is palindrome");
}else {
	System.out.println("not palindrome");
}
}
}