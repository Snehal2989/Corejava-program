package com.superAndthis_keywords.Example8;

public class B extends A{

	int x = 10;
	
	public B() {
		super();
		System.out.println("constructor----B");
	}
	
	public B(String d) {
		this();
		System.out.println("constructor---B---String");
	}
	public void m1() {
		int x = 90;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		System.out.println("m1----B");
	}
	public void m2() {
		
		m1();
		this.m1();
		super.m1();
		System.out.println("m2------B");
		
	}
}
