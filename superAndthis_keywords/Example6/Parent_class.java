package com.superAndthis_keywords.Example6;

public class Parent_class {
	
	public Parent_class() {
		
		System.out.println("Constructor---Parent_class");
	}

	public Parent_class(String s) {
		
		this(200);
		System.out.println("Constructor---Parent_class---String");
	}
	
	public Parent_class(int i) {
		
		System.out.println("Constructor---Parent_class---int");
		
	}
}
