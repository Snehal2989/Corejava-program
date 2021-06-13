package com.Polymorphism.Overriding.Example3;

// If return type is non-primitive (class type), then it should be same or their childClass 


public class ParentClass {
	
//	1] First method
	public ParentClass m1() {// here return type is class type ParentClass
		
		System.out.println("m1-----ParentClass");
		
		return new ParentClass();
	}
	
	
//	2] Second method
	public ParentClass m2() {
		System.out.println("m2------ParentClass");
		return new ParentClass();
	}
	
	

}
