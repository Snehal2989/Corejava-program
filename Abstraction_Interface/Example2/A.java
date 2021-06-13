package com.Abstraction_Interface.Example2;

public class A implements I,I2 {
	
	public void m1() {
		System.out.println("m1----A");
	}
	
	public static void main(String[] args) {
		
		I i = new A();
		i.m1();
		System.out.println(I.x);
		
		I2 i2 = new A();
		i2.m1();
		System.out.println(I2.x);
	}

}
