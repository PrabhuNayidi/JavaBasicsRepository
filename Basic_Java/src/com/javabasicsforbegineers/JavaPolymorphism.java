package com.javabasicsforbegineers;

import com.javainheritance.ClassA;

public class JavaPolymorphism extends ClassA{

	/*	Polymorphism
		I.Existance of Object Behavior in many forms.
		II.Types of Polymorphism - 
		 	Compile Time Polymorphism (or) Method overloading
		 	Run Time Polymorphism (or) Method Overriding
		 
		 Compile Time Polymorphism (or) Method overloading
		 -------------------------------------------------
		 If there are two or more methods with same name in the same class but they differ in :
		 	i) Number of Arguments.
		 	ii) Types of Arguments.
		 
		 Run Time Polymorphism (or) Method overriding
		 -------------------------------------------------
		 If there are two or more methods with same name available in super class and sub class.
	*/
	
	public void add(int a, int b)
	{
		System.out.println("The sum of given two numbers is : " + (a+b));
	}
	public void add(int a, int b, int c)
	{
		System.out.println("The sum of given three numbers is : " + (a+b+c));
	}
	public void add(double d, double e)
	{
		System.out.println("The sum of given two numbers is : " + (d+e));
	}
	public void add(double d, double e, double f)
	{
		System.out.println("The sum of given three numbers is : " + (d+e+f));
	}
	//The following Method exists in the Parent Class ClassA in com.javainheritance package.
	public void add()
	{
		System.out.println("This display message overrides the add() method in the Parent Class!!!");
	}
	
	
	public static void main(String[] args) {
		JavaPolymorphism o1 = new JavaPolymorphism();
		int a=1,b=2,c=3;
		double d=2.35689,e=58.264756,f=5826.3547896;
		o1.add(a, b);
		o1.add(a, b, c);
		o1.add(d, e);
		o1.add(d, e, f);
		o1.add();
		ClassA o2 = new ClassA();
		System.out.println("Accessing the add() Method in Parent Class without Overriding by creating an object for Parent Class in Child Class's main() method");
		o2.add();
	}

}
