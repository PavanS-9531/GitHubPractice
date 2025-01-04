package org.java.inheritance;
class Animal{
	Animal(){
		System.out.println("Animal is running");
	}
}

class Tiger extends Animal{
	Tiger(){
		System.out.println("Running Tiger");
	}
}

class MysoreTiger extends Tiger{
	 MysoreTiger() {
		System.out.println("Mysore Tiger Running");
	}
}

public class ImplicitCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MysoreTiger MT = new MysoreTiger();

	}

}
