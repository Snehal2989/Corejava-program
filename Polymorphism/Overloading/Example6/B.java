package com.Polymorphism.Overloading.Example6;

public class B extends A {

	public B() {
		super(10,12);
		System.out.println("constructor---B---default");
		
	}
	
	public B(float x,float y) {
		super();
		float result = x/y;
		System.out.println(result);
		System.out.println("constructor---B---float");
		
	}
	
	public B(String s) {
		this(42.1f,6.2f);
		System.out.println("constructor---B---String");
	}
	
}
