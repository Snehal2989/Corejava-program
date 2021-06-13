package com.Data_Types_Of_Array.Int_Array;

import java.util.Scanner;

//integer array : int[] x = new int[size];

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		// storing loop for values in array
		for(int i=0 ;i<size;i++) {
			System.out.println("enter number:");
			array[i] = sc.nextInt();
//			sc.close();
		}
		
		// printing loop for stored values in array
		
		for(int i=0;i<array.length ;i++) {
			System.out.println(array[i]);
		}
	}
}
