package com.Abstraction_Interface.Example4;

public class Oracle implements Connection {

	public void commit() {
		System.out.println("commit---Oracle");
	}
	
	public void rollback() {
		System.out.println("rollback---Oracle");
	}
}
