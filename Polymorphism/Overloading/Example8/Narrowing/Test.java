package com.Polymorphism.Overloading.Example8.Narrowing;

public class Test {

	public static void main(String[] args) {

		A a = new A();
//		a.add(null); 	It will give compile time error that The method add(Object) is ambiguous for the type A
		
		a.add((Object)null); // OR if u want to remove Ambiguous issue , then call particular method by casting particurly return type
							// Here calling add method of object return type
		
		a.add((A)null); // Here calling add method of  A return type
		a.add((String)null); // Here calling add method of  A return type
		
		a.add(new A()); // here m creating new object so , directly object return type A method is being called
		
	}

}
