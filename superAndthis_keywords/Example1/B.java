package com.superAndthis_keywords.Example1;

public class B extends A{
	
	int x = 20;
	public void m1() {
		int x = 30;
		System.out.println("m1---B");
		System.out.println(x); //30 it just calling variable inside method means Local variable
		System.out.println(this.x);//20 this() keyword is used for calling same class variable
		System.out.println(super.x);//10 super() keywords is used for calling parent class variable
	}
	
	


}
