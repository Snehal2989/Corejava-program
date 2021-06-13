package com.Data_Types_Of_Array.char_Array;

import java.util.Arrays;

;

/* char Array : 
way 1:  char[] ch = new char[size];
way 2: char[] ch = new char[] {};
*/
public class Test {

	public static void main(String[] args) {
		
//		char[] ch = new char[7];
		char[] javacharArray = new char[] {'a','v','z','e','o','h','t'};
		
		// Accessing char array elements using Loop
		
		for(int i = 0; i<javacharArray.length;i++) {
			System.out.println(javacharArray[i]);
		}
		
		// sorting array using Alphabetical order(ascending order) using command : Arrays.sort(ArrayName)
		
		Arrays.sort(javacharArray);
		System.out.println(Arrays.toString(javacharArray));
		
		// calculate length of array : ArrayName.length
		
		System.out.println(javacharArray.length);
		
	}
}
