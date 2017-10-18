package com.javabasicsforbegineers;
import java.util.Scanner;

public class IOoperations {
	static Scanner scan1 = new Scanner(System.in);
	public static void ReadName()
	{
		System.out.println("Enter your name here: ");
		String myName = scan1.nextLine();
		System.out.println("Your name is : " + myName);
	}
	public static void ReadCity()
	{
		System.out.println("Enter your City here: ");
		String city = scan1.next();
		System.out.println("Your City is : " + city);
	}
	public static void ReadAge()
	{
		System.out.println("Enter your age here: ");
		int myAge = scan1.nextInt();
		System.out.println("Your Age is : " + myAge);
	}
	public static void ReadMobileNumber()
	{
		System.out.println("Enter your Mobile Number here: ");
		long myNumber = scan1.nextLong();
		System.out.println("Your Mobile Number is : " + myNumber);
	}
	public static void ReadGender()
	{
		System.out.println("Enter your Gender here: ");
		char myGender = scan1.next().charAt(0);
		System.out.println("Your Gender is : " + myGender);
	}
	public static void CheckCondition()
	{
		System.out.println("Enter a Boolean Expression Vaalue : ");
		boolean b = scan1.nextBoolean();
		System.out.println("The Given Boolean Value is : " + b);
	}
	public static void main(String[] args) {
		ReadName();
		ReadCity();
		ReadAge();
		ReadMobileNumber();
		ReadGender();
		CheckCondition();
	}

}
