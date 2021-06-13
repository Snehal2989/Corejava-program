package com.Declaration_Creation_Initialization.Example1;

public class A {

	public static void main(String[] args) {
		
//		int x[]; Deceleration
		
//		x = new int[5]; Creation
		
		int x[] = {10,20,30,40,50}; //Deceleration + Creation + Initialization
		
		// Note : array size [5]: 0 to 5 according to indexing
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
		
		System.out.println("Array size x[] is : "+x.length);/* this is display array size, length is Variable*/

		int x1[] = new int[5]; //Deceleration + Creation 
		x1[0] = 10;
		x1[1] = 10;
		x1[2] = 10;
		x1[3] = 10;
		x1[4] = 10;
		//x1[5] = 10; this will throw an ArrayIndexOutOfBoundException
		
		System.out.println("Array size x[] is : "+x1.length);/* this is display array size, length is Variable*/

		
	}
}
