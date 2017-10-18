package com.javabasicsforbegineers;

public class ExceptionHandling {

	public static void ArithmaticExceptionType()
	{
		int a =25;
		try
		{
			int result = a/0;
			System.out.println(result);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Division by zero is not possible!");
		}
	}
	public static void NullPointerExceptionType()
	{
		try
		{
			String str1 = null;
			int a = str1.hashCode();
			System.out.println(25*50);
			System.out.println(str1);
			System.out.println(a);
		}
		catch (NullPointerException e)
		{
			System.out.println("Performing Operations on NULL value is not Possible!!");
		}
	}
	public static void NumberFormatExceptionType()
	{
		try
		{
			String str1 = "Awesome";
			int i = Integer.parseInt(str1);
			System.out.println(i);
		}
		catch (NumberFormatException e)
		{
			System.out.println("Converting String Alphabets to Integer is Impossible!!");
		}
	}
	public static void ArrayIndexOutOfBoundsExceptionType()
	{
		try
		{
			int [] a1 = {1,2,3,4,5};
			a1[5] = 100;
			System.out.println(a1);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Accessing or Assigning a value to an Array Index greater than the Array length is not possible!");
		}
	}
	public static void main(String[] args) {
		/*Scanner s1 = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		String str1 = s1.nextLine();
		System.out.println("Enter First Number : ");
		String str2 = s1.nextLine();
		System.out.println("String Concatenation--------" + str1+str2);
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		System.out.println("Addition of numbers------" + (a+b));
		s1.close();*/
		ArithmaticExceptionType();
		NullPointerExceptionType();
		NumberFormatExceptionType();
		ArrayIndexOutOfBoundsExceptionType();
	}

}
