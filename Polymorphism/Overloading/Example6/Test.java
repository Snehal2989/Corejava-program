package com.Polymorphism.Overloading.Example6;

public class Test {

	public static void main(String[] args) {

		B b = new B();
		/* For this output is : 
		  	constructor--A---default
			constructor---A---String
			22
			constructor---A--int
			constructor---B---default
		 */
		
		System.out.println();
		B b1 = new B("xyz");
		/* For this output is:
		    constructor--A---default
			6.790323
			constructor---B---float
			constructor---B---String
		 */
	}

}
