package com.Polymorphism.Overloading.Example13;

public class A {

	public void m1(Object o) {
		System.out.println("object paremeter");
	}
	
	public void m1(int i) {  // if we entering int then we will get the onject paremeters value by time adding null
		System.out.println("int parameter");
	}
	
	public void m1(Integer i) {
		System.out.println("Integer parameter");
	}
}
