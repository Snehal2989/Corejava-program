package com.Declaration_Creation_Initialization.Example3;

import java.util.Scanner;

// Program to print reverse array
public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		
		int array[] = new int[size];
		
	// for loop for value storing
		for(int i = 0 ; i<size ; i++) {
			
			System.out.println("Enter the value : ");
			int num = sc.nextInt();
			array[i] = num;
		}
		
		System.out.println();
		
		// for loop for printing reverse array
		for(int i = size-1 ; i >=0 ; i--){
			System.out.println(array[i]);
		}
		
	}
}
