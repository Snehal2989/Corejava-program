package com.Creating_copyOfObject_Example_withoutusing_Clone_andCloneable_interface;

public class Test {

	public static void main(String[] args) {
		//here hashcode for every object is different
		
		Employee e1 = new Employee();
		e1.setEid(1);
		e1.setEname("xyz");
		System.out.println(e1.hashCode());
		System.out.println(e1.getEid() +" "+e1.getEname());
		
		Employee e2 = e1.copy();
		System.out.println(e2.hashCode());
		System.out.println(e2.getEid() +" "+e2.getEname());
		
		Employee e3 = e1.copy();
		e3.setEid(2);
		e3.setEname("abc");
		System.out.println(e3.hashCode());
		System.out.println(e3.getEid() +" "+e3.getEname());
		
		
	
		
	}
}
