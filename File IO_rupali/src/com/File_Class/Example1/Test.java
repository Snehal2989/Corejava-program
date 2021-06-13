package com.File_Class.Example1;

import java.io.File;
import java.io.IOException;

// How to create new file:
public class Test {
	public static void main(String[] args) throws IOException {
		
		File f = new File("abc.txt");
		boolean b = f.createNewFile(); // it will create new file
		
		System.out.println(b);/* Note : if file does not exists it will return true means file is created. OR if
		                         is already exists then it will return false.
		                         boolean = return true(new file created)
		                         boolean = return false(File is already exists)*/
		
		if(b == true) {
		System.out.println("File created Successfully!");
		}
		else {
			System.out.println("File is already exists!");
		}
	}

}
