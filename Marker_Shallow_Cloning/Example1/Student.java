package com.Marker_Shallow_Cloning.Example1;

public class Student implements Cloneable {

	private String name;
	private int rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	@Override
	public String toString() {
		
		return "[Name : "+name+" Rollno : "+rollno+"]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
}
