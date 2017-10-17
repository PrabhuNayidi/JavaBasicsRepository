package com.javabasicsforbegineers;

public class Strings {

	static String str1 = "Rakesh";
	static String str2 = "Ramesh";
	static String str3 = "Rajesh";
	public static void StringDisplay(String msg)
	{
		System.out.println("The Message is : " + msg);
	}
	public static void StringArrayDisplay(String [] SArray)
	{
		for (String str : SArray)
		{
			System.out.println("The Elements of the Given Array of Strings are : " + str);
		}
	}
	public static void StringOperations(String str1, String str2, String str3)
	{
		// String Concatenation
		System.out.println(str1 + ", " + str2 + " and " + str3 + " are Best Friends Forever.");
		System.out.println("My Best Friends names are : " + 1. + str2 + " " + 2. + str3 + " " + 3. + str1);
		System.out.println("Selenium" + 1.0 + 1.0);
		System.out.println("Selenium" + (1.0 + 1.0));
		System.out.println(1.0 + 1.0 + "Selenium");
		// String Comparison
		
		if (str1 == str2 && str2 == str3)
		{
			System.out.println("//Using Relational Operator");
			System.out.println("The Given three Strings are same!");
		}
		else
		{
			System.out.println("//Using Relational Operator");
			System.out.println("The Given three Strings are not same!!");
		}
		if (str1.equals(str2) && str2.equals(str3))
		{
			System.out.println("//Using euals Built In Method");
			System.out.println("The Given three Strings are same!");
		}
		else
		{
			System.out.println("//Using euals Built In Method");
			System.out.println("The Given three Strings are not same!!");
		}
		System.out.println("A-Z --->65 to 90");
		System.out.println("a-z --->97 to 122");
		System.out.println("0-9 --->48 to 57");
		System.out.println("When str1 is compared with str2 it's value is : " + str1.compareTo(str2));
		System.out.println("When str2 is compared with str3 it's value is : " + str2.compareTo(str3));
		System.out.println("When str2 is compared with itself it's value is : " + str2.compareTo(str2));
		
	}
	public static void main(String[] args) {
		
		StringDisplay("Selenium");
		StringDisplay("Selenium4Everyone");
		StringDisplay("$Selenium$");
		StringDisplay("Selenium2.0");
		StringDisplay("123458697");
		String s [] = {str1, str2, str3};
		StringArrayDisplay(s);
		StringOperations(str1, str2, str3);
	}

}
