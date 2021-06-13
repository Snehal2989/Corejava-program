package com.Polymorphism.Overriding.Example4;

// Overriding method syntax rule 5: Access modifier should be same or greater , but we cannot write weaker
// flow of access modifier according to scope :  public > protected > default > private

public class A {

	protected void m1() {
		System.out.println("m1-----A");
	}
	
	public void m2() {
		System.out.println("m2------A");
	}
	
	public void m3() {
		System.out.println("m3------A");
	}
	
	
}
