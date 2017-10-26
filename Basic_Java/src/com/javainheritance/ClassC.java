package com.javainheritance;

public class ClassC extends ClassB {
	int a = 1;
	int b = 2;
	public void add()
	{
		System.out.println("The Sum of Values of a and b in ClassC is : " + (a+b));
	}
	public static void main(String[] args) {
		ClassC o3 = new ClassC();
		System.out.println("The Value of a in ClassC is : " + o3.a);
		System.out.println("The Value of a in ClassC is : " + o3.b);
		o3.add();
	}
}
