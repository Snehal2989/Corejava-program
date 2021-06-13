package com.CoVarient_ReturnType.example3;

public class B extends A {
	int x = 36;
	int z = 23;
	
	public void m2() {
		int result = x*z;
		System.out.println(result);
	}
	
	public void m3() {
		int result = x/z;
		System.out.println(result);
	}

}
