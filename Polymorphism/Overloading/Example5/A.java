package com.Polymorphism.Overloading.Example5;

// Constructor Overloading
public class A {

	public A() {
		System.out.println("constructor----A");
	}

	public A(String s) {
		this(20);
		System.out.println("constructor---A---String");

	}

	public A(int i) {
		System.out.println("constructor---A---int");
	}

}
