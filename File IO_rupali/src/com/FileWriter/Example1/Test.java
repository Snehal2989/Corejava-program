package com.FileWriter.Example1;

import java.io.FileWriter;
import java.io.IOException;

//FileWriter
public class Test {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("abc.txt");
		
		fw.write(65);//this integer 65 is unicode value of A
		fw.write("\n");// it will take an cursor to a new line
		fw.write(66);//B
		fw.write(67);//C
		fw.write("\n");
		fw.write("Hello welcome to pune!");
		fw.write("\n");
		char[] ch = {'A','K','U','R','D','I'};
		fw.write(ch);
		
		fw.flush();//with help flush() method we can able to see the writed data in text file
		fw.close();//it is used to close current using file , so no one can misuse it
		
		System.out.println("Data added successfully!!");
		
		
	}

}
