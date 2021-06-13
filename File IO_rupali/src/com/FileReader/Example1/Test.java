package com.FileReader.Example1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//File Reader
public class Test {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("abc.txt");
		int ch = fr.read(); //note : this command will read data charcter by character
		ch = fr.read();
		System.out.println((char)ch);
		
		ch = fr.read();
		System.out.println((char)ch);
		
		ch = fr.read();
		System.out.println((char)ch);
		
		ch = fr.read();
		System.out.println((char)ch);
		
		//note : if you want to see whole data from file , then for that purpose use Loop
		
		while(ch!= -1) {
			System.out.print((char)ch);
			ch = fr.read();
		}
		
	System.out.println();
	fr.close();
		System.out.println("Data read successfully!");
		
	}
}
