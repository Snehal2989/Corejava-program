package com.CoVarient_ReturnType.example3;

public class C extends B {
	
	int z = 34;
	int y = 11;
	int d = 10;
	
	public void m3() {
		int result = 2*(d^2);
		System.out.println(result);
	}
	
	public void m4() {
		int result = (1/2)*z*y;
		System.out.println(result);
	}

}
