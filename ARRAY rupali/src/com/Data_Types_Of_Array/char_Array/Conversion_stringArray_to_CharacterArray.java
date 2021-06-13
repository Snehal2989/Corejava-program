package com.Data_Types_Of_Array.char_Array;

import java.util.Arrays;

public class Conversion_stringArray_to_CharacterArray {

	public static void main(String[] args) {
		
		String value = "helloworld";
		char[] c = value.toCharArray();// Conversion to character from string 
		
		//Iterating array values
		for(int i = 0;i<c.length;i++) {
			System.out.println(c[i]);
			
		}
		System.out.println();
		System.out.println(c.length); //length calculate
		
		Arrays.sort(c);// sorting array
		System.out.println(Arrays.toString(c));
	}
}
