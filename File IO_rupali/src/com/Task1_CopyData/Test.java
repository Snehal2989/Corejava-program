package com.Task1_CopyData;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

// Task1 : copy data from 1 file into another file
public class Test {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		
		PrintWriter out = new  PrintWriter(new FileWriter("BBB.txt",true));/*here i created the new file , so we can
		                                                          able to copy data from one file to another, true for appending purpose*/
		
		String line = br.readLine();
		
		while(line!=null) {
			out.println(line);
			line = br.readLine();
			
		}
	
		br.close();
		out.flush();
		out.close();
		
		System.out.println("Data copied Successfully!!");
		
		
	}
}
