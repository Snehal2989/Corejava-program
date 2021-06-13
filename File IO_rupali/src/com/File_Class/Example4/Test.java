package com.File_Class.Example4;

import java.io.File;

//How to create File in particular folder directory:
public class Test {

	public static void main(String[] args)throws Exception {
		
		
		File f = new File("D:\\ABC","xyz.txt"); //syntax : ("file path directory ","file name")
		boolean b = f.createNewFile();
		System.out.println(b);
		
		if(b == true) {
			System.out.println("file is created in ABC folder!");
		}else {
			System.out.println("file is already exists in ABC folder!");

		}
	}
}
