package org.java.strings;

public class StringReverse {
	
	public String reversemadi(String s) {
		String temp="";
		char[] t = s.toCharArray();
		int len = t.length;
		for(int i=len-1;i>=0;i--) {
			temp+=t[i];
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverse str= new StringReverse();
		String revstr=str.reversemadi("Complete");
		System.out.println("The reverse string is "+ revstr);
	}

}
