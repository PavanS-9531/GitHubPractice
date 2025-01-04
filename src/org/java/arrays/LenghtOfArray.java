package org.java.arrays;

public class LenghtOfArray {
	//static int count;
	@SuppressWarnings("finally")
	public static int findLenght(int[] a) {
		
		int count=0;
		int temp=0;
		int i=0;
		while(i>=0) {
		try {
			temp=a[i];
			i++;
			count++;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println(e.getMessage());
			break;
		}
		
	}
		return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int len;
           int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
           len=findLenght(a);
           System.out.println(len);
	}

}
