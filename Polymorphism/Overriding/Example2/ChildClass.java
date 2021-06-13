package com.Polymorphism.Overriding.Example2;

public class ChildClass extends ParentClass {
	@Override
	public int m1() {// here method return type also int
		System.out.println("m1-----ChildClass");
		return 10;
	}

}
