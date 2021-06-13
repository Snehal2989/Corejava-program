package com.arraylist_method;

import java.util.*;

public class Add {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); //intial capacity is 10

		// Call add() method to add elements at the end of the list using the reference variable list. 
		   System.out.println("Adding elements to end of list"); 
		    list.add("A"); // Adding elemen at index 0.
		    list.add("B"); // Adding element at index 1.
		    list.add("D"); // Adding element at index 2.
		    list.add("E"); // Adding element at index 3.
		    list.add("G"); // Adding element at index 4.
		   
		System.out.println("ArrayList insertion order: " +list); 
		   
		System.out.println("Adding an element at a specific index after B element."); 
		   list.add(2, "C"); //A B C D E G
		System.out.println("ArrayList insertion order after adding C: " +list ); 

		System.out.println("Adding an element at a specific index after E"); 
		   list.add(5, "F"); //addition perform on updated list..A B C D E F
		System.out.println("ArrayList insertion order after adding F: " +list); 
		 } 
		


	}


