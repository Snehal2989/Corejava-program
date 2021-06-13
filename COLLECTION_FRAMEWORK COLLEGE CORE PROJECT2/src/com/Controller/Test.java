package com.Controller;

import java.util.Scanner;

import com.Service.Akurdi;
import com.Service.CJC;

public class Test {

	public static void main(String[] args) {

		CJC c = new Akurdi();
		Scanner sc = new Scanner(System.in);

		boolean b = true;

		while (b) {
			System.out.println();
			System.out.println("*********************************************");
			System.out.println();
			System.out.println("--------!!Welcome to CJC!!---------");
			System.out.println("Select : ");
			System.out.println("1. AddCourse");
			System.out.println("2. ViewCourse");
			System.out.println("3. AddFaculty");
			System.out.println("4. ViewFaculty");
			System.out.println("5. AddBatch");
			System.out.println("6. ViewBatch");
			System.out.println("7. AddStudent");
			System.out.println("8. ViewStudent");
			System.out.println("9. Exit");
			System.out.println();
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				c.addCourse();

				break;
			case 2:
				c.viewCourse();
				

				break;
			case 3:
				c.addFaculty();

				break;
			case 4:
				c.viewFaculty();

				break;
			case 5:
				c.addBatch();

				break;
			case 6:
				c.viewBatch();

				break;
			case 7:
				c.addStudent();

				break;
			case 8:
				c.viewStudent();

				break;
			case 9:
				System.out.println("Program completed Successfully!");
				System.exit(1);

				break;

			default:
				b = false;
				System.out.println("Wrong Input!");
				break;
			}
		}
	}

}
