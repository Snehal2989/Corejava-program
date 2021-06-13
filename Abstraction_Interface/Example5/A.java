package com.Abstraction_Interface.Example5;

public class A implements I,I1 {

	public static void main(String[] args) {
		
		I1 a = new A();
		System.out.println(a.x);/*Note: we can able access x variable without taking I as reference variable bcz , we extends the interface
		                            I in interface I1 ...if we are extended then we wont able to access x with the help of reference of I1*/
		System.out.println(a.y);
		
		// or we can access x, y in static way bcz variables are always static in interface
		System.out.println(I1.x);
		System.out.println(I1.y);
		
	}
}
