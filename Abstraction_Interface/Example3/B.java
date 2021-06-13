package com.Abstraction_Interface.Example3;

public class B implements A {
	public void m1() {
		System.out.println("m1----B");
	}
	
	public void m2() {
		System.out.println("m2----B");
	}
	
	public static void main(String[] args) {
		A a = new B();
		a.m1();
		a.m2();
	}

}
