package com.Inheritance.Example4;

public class B extends A {

	public void m2() {
		m1();
		System.out.println("m2----B");
	}
	
	public void m3() {
		System.out.println(x);
		System.out.println("m3----B");
	}
	
}
