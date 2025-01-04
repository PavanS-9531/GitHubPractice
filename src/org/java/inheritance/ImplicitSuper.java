package org.java.inheritance;

class Test8{
	int x;
	int b;
	Test8(){
		x=78;
		System.out.println("Running Test8");
	}
	
	Test8(double g){
		b=77;
		System.out.println("Running double argument Test8");
	}
}

class Test7 extends Test8{
	int a;
	Test7(){
		super();
		a=86;
		System.out.println("Running Test7");
	}
}


public class ImplicitSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test7 t7= new Test7();
		System.out.println("a's value is : "+ t7.a);
		System.out.println("b's value is : "+ t7.b);
        
	}

}
