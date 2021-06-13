package com.File_Class.Example6;

import java.io.File;


//to check that how many files and folder are exists in particular directory
public class Test {

	public static void main(String[] args) throws Exception {

		File f = new File("D:\\");

		String sArray[] = f.list();
		System.out.println("The total directory contain including file and folder is : "+sArray.length);// it will give you total count of files and folder in directory

		File[] file_Array = f.listFiles(); // it only list the files in directory

		for (int i = 0; i < sArray.length; i++) {

			if (file_Array[i].isFile()) {
				System.out.println("File: ");
				System.out.println("--->" + file_Array[i].getName());
			} else {
				System.out.println("Folder: ");
				System.out.println("--->" + file_Array[i].getName());
			}
		}
		
		
		
		
	}
}
