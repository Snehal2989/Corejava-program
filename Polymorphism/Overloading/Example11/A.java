package com.Polymorphism.Overloading.Example11;

// Method OverLoading
public class A {

	public void add(int x,int y) {
		int result = x+y;
		System.out.println(result);
		System.out.println("add method with int return type");
	}
	
	public void add(double d1, double d2) {
		double result = d1/d2;
		System.out.println(result);
		System.out.println("add method of double return type");
	}
	
	public void add(String s1, String s2) {
		System.out.println("Full Name : "+s1+" "+s2);
		System.out.println("add method of String return Type");
	}
}
