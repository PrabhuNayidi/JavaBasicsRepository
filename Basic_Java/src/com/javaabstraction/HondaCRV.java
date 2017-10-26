package com.javaabstraction;

public class HondaCRV extends Car{

//The Abstract Methods defined in the Parent(Car) Class were implemented in the Child(HondaCRV) Class with the help of Inheritance.
	@Override
	public void engine() {
		System.out.println("The HondaCRV has an Awesome Engine!");
	}
//The Abstract Methods defined in the Parent(Car) Class were implemented in the Child(HondaCRV) Class with the help of Inheritance.
	@Override
	public void name() {
		System.out.println("The HondaCRV is a great Model in Honda Automobiles!!");
	}
	public static void main(String[] args) {
		HondaCRV o1 = new HondaCRV();
		o1.doors();
		o1.types();
		o1.engine();
		o1.name();
	}
}
