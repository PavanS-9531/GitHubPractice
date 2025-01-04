package org.java.practice;

class Vehicle{
	void run() {
		System.out.println("Vehicle is in running state");
	}
}

class bike extends Vehicle{
	void run() {
		System.out.println("Bike is running smoothly");
	}
}

public class VehicleMethodOverRide {

	public static void main(String[] args) {
		bike b= new bike();
		b.run();

	}

}
