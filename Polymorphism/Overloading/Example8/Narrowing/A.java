package com.Polymorphism.Overloading.Example8.Narrowing;
//Method Overloading with Narrowing concept


public class A {
	
	public void add(Object o) {
		
		System.out.println("object argument add(Object o) method");
	}

	public void add(String s) {
		System.out.println("String argument  add(String s) method");
	}
	
	public void add(A a) {
		System.out.println("A argument add(A a) method");
	}
}
