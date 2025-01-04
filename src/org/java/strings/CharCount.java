package org.java.strings;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
	
	public void countchar(String a) {
		
		char[] s = a.toCharArray();
		int len = s.length;
		HashMap <Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(int i=0; i<= len-1;i++) {
			if(hm.containsKey(s[i])) {
				hm.put(s[i], hm.get(s[i])+1);
			}else {
				hm.put(s[i],1);
			}
		}
		
		for(Map.Entry e:hm.entrySet()) {
			System.out.println("Character is : " + e.getKey() + " Count of character is : " + e.getValue());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharCount cc = new CharCount();
		cc.countchar("accfffffffffffgabbbbbbbbbbeeeeeeettttt");
	}

}
