package org.java.strings;

import java.util.HashSet;

public class UniqueCount {
	
	public static int countchars(String inputData) {
		
		char[] a = inputData.toCharArray();
		int len = a.length;
		
		HashSet<String> counter = new HashSet<String>();
		for(int i=0;i<len-1;i++) {
		      counter.add(Character.toString(a[i]));	
		}
		
		return counter.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "ffffiiilllltteeerreedddd";
		int charactercount = countchars(a);
		System.out.println("The number of characters in the given string is : " + charactercount);

	}

}
