package com.Abstraction_AbstractClass_Constructor;

public class C extends B{
	
	public C() {
		
		System.out.println(this.hashCode());
		System.out.println(this.getClass().getName());
	}

}
