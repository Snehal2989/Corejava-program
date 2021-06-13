package com.Inheritance.Example4;

public class Test {

	public static void main(String[] args) {
		
		/* Take a note by now A is parent of B because we extends A into B,
		so it can be access  all method and variable by creating object of B,
		even we don't need to create object of A for that*/
		B b  = new B();
		b.m2();
		b.m3();
		b.m1();
		System.out.println(b.x);
	}
}
