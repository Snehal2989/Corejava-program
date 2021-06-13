package com.Abstraction_Interface.Example7;

public class Test {

	public static void main(String[] args) {
		
		Mobile_Network m1 = new Jio();
		m1.calling();
		m1.browsing();
		/*m1.jioRecharge(); note = here we are directly access this method , bcz this method we did not define in interface.
		  so for accessing this method we need to create object of Jio class like  Jio j = new Jio();*/
		
		Jio j = new Jio();
		j.jioRecharge();
		
		System.out.println();
		
		Mobile_Network m2 = new Airtel();
		m2.calling();
		m2.browsing();
		
		Airtel a = new Airtel();// we need to create object for calling  explicit method in Airtel class
		a.airtelRecharge();
	}
}
