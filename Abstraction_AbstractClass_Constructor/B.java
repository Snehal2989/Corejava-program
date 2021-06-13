package com.Abstraction_AbstractClass_Constructor;

public class B extends A{
	
	
	public B() {
		System.out.println(this.hashCode());
		System.out.println(this.getClass().getName());
	}

}
