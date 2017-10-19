package com.javabasicsforbegineers;

public class Sample2 {
	public double division(double d1, double d2)
	{
		double result = d1/d2;
		return result;
	}
	public static void newMethod2()
	{
		System.out.println("This is a New Method for Sample2 Class without any return Value!!!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 o1 = new Sample1();
		int value = o1.product(25, 15, 10);
		System.out.println("The Product of Given Three Numbers is : " + value);
		Sample1.newMethod1();
	}

}
