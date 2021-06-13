package com.Marker_interface.Example1;

public class Test {

	// using Marker interface without return type
	public void m1(Marker m) {
		System.out.println("m1-----Test");
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		A a = new A();
		B b = new B();
		//WC c = new C();
		
		t.m1(a); /*Note : we can send any argument here either a,b, because in m1() method we pass the (Marker m) 
		                  argument , and in A & B class we implements the Marker */
		t.m1(b);
		//t.m1(c); Error= we can not the c argument in m1() method , because we did not  implements Marker in C class. 
	}
}
