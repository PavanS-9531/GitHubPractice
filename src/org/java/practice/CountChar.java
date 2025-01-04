package org.java.practice;

import java.util.HashMap;
import java.util.Map;

class CountChar {
	
	public HashMap<Character,Integer> countchars(String s) {
		char[] m = s.toCharArray();
		Integer count=0;
		HashMap<Character,Integer> cc = new HashMap<Character,Integer>();
		for(int i=0;i<m.length;i++) {
			if(cc.containsKey(m[i])) {
				cc.put(m[i], cc.get(m[i])+1);
			}
			else {
				cc.put(m[i], 1);
			}
		}
		return cc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountChar c = new CountChar();
		String l="abcabcabcedghfddecbgd";
		HashMap<Character,Integer> k = c.countchars(l);
		for(Map.Entry t:k.entrySet()) {
			System.out.println("The character : " + t.getKey() + " is present " + t.getValue() + " times");
		}

	}

}
