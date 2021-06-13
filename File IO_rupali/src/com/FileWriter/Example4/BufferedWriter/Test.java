package com.FileWriter.Example4.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//BufferedWriter
public class Test {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("xyz.txt",true);/*FileWriter also created the new file if it does not exists
		                                                 and pass true to append the data*/
		BufferedWriter bw = new BufferedWriter(fw);/* to initialized the BufferedWriter ,we
		                                              need to pass fw in object*/
		
		
		bw.write("Hello");
		bw.newLine();// it will print next line
		bw.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
				+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, "
				+ "when an unknown printer took a galley of type and scrambled it"
				+ " to make a type specimen book. ");
		
		bw.newLine();// it will print next line
        bw.write("here m appending the data");
		bw.flush();
		bw.close();
		
		System.out.println("data Append Successfully!");
		
		
		
		
		
	}
}
