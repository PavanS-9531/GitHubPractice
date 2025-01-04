package org.java.strings;

public class StringReverseRet {
	
	public String StringReverseFunc(String x) {
		
		char [] a = x.toCharArray();
		int len = a.length;
		String temp="";
		
		for(int i=len-1;i>=0;i--) {
			
			temp+=a[i];
			
		}
		
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverseRet rst = new StringReverseRet();
		String c="Today is Sunday";
		String revstr =  rst.StringReverseFunc(c);
		System.out.println(revstr);

	}

}
