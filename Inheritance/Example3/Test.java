package com.Inheritance.Example3;

public class Test {
	

	public static void main(String[] args) {
		
		
		System.out.println("Reference class : A \n"+"Reference Variable : a \n"+"Object Constructor Class : B");
		System.out.println();
		A a = new B();
		a.m1(); // "m1--B"
		a.m2(); // "m2--A"
		
		System.out.println(a.a); // 10
		System.out.println(a.b); // 20
	}

}
