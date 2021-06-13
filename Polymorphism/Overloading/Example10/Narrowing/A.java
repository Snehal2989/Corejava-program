package com.Polymorphism.Overloading.Example10.Narrowing;
// Narrowing concept
public class A {

	public void m1(Object o) {//o=null
		System.out.println("m1 argument method of m1(Object o) Object return type");
	}

	public void m1(B b) {
		System.out.println("arg method of m1(B b) B return type");
	}

	public void m1(String s) {//s=null

		System.out.println("arg string method");
	}

	public void m1(A a) {//a=null

		System.out.println("arg m1(A a) method of Return type A");
	}
}
