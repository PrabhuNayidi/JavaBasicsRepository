package com.javabasicsforbegineers;

public class Arrays {

	public static void ArrayDeclaration()
	{
		System.out.println("------Method I------");
		int a[];
		a = new int[5];
		a[0] = 25;
		a[1] = 5;
		a[2] = 125;
		a[3] = 525;
		for (int i : a)
		{
			System.out.println("The Elements of array a are : " + i);
		}
		
		System.out.println("------Method II------");
		char [] vowels = new char[5];
		vowels[0] = 'a';
		vowels[1] = 'e';
		vowels[2] = 'i';
		vowels[3] = 'o';
		vowels[4] = 'u';
		for (char c : vowels)
		{
			System.out.println("The Elements of a Vowel Alphabets Array are : " + c);
		}
		System.out.println("------Method III------");
		String [] strArray = {"Alabama", "Alaska", "Arizona", "Arkansas"};
		for (String states: strArray)
		{
			System.out.println("The Elements of strArray are : " + states);
		}
		System.out.println("-----------------------------------------------------------");		
	}
	
	public static void ArrayTypes()
	{
		int [] a11 = {1,2,3,4,5};
		String [] [] a2 ={{"Illinois","California","Texas"},{"Springfield","Sacramento","Austin","@@@@@@@@@@@@"}};
		System.out.println(a11);
		System.out.println("----------------------");
		System.out.println(a2.length);
		for (int a=0; a<a2.length; a++)
		{
			for (int b=0; b<a2[a].length; b++)
			{
				System.out.println(a2[a][b]);
			}
		}
	}
	public static void main(String[] args) {
		//Declaration of Arrays
		//-----------Method 1----------
		/*datatype arrayname []; (Creating Array)
		arrayname = new datatype[n] (Define Size)
		arrayname[0] = value;
		arrayname[1] = value;
		arrayname[n-1] = value;*/
		
		//-----------Method 2----------
		/*datatype [] arrayname = new datatype[length] (Declare array along with it's length)
		arrayname[index] = value (Assigning the value)*/
		
		//-----------Method 2----------
		/*datatype [] arrayname = {value 1, value 2,......value n}(Declare Array and Assign Values)*/
		ArrayDeclaration();
		//Duplicating an Array
		int [] array1 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("The Elements of array1 are : ");
		for (int i : array1)
		{
			System.out.println(i);
		}
		int array2 [] = array1;
		System.out.println("The Elements of array2 are : ");
		for (int j : array2)
		{
			System.out.println(j);
		}
		
		ArrayTypes();
	}

}
