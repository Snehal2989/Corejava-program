package com.Declaration_Creation_Initialization.Example2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Main---Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		
		int array[] = new int[size];
		
		// Storing Loop for value 
		
		for(int i = 0; i<size ; i++) {
			System.out.println("Enter Number : ");
			int num = sc.nextInt();
			 array[i] = num;
		}
		
		// Printing Loop 
		for(int i = 0 ; i<size ;i++) {
			System.out.println(array[i]);
		}
	}
}
