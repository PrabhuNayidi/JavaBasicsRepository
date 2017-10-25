package com.javabasicsforbegineers;

public class JavaInheritance {
	/*
	I. It is a process of Inheriting(Reusing) the class members(Variables and Methods) from one class to another class.
	II. Static Class Members(Non-Inheritable) and Non-Static Class Members(Inheritable)
											Inheriting
	III. Super Class/Parent Class/Base Class -------------------> Sub Class/Child Class/Derived Class
											Class Members
	IV. Inheritance between Super Class and Sub Class can be achieved using extends keyword.
	V. Using Inheritance we can use all class members and also we can use protected class members.
	*/
	
	
	//Declaration of Static Variables
	static int a = 10;
	static int b = 25; // 
	static int a1 = 25, b1=50;
	
	//Declaration of Non Static Variables
	int c = 35;
	int d = 20;
	int c1 = 5, d1 = 8;
	
	//Create a Static Method with a return Value
	public static int add()
	{
		int res = a + b;
		return res;
	}
	
	//Create a Static Method without a return Value
	public static void mul()
	{
		System.out.println("The Product of given two Numbers is : " + (a1*b1));
	}
	
	//Create a Non Static Method with a return Value
	public int div()
	{
		int div = c/d;
		return div;
	}
	
	//Create a Non Static Method without a return Value
	public void mod()
	{
		System.out.println("The Modular Division between two given numbers is : " + (c1%d1));
	}
	
	/* Types of Inheritance in Java Programming Language:
	  Single Inheritance - 
	  			public Class ClassB extends ClassA
	  			{
	  			}
	  Multi Level Inheritance - 
	  			public Class ClassB extends ClassA {
	  			public Class ClassC extends ClassB {
	  			}
	  			}
	  Note : Java Language doesn't support Multiple Inheritance due to Diamond Problem
	  Multiple Inheritance - 
	  public Class ClassB extends ClassA {
	  public Class ClassB extends ClassC {
	  }
	  }
	*/
	
		
	
	public static void main(String[] args) 
	{
		System.out.println("------------------Accessing the Static Variables------------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a1);
		System.out.println(b1);
		System.out.println("------------------Accessing the Static Methods------------------");
		System.out.println("The Sum of given two static variables is : " + add());
		mul();
		System.out.println("------------------Accessing the Non Static Variables------------------");
		JavaInheritance o1 = new JavaInheritance();
		System.out.println(o1.c);
		System.out.println(o1.d);
		System.out.println(o1.c1);
		System.out.println(o1.d1);
		System.out.println("------------------Accessing the Non Static Methods------------------");
		System.out.println("The division between the given two static variables is : " + o1.div());
		o1.mod();
	}

}
