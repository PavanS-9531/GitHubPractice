package org.java.collections;

import java.util.LinkedList;

public class PracticeLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<String>();
		l.add("Bangalore");
		l.add("Tumukuru");
		l.add("Mysuru");
		l.add("Kolara");
		l.add("Mandya");
		l.add(3, "Chitradurga");
		for(String a:l) {
			System.out.println("The names of the cities are " + a);
		}
		
	}

}
