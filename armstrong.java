package com.assignment;

public class armstrong {
public static void main(String[] args) {
int n=2;
int rem,c,arm=0;
c=n;
while(n!=0) {
	rem=n%10;
	arm=(rem*rem*rem)+arm;
	n=n/10;
}
if(c==n) {
	System.out.println("armstrong");
}
else {
	System.out.println("not armstrong");
}
}
}