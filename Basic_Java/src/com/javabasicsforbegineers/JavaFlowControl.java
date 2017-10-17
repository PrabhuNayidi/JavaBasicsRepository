package com.javabasicsforbegineers;

public class JavaFlowControl {
	
	public static void NumberCheck(int a)
	{
		if (a>=1 && a<=100)
			System.out.println("The Given Number is a Small Number!");
		else if (a>=101 && a<=1000)
			System.out.println("The Given Number is a Medium Number!");
		else if (a>=1001 && a<=10000)
			System.out.println("The Given Number ia a Big Number!");
		else if (a>10001)
			System.out.println("The Given Number is a High Number!");
		else
			System.out.println("The Given Number is zero or a Negative Number!");
	}
	
	static int a1 = 60;
	static int a2 = 58;
	static int a3 = 39;
	static int a4 = 20;
	static int a5 = 10;
	public static void BigNumber(int a1, int a2, int a3, int a4, int a5)
	{
		if (a1>a2)
		{
			if (a1>a3)
			{
				if (a1>a4)
				{
					if (a1>a5)
					{
						System.out.println("a1 is biggest number among a1,a2,a3,a4,a5");
					}
					else
					{
						System.out.println("a5 is biggest number among a1,a2,a3,a4,a5");
					}
				}
				else
				{
					if (a4>a5)
					{
						System.out.println("a4 is biggest number among a1,a2,a3,a4,a5");
					}
					else
					{
						System.out.println("a5 is biggest number among a1,a2,a3,a4,a5");
					}
				}
			}
			else
			{
				if(a3>a4)
				{
					if(a3>a5)
					{
						System.out.println("a3 is biggest number among a1,a2,a3,a4,a5");
					}
					else
					{
						System.out.println("a5 is biggest number among a1,a2,a3,a4,a5");
					}
				}
				else
				{
					if (a4>a5)
					{
						System.out.println("a4 is biggest number among a1,a2,a3,a4,a5");
					}
					else
					{
						System.out.println("a5 is biggest number among a1,a2,a3,a4,a5");
					}
				}
			}
		}
		else
		{
			if (a2>a3)
			{
				if (a2>a4)
				{
					if (a2>a5)
					{
						System.out.println("a2 is biggest number among a1,a2,a3,a4,a5");
					}
					else
					{
						System.out.println("a5 is biggest number among a1,a2,a3,a4,a5");
					}
				}
				else
				{
					if (a4>a5)
					{
						System.out.println("a4 is biggest number among a1,a2,a3,a4,a5");
					}
					else
					{
						System.out.println("a5 is biggest number among a1,a2,a3,a4,a5");
					}
				}
			}
			else
			{
				if (a3>a4)
				{
					if (a3>a5)
					{
						System.out.println("a3 is biggest number among a1,a2,a3,a4,a5");
					}
					else
					{
						System.out.println("a5 is biggest number among a1,a2,a3,a4,a5");
					}
				}
				else
				{
					if (a4>a5)
					{
						System.out.println("a4 is biggest number among a1,a2,a3,a4,a5");
					}
					else
					{
						System.out.println("a5 is biggest number among a1,a2,a3,a4,a5");
					}
				}
			}
		}
	}
	public static void BigNumber1(int a1, int a2, int a3, int a4, int a5)
	{
		if (a1>a2 && a1>a3 && a1>a4 && a1>a5)
			System.out.println("a1 is bigger than a2,a3,a4,a5");
		else if (a2>a1 && a2>a3 && a2>a4 && a2>a5)
			System.out.println("a2 is bigger than a1,a3,a4,a5");
		else if (a3>a1 && a3>a2 && a3>a4 && a3>a5)
			System.out.println("a3 is bigger than a1,a2,a4,a5");
		else if (a4>a1 && a4>a2 && a4>a3 && a4>a5)
			System.out.println("a4 is bigger than a1,a2,a3,a5");
		else
			System.out.println("a5 is bigger than a1,a2,a3,a4");
	}
	public static void main(String[] args) {
		int a = 50;
		//int b = 50000;
		//int c = -100;
		NumberCheck(a);
		NumberCheck(a=10000);
		BigNumber(a1, a2, a3, a4, a5);
		BigNumber(2, 12, 23, 34, 45);
		BigNumber(102, 128, 23, 3784, 485);
		BigNumber(102, 12588, 23, 3784, 485);
		BigNumber(102, 12588, 2389652, 3784, 485);
		BigNumber(102, -12588, 0, -3784, 485);
		BigNumber1(a1, a2, a3, a4, a5);
		BigNumber1(2, 12, 23, 34, 45);
		BigNumber1(102, 128, 23, 3784, 485);
		BigNumber1(102, 12588, 23, 3784, 485);
		BigNumber1(102, 12588, 2389652, 3784, 485);
		BigNumber1(102, -12588, 0, -3784, 485);
	}

}
