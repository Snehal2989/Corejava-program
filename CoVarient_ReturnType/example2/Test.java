package com.CoVarient_ReturnType.example2;

public class Test {

	public static void main(String[] args) {

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
		
		A a3 = new C();
		a3.m1();
		a3.m2();
		System.out.println(a3.x);
		System.out.println(a3.y);
		
		System.out.println();
		System.out.println("4]:");
		
		A a4 = new D();
		a4.m1();
		a4.m2();
		System.out.println(a4.x);
		System.out.println(a4.y);
		
		System.out.println();
		System.out.println("5]:");
		
		B b1 = new B();
		b1.m1();
		b1.m2();
		b1.m3();
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.z);
		
		System.out.println();
		System.out.println("6]:");
		
		B b2 = new C();
		b2.m1();
		b2.m2();
		b2.m3();
		System.out.println(b2.x);
		System.out.println(b2.y);
		System.out.println(b2.z);
		
		System.out.println();
		System.out.println("7]:");
		
		C c1 = new C();
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();
		System.out.println(c1.x);
		System.out.println(c1.y);
		System.out.println(c1.z);
		System.out.println(c1.d);
		
		
		System.out.println();
		System.out.println("8]:");
		
		C c2 = new D();
		c2.m1();
		c2.m2();
		c2.m3();
		c2.m4();
		System.out.println(c2.x);
		System.out.println(c2.y);
		System.out.println(c2.z);
		System.out.println(c2.d);
		
		
		System.out.println();
		System.out.println("9]:");
		
		D d1 = new D();
		d1.m1();
		d1.m2();
		d1.m3();
		d1.m4();
		d1.m5();
		System.out.println(d1.x);
		System.out.println(d1.y);
		System.out.println(d1.z);
		System.out.println(d1.d);
		System.out.println(d1.e);




		
		
		



	}

}
