package org.java.practice;

public class Dog {
	String breed;
	int age;
	String color;
	void barking() {
		System.out.println("The dog is barking");
	}
	void hungry() {
		System.out.println("The dog is hungry");
	}
	void sleeping() {
		System.out.println("The dog is sleeping");
	}
	
	public static void main(String[] args) {
		Dog d= new Dog();
		d.barking();
		d.hungry();
		d.sleeping();
	}

}
