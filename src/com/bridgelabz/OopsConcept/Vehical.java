package com.bridgelabz.OopsConcept;

//If subclass (child class) has the same method as declared in the parent class,it is known as method overriding in Java.
public class Vehical {
	void run() {
		System.out.println("Vehical is running");
	}
}

class Bike extends Vehical {
	public static void main(String[] args) {
		Bike obj = new Bike();
		obj.run();
	}

}
