package com.assignment;

public class reversestring {
public static void main(String[] args) {
	String str ="nayan";
	String rev="";
	int length=str.length();
	for(int i=str.length()-1;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	if(str==rev) {
		System.out.println("String is palindrome");
	}else {
		System.out.println("String is not palindrome");
	}
}

}

