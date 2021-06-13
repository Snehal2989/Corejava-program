package com.Polymorphism.Overloading.Example5;

public class Test {

	public static void main(String[] args) {

		B b = new B("abc"); /* For this output is :
								constructor---A---int
								constructor---A---String
								constructor---B---default
								30
								constructor---B---int
								constructor---B---String*/
		
		System.out.println();

		B b1 = new B(34,45); /* For this output is:
								constructor---A---int
								constructor---A---String
								constructor---B---default
								79
								constructor---B---int*/
		
		System.out.println();
		B b2 = new B(); /* For this output is:
								constructor---A---int
								constructor---A---String
								constructor---B---default*/
	}

}
