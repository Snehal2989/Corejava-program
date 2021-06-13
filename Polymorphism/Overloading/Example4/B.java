package com.Polymorphism.Overloading.Example4;

public class B extends A {
	
	int x  = 20;
	
	public void m1() {
		
		int x = 10; 
		System.out.println(x); // Local variable of m1() method
		System.out.println(this.x);// global variable of same class
		System.out.println(super.x);
	}

}
