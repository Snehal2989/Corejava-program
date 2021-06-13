package com.Task2_MergedData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//Let the given two files be file1.txt and file2.txt. Our Task is to merge both files into third file say file3.txt. The following are steps to merge.
//
//Create PrintWriter object for file3.txt
//Open BufferedReader for file1.txt
//Run a loop to copy each line of file1.txt to file3.txt
//Open BufferedReader for file2.txt
//Run a loop to copy each line of file2.txt to file3.txt
//Flush PrintWriter stream and close resources.
public class Test {

	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter(new FileWriter("QQQ.txt")); // create file

		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));

		String line = br.readLine();

		// loop to copy each line of
		// abc.txt to QQQ.txt
		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}

		br = new BufferedReader(new FileReader("xyz.txt"));

		line = br.readLine();

		// loop to copy each line of
		// xyz.txt to QQQ.txt
		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}

		pw.flush();

		// closing resources
		br.close();
		pw.close();

		System.out.println("Merged abc.txt and xyz.txt into QQQ.txt");

	}
}
