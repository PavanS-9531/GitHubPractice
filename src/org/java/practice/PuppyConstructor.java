package org.java.practice;

public class PuppyConstructor {
	int age;
	public PuppyConstructor(int b) {
		age=b;
	}
	void eat() {
		System.out.println("Puppy eats biscuit");
	}
	public static void main(String[] args) {
		PuppyConstructor p = new PuppyConstructor(2);
		System.out.println("Puppies age is : "+ p.age);
		System.out.println("And");
		p.eat();
		
	}
}
