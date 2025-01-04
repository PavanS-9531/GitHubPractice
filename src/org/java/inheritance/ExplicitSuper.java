package org.java.inheritance;

class Apple{
	Apple(){
		System.out.println("Eating Apple");
	}
}

class OotyApple extends Apple{
	OotyApple(int a){
		super();
		System.out.println("Eating Ooty Apple");
	}
}

class GreenApple extends OotyApple{
	GreenApple(){
		super(56);
		System.out.println("Eating Green Apple");
	}
}



public class ExplicitSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Starts");
		System.out.println("-----------------------------");
		GreenApple ga = new GreenApple();
		System.out.println("-----------------------------");
		System.out.println("Main ends");

	}

}
