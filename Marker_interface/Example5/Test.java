package com.Marker_interface.Example5;

public class Test {

	public void m1(Marker m) { 
		
		A a = (A)m;
		System.out.println(a.x);
		System.out.println("m1----Test");
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		A a = new A();
		B b = new B();
//		C c = new C();
		
		t.m1(a);
	    t.m1(b);
//		t.m1(c);
		
	}
}
