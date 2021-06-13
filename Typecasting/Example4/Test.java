package com.Typecasting.Example4;

public class Test {

	public static void main(String[] args) {
		
		A a = new A();
		
		int i1 = (int)a.m1();
		System.out.println(i1);
		
		String s1 = (String)a.m2();
		System.out.println(s1);
		
		String s2 = a.m3();
		System.out.println(s2);
		
		int i2 = a.m4();
		System.out.println(i2);
	}
}
