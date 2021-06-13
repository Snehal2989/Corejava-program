package com.Inheritance.Example2;

public class Test {
	
	public static void main(String[] args) {

		System.out.println("Reference class : B \n"+"Reference Variable : b \n"+"Object Constructor Class : C");
		System.out.println();
		B b = new C();
		b.m1(); // "m1--B"
		b.m2(); // "m2--C"
		b.m3(); // "m3--C"
		
		System.out.println(b.a); // 30
		System.out.println(b.b); // 20
		System.out.println(b.c); // 40
		
		
		

		
	}

}
