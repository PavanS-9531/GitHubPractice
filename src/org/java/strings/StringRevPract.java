package org.java.strings;

public class StringRevPract {
	
	public String revString(String a) {
		
		char[] c = a.toCharArray();
		String temp="";
		int len = c.length;
		for(int i=len-1;i>=0;i--) {
			temp=temp+c[i];
		}
		return temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result;
		StringRevPract str = new StringRevPract();
		result = str.revString("abcdefghijk");
		System.out.println(result);

	}

}
