package com.javainheritance;

public class Class1 {
	protected int a = 400,b = 1000;
	protected void add()
	{
		System.out.println("The Sum of values of a and b is : " + (a+b));
	}
	public static void main(String[] args) {
		Class1 obj1 = new Class1();
		System.out.println("The Value of a in Class1 is : " + obj1.a);
		System.out.println("The Value of b in Class1 is : " + obj1.b);
		obj1.add();
	}

}
