package com.Marker_interface.Example4;

public class Test {

	// Marker with return type
	public Marker m1() {
		System.out.println("m1----Test");
		return new A();
		
	}
	
	public static void main(String[] args) {
		 System.out.println("main start");
		 
		 Test t = new Test();
		 
		 A a = (A)t.m1();
		 /* Now here for calling m1() method we need to type cast into A,,because return type of m1()
		   method is Marker and return value is object [new A()]
		  */
		 
		/* B b =(B)t.m1(); //Error , if we try to store value in B so it will give the error at runtime by saying
		 Exception in thread "main" java.lang.ClassCastException: com.Marker_interface.Example4.A cannot be cast to com.Marker_interface.Example4.B
			at com.Marker_interface.Example4.Test.main(Test.java:22)*/

		 
	}
}
