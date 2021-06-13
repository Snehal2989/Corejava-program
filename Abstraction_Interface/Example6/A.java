package com.Abstraction_Interface.Example6;

public class A implements I2,I{
	
	public void m1() {// here compulsory we need to initialized m1() method
		
		System.out.println("m1----A");
		
	}
	
	public static void main(String[] args) {
		
		I2 i = new A();
		i.m1();
	}

}
