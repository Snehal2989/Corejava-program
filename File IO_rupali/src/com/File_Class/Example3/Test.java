package com.File_Class.Example3;

import java.io.File;

// How to created folder in particular directory:
public class Test {
public static void main(String[] args) throws Exception {
	// folder creation
	File f = new File("D:\\","ABC");
	boolean b = f.mkdir();
	
	System.out.println(b);
	if(b == true) {
		System.out.println("New folder is created!");
	}
	else {
		System.out.println("This folder is already exists!");
	}
}
}
