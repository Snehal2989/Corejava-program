package com.FileReader.Example2.BufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

//Buffered Reader
public class Test {
	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		while(line!= null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
		System.out.println("data read successfully!");
		
	}
	
	

}
