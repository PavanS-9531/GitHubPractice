package org.java.inheritance;
class A{
	A(){
		System.out.println("Hi");
	}
}

class B extends A{
	B(){
		System.out.println("Hello");
	}
}
class C extends B{
	C(){
		System.out.println("Java");
	}
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1= new C();

	}

}
