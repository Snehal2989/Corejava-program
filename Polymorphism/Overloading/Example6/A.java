package com.Polymorphism.Overloading.Example6;

// Constructor Overloading
public class A {

	public A() {
		System.out.println("constructor--A---default");
	}

	public A(int x, int y) {
		this("abc");
		int result = x + y;
		System.out.println(result);
		System.out.println("constructor---A--int");

	}

	public A(String s) {
		this();
		System.out.println("constructor---A---String");
	}

}
