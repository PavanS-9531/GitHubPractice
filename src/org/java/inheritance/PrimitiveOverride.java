package org.java.inheritance;

class Sample {
	public int add(int x, int y) {
		int result;
		result=x+y;
		return result;
	}
}

class Maths extends Sample{
	public int add(int a, int b) {
		int fresult;
		fresult = a+b+b+a;
		return fresult;
		
	}
}

public class PrimitiveOverride {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths m = new Maths();
		int j= m.add(2, 3);
		System.out.println(j);
            
	}

}
