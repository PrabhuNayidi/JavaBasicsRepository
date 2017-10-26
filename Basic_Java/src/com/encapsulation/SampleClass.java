package com.encapsulation;

public class SampleClass {

	/* Encapsulation - 
	 	I. It is a Process of Binding or wrapping the Code and Data into a Single Unit.
	 	II. It is a technique for making the fields in a Class private and providing the access through public Methods.
	 	Advantages:
	 		I. It Provides control over the Data.
	 		II. By providing setter and getter Methods we can make a Class Read only or Write only.
	*/
	
	//Create a private Variable of Data Type String.
	private String courseName = "CoreJava";
	
	//Write getter Method.
	public String getName()
	{
		return courseName;
	}
	
	//Write setter Method
	public void setName(String newName)
	{
		courseName = newName;
	}
	
	public static void main(String[] args) {
		SampleClass obj = new SampleClass();
		System.out.println(obj.getName()); // getter Method Without setter Method.
	}

}
