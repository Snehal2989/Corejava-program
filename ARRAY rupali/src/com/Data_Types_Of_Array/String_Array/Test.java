package com.Data_Types_Of_Array.String_Array;

import java.util.Scanner;

// String array : String[] s = new String[size];
public class Test {

	public static void main(String[] args) {
		
		String[] str_array = new String[4]; // string array creation + declaration
		
		//value initialization or assign value to string array
		
		str_array[0] = "hello";
		str_array[1] = "mahi";
		str_array[2] = "fruit";
		str_array[3] = "song";
		
		System.out.println(str_array[0]);
		System.out.println(str_array[1]);
		System.out.println(str_array[2]);
		System.out.println(str_array[3]);
		
		//value initialization or assign value to string array by using loop
		
		Scanner sc = new Scanner(System.in);
		
		// storing loop to stored string values
		for(int i = 0;i<4;i++) {
			System.out.println("enter string:");
			String str = sc.next();
			
			str_array[i] = str;
			
		}
		
		// printing loop to display values in string array
		
		for(int i=0;i<str_array.length;i++) {
			System.out.println(str_array[i]);
			
		}
		
		
		
		
	}
}
