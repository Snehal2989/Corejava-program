package com.Polymorphism.Overloading.Example10.Narrowing;

public class Test {

	public static void main(String[] args) {
		
		A a = new A();
		//a.m1(null); The method m1(Object) is ambiguous for the type A
		
		a.m1(new A()); // It will directly display statement of method m1(A a) by creating object oa A class
		a.m1(new Object());// It will directly display statement of method m1(Object o) by creating new object.
		a.m1((B)null);// If we want to print statement of method m1(B b)  , then Typecasting that  m1 method into B
		a.m1((String)null);
	}

}
