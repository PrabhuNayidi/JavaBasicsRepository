package com.javainheritance;

public class Class2 extends Class1{
	int a = 5;
	int b = 5;
	public void add()
	{
		System.out.println("The Sum of Values of a and b in Class2 is : " + (a+b)); 
	}
	public static void main(String[] args) {
		Class2 obj2 = new Class2();
		System.out.println("The Value of a is : " + obj2.a);
		System.out.println("The Value of b is : " + obj2.b);
		obj2.add();
	}

}
