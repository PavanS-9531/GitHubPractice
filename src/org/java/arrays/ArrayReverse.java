package org.java.arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int[] reverserarray = arrayreverse(a);
		for(int k:reverserarray) {
			System.out.println(k);
		}
	}
	
	public static int[] arrayreverse(int[] a) {
		
		int len= a.length;
		int[] b=new int[len];;
		int tempval;
		//int[] temparray=new int[a.length];
		for(int i=len-1,j=0;i>=0;i--,j++) {
			b[j]=a[i];
		}
		return b;
		
	}

}
