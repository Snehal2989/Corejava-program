package com.superAndthis_keywords.Example3;

public class B extends A{
	
	public void m1() {
		super.m1();// super() keyword is used for calling parent class method
		System.out.println("m1---B");
	}
	
	public void m2() {
		
		m1();
		this.m1(); // this() keyword is used for calling same class method.
		super.m1();// super() keyword is used for calling parent class method
	}

}
