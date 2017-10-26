package com.encapsulation;

public class Sample extends SampleClass{

	public static void main(String[] args) {
		Sample o = new Sample();
		System.out.println(o.getName());//Using getter Method we are accessing the private field(Variable courseName).
		o.setName("Advanced Java");
		System.out.println(o.getName());
	}

}
