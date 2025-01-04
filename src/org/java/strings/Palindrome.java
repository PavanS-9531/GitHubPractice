package org.java.strings;

public class Palindrome {

	public boolean checkPalin(String s) {
		char[] c = s.toCharArray();
		int len = s.length();
		String temp="";
		
		for (int i=len-1;i>=0;i--) {
			temp=temp+c[i];
		}
		
		if(!temp.equalsIgnoreCase(s)) {
			return false;
		}
		else {
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String j = "next";
		Palindrome palin = new Palindrome();
		if(palin.checkPalin(j)) {
			System.out.println("The given string is a palindrome");
		}else {
			System.out.println("Try another string!!!");
		}

	}

}
