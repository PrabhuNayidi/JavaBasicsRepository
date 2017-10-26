package com.javainterfaces;

public interface SampleInterface1 {
	public void myName();
	public void gender();
	public void age();
	public void address();

public static void main(String[] args) {
	SampleClass1 o1 = new SampleClass1();
	o1.myName();
	o1.gender();
	o1.age();
	o1.address();
}
}