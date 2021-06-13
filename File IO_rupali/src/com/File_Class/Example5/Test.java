package com.File_Class.Example5;

import java.io.File;

public class Test {

	public static void main(String[] args) throws Exception {
		
		File f = new File("abc.txt");
		
		System.out.println("check whether file is exists or not : "+f.exists()); //return type of exists() is boolean
		System.out.println("check whether the file is writeable or not : "+f.canWrite());//return type of canWrite() is boolean,it will check that it should be text file
		System.out.println("check whether the file is readable or not : "+f.canRead());//boolean 
		System.out.println("get the accurate or absolate path of file : "+f.getAbsolutePath());//display directory
		System.out.println("get the canonical path : "+f.getCanonicalPath());//display directory
		System.out.println("get the path: "+f.getPath());//display directory
		System.out.println("get the name of file : "+f.getName());// display the name of file
		System.out.println("to the existing file is executable or not : "+f.canExecute());//boolean
		
	}
}
