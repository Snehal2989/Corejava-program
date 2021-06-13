package com.Typecasting.example1;

public class Test {

	public static void main(String[] args) {

		A a  = new A();
		
		int x = a.m1();
		System.out.println(x);//10
		
		String s = a.m2();
		System.out.println(s);//java
		
		int y = (int)a.m3();
		System.out.println(y);//30
		
		String s1 = (String)a.m4();
		System.out.println(s1); // Hello
	}

}
