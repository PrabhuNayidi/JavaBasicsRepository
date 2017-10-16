package com.javabasicsforbegineers;

public class Variables {
	static int a1 = 500; //Static or Class Variable
	public double ShareValue()
	{
		double value = 5.0359; //Local Variable
		System.out.println(a1);
		return value;
	}
	
	public static void main(String[] args) {
		char c1 = 'S'; //Instance Variable
		System.out.println(a1);
		System.out.println(c1);
		Variables v1 = new Variables();
		System.out.println(v1.ShareValue());
	}
	
}
