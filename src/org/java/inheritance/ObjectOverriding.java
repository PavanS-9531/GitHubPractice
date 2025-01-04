package org.java.inheritance;

class D{
	D disp() {
		System.out.println("Running method disp of D");
		return new D();
	}
}

class E extends D{
	E disp() {
		System.out.println("Running disp method of E");
		return new E();
	}
}

public class ObjectOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e= new E();
		e.disp();

	}

}
