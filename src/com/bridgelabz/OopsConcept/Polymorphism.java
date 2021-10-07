package com.bridgelabz.OopsConcept;

//If one task is performed in different ways, it is known as polymorphism.

class Car {
	void run() {
		System.out.println("running");
	}
}

class Polymorphism extends Car {
	void run() {
		System.out.println("running safely with 60km");
	}

	public static void main(String args[]) {
		Car b = new Polymorphism();
		b.run();
	}
}
