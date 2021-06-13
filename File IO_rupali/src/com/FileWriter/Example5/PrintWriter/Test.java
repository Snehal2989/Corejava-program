package com.FileWriter.Example5.PrintWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//PrinterWriter
public class Test {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("xyz.txt",true);/*FileWriter also created the new file if it does not exists
        and pass true to append the data*/
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println(true);
		pw.println(10.23f);
		pw.println("my name is rupali!");
		pw.println("i am student of cjc class!");
		
		pw.flush();
		pw.close();
		System.out.println("data added!");
	
	}

}
