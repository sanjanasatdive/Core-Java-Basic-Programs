package com.assignment;

public class vowels {
public static void getString(String str) {
String vowels = "aeiou";
int count=0;
for(int i=0;i<=vowels.length();i++) {
	
	for(int j=0;j<=str.length();j++) {
		if(vowels.charAt(i)==str.charAt(j))
			count++;
	}
	System.out.println(vowels.charAt(i)+"->"+count);
	}
}


public static void main(String[] args) {
	String str="INDIA";
	str=str.toLowerCase();
	vowels.getString(str);
}
}
