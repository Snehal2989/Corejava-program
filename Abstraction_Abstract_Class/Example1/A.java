package com.Abstraction_Abstract_Class.Example1;

// by using abstract class we declare  implemented method as well as unimplemented method in one class 
public abstract class A {

	public abstract void m1();// unimplemented method without initializing body
	
	public abstract void m2();
	
	public void m3() {// implemented method with initializing body
		System.out.println("m3----A");
	}
}
