package com.javabasicsforbegineers;

public class SampleClass03 {

	public int Sum(int x, int y)
	{
		int sum = y + x;
		return sum;
	}
	public int Multiply(int s, int d, int f)
	{
		int prod = s * d * f;
		return prod;
	}
	public double Division(double f01, double f02)
	{
		double div = f01/f02;
		return div;
	}
	public double ModularDivision(double d01, double d02)
	{
		double mod = d01%d02;
		return mod;
	}
	public static void main(String[] args) {
		int a,b,c;
		a = 2;
		b = 3;
		c = 5;
		double f1 = 25.36;
		double f2 = 26.568936;
		double d1 = 20.59867286;
		double d2 = 7.5896547268863456;
		
		SampleClass03 XYZ = new SampleClass03();
		int SUM = XYZ.Sum(a,b);
		int PRODUCT = XYZ.Multiply(a, b, c);
		double DIV = XYZ.Division(f1, f2);
		double MOD = XYZ.ModularDivision(d1, d2);
		System.out.println(SUM);
		System.out.println(PRODUCT);
		System.out.println(DIV);
		System.out.println(MOD);
	}

}
