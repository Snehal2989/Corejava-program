package com.Abstraction_Interface.Example7;

public class Jio implements Mobile_Network {

	@Override
	public void calling() {
		System.out.println("calling---Jio");
	}

	@Override
	public void browsing() {
		System.out.println("browsing---Jio");
	}

	// we can also create any explicitly  method
	public void jioRecharge() {
		System.out.println("In Rs-129  40GB unlimited Talktime");
	}
}
