package com.Typecasting.Example3;

public class Test {
//Note : If return type is object, then we can return either A,B,C
	public Object m1() {
		System.out.println("m1---Test");
		return new A();
	}

	public Object m2() {

		System.out.println("m2---Test");
		return new B();
	}

	public Object m3() {

		System.out.println("m3---Test");
		return new C();
	}
	
	public A m4() {
		System.out.println("m4---Test");
		return new A();
	}
	
	public A m5() {
		System.out.println("m5---Test");
		return new B();
	}
	
	public A m6() {
		System.out.println("m6---Test");
		return new C();
	}
	
	public B m7() {
		System.out.println("m7---Test");
		return new B();
	}
	
	public B m8() {
		System.out.println("m8---Test");
		return new C();
	}
	
	public C m9() {
		System.out.println("m9---Test");
		return new C();
	}

	public static void main(String[] args) {

		Test t = new Test();

		A a1 = (A) t.m1();
		System.out.println(a1.a_name);

		B b1 = (B) t.m2();
		System.out.println(b1.b_name);

		C c1 = (C) t.m3();
		System.out.println(c1.c_name);
		
		A a2 = t.m4();// here no need to typecast because return type and return value is same
		System.out.println(a2.a_name);
		
		B b2  = (B) t.m5();
		System.out.println(b2.b_name);
		
		C c2  = (C) t.m6();
		System.out.println(c2.c_name);
		
		B b3 = t.m7();// here no need to typecast because return type and return value is same
		System.out.println(b3.b_name);
		
		C c3 =  (C)t.m8();
		System.out.println(c3.c_name);
		
		C c4 = t.m9();// here no need to typecast because return type and return value is same
		System.out.println(c4.c_name);
	}
}
