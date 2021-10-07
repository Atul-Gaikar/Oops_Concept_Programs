package com.bridgelabz.OopsConcept;

//If a class has multiple methods having same name but different in parameters, it is known as Method Overloading

public class MethodOverloading {
	public static void main(String[] args) {
		System.out.println(Adder.add(1, 2));
		System.out.println(Adder.add(1, 2, 3));
	}
}

class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}