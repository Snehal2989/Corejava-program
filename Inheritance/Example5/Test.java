package com.Inheritance.Example5;

public class Test {

	public static void main(String[] args) {
		
		A a = new A();
		a.m1();//m1--A
		a.m2();//m2---A
		System.out.println(a.a);//23
		System.out.println(a.s);//abc
		
		A a1 = new B();
		a1.m1();//m1--A
		a1.m2();//m2---B
		System.out.println(a1.a);//23
		System.out.println(a1.s);//abc.
		
		A a2 = new C();
		a2.m1();//m1--A
		a2.m2();//m2---B
		System.out.println(a2.a);//23
		System.out.println(a2.s);//abc.
		
		
		B b =  new B();
		b.m1();//m1---A
		b.m2();//m2---B
		b.m3();//m3----B
		System.out.println(b.a);//24
		System.out.println(b.s);//xyz
		System.out.println(b.b);//25
		
		B b1 =  new C();
		b1.m1();//m1---A
		b1.m2();//m2---B
		b1.m3();//m3----C
		System.out.println(b1.a);//24
		System.out.println(b1.s);//xyz
		System.out.println(b1.b);//25
		
		C c = new C();
		System.out.println(c.a);//24
		System.out.println(c.s);//xyz
		System.out.println(c.b);//30
		System.out.println(c.y);//10
		System.out.println(c.z);//20
		
		c.m1();//m1-----A
		c.m2();//m2----B
		c.m3();//m3----C
		c.m4();//m4---C




	}
}
