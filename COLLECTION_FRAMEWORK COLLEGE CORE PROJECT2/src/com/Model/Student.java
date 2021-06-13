package com.Model;

public class Student {

	private int srollno;
	private String sname;
	private Batch bat;
	
	@Override
	public String toString() {
		return "Student Information --> [Student ID : " + srollno + ", Student Name : " +sname +" , Batch : "+bat+ "]";
	}


	public int getSrollno() {
		return srollno;
	}

	public void setSrollno(int srollno) {
		this.srollno = srollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Batch getBat() {
		return bat;
	}

	public void setBat(Batch bat) {
		this.bat = bat;
	}
}
