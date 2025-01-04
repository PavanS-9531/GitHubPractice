package org.java.practice;

class Calculator {
	static private int count;
	static private Calculator c1;
	
	private Calculator() {
		System.out.println("Instance is invoked");
		count++;
		System.out.println(count);
	}
	
	public void divide(int n1,int n2) {
		double result=(n1/n2);
		System.out.println("n1 is : " + n1 + " n2 is : " + n2 +" and result is : "+ result);
	}
	public static Calculator getInstance() {
		// TODO Auto-generated method stub
		if(count==0) {
			c1=new Calculator();
		}
		return c1;
	}

}

public class SingletonDemo{
	
	public static void main(String[] args) {
		Calculator c2= Calculator.getInstance();
		System.out.println(c2.hashCode());
		c2.divide(235, 5);
		
		Calculator c3 = Calculator.getInstance();
		System.out.println(c3.hashCode());
		c3.divide(1562, 2);
		
	}
}
