package org.java.arrays;

import java.util.HashMap;
import java.util.HashSet;

public class NumberOccuranceHM {
	
	static HashSet<Integer> getOddOccurance(int arr[]) {
		int len=arr.length;
		int temp=0;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		HashSet<Integer> s = new HashSet<Integer>();
		for(int i=0;i<len;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
			}else {
				hm.put(arr[i], 1);
			}
		}
		
		 for(Integer a: hm.keySet()){ 
			 if(hm.get(a)%2 !=0) { 
				  s.add(a);
				 } 
			 }
		 
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] h = {5,3,6,8,5,4,3,4,2,2,1,2,1};
		HashSet<Integer> n = getOddOccurance(h);
		for(Integer v:n) {
			System.out.println(v);
		}
		

	}

}
