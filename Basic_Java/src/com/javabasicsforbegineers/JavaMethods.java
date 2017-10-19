package com.javabasicsforbegineers;

public class JavaMethods {
	public String displayFullName(String FirstName, String LastName)
	{
		String FullName = (FirstName + " " + LastName);
		return FullName;
	}
	public static int sumOfNumbers(int a, int b, int c)
	{
		int result = a + b + c;
		return result;
	}
	public void arrayDisplay()
	{
		String [] s1 = {"Hello_World!", "How are you?"};
		for (String str : s1)
		{
			System.out.println("The Values of the Given String Array are : " + str);
		}
	}
	public static void newMessage(String msg)
	{
		if (msg.length() == 0)
		{
			System.out.println("Please Enter some message!!!!");
		}
		else
		{
			System.out.println(msg);
		}
	}
	public static void main(String[] args) {
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Displaying the Return value for a User Defined Method by Invoking an Object");
		System.out.println("---------------------------------------------------------------------------");
		JavaMethods n1 = new JavaMethods();
		String name = n1.displayFullName("Jaswanth","Potini");
		System.out.println(name);
		name = n1.displayFullName("Srikanth", "Vipparla");
		System.out.println(name);
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Displaying the Return value for a User Defined Method without Invoking an Object");
		System.out.println("--------------------------------------------------------------------------------");
		int result = sumOfNumbers(25, 52, 11);
		System.out.println("The Sum of Given Three Numbers is : " + result);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Displaying the Statement for a User Defined Method by Invoking an Object");
		System.out.println("------------------------------------------------------------------------");
		JavaMethods m1 = new JavaMethods();
		m1.arrayDisplay();
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Displaying the Message for a User Defined Method without Invoking an Object");
		System.out.println("---------------------------------------------------------------------------");
		newMessage("I am New to Java Programming Language!!");
	}

}
