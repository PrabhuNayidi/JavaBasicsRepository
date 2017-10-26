package com.javainterfaces;

public class SampleClass1 implements SampleInterface1{

	@Override
	public void myName() {
		System.out.println("My Name is : FirstName + LastName");
	}

	@Override
	public void gender() {
		System.out.println("My Gender is : Male/Female/Other");
	}

	@Override
	public void age() {
		System.out.println("My Age is : SomeNumber");
	}

	@Override
	public void address() {
		System.out.println("My Address is : SomeSampleAddress");
	}
	
	public static void main(String[] args) {
		SampleClass1 obj = new SampleClass1();
		obj.myName();
		obj.gender();
		obj.age();
		obj.address();
	}
}
