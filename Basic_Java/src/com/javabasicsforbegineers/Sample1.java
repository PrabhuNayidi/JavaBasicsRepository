package com.javabasicsforbegineers;

public class Sample1 {
	public int product(int a, int b,int c)
	{
		int result = a * b * c;
		return result;
	}
	public static void newMethod1()
	{
		System.out.println("This is a New Method for Sample1 Class without any return Value!!!");
	}
	public static void main(String[] args) {
		Sample2 o1 = new Sample2();
		double newvalue = o1.division(56.2589, 25.879536);
		System.out.println("The Division between two given Double Decimal Numbers is : " + newvalue);
		Sample2.newMethod2();
	}

}
