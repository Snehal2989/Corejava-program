package com.superAndthis_keywords.Example6;

public class Test {

	public static void main(String[] args) {

		Child_class c1 = new Child_class("PQR");
		/* for this output = Constructor---Parent_class---int
						  constructor---Child_class
		                  Constructor---Child_class---String*/
		
		System.out.println();
		Child_class c2 = new Child_class();

	}

}
