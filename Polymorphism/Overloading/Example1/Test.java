package com.Polymorphism.Overloading.Example1;

public class Test {

	public static void main(String[] args) {

		A a = new A();
		a.m1();
		a.m1(4);
		a.m1("abc");
		
		//a.m1(2,3); It will show a compile time error bcz no such method parameter  exists in class A
	}

}
