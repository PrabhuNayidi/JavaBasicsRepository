package com.javabasicsforbegineers;

public class Operators {
	static int a = 56;
	static double b = 25.687953;
	public static void ArithmaticOperators(int a, double b)
	{
		System.out.println("The Sum of a and b is : " + (a+b));
		System.out.println("The Difference between a and b is : " + (a-b));
		System.out.println("The Product of a and b is : " + (a*b));
		System.out.println("The Division between a and b is : " + (a/b));
		System.out.println("The Modular Division between a and b is : " + (a%b));
		System.out.println("The Post increment of a is : " + (a++));
		System.out.println("The value of a is : " + a);
		System.out.println("The Post decrement of a is : " + (a--));
		System.out.println("The value of a is : " + a);
		System.out.println("The Pre increment of a is : " + (++a));
		System.out.println("The value of a is : " + a);
		System.out.println("The Pre decrement of a is : " + (--a));
		System.out.println("The value of a is : " + a);
	}
	
	static char c1 = 'a';
	static char c2 = 'A';
	public static void RelationalOperators(char c1,char c2)
	{
		System.out.println("Is the Value of a equal to Value of b ? " + (a == b));
		System.out.println("Is the Value of a not equal to Value of b ? " + (a != b));
		System.out.println("Is the Value of a greater than Value of b ? " + (a > b));
		System.out.println("Is the Value of a lesser than Value of b ? " + (a < b));
		System.out.println("Is the Value of a greater than or equal Value of b ? " + (a >= b));
		System.out.println("Is the Value of a lesser than or equal Value of b ? " + (a <= b));
	}
	
	static int x = 5;
	static int y = 10;
	static int z = 1;
	public static void LogicalOperators(int x, int y, int z)
	{
		if (x == y && y == z)
		{
			System.out.println("(&&)The values of x,y and z are equal");
		}
		else if (x == y && y !=z)
		{
			System.out.println("(&&)The values of x,y are same and different from value of Z");
		}
		else if (x !=y && y != z)
		{
			System.out.println("(&&)The values of x,y and z are not equal");
		}
		if (x == y || y == z)
		{
			System.out.println("(||)The values of x,y and z are equal");
		}
		else if (x == y || y !=z)
		{
			System.out.println("(||)The values of x,y are same and different from value of Z");
		}
		else if (x !=y || y != z)
		{
			System.out.println("(||)The values of x,y and z are not equal");
		}
	}
	public static void main(String[] args) {
		// Operators o1 = new Operators(); // Object for Operators
		ArithmaticOperators(a, b);
		RelationalOperators(c1, c2);
		LogicalOperators(x, y, z);
	}

}
