package org.java.practice;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {10,20,30,40,50};
		for(int x:numbers) {
			System.out.print(x);
			System.out.print(",");
		}
		System.out.println("\n");
		String[] names= {"James","Larry","Tom"};
		int len=names.length;
		for(int i=0;i<len;i++) {
			System.out.print(names[i]);
			System.out.print(",");
		}

	}

}
