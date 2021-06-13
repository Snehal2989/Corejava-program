package com.Abstraction_Interface.Example1;

public class A implements I {
	
	@Override
	public void m1() {
		System.out.println("m1----A");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("main---start");
		
//		I i = new I; Here we can not instantiate the interface
		
		I i = new A();// 1] Way : we can only create the reference variable of interface and by creating object of child class
		i.m1();
		
		A a = new A();//2] way : directly by creating object of child class
		a.m1();
		
		// Note: Here are some ways to access interface variable variable 
		System.out.println(x);// can access x directly because x is also static and main method too
		System.out.println(I.x);// by using class name
		System.out.println(i.x);// by using reference variable of I
		System.out.println(a.x);// by using reference variable of A 
		
	}

}
