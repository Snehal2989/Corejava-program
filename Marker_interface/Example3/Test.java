package com.Marker_interface.Example3;

public class Test {
// Marker without return type
	public void m2(Marker m) {
		A a  = new A();
		System.out.println(a.x);
		
		B b = new B();
		System.out.println(b.y);
		
		C c = new C();
		System.out.println(c.z);
		System.out.println("m2----Test");
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		A a1 = new A();
		B b1 = new B();
		C c1 = new C(); // here u can now create object for C , because we implemented Marker interface in class C
		
		t.m2(a1); /*here you also can send a1...in m2() method arguments (Marker m) i passed and i also implemented the Marker interface
                   interface in A class, so you can access m2() method by passing a1 argument also*/
		
		t.m2(b1); /*here you also can send b1...in m2() method arguments (Marker m) i passed and i also implemented the Marker interface
		           interface in C class, so you can access m2() method by passing b1 argument also*/
		
		t.m2(c1);/*here you also can send c1...in m2() method arguments (Marker m) i passed and i also implemented the Marker interface
                 interface in B class, so you can access m2() method by passing c1 argument also*/
		
	}
}
