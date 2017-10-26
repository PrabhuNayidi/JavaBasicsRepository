package com.javaabstraction;

public abstract class Car {
	public void doors()
	{
		System.out.println("The Sedan Car have 4 Doors.");
	}
	public void types()
	{
		System.out.println("There are 6 types of Sedans.");
	}
	public abstract void engine();
	public abstract void name();
	public static void main(String[] args) {
		//Car o = new Car(); --->we can't create instance for the Abstract Class.
		HondaCRV o = new HondaCRV();
		o.engine();
		o.name();
		o.doors();
		o.types();
	}
}
