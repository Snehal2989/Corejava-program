package com.superAndthis_keywords.Example8;

public class C extends B{
	public C() {
		System.out.println("constructor---c");
	}
	public C(int i) {
		super("dfg");
		System.out.println("constructor----C---int");
	}
	
	public C(String s) {
		this(20);
		System.out.println("constructor---C----string");
	}
	
	public void m3() {
		super.m2();
		System.out.println("m3----C");
	}

}
