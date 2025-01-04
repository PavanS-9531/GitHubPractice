package org.java.recursion;

public class Fiboonacci {
	static int fib(int n) {
		if(n<=1) {
			return n;
		}else {
		return	fib(n-1)+fib(n-2);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		System.out.println(fib(n));
		

	}

}
