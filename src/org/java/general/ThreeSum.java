package org.java.general;

public class ThreeSum {
	
	public void findthree(int[] a, int sum) {
		int len=a.length;
		int result=sum;
		int total=0;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				for(int k=j+1;k<len;k++) {
					total=a[i]+a[j]+a[k];
					if(total==result) {
						System.out.println("The required numbers are : " + a[i] + " ," + a[j] + " ," + a[k]);
						
					}
					
				}
			}
			
		}
		if(total!=result) {
			System.out.println("N0 numbers found");
		}
		
		
	}
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,9,3,2,6,4,7,1};
		int sum=22;
		ThreeSum ts= new ThreeSum();
		ts.findthree(a, sum);
		
		
		

	}

}
