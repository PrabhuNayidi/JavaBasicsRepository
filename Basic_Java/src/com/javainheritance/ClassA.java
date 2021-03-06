package com.javainheritance;

public class ClassA {
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
	int a = 25;
	int b =50;
	public void add()
	{
		System.out.println("The Sum of given two numbers is : " + (a+b));
	}
	static int c = 15;
	static int d = 25;
	public static int product()
	{
		int res = c*d;
		return res;
	}
	public static void main(String[] args) {
		ClassA o1 = new ClassA();
		System.out.println("The First Number is : " + o1.a);
		System.out.println("The Second Number is : " + o1.b);
		o1.add();
		System.out.println("The value of c is : " + c);
		System.out.println("The value of d is : " + d);
		System.out.println("The Product of values c and d is : " + product());
	}

}
