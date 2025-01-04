package org.java.inheritance;


class Multiply{
	double multiplyint(int a,int b) {
		return a*b;
	}
}

class Product extends Multiply{
	double multiplyint(double c, double d) {
		return c*d;
	}
}

public class PrimitiveOverriding {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p= new Product();
		double g=p.multiplyint(12.5, 6.85);
		System.out.println(g);
		Multiply m =new Multiply();
		int i=(int)m.multiplyint(12, 68);
		System.out.println(i);

	}

}
