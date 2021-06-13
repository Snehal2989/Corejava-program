package com.arraylist_method;

import java.util.*;

public class Addall {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(); 
	    al.add("G"); 
	    al.add("H"); 
	    al.add("I"); 
	    al.add("M"); 
	    al.add("N"); 
	  System.out.println("Original ArrayList insertion order: " +al); 

	// Creates another ArrayList2 with an initial capacity of 10. 
	   ArrayList<String> al2 = new ArrayList<String>(); 
	    al2.add("J"); 
	    al2.add("K"); 
	    al2.add("L"); 

	// Call addAll() method to add all elements in the list2 at spcefic index 3. 
	   al.addAll(3, al2); 
	   System.out.println("ArrayList insertion order after adding group of elements in the list1 : " +al); 

	// Creates ArrayList3 with initial capacity 10. 
	   ArrayList<String> al3 = new ArrayList<String>(); 
	    al3.add("20"); 
	    al3.add("40"); 
	    al3.add("12"); 
	// Adding group of elements at the end of list1. 
	    al.addAll(al3); 
	    System.out.println(al); 
	  } 
	

}
