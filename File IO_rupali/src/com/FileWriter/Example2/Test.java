package com.FileWriter.Example2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Append the data in current file
public class Test {

	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		FileWriter fw = new FileWriter(f,true);// If we want to append or add the data in file ,then we need to pass true
		                                         // in fileWriter constructor. it is by default false(so it always override data the in file)
		
		fw.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
				+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, "
				+ "when an unknown printer took a galley of type and scrambled it"
				+ " to make a type specimen book. ");
		fw.write("\n");
		fw.write(65);//this integer 65 is unicode value of A
		fw.write("\n");// it will take an cursor to a new line
		fw.write(66);//B
		fw.write(67);//C
		fw.write("\n");
		fw.write("Hello welcome to pune!");
		fw.write("\n");
		char[] ch = {'A','K','U','R','D','I'};
		fw.write(ch);
		
		
		fw.flush();
		fw.close();
		
		System.out.println("Data append successfuly!");
		
	}
}
