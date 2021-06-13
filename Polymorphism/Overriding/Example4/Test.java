package com.Polymorphism.Overriding.Example4;

public class Test {

	public static void main(String[] args) {
		
		B b = new B();
		b.m1();
//		b.m2(); Here error comes because in child class we give private modifier so this method is not visible in test class
		
	}
}
