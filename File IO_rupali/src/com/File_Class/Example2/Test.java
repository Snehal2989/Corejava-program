package com.File_Class.Example2;

import java.io.File;

// How to create new Folder:
public class Test {
	
	public static void main(String[] args) {
		
		File f= new File("ABC");
		boolean f1 = f.mkdir();
		
		System.out.println(f1);
		if(f1 == true) {
			System.out.println("New folder is created!");
		}
		else {
			System.out.println("This folder is already exists!");
		}
	}

}
