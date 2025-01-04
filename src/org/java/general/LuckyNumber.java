package org.java.general;

public class LuckyNumber {
	
	public boolean findLucky(int n) {
		int i = n;
		boolean flag=true;
		String s= ((Integer)i).toString();
		char[] c= s.toCharArray();
		int len = c.length;
		for(int k=0;k<len;k++) {
			for(int j=k+1;j<len;j++) {
				if(c[k]==c[j]) {
					flag= false;
				}
				
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		
		LuckyNumber ln = new LuckyNumber();
		boolean check = ln.findLucky(12);
		if(check==true) {
		System.out.println("The given number is lucky number");
		}else {
			System.out.println("The given number has repetitive values");
		}

	}

}
