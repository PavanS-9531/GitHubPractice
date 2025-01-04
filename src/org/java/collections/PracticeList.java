package org.java.collections;

import java.util.ArrayList;

public class PracticeList {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		ArrayList<String> a= new ArrayList<String>();
		a.add("Bangalore");
		a.add("Mysore");
		a.add("Tumkur");
		a.add("Mangaluru");
		a.add("Belagavi");
		a.add("Hubballi");
		a.add("Kolar");
		a.add(null);
		a.add("Mysore");
	
		int len=a.size();
		for(String s:a) {
			System.out.println(s);
		}
		System.out.println("The Random city is:"+a.get(5));
		System.out.println("===========================================");
		System.out.println("Printing the cities of Karnataka State");
		
		for(int i=0;i<len;i++) {
			System.out.println(a.get(i));
		}
		a.set(7, "Davangere");
		System.out.println("===========================================");
		System.out.println("Printing the cities of Karnataka State after setting");
		
		for(int i=0;i<len;i++) {
			System.out.println(a.get(i));
		}
		

	}
	    

}
