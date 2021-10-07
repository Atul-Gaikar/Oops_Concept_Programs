package com.bridgelabz.OopsConcept;

//Hiding internal details and showing functionality is known as abstraction. For example phone call, we don't know the internal processing.
//In Java, we use abstract class and interface to achieve abstraction.
class Abstraction {
	public static void main(String args[]) {
		Shape s = new Circle();
		s.draw();
	}
}

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing Circle");
	}
}
