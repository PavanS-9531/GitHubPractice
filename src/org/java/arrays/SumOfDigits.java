package org.java.arrays;

public class SumOfDigits {
	
	public static int findSum(int n) {
		int sum=0;
		int temp=0;
		if(n<=0) {
			return -1;
		}
		while(n>0) {
			temp=n%10;
			sum=sum+temp;
			n=n/10;
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total;
		total=findSum(687);
		System.out.println(total);
		

	}

}
