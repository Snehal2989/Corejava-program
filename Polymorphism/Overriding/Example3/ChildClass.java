package com.Polymorphism.Overriding.Example3;

public class ChildClass extends ParentClass {
	/*Note:Henced proved, If return the return type is non-primitive(class type) then
	we can return same or it should be their child class.*/
	
	public ParentClass m1() {
		
		System.out.println("m1-----ChildClass");
		return new ChildClass();
	}
	
	public ChildClass m2() {
		
		System.out.println("m2-----ChildClass");
		return new ChildClass();
	}

}
