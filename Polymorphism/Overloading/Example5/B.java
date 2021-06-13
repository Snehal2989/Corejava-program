package com.Polymorphism.Overloading.Example5;
// overloading of Constructor
public class B extends A{

	public B() {
		
		super("abc");
		System.out.println("constructor---B---default");
	}

	public B(int x,int y) {
		this();
		int result = x+y;
		System.out.println(result);
		System.out.println("constructor---B---int");
	}
	
	public B(String r) {
		this(20,10);
		System.out.println("constructor---B---String");
	}
}
