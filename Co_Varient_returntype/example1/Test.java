package com.Co_Varient_returntype.example1;

public class Test {

	public A m1() {
		
		A a = new A();
		B b = new B();
		C c = new C();
		
//		return a;  we can also return a
		return b; // we can also return b
//		return c;  we can also return c
	}
	

	public B m2() {
		
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		
//		return a;  compile time error
//		return b1; we can also return b1
		return c1;  // we can also return c1
	}
	
	

	public C m3() {
		
		A a2 = new A();
		B b2 = new B();
		C c2 = new C();
		
//		return a; compile time error
		//return b; compile time error
		return c2;     
	}
	
	
	
	
	
	
}
