package com.Marker_Deep_Cloning_interface.Example2;

public class Student implements Cloneable {

	private String name;
	private int rollno;
	private String address;
	
	public Student(String name, int rollno, String address) {

		this.name = name;
		this.rollno = rollno;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	@Override
	public String toString() {

		return "[ Name : " + name + " Rollno : " + rollno + " Address : " + address + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
}
