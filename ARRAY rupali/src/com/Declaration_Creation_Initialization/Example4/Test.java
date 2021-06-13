package com.Declaration_Creation_Initialization.Example4;

import java.util.Scanner;

public class Test {
	
	static int size;
	public int[] getArray() {
		
		System.out.println("getArray()-------start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		
		int array[] = new int[size];
		System.out.println("Array Address : " + array.hashCode());
		
		//storing value loop
		for(int i = 0;i<size ; i++) {
			
			System.out.println("Enter value : ");
			int num = sc.nextInt();
			array[i] = num;
			
		}
		
		
		System.out.println("getArray()-------end");
		return array;
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Main-----Start");
		Test t1 = new Test();
		int array_1[] = t1.getArray();
		System.out.println("In main method ");
		// Printing Loop : for loop to print forward array
		for(int i = 0; i<array_1.length ;i++) {
			System.out.println(array_1[i]);
		}
		System.out.println();
		
		Test t2 = new Test();
		int array_2[] = t2.getArray();
		
		
		// Printing Loop : for loop to print reverse array
		for(int i = size-1 ; i >=0 ; i--){
			System.out.println(array_2[i]);
		}
	}

}
