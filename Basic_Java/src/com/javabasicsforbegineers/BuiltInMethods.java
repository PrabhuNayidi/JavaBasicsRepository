package com.javabasicsforbegineers;
import java.util.Arrays;
public class BuiltInMethods {
	/*Categories of Built In Methods in Java Programming Language.
	String Methods
	Number Methods
	Character Methods
	Array Methods*/
	
	public static void stringMethods()
	{
		System.out.println("---------------------compareTo String Method---------------------");
		String str1 = "Sagarasangamam";
		String str2 = "Sagarasangamam";
		System.out.println("The compare method between two strings returns ZERO Value : " + str1.compareTo(str2));
		str1 = "Swarabhishekam";
		str2 = "Sagarasangamam";
		System.out.println("The compare method between two strings return a POSITIVE Value : " + str1.compareTo(str2));
		str1 = "Sagarasangamam";
		str2 = "Swarabhishekam";
		System.out.println("The compare method between two strings return a NEGATIVE Value : " + str1.compareTo(str2));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------equals String Method---------------------");
		str1 = "Arkansas";
		str2 = "Arkansas";
		System.out.println("The Equals Mathod between two Strings returns : " + str1.equals(str2));
		str1 = "Arkansas";
		str2 = "Alaska";
		System.out.println("The Equals Method between two Strings returns : " + str1.equals(str2));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------concat String Method---------------------");
		str1 = "Java" + " ";
		str2 = "Programming Language";
		System.out.println("The Concatenation Method between two Strings is : " + str1.concat(str2));
		System.out.println("-----------------------------------------------------------------");
		str1 = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("---------------------charAt String Method---------------------");
		System.out.println("The charAt Method (Character at the Index) on a String returns : " + str1.charAt(9));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------equalsIgnoreCase String Method---------------------");
		str1 = "abcdefghijklmnopqrstuvwxyz";
		str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String str3 = "0123456789";
		System.out.println("The Equals Ignore Case Method on two Strings returns : " + str1.equalsIgnoreCase(str2));
		System.out.println("The Equals Ignore Case Method on two Strings returns : " + str2.equalsIgnoreCase(str3));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------toUpperCase String Method---------------------");
		str1 = "143SeLeNiUm";
		str2 = "SeLeNium@$*";
		str3 = "Selenium";
		System.out.println("The toUpperCase Method on str1 returns : " + str1.toUpperCase());
		System.out.println("The toUpperCase Method on str2 returns : " + str2.toUpperCase());
		System.out.println("The toUpperCase Method on str3 returns : " + str3.toUpperCase());
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------toLowerCase String Method---------------------");
		str1 = "143SeLeNiUm";
		str2 = "SeLeNium@$*";
		str3 = "Selenium";
		System.out.println("The toLowerCase Method on str1 returns : " + str1.toLowerCase());
		System.out.println("The toLowerCase Method on str2 returns : " + str2.toLowerCase());
		System.out.println("The toLowerCase Method on str3 returns : " + str3.toLowerCase());
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------trim String Method---------------------");
		str1 = "  SAMPLE_STRING";
		str2 = "SAMPLE_STRING  ";
		str3 = "  SAMPLE_STRING  ";
		String str4 = "SAMPLE STRING";
		System.out.println("Before trim Method : " + str1);
		System.out.println("The trim Method on a given string returns : " + str1.trim());
		System.out.println("Before trim Method : " + str2);
		System.out.println("The trim Method on a given string returns : " + str2.trim());
		System.out.println("Before trim Method : " + str3);
		System.out.println("The trim Method on a given string returns : " + str3.trim());
		System.out.println("Before trim Method : " + str4);
		System.out.println("The trim Method on a given string returns : " + str4.trim());
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------subString String Method---------------------");
		str1 = "Welcome to My Sample Java Programming Channel!!";
		System.out.println("The Substring for a given string begins from : " + str1.substring(11));
		System.out.println("The Substring for a given string was between : " + str1.substring(21, 45));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------endsWith String Method---------------------");
		str1 = "Welcome to My Sample Java Programming Channel!!";
		System.out.println("The endsWith Method returns : " + str1.endsWith("Channel!!"));
		System.out.println("The endsWith Method returns : " + str1.endsWith("Channel"));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------length String Method---------------------");
		str1 = "Welcome to My Sample Java Programming Channel!!";
		System.out.println("The Length of the Given String by length() method is : " + str1.length());
		System.out.println("-----------------------------------------------------------------");
	}
	
	public static void numberMethods()
	{
		//Integer Class wraps a value of Primitive Data Type int in an object. An Object of type Integer contains a single field whose type is int.
		System.out.println("---------------------compareTo Number Method---------------------");
		int b = 25;
		Integer a = b;
		System.out.println(a.compareTo(26));
		System.out.println(a.compareTo(25));
		System.out.println(a.compareTo(5));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------equals Number Method---------------------");
		Integer x = 55;
		Integer y = 5;
		System.out.println(x.equals(y));
		x = 55;
		y = 55;
		System.out.println(x.equals(y));
		x = 55;
		y = 555;
		System.out.println(x.equals(y));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------abs Number Method---------------------");
		x = -123;
		System.out.println("abs(-123): " + Math.abs(x));
		double c = 26.5894;
		double d = -28.9875;
		System.out.println("abs(26.5894): " + Math.abs(c));
		System.out.println("abs(-28.9875): " + Math.abs(d));
		long e = 256897856;
		long f = -256897324;
		System.out.println("abs(256897856): " + Math.abs(e));
		System.out.println("abs(-256897324): " + Math.abs(f));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------round Number Method---------------------");
		c = -5.98624;
		d = 5.02594;
		x = 59;
		y = -99;
		System.out.println("round(-5.98624) : " + Math.round(c));
		System.out.println("round(5.02594) : " + Math.round(d));
		System.out.println("round(59) : " + Math.round(x));
		System.out.println("round(-99) : " + Math.round(y));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------min Number Method---------------------");
		Integer a1 = 56;
		Integer a2 = -58;
		double a3 = 5863.5987;
		double a4 = -8.25987;
		System.out.println("min(56,-58) : " + Math.min(a1, a2));
		System.out.println("min(5863.5987,-8.25987) : " + Math.min(a3, a4));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------max Number Method---------------------");
		a1 = 56;
		a2 = -58;
		a3 = 5863.5987;
		a4 = -8.25987;
		System.out.println("max(56,-58) : " + Math.max(a1, a2));
		System.out.println("max(5863.5987,-8.25987) : " + Math.max(a3, a4));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------random Number Method---------------------");
		System.out.println("Random decimal integer between 0 and 1 is by Using random(): " + Math.random());
		System.out.println("-----------------------------------------------------------------");
	}
	
	public static void characterMethods()
	{
		//Character class wraps a value of primitive data type char is an object.
		System.out.println("---------------------isLetter Character Method---------------------");
		char c1 = 'a';
		char c2 = '1';
		System.out.println("isLetter('a'): " + Character.isLetter(c1));
		System.out.println("isLetter('1'): " + Character.isLetter(c2));
		System.out.println("isLetter('$'): " + Character.isLetter('$'));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------isAlphabetic Character Method---------------------");
		c1 = 'a';
		c2 = '1';
		System.out.println("isAlphabetic('a'): " + Character.isAlphabetic(c1));
		System.out.println("isAlphabetic('1'): " + Character.isAlphabetic(c2));
		System.out.println("isAlphabetic('$'): " + Character.isAlphabetic('$'));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------isDigit Character Method---------------------");
		c1 = 'a';
		c2 = '1';
		System.out.println("isDigit('a'): " + Character.isDigit(c1));
		System.out.println("isDigit('1'): " + Character.isDigit(c2));
		System.out.println("isDigit('$'): " + Character.isDigit('$'));
		System.out.println("isDigit('2'): " + Character.isDigit('2'));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------isUpperCase Character Method---------------------");
		c1 = 'a';
		c2 = '1';
		System.out.println("isUpperCase('a'): " + Character.isUpperCase(c1));
		System.out.println("isUpperCase('1'): " + Character.isUpperCase(c2));
		System.out.println("isUpperCase('$'): " + Character.isUpperCase('$'));
		System.out.println("isUpperCase('D'): " + Character.isUpperCase('D'));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------isLowerCase Character Method---------------------");
		c1 = 'a';
		c2 = '1';
		System.out.println("isLowerCase('a'): " + Character.isLowerCase(c1));
		System.out.println("isLowerCase('1'): " + Character.isLowerCase(c2));
		System.out.println("isLowerCase('$'): " + Character.isLowerCase('$'));
		System.out.println("isLowerCase('T'): " + Character.isLowerCase('T'));
		System.out.println("-----------------------------------------------------------------");
	}
	
	public static void arrayMethods()
	{
		System.out.println("---------------------length Array Property---------------------");
		int [] a1 = {5,10,15,25,20,5,15,10,20,25};
		System.out.println("The length of the given Array is : " + a1.length);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------toString Array Method---------------------");
		String [] a2 = {"FirstName","LastName"};
		String str = Arrays.toString(a2);
		System.out.println(str);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("---------------------contains Array Method---------------------");
		double [] a3 ={25.63,59.58,84.254,25.63,78.489,10.586,59.58,84.254};
		boolean res = Arrays.asList(a3).contains(25.63);
		boolean res1 = Arrays.asList(a3).contains(a3);
		System.out.println(res);
		System.out.println(res1);
		char [] v = {'a','e','i','o','u'};
		boolean v1 = Arrays.asList(v).contains('a');
		boolean v2 = Arrays.asList(v).contains('e');
		boolean v3 = Arrays.asList(v).contains('i');
		boolean v4 = Arrays.asList(v).contains('o');
		boolean v5 = Arrays.asList(v).contains('u');
		boolean nr = Arrays.asList(v).contains(v);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(nr);
		a2[0] = "FirstName";
		a2[1] = "LastName";
		boolean r1 = Arrays.asList(a2).contains("FirstName");
		boolean r2 = Arrays.asList(a2).contains("Sample");
		System.out.println(r1);
		System.out.println(r2);
		System.out.println("-----------------------------------------------------------------");
	}
	public static void main(String[] args) {
		stringMethods();
		numberMethods();
		characterMethods();
		arrayMethods();
	}

}
