package org.java.practice;

public class SecondLargestNumber {
	
	public void findseclar(int[] a) {
		
		int largest;
		int seclar;
		int tmp;
		int len = a.length;
		for(int i=0;i<len-1;i++) {
			if(a[i]>a[i+1]) {
				largest = a[i];
				seclar = a[i+1];
			}else {
				seclar=a[i];
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] b = {5,3,8,7,12,6,2,1};

	}

}
