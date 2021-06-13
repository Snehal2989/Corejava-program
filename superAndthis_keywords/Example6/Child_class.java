package com.superAndthis_keywords.Example6;

public class Child_class extends Parent_class {
	
	public Child_class() {
		super(10);
		
		System.out.println("constructor---Child_class");
	}
	
	public Child_class(int z) {
		
		this("xyz");
		System.out.println("Constructor---Child_class---int");

	}
	
	public Child_class(String s1) {
		
		this();
		System.out.println("Constructor---Child_class---String");
	}
	
	

}
