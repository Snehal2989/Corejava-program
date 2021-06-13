package com.CoVarient_ReturnType.example3;

public class Test {

	public static void main(String[] args) {

		System.out.println();
		System.out.println("1]:");
		A a1 = new A();
		a1.m1();
		a1.m2();
		System.out.println(a1.x);
		System.out.println(a1.y);
		
		System.out.println();
		System.out.println("2]:");
		A a2 = new B();
		a2.m1();
		a2.m2();
		System.out.println(a2.x);
		System.out.println(a2.y);
		
		System.out.println();
		System.out.println("3]:");
		B b1 = new B();
		b1.m1();
		b1.m2();
		b1.m3();
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.z);
		
		System.out.println();
		System.out.println("4]:");
		B b2 = new C();
		b2.m1();
		b2.m2();
		b2.m3();
		System.out.println(b2.x);
		System.out.println(b2.y);
		System.out.println(b2.z);
		

		System.out.println();
		System.out.println("5]:");
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
		System.out.println(c.d);


	}

}
