package com.javainheritance;

public class ClassB extends ClassA{

	public static void main(String[] args) {
		ClassB o2 = new ClassB();
		o2.a = 50;
		o2.b = 40;
		System.out.println("The value of a from ClassA is : " + o2.a);
		System.out.println("The value of b from ClassA is : " + o2.b);
		o2.add();
		
	}
}
