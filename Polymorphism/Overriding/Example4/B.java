package com.Polymorphism.Overriding.Example4;

public class B {
	
	public void m1() {
		System.out.println("m1----B");
	}
	
	private void m2() {
		System.out.println("m2----B");
	}

	//@Override
//	protected void m3() { /* here it will give error bcz protected is weaker than public, or
//		           according rule we can give only modifier same or greater*/
//		System.out.println("m3-----B");
//	}
	
	
}
