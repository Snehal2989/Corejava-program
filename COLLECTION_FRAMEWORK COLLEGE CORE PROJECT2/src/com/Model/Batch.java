package com.Model;

public class Batch {

	private int bid;
	private String bname;
	private Faculty faculty;
	

	@Override
	public String toString() {
		return "Batch Information --> [Batch ID : " + bid + ", Batch Name : " +bname +" , Faculty : "+faculty+ "]";
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

}
