package org.java.arrays;

import java.util.HashSet;

public class NumberOccurance {
	
	public static HashSet<Integer> findOccurance(int[] a) {
		int l=a.length;
		int counter=0;
		int temp;
		HashSet<Integer> s = new HashSet<Integer>();
		for(int i=0;i<l;i++) {
			temp=a[i];
			for(int j=0;j<l;j++) {
				if(temp==a[j]) {
					counter++;
				}
			}
			if(counter%2==1) {
				//System.out.println("The given number " + a[i] + " Occurs odd numer of times : " + counter);
				s.add(temp);
			}
			counter=0;
		}
		return s;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] j = {3,1,2,3,2,2,4,3,5,4,9,9,9,9,9,6,6,6,6};
		int[] m = {1, 2, 3, 2, 3, 1, 3};
		HashSet<Integer> p = findOccurance(m);
		for(int k:p) {
			System.out.println(k);
		}
		

	}

}
