package com.assignment;

import java.util.HashSet;
import java.util.Iterator;

public class Remove_duplicate_usingSet {
public static void main(String[] args) {
	int a[]= {12,12,12,12,34,55,55,66,66,7,7,8};
	HashSet<Integer> hs= new HashSet<Integer>();
	for(int i=0;i<a.length;i++) {
		hs.add(a[i]);
	}
	Iterator itr=hs.iterator();
	while(itr.hasNext()) {
		System.out.print(itr.next()+",");
	}
	
}
}
