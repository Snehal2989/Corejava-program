package com.Polymorphism.Overloading.Example12;
// Constructor overloading
public class A {
	
	public A() {
		System.out.println("Default constructor");
	}
	
	public A(int i ) {
		System.out.println("Parameterized int constructor");
	}
	
	public A(String s) {
		System.out.println("parameterized string constructor");
	}
	
	public A(boolean b) {
		System.out.println("paremeterized Boolean constructor");
	}
	
	public A(float f) {
		System.out.println("paremeterized Float constructor");
	}

}
