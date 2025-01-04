package org.java.strings;

import java.util.HashSet;
import java.util.Set;

public class UniqueCountPract {
	
	public static int countUnique(String s) {
		char[] d = s.toCharArray();
		Set<Character> k = new HashSet<Character>(); 
		int len = s.length();
		
		for(int i=0;i<len-1;i++) {
			k.add(d[i]);
		}
		
		return k.size();
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ffffiiilllltteeerreedddd";
		int charactercount = countUnique(a);
		System.out.println("The number of characters in the given string is : " + charactercount);

	}

}
