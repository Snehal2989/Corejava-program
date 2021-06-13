package com.Find_Maximum_number_inArray.Example2;

public class Student {

	private int rollno;
	private String name;
	private int marks;

	

	public int getRollno() {
		return rollno;
	}



	public String getName() {
		return name;
	}



	public int getMarks() {
		return marks;
	}



	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

}
