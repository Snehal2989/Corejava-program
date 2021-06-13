package com.superAndthis_keywords.Example7;

public class B extends A {
	
	int x = 20;
	public B() {
		super(10);
 		
			System.out.println("constructor---of----B");
		
	}
	
	public void m2() {
		
		System.out.println("m2---of---B");
	}
	
	public B(String s) {
		
	this(200);
	System.out.println("constructor---B---String");
	}
	
	public B(int i) {
		this();
		int x = 39;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		System.out.println("constructor---B---int");
		
	}

}
