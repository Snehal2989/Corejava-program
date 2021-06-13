package com.superAndthis_keywords.Example2;

public class B extends A{
	
	public void m1() {
		super.m1();
		System.out.println("m1---B");
	}
	
	public void m2() {
		
		m1();
		super.m1();
	}

}
