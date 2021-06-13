package com.Marker_interface.Example2;

public class Test {
	//Marker without return type
	public void m3(Marker m) { // m = b;
		
		B b = new B();
		System.out.println(b.y);
		System.out.println(b.x);  // here m able to access variable and method of A class because B extends A, A is parent of B
		b.m1();
		b.m2();
		System.out.println("m3---Test");
	}

	public static void main(String[] args) {
		
		Test t = new Test();
		A a1 = new A();
		B b1 = new B();
	//	C c = new C(); we can not instantiate object of C because , in C we did not implement Marker
		
		t.m3(a1); /*here you also can send argument a1...in m3() method arguments (Marker m) i passed and i also implemented the Marker interface
                    interface in A class, so you can access m3() method by passing a1 argument also*/
		
		t.m3(b1);/*here you also can send b1...in m3() method arguments (Marker m) i passed and i also implemented the Marker interface
                 interface in B class, so you can access m3() method by passing b1 argument also*/
	}
}
