package com.Abstraction_Interface.Example7;

public class Airtel implements Mobile_Network {

	@Override
	public void calling() {
		System.out.println("calling---Airtel");
	}

	@Override
	public void browsing() {
		System.out.println("browsing---Airtel");
	}
	
	//Note: we can also create explicitly method
	public void airtelRecharge() {
		System.out.println("In Rs-449  20GB unlimited Talktime");
	}

}
