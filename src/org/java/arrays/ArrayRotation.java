package org.java.arrays;

public class ArrayRotation {
	
	public static void rotatearray(int[] a,int n) {
		
		int len = a.length;
		int temp;
		
		for(int i=0;i<n;i++) {
			
			temp=a[0];
			for(int j=0;j<len-1;j++) {
				
				a[j]=a[j+1];
				
			}
			a[len-1]=temp;
		}
		
		
		System.out.println("The Rotated array is");
		for(int p:a) {
			System.out.print(p);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m[]= {1,3,5,7,9};
		rotatearray(m,2);

	}

}
