package com.inheritance;

// Example of MultiLevel Inheritance
class Vehicle {
	void start() {
		String engine = "4cylinder";
		System.out.println("Vehicle is " + engine);

	}
}

class FourWheeler extends Vehicle {
	void wheels() {
		int wheel = 4;
		System.out.println("This vehicle has " + wheel + " wheels.");
	}
}

class Car extends FourWheeler {
	void drive() {
		System.out.println("Car is being driven.");
	}
}

public class Test7 {
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.start(); // from Vehicle
		myCar.wheels(); // from FourWheeler
		myCar.drive(); // from Car
	}
}
